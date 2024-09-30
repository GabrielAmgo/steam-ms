package com.infnet.Desenvolvedora.service.Impl;

import com.infnet.Desenvolvedora.model.Desenvolvedora;
import com.infnet.Desenvolvedora.repository.DesenvolvedoraRepository;
import com.infnet.Desenvolvedora.service.DesenvolvedoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DesenvolvedoraServiceImpl implements DesenvolvedoraService {

    private final DesenvolvedoraRepository desenvolvedoraRepository;

    @Override
    public Desenvolvedora create(Desenvolvedora desenvolvedora) {
        return desenvolvedoraRepository.save(desenvolvedora);
    }

    @Override
    public Optional<Desenvolvedora> findById(Long id) {
        return desenvolvedoraRepository.findById(id);
    }

    @Override
    public List<Desenvolvedora> findAll() {
        return desenvolvedoraRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
    desenvolvedoraRepository.deleteById(id);
    }

    @Override
    public Desenvolvedora update(Desenvolvedora desenvolvedora) {
        return null;
    }
}
