package gft.dto.funcionario;

import gft.dto.endereco.EnderecoDTO;

public class RegistroFuncionarioDTO {
	
	private String nome;
	private EnderecoDTO endereco;
	
	
	public RegistroFuncionarioDTO() {
	
	}

	public RegistroFuncionarioDTO(String nome, EnderecoDTO endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
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
