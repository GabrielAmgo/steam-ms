package com.infnet.Desenvolvedora.controller;

import com.infnet.Desenvolvedora.model.Desenvolvedora;
import com.infnet.Desenvolvedora.service.DesenvolvedoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DesenvolvedoraController {

    private final DesenvolvedoraService desenvolvedoraService;

    @GetMapping
    public ResponseEntity<?> findAll(){ return ResponseEntity.ok(desenvolvedoraService.findAll());}

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Desenvolvedora> optDesenvolvedora = desenvolvedoraService.findById(id);
        if (optDesenvolvedora.isPresent()) {
            return ResponseEntity.ok(optDesenvolvedora.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
            desenvolvedoraService.deleteById(id);
            return ResponseEntity.ok().build();
        }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Desenvolvedora desenvolvedora){
        Desenvolvedora saved = desenvolvedoraService.create(desenvolvedora);
        return  ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<?> update (@RequestBody Desenvolvedora desenvolvedora){
        desenvolvedoraService.update(desenvolvedora);
        return ResponseEntity.ok().build();
    }

    }

