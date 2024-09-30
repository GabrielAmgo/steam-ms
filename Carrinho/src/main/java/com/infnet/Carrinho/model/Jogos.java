package com.infnet.Carrinho.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data@NoArgsConstructor@AllArgsConstructor@Builder
@Entity

public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String nome;
    private String genero;
    private BigDecimal preco;
    private String desenvolvedora;
    private long desenvolvedora_id;
    private long quantidade;

}
