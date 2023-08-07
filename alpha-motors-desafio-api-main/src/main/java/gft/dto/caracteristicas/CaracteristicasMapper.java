package gft.dto.caracteristicas;

import gft.entities.Caracteristicas;

public class CaracteristicasMapper {
	
	
	public static Caracteristicas fromDTO(CaracteristicasDTO dto) {
		return new Caracteristicas( dto.getFornecedor(),dto.getDescricao(), dto.getQuantidade(), dto.getPrecoCusto(), dto.getPrecoVenda());
	}
	
	public static CaracteristicasDTO fromEntity(Caracteristicas caracteristicas) {
		return new CaracteristicasDTO(caracteristicas.getFornecedor(),caracteristicas.getDescricao(), caracteristicas.getQuantidade(), caracteristicas.getPrecoCusto(), caracteristicas.getPrecoVenda());
	}

}
