package br.edu.brunno.geral.regex;

import java.util.Optional;

import br.edu.brunno.geral.controllers.PessoaController;
import br.edu.brunno.geral.entidades.Pessoa;

public class PessoaRun {

    public static void main(String[] args) {

        Optional<Pessoa> pessoa2 = Optional.empty();
        Optional<Pessoa> pessoa = PessoaController.obterPessoa();

        // Exemplos:
        // Validar se esta presente
        System.out.println(pessoa.isPresent());
        // Criação de entidade VAZIA
        System.out.println(Optional.empty());
        // Pessoa Optional
        System.out.println(pessoa);
        // resultado
        System.out.println(pessoa.get());// Para certeza que volta valor , ler documentação
        // resultado
        System.out.println(pessoa.orElseGet(Pessoa::new));// Pega uma pessoa caso contrário pega uma outra do parâmetro
        // resultado
        System.out.println(pessoa.orElse(new Pessoa()));// Volta outra pessoa se não existir pode orquestrar outra
                                                        // chamada para obter pessoa
        // exception
        System.out.println(pessoa.orElseThrow(IllegalArgumentException::new));// Lança exception se nao encontrar
        // Orquestração
        pessoa.ifPresentOrElse(p -> PessoaController.registrarPresenca(p.getNome()),
                () -> PessoaController.registrarFalha());// Orquestração
        // MAP
        System.out.println(pessoa.map(Pessoa::getNome).orElse("Desconhecido"));// Busca outro valor

    }

}
