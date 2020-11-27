package br.edu.brunno.geral.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Brunno Silva
 * @since 26/11/2020
 * Estudos sobre expressões regulares
 * 
 */
public class TesteRegex {

   public static void main(String[] args) {
        
        validarCPF("335.901.451-60");

    }

    private static void validarCPF(String cpf){

        //Padrão a ser buscado
        String regexCPF = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(regexCPF);

        //Alvo que padrão será aplicado
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.find()){

            String match = matcher.group();
            String grupo = matcher.group(0);
            int start = matcher.start();
            int end = matcher.end();

            System.out.printf("Resultado: %s \n;" +
                               "Grupo: %s \n;" +
                               "Inicio: %s \n;" +
                               "Fim: %s", match, grupo, start, end);

        }
        else{
            System.out.println("Não Encontrou.");
        }

    }
    
}
