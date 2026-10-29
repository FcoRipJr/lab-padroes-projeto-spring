package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Banco;

public interface BancoService {

    Iterable<Banco> buscarTodos();

	Banco buscarPorId(Long code);
}
