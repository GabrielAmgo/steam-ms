package com.infnet.Carrinho.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
@Entity
public class  Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carrinhoid;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogos> jogosCarrinho;
    private int quantidadeItem;

}
