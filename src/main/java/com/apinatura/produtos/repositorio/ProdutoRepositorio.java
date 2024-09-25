package com.apinatura.produtos.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.apinatura.produtos.modelo.Produto;

@Service
public interface ProdutoRepositorio extends CrudRepository<Produto, Long> {
	
	
	
	// Listar todos os produtos
	List<Produto> findAll();

	// Pesquisar por código

	// Remover um produto
	// void deleteById();

	// Atualizar ou Cadastrar produto

	public static List<Produto> saveAll(List<Produto> produtos) {
		return saveAll(produtos); // Salva todos os produtos
	}
	
	
    void deleteAll(); // Deleta todos os produtos
   

}
