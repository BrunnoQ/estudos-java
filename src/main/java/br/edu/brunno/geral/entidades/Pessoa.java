package br.edu.brunno.geral.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
  
    private String nome;
    private String sobrenome;
    private Integer idade;

    @Override
    public String toString() {

        return System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %s \n", this.nome, this.sobrenome, this.idade)
                .toString();

    }
}
