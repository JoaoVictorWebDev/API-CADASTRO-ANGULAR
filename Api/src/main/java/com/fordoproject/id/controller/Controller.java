package com.fordoproject.id.controller;

import com.fordoproject.id.model.Cliente;
import com.fordoproject.id.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Service
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {
    @Autowired
    private Repository action;

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente c) {
        return action.save(c);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar() {
        return action.findAll();
    }

    @PutMapping
    public Cliente editar(@RequestBody Cliente c) {
        return action.save(c);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        action.deleteById(id);
    }
}
