package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Agencia;
import one.digitalinnovation.gof.model.AgenciaRepository;
import one.digitalinnovation.gof.model.Banco;
import one.digitalinnovation.gof.model.BancoRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.AgenciaService;
import one.digitalinnovation.gof.service.BrasilApiBankService;
import one.digitalinnovation.gof.service.ViaCepService;

@Service 
public class AgenciaServiceImpl implements AgenciaService {

    @Autowired 
    private AgenciaRepository agenciaRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private BancoRepository bancoRepository;
	@Autowired
	private ViaCepService viaCepService;
	@Autowired 
	private BrasilApiBankService brasilApiBankService;

    @Override
    public Iterable<Agencia> buscarTodos() {
		return agenciaRepository.findAll();
	}

	@Override
	public Agencia buscarPorId(Long id) {
		Optional<Agencia> agencia = agenciaRepository.findById(id);
		return agencia.get();
	}

	@Override
	public void inserir(Agencia agencia) {
		salvarAgenciaComBancoCep(agencia);
	}

	@Override
	public void atualizar(Long id, Agencia agencia) {
		Optional<Agencia> agenciaBd = agenciaRepository.findById(id);
		if (agenciaBd.isPresent()) {
			salvarAgenciaComBancoCep(agencia);
		}
	}

	@Override
	public void deletar(Long id) {
		agenciaRepository.deleteById(id);
	}

	private void salvarAgenciaComBancoCep(Agencia Agencia) {
		String cep = Agencia.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		Agencia.setEndereco(endereco);

		Long code = Agencia.getBanco().getCode();
		Banco banco = bancoRepository.findById(code).orElseGet(() -> {
			Banco novoBanco = brasilApiBankService.consultarCode(code);
			bancoRepository.save(novoBanco);
			return novoBanco;
		});
		Agencia.setBanco(banco);
		agenciaRepository.save(Agencia);
	}
}
