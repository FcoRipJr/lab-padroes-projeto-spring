package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Banco;
import one.digitalinnovation.gof.model.BancoRepository;
import one.digitalinnovation.gof.service.BancoService;

@Service 
public class BancoServiceImpl implements BancoService {

	@Autowired
	private BancoRepository bancoRepository;

    @Override
    public Iterable<Banco> buscarTodos() {
		return bancoRepository.findAll();
	}

	@Override
	public Banco buscarPorId(Long code) {
		Optional<Banco> cliente = bancoRepository.findById(code);
		return cliente.get();
	}

}
