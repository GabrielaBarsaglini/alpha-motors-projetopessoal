package gft.controllers;

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

import gft.dto.fornecedor.ConsultaFornecedorDTO;
import gft.dto.fornecedor.FornecedorMapper;
import gft.dto.fornecedor.RegistroFornecedorDTO;
import gft.entities.Fornecedor;
import gft.services.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
private final FornecedorService fornecedorService;
	
	public FornecedorController(FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;
	}

	@GetMapping
	public ResponseEntity<Page<ConsultaFornecedorDTO>> listar(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(fornecedorService.listar(pageable).map(FornecedorMapper::fromEntity));		
	}
	
	@PostMapping
	public ResponseEntity<ConsultaFornecedorDTO> salvar(@RequestBody RegistroFornecedorDTO dto){
		
		Fornecedor fornecedor = fornecedorService.salvar(FornecedorMapper.fromDTO(dto));
		return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));
		
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaFornecedorDTO> buscar(@PathVariable Long id){

		Fornecedor fornecedor = fornecedorService.buscar(id);
		
		return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));
		
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaFornecedorDTO> alterar(@RequestBody RegistroFornecedorDTO dto,
			@PathVariable Long id){
		
		try {
		
			Fornecedor fornecedor = fornecedorService.atualizar(FornecedorMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaFornecedorDTO> excluir(@PathVariable Long id){
		
		try {
			fornecedorService.excluir(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
}
