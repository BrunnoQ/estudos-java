package br.edu.brunno.geral.controllers;

import java.util.Optional;

import br.edu.brunno.anotacao.Anotacao;
import br.edu.brunno.geral.dao.PessoaDao;
import br.edu.brunno.geral.entidades.Pessoa;

@Anotacao("OI")
public class PessoaController {

  @Anotacao("OI")
  private String testeParaAnotacao;

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
