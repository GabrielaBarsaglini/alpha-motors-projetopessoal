package gft.dto.produto;

import gft.dto.caracteristicas.CaracteristicasDTO;

public class RegistroProdutoDTO {
	
	private String nome;
    private CaracteristicasDTO caracteristicas;
	
    
    
    public RegistroProdutoDTO() {
	}
	public RegistroProdutoDTO(String nome, CaracteristicasDTO caracteristicas) {
		this.nome = nome;
		this.caracteristicas = caracteristicas;
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
