package gft.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.cliente.ClienteMapper;
import gft.dto.cliente.ConsultaClienteDTO;
import gft.dto.cliente.RegistroClienteDTO;
import gft.entities.Cliente;
import gft.services.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Cliente")
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@ApiOperation(value = "Listar")
	@GetMapping
	public List<ConsultaClienteDTO> listarTodos(){
		return clienteService.listarTodos().stream()
				.map(cliente -> ClienteMapper.fromEntity(cliente))
				.collect(Collectors.toList());
	}
	
	@ApiOperation(value = "Listar por Id")
	@GetMapping("/{id}")
	public ResponseEntity<ConsultaClienteDTO> listarPorId(@PathVariable Long id) {
		Cliente cliente = clienteService.buscar(id);
		if (cliente == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
	}
	
	@ApiOperation(value = "Salvar")
	@PostMapping 
	public ResponseEntity<ConsultaClienteDTO> salvar(@Valid @RequestBody RegistroClienteDTO dto){
		Cliente novoCliente =  clienteService.salvar(ClienteMapper.fromDTO(dto));
		return ResponseEntity.status(HttpStatus.CREATED).body(ClienteMapper.fromEntity(novoCliente));
	}
	
	
	@ApiOperation(value = "Atualizar")
	@PutMapping("/{id}")
	public ResponseEntity<ConsultaClienteDTO> atualizar(@PathVariable Long id, @RequestBody RegistroClienteDTO dto){
		Cliente clienteAtualizado = clienteService.atualizar(id, ClienteMapper.fromDTO(dto));
		return ResponseEntity.ok(ClienteMapper.fromEntity(clienteAtualizado));
	}
	
	@ApiOperation(value = "Deletar")
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		clienteService.deletar(id);
		
	}
	

}
