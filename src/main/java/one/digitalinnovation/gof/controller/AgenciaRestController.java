package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Agencia;
import one.digitalinnovation.gof.service.AgenciaService;

@RestController 
@RequestMapping("agencias")
public class AgenciaRestController {

    @Autowired 
    private AgenciaService agenciaService;

    @GetMapping
	public ResponseEntity<Iterable<Agencia>> buscarTodos() {
		return ResponseEntity.ok(agenciaService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Agencia> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(agenciaService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<Agencia> inserir(@RequestBody Agencia agencia) {
		agenciaService.inserir(agencia);
		return ResponseEntity.ok(agencia);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Agencia> atualizar(@PathVariable Long id, @RequestBody Agencia agencia) {
		agenciaService.atualizar(id, agencia);
		return ResponseEntity.ok(agencia);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		agenciaService.deletar(id);
		return ResponseEntity.ok().build();
	}
}
