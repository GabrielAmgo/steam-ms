package com.infnet.jogos.service;

import com.infnet.jogos.model.Jogos;

import java.util.List;
import java.util.Optional;

public interface JogosService {
    Jogos create (Jogos jogos);
    Optional<Jogos> findById (Long id);
    List<Jogos> findAll();
    void deleteById(Long id);
    Jogos update (Jogos jogos);

}
