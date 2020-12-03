package br.edu.brunno.geral.controllers;

import java.util.Optional;

import javax.print.attribute.standard.RequestingUserName;

import br.edu.brunno.geral.dao.PessoaDao;
import br.edu.brunno.geral.entidades.Pessoa;

public class PessoaController {

  public static Optional<Pessoa> obterPessoa() {

    // Optional<Pessoa> pessoa = Optional.of(null);//OF para certeza que vem valor
    // lnça nullpointer
    Optional<Pessoa> pessoa = Optional.ofNullable(PessoaDao.obterPessoa());// Para elementos que podem ou não vir
                                                                           // preenchidos, volta vazio

    return pessoa;

  }

  public static void registrarPresenca(String nome) {

    System.out.println("Fulano: " + nome + " presente.");

  }

  public static void registrarFalha() {
    System.out.println("Falhou....");
  }

}
