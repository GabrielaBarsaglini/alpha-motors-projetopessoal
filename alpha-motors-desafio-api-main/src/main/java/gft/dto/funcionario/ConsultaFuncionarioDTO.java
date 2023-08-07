package gft.dto.funcionario;

import gft.dto.endereco.EnderecoDTO;

public class ConsultaFuncionarioDTO {
	private Long id;
	private String nome;
	private EnderecoDTO endereco;
	
	
	
	
	public ConsultaFuncionarioDTO() {
		
	}
	
	public ConsultaFuncionarioDTO(Long id, String nome, EnderecoDTO endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
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
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	
	

}
