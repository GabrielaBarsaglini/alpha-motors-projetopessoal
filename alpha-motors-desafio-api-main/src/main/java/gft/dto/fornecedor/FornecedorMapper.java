package gft.dto.fornecedor;

import gft.dto.endereco.EnderecoMapper;
import gft.entities.Fornecedor;

public class FornecedorMapper {
	
	public static Fornecedor fromDTO(RegistroFornecedorDTO dto) {
		return new Fornecedor(null, dto.getRazaoSocial(), dto.getCnpj(), dto.getTelefone(), dto.getEmail(), 
				EnderecoMapper.fromDTO(dto.getEndereco()));
	}
	
	
	public static ConsultaFornecedorDTO fromEntity(Fornecedor fornecedor) {
		return new ConsultaFornecedorDTO(fornecedor.getId(), fornecedor.getRazaoSocial(), fornecedor.getCnpj(),
				fornecedor.getTelefone(), fornecedor.getEmail(), EnderecoMapper.fromEntity(fornecedor.getEndereco()));
	}
}
