package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.EnderecoService;

@RestController 
@RequestMapping("enderecos")
public class EnderecoRestController {

    @Autowired 
    private EnderecoService enderecoService;

    @GetMapping
	public ResponseEntity<Iterable<Endereco>> buscarTodos() {
		return ResponseEntity.ok(enderecoService.buscarTodos());
	}

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> buscarPorId(@PathVariable String cep) {
		return ResponseEntity.ok(enderecoService.buscarPorId(cep));
	}

}
