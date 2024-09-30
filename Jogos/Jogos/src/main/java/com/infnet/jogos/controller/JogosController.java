package com.infnet.jogos.controller;


import com.infnet.jogos.model.Jogos;
import com.infnet.jogos.service.JogosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class JogosController {
    private final JogosService jogosService;
    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(jogosService.findAll());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Jogos> optJogos = jogosService.findById(id);
        if (optJogos.isPresent()) {
            return ResponseEntity.ok(optJogos.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        jogosService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Jogos jogos) {
        Jogos saved = jogosService.create(jogos);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<?> update (@RequestBody Jogos jogos) {
        jogosService.update(jogos);
        return ResponseEntity.ok().build();
    }
}
