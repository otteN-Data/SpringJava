package dev.teste.spring.SpringcJava;

import jakarta.persistence.*;

@Entity // Transforma uma classe em uma entidade, o que possibilita a criação de bancos de dados.
@Table(name = "tb_cadastro_pessoa") // Nesta API utilizaremos uma tabela como exemplo.
public class PersonModel {

    @Id // Notação para ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera valores de ID sequenciais, 1, 2, 3, 4, 5, 6
    Long id;
    private String nome;
    private String email;
    private int idade;

    public PersonModel() {

    }

    public PersonModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    } // Utilização do Encapsulamento das variáveis.
}
