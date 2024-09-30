package com.infnet.Desenvolvedora.service;

import com.infnet.Desenvolvedora.model.Desenvolvedora;

import java.util.List;
import java.util.Optional;

public interface DesenvolvedoraService {
    Desenvolvedora create (Desenvolvedora desenvolvedora);
    Optional<Desenvolvedora> findById (Long id);
    List<Desenvolvedora> findAll();
    void deleteById(Long id);
    Desenvolvedora update (Desenvolvedora desenvolvedora);
}
