package gft.dto.caracteristicas;

import java.math.BigDecimal;

import gft.entities.Fornecedor;

public class CaracteristicasDTO {

	//razaõ social na entidade forneedor
	private Fornecedor fornecedor;
	private String descricao;
	private Integer quantidade;
	private BigDecimal precoCusto;
	private BigDecimal precoVenda;
	
	
	
	public CaracteristicasDTO() {
	}


	

	public CaracteristicasDTO(Fornecedor fornecedor, String descricao, Integer quantidade, BigDecimal precoCusto,
			BigDecimal precoVenda) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}




	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Integer getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}



	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}



	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}



	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}



	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}
	


	


	
	
}
