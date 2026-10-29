package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Agencia;

public interface AgenciaService {

    Iterable<Agencia> buscarTodos();

	Agencia buscarPorId(Long id);

	void inserir(Agencia agencia);

	void atualizar(Long id, Agencia agencia);

	void deletar(Long id);
}
