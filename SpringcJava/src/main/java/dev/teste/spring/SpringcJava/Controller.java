package dev.teste.spring.SpringcJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Principais anotações para o Controller
@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "BEM-VINDO";
    }
}
