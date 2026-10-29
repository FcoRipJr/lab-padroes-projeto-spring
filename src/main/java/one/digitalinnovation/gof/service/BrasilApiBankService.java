package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Banco;

@FeignClient(name = "brasilapibank", url = "https://brasilapi.com.br/api/banks/v1")
public interface BrasilApiBankService {

    @GetMapping("/{code}")
    Banco consultarCode(@PathVariable("code") Long code);

}
