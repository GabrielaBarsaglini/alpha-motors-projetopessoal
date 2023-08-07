package gft.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Caracteristicas;
import gft.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
	// busco pelo nome meu produto
	//ao inves de criar a entidade estoque
	//faço isso aqui no repository de produto
	
	//eu to recebendo um tipo list de produto
	//chega uma lista do mesmo tipo de produto chamando pelo nome
	List<Produto> findByNomeContains(String nome);
	
	//List<Caracteristicas> findByCaracteristicas(Caracteristicas caracteristicas);

}