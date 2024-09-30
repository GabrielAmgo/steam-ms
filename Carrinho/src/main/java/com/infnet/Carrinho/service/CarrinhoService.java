package com.infnet.Carrinho.service;

import com.infnet.Carrinho.model.Carrinho;
import com.infnet.Carrinho.service.Impl.CarrinhoServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service

    public interface CarrinhoService{

     public abstract Carrinho salvar(Carrinho carrinho);


        public abstract CarrinhoServiceImpl addItem(long carrinhoId, long jogoId, int quantidadeItem);

        public abstract Carrinho create(Carrinho Carrinho);

     public abstract Optional<Carrinho> findById(long id);

        List<Carrinho> findAll();

        void deleteById(long id);

        Carrinho update(Carrinho Carrinho);

        void removerItem(long id, int quantidade);

        void limparCarrinho(long id);
    }

