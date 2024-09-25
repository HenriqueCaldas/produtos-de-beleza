package com.apinatura.produtos.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apinatura.produtos.modelo.Produto;
import com.apinatura.produtos.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControle {

	@Autowired
	private ProdutoRepositorio acao;

	@GetMapping("/produtos")
	public @ResponseBody List<Produto> listarTodosProdutos() {
		return acao.findAll();
	}

	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> encontraProdutoPorId(@PathVariable Long id) {
		Optional<Produto> produto = acao.findById(id);

		// Verifica se o produto está presente
		if (produto.isPresent()) {
			return ResponseEntity.ok(produto.get()); // Retorna 200 OK com o produto
		} else {
			return ResponseEntity.notFound().build(); // Retorna 404 Not Found
		}
	}

	@PostMapping("/produtos")
	public @ResponseBody Produto cadastrar(@RequestBody Produto produto) {
		return acao.save(produto);
	}
	
	@PutMapping("/produtos")
	public @ResponseBody Produto atualizar(@RequestBody Produto produto) {
		return acao.save(produto);
	}
	
	
	@PostMapping("/cadastrar")
    public ResponseEntity<List<Produto>> cadastrarProdutos(@RequestBody List<Produto> produtos) {
        //List<Produto> novosProdutos = (List<Produto>) acao.saveAll(produtos); // Salva todos os produtos no banco
        return ResponseEntity.status(201).body((List<Produto>) acao.saveAll(produtos)); // Retorna 201 Created com a lista de produtos
    }
	
	 @DeleteMapping("/deletar-todos")
	    public ResponseEntity<Void> deletarTodosProdutos() {
	        acao.deleteAll(); // Chama o método para deletar todos os produtos
	        return ResponseEntity.noContent().build(); // Retorna 204 No Content
	    }
	

	@DeleteMapping("/produtos/{id}")
	 public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        if (!acao.findById(id).isPresent()) { // Verifica se o produto existe
            return ResponseEntity.notFound().build(); // Retorna 404 Not Found se o produto não existir
        }
        
        acao.deleteById(id); // Se o produto existir, tenta deletar
        return ResponseEntity.ok(null); // Retorna 204 No Content em caso de sucesso
    }

}
