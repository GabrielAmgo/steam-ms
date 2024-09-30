package com.infnet.jogos.service.Impl;

import com.infnet.jogos.model.Jogos;
import com.infnet.jogos.repository.JogosRepository;
import com.infnet.jogos.service.JogosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JogosServiceImpl implements JogosService {

    private final JogosRepository jogosRepository;

    @Override
    public Jogos create(Jogos jogos) {
        return jogosRepository.save(jogos);
    }

    @Override
    public Optional<Jogos> findById(Long id) {
        return jogosRepository.findById(id);
    }

    @Override
    public List<Jogos> findAll() {
        return jogosRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jogosRepository.deleteById(id);
    }

    @Override
    public Jogos update(Jogos jogos) {
        return jogosRepository.save(jogos);
    }
}
