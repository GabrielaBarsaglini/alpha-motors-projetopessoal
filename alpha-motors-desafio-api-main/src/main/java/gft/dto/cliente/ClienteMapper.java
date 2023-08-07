package gft.dto.cliente;

import gft.dto.endereco.EnderecoMapper;
import gft.entities.Cliente;

public class ClienteMapper {

	public static ConsultaClienteDTO fromEntity(Cliente cliente) {
		return new ConsultaClienteDTO(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getTelefone(),
				cliente.getEmail(), EnderecoMapper.fromEntity(cliente.getEndereco()));
	}

	public static Cliente fromDTO(RegistroClienteDTO dto) {
		return new Cliente(null, dto.getNome(), dto.getCpf(), dto.getTelefone(), dto.getEmail(),
				EnderecoMapper.fromDTO(dto.getEndereco()));
	}

}
