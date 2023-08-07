package gft.dto.produto;

import gft.dto.caracteristicas.CaracteristicasDTO;

public class ConsultaProdutoDTO {

	private Long id;
	private String nome;
	private CaracteristicasDTO caracteristicas;
	
	
	public ConsultaProdutoDTO() {
	}
	public ConsultaProdutoDTO(Long id, String nome, CaracteristicasDTO caracteristicas) {
		this.id = id;
		this.nome = nome;
		this.caracteristicas = caracteristicas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CaracteristicasDTO getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(CaracteristicasDTO caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	
}
