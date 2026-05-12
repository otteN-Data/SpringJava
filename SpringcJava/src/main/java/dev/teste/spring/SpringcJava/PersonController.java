package dev.teste.spring.SpringcJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Principais anotações para o Controller
@RestController // Notação para controlador
@RequestMapping// Notação necssária para mapeamento das informações no banco de dados.
public class PersonController {

    @GetMapping("/boasvindas") // Instancia uma rota para nossa dependencia do TOM CAT, abrindo o localhost na porta 8080 e definindo uma rota boasvindas para o usuario.
    public String boasVindas() {
        return "BEM-VINDO";
    }


}
