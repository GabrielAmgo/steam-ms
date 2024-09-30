/*package com.infnet.Carrinho.service.Impl;

import com.infnet.Carrinho.Repository.CarrinhoRepository;
import com.infnet.Carrinho.model.Carrinho;
import com.infnet.Carrinho.model.ItemCarrinho;
import com.infnet.Carrinho.model.Jogos;
import com.infnet.Carrinho.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CarrinhoServiceImpl implements CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;
    private final List<ItemCarrinho> itensCarrinho;
    private final RestTemplate restTemplate;

    private final String jogosServiceUrl = "http://localhost:8081/";


    @Override
    public Carrinho addItem(long carrinhoId, long jogoId, int quantidadeItem) {
        // Faz uma requisição ao microsserviço de jogos para buscar os detalhes do jogo
        Jogos jogo = restTemplate.getForObject(jogosServiceUrl + jogoId, Jogos.class);

        // Busca o carrinho pelo id
        Optional<Carrinho> optionalCarrinho = carrinhoRepository.findById(carrinhoId);

        if (optionalCarrinho.isPresent() && jogo != null) {
            Carrinho carrinho = optionalCarrinho.get();
            boolean itemExistente = false;

            // Verifica se o jogo já existe no carrinho
            for (ItemCarrinho item : carrinho.getItens()) {
                if (item.getId().) {
                    // Se o jogo já está no carrinho, atualiza a quantidade
                    item.setQuantidade(item.getQuantidade() + quantidadeItem);
                    itemExistente = true;
                    break;
                }
            }

            // Se o jogo não estava no carrinho, cria um novo item
            if (!itemExistente) {
                ItemCarrinho novoItem = new ItemCarrinho();
                novoItem.setId(jogoId);
                novoItem.setNome(jogo.getNome());
                novoItem.setPreco(jogo.getPreco());
                novoItem.setQuantidade(quantidadeItem);
                carrinho.getItens().add(novoItem);
            }

            // Atualiza o carrinho no repositório
            carrinhoRepository.save(carrinho);
        }

        return this;
    }

    @Override
    public Carrinho create(Carrinho Carrinho) {
        return carrinhoRepository.save(Carrinho);
    }

    @Override
    public Optional<Carrinho> findById(long id) {
        return carrinhoRepository.findById(id);
    }

    @Override
    public List<Carrinho> findAll() {
        return carrinhoRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        carrinhoRepository.deleteById(id);
    }

    @Override
    public Carrinho update(Carrinho Carrinho) {
        return null;
    }

    @Override
    public void removerItem(long id, int quantidade) {}

    @Override
    public void limparCarrinho(long id) {

    }

}
*/