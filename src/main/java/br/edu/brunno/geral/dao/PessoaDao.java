package br.edu.brunno.geral.dao;

import br.edu.brunno.geral.entidades.Pessoa;

public class PessoaDao {

    public static Pessoa obterPessoa(){

        Pessoa pessoa = new Pessoa("Brunno","Silva", 32);

        return pessoa;
        
    }
    
}
