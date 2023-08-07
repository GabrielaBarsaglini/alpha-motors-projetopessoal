package gft.dto.cliente;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import gft.dto.endereco.EnderecoDTO;

public class RegistroClienteDTO {
	
	@NotBlank(message = "Nome")
	private String nome;
	
	@NotBlank(message = "Cpf")
	@Length(min = 11, max = 11, message = "Cpf")
	private String cpf;
	
	@NotBlank(message = "Telefone")
	@Length(min = 10, max = 11, message = "Telefone")
	private String telefone;
	
	@NotBlank(message = "Email")
	private String email;
	private EnderecoDTO endereco;
	
	public RegistroClienteDTO() {
	}

	public RegistroClienteDTO(String nome, String cpf, String telefone, String email, EnderecoDTO endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	

}
