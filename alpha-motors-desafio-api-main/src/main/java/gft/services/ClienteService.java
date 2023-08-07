package gft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import gft.entities.Cliente;
import gft.exception.RegraNegocioException;
import gft.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	public List<Cliente> listarTodos(){
		return clienteRepository.findAll();
	}
	
	
	public Cliente buscar(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new EmptyResultDataAccessException(1));
	}
	
	
	public Cliente salvar(Cliente cliente) {
		validarClienteDuplicado(cliente);
		return clienteRepository.save(cliente);
	}
	
	
	public Cliente atualizar(Long id, Cliente cliente) {
		Cliente clienteAtualizar = buscar(id);
		validarClienteDuplicado(cliente);
		BeanUtils.copyProperties(cliente, clienteAtualizar, "id");
		return clienteRepository.save(clienteAtualizar);
	}
	
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public void validarClienteDuplicado(Cliente cliente) {
		Cliente clienteDuplicado = clienteRepository.findByCpf(cliente.getCpf());
		if(clienteDuplicado != null && clienteDuplicado.getId() != cliente.getId()) {
			throw new RegraNegocioException(String.format("Cliente %s já cadastrado", clienteDuplicado.getNome()));
		}
	}

}
