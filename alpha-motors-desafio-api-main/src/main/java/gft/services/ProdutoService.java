package gft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gft.dto.produto.ConsultaProdutoDTO;
import gft.entities.Produto;
import gft.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	//uma boa prática mehlor que autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto salvarProduto(Produto produto) {
		return this.produtoRepository.save(produto);
	}
	
	public List<Produto> listarTodosOsProdutos(){
		
		return produtoRepository.findAll();
	}

	public Produto buscarProduto(Long id) {
		
		Optional<Produto> optional = produtoRepository.findById(id);
		
		return optional.orElseThrow(() -> new RuntimeException("Produto não encontrado"));
	}
	
	public Produto atualizarProduto(Produto produto, Long id) {
		
		Produto produtoOriginal = this.buscarProduto(id);
		
		produto.setId(produtoOriginal.getId());
		
		return produtoRepository.save(produto);
	}

	public void excluirProduto(Long id) {
        Produto produtoOriginal = this.buscarProduto(id);
        
        produtoRepository.delete(produtoOriginal);
	}
	
	//o metodo espera uma lista 
	public List<Produto> listarProduto(String nome) {
		
	
			return produtoRepository.findByNomeContains(nome);
		}
		

}
