package gft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.funcionario.ConsultaFuncionarioDTO;
import gft.dto.funcionario.FuncionarioMapper;
import gft.dto.funcionario.RegistroFuncionarioDTO;
import gft.entities.Funcionario;
import gft.services.FuncionarioService;


@RestController
@RequestMapping("v1/funcionarios")
public class FuncionarioController {
	

	@Autowired
	private FuncionarioService funcionarioService;
	
	

	@GetMapping
	public ResponseEntity<Page<ConsultaFuncionarioDTO>> buscar(@PageableDefault(size = 3) Pageable pageable){
		
		return ResponseEntity.ok(funcionarioService.listarTodosOsFuncionarios(pageable).map(FuncionarioMapper::fromEntity));		
			
		
	}
	
	@PostMapping
	public ResponseEntity<ConsultaFuncionarioDTO> salvar(@RequestBody RegistroFuncionarioDTO dto){
		
		Funcionario funcionario = funcionarioService.salvar(FuncionarioMapper.fromDTO(dto));
		
		return ResponseEntity.ok(FuncionarioMapper.fromEntity(funcionario));
		
	}
	
	@GetMapping("{id}") // localhost:8080/v1/funcionarios/2
	public ResponseEntity<ConsultaFuncionarioDTO> buscarFuncionario(@PathVariable Long id){

		Funcionario funcionario = funcionarioService.buscar(id);
		
		return ResponseEntity.ok(FuncionarioMapper.fromEntity(funcionario));
		
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaFuncionarioDTO> alterar(@RequestBody RegistroFuncionarioDTO dto,
			@PathVariable Long id){
		
		try {
		
			Funcionario funcionario = funcionarioService.atualizar(FuncionarioMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(FuncionarioMapper.fromEntity(funcionario));
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaFuncionarioDTO> excluir(@PathVariable Long id){
		
		try {
			funcionarioService.excluir(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
		
}
