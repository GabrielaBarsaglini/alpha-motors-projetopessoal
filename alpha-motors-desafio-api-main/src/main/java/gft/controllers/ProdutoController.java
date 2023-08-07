package gft.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.busca.BuscaPorNomeDTO;
import gft.dto.produto.ConsultaProdutoDTO;
import gft.dto.produto.ProdutoMapper;
import gft.dto.produto.RegistroProdutoDTO;
import gft.entities.Produto;
import gft.services.ProdutoService;
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	
	private final ProdutoService produtoService;
	
	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}


	// no DTO não tem id das coisas
	//pois é usado só para criar objetos
	@GetMapping
	public ResponseEntity<List<ConsultaProdutoDTO>> buscarTodosOsProdutos(){
		
		
		// o map trasforma objetos de um tipo para outro
		//metodo lambda
		return ResponseEntity.ok(produtoService.listarTodosOsProdutos()
				.stream().map(ProdutoMapper::fromEntity).collect(Collectors.toList()));
	
	}

	
	@PostMapping
	public ResponseEntity<ConsultaProdutoDTO> salvarProduto(@RequestBody RegistroProdutoDTO dto){
		
		Produto produto = produtoService.salvarProduto(ProdutoMapper.fromDTO(dto));
		
		return ResponseEntity.ok(ProdutoMapper.fromEntity(produto));
}
	
	@GetMapping("{id}") // localhost:8080/produto/2
	public ResponseEntity<ConsultaProdutoDTO> buscarProduto(@PathVariable Long id){
		
		try {
		 Produto produto = produtoService.buscarProduto(id);
		 
		 return ResponseEntity.ok(ProdutoMapper.fromEntity(produto));
	}catch(RuntimeException ex) {
		return ResponseEntity.notFound().build();
	}
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaProdutoDTO> alterarProduto(@RequestBody RegistroProdutoDTO dto,
			@PathVariable Long id){
		
		try {
			
		
		Produto produto = produtoService.atualizarProduto(ProdutoMapper.fromDTO(dto), id);
		
		return ResponseEntity.ok(ProdutoMapper.fromEntity(produto));
	}catch(RuntimeException ex) {
		return ResponseEntity.notFound().build();
	}
}
	
	@DeleteMapping("{id}")
    public ResponseEntity<ConsultaProdutoDTO> excluirProduto(@PathVariable Long id){
		
		try {
		  produtoService.excluirProduto(id);
		 
		 return ResponseEntity.ok().build();
	}catch(RuntimeException ex) {
		return ResponseEntity.notFound().build();
	}
}
	@GetMapping("/estoque/{nome}")
	public ResponseEntity<List<BuscaPorNomeDTO>> buscarProdutoPorNome(@PathVariable String nome){
		
		
	
		// o map trasforma objetos de um tipo para outro
		//metodo lambda
		return ResponseEntity.ok(produtoService.listarProduto(nome)
				.stream().map(ProdutoMapper::fromEntityBusca).collect(Collectors.toList()));
	
	}
}

