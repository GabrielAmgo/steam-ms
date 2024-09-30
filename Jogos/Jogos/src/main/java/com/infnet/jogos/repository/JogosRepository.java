package com.infnet.jogos.repository;

import com.infnet.jogos.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepository extends JpaRepository<Jogos, Long> {
}
