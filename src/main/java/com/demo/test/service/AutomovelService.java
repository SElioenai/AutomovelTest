package com.demo.test.service;

import com.demo.test.domain.model.Automovel;
import com.demo.test.repo.AutomovelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepo repo;

    public void cadastrarAutomovel(Automovel automovel){
        repo.save(automovel);
    }

    public Iterable<Automovel> retornarAutomoveis(){
        return repo.findAll();
    }
}
