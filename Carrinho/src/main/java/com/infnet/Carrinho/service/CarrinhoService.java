package com.infnet.Carrinho.service;

import com.infnet.Carrinho.Repository.CarrinhoRepository;
import com.infnet.Carrinho.model.Carrinho;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    @RequiredArgsConstructor
    public class CarrinhoService{

     private final CarrinhoRepository carrinhoRepository;
     public Carrinho salvar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
     }

}

