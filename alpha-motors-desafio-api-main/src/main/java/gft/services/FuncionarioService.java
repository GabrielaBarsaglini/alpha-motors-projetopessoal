package gft.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.entities.Funcionario;
import gft.repositories.FuncionarioRepository;


@Service
public class FuncionarioService {

private final FuncionarioRepository funcionarioRepository;
	
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
		
	public Funcionario salvar(Funcionario funcionario) {
		
		return funcionarioRepository.save(funcionario);
		
	}
	
    public Page<Funcionario> listarTodosOsFuncionarios(Pageable pageable){
		
		return funcionarioRepository.findAll(pageable);
		
	}

	public Funcionario buscar(Long id) {
		Optional<Funcionario> optional = funcionarioRepository.findById(id);
		
		return optional.orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado") );
		
	}
	
	public Funcionario atualizar(Funcionario funcionario, Long id) {
		
		Funcionario funcionarioOriginal = this.buscar(id);
		
		funcionario.setId(funcionarioOriginal.getId());
		
		return funcionarioRepository.save(funcionario);
		
	}

	public void excluir(Long id) {
		Funcionario funcionarioOriginal = this.buscar(id);
		
		funcionarioRepository.delete(funcionarioOriginal);
		
	}


}
