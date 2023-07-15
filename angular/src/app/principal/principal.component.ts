import {
  Component
} from '@angular/core';
import { Client} from '../model/Client';
import {
  ClientService
} from '../service/client.service';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent {
  //Visibilidade dos botoões
  btnCadastro: boolean = true;
  tabela: boolean = true;
  cliente = new Client();
  //Json Clientes
  clientes: Client[] = [];

  constructor(private service: ClientService) {

  };

  selecionar(): void {
    this.service.selecionar()
      .subscribe(retorno => this.clientes = retorno);
  }

  ngOnInit() {
    this.selecionar() //

  }

  cadastrar(): void {
    this.service.cadastrar(this.cliente)
      .subscribe(retorno => {
        this.clientes.push(retorno);
      });
    this.cliente = new Client();
    
  }

  selecionarCliente(posicao: number): void {
    this.cliente = this.clientes[posicao];
    this.btnCadastro = false;
    this.tabela = false;
  }
  editar(): void {
    this.service.editar(this.cliente)
      .subscribe(retorno => {
        let posicao = this.clientes.findIndex(obj => obj.id === retorno.id);
        if (posicao !== -1) {
          this.clientes[posicao] = retorno;
          this.btnCadastro = true;
          this.tabela = true;
          alert('Cliente alterado com sucesso!');
        }
      });
      
  }
    remover(): void {
      this.service.remover(this.cliente.id)
        .subscribe(retorno => {
          let posicao = this.clientes.findIndex(obj=>{return obj.id == this.cliente.id});
            this.clientes.splice(posicao, 1);
            this.cliente = new Client();
            this.tabela = true;
            this.btnCadastro = true;
            alert('Cliente Deletado com sucesso!');
        });
        
    }

}
