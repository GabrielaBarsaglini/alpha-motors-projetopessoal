package gft.dto.produto;

import gft.dto.busca.BuscaPorNomeDTO;
import gft.dto.caracteristicas.CaracteristicasMapper;
import gft.entities.Produto;

public class ProdutoMapper {
	
	public static Produto fromDTO(RegistroProdutoDTO dto) {
		return new Produto(null, dto.getNome(), CaracteristicasMapper.fromDTO(dto.getCaracteristicas()));
	}
	
	public static ConsultaProdutoDTO fromEntity(Produto produto) {
		return new ConsultaProdutoDTO(produto.getId(),
				produto.getNome(), CaracteristicasMapper.fromEntity(produto.getCaracteristicas()));
	}
	
	public static BuscaPorNomeDTO fromEntityBusca(Produto produto) {
		return new BuscaPorNomeDTO(
				produto.getNome(),produto.getCaracteristicas().getQuantidade());
	}

}
