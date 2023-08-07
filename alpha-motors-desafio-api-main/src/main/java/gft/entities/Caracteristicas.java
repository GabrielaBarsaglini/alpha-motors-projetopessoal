package gft.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Embeddable
public class Caracteristicas {
	

	@ManyToOne
	@JoinColumn
	(name = "fornecedor_id", referencedColumnName = "id")
	private Fornecedor fornecedor;
	
	
	private String descricao;
	private Integer quantidade;
	
	@Column(name = "preco_custo")
	private BigDecimal precoCusto;
	
	@Column(name = "preco_venda")
	private BigDecimal precoVenda;
	

	
	
	public Caracteristicas() {
	}


	


	public Caracteristicas(Fornecedor fornecedor, String descricao, Integer quantidade, BigDecimal precoCusto,
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







