package gft.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private String telefone;
	
	private String email;

	private String username;
	
	@Column(name = "senha")
	private String password;
	
	
	@Embedded
	private Endereco endereco;
	
	//@ElementCollection(fetch = FetchType.EAGER)
	//@CollectionTable(name = "tb_funcionario_roles", joinColumns = @JoinColumn(name = "funcionario_id"))
	//@Column(name = "role_id")
	//private List<String>roles = new ArrayList<>();
	
	

	public Funcionario() {
	
	}

	

	public Funcionario(Long id, String nome, String cpf, String telefone, String email, String username,
			String password, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return getUsername();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return getPassword();
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

	//public List<String> getRoles() {
	//	return roles;
	//}

	//public void setRoles(List<String> roles) {
	//	this.roles = roles;
	//}


	