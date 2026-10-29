package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

public interface EnderecoService {

    Iterable<Endereco> buscarTodos();

	Endereco buscarPorId(String cep);
}
