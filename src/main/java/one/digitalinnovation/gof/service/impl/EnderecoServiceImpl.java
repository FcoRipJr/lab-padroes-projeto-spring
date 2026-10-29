package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.EnderecoService;

@Service 
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Endereco> buscarTodos() {
		return enderecoRepository.findAll();
	}

	@Override
	public Endereco buscarPorId(String cep) {
		Optional<Endereco> cliente = enderecoRepository.findById(cep);
		return cliente.get();
	}

}
