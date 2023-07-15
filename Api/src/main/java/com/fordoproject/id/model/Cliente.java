package com.fordoproject.id.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String cidade;
    public Cliente(Long id, String nome, String idade, String cidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Cliente() {

    }
}
