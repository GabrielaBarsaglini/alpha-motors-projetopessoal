package gft.dto.funcionario;

import gft.dto.endereco.EnderecoMapper;
import gft.entities.Funcionario;

public class FuncionarioMapper {
	
	public static Funcionario fromDTO(RegistroFuncionarioDTO dto) {
		return new Funcionario(null, dto.getNome(), null, null, null, null, null, EnderecoMapper.fromDTO(dto.getEndereco()));	
		
	}
	public static ConsultaFuncionarioDTO fromEntity(Funcionario funcionario) {
		return new ConsultaFuncionarioDTO(funcionario.getId(), 
				funcionario.getNome(), EnderecoMapper.fromEntity(funcionario.getEndereco()));
	} 

}
