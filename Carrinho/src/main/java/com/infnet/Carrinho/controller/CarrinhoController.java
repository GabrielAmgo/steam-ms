package com.infnet.Carrinho.controller;

import com.infnet.Carrinho.model.Carrinho;
import com.infnet.Carrinho.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CarrinhoController {

    private final CarrinhoService carrinhoService;

    @PostMapping("/add")
    public ResponseEntity addJogo(@RequestParam long carrinhoId,
                                  @RequestParam long jogoId,
                                  @RequestParam int quantidadeItem){
        carrinhoService.addItem(carrinhoId, jogoId, quantidadeItem);
        return null;
    }

    @PostMapping("")
    public ResponseEntity create(@RequestBody Carrinho carrinho){
        carrinhoService.salvar(carrinho);
        return null;
    }


}
