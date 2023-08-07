package gft.dto.fornecedor;

import gft.dto.endereco.EnderecoDTO;

public class ConsultaFornecedorDTO {

	private Long id;
	private String razaoSocial;
	private String cnpj;

	private String telefone;
	private String email;
	private EnderecoDTO endereco;
	
	public ConsultaFornecedorDTO() {
	}
	
	
	public ConsultaFornecedorDTO(Long id, String razaoSocial, String cnpj, String telefone, String email,
			EnderecoDTO endereco) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
