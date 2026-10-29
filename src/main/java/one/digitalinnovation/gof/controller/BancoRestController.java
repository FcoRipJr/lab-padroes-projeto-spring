package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Banco;
import one.digitalinnovation.gof.service.BancoService;

@RestController 
@RequestMapping("bancos")
public class BancoRestController {

    @Autowired 
    private BancoService bancoService;

    @GetMapping
	public ResponseEntity<Iterable<Banco>> buscarTodos() {
		return ResponseEntity.ok(bancoService.buscarTodos());
	}

	@GetMapping("/{code}")
	public ResponseEntity<Banco> buscarPorId(@PathVariable Long code) {
		return ResponseEntity.ok(bancoService.buscarPorId(code));
	}

}
