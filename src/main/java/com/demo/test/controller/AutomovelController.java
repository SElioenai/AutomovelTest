package com.demo.test.controller;

import com.demo.test.domain.model.Automovel;
import com.demo.test.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

@Controller
public class AutomovelController {

    @Autowired
    private AutomovelService service;

    @PostMapping("/cadastroAutomoveis")
    public ResponseEntity<String> cadastrarAutomavel(@RequestBody Automovel automovel){
        service.cadastrarAutomovel(automovel);
        return ResponseEntity.created(URI.create("Cadastrado")).build();
    }

    @GetMapping("/automoveis")
    public ResponseEntity<Iterable> retornarAutomoveis(){
        Iterable<Automovel> response = service.retornarAutomoveis();
        return ResponseEntity.ok().body(response);
    }
}
