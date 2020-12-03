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
        validarEmail("brunno_.silva@teste.com.br");

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

            System.out.printf("Resultado: %s \n" +
                               "Grupo: %s \n" +
                               "Inicio: %s \n" +
                               "Fim: %s \n", match, grupo, start, end);

        }
        else{
            System.out.println("Não Encontrou.");
        }

    }

    private static void validarEmail(String email){

        String emailRegex = "^([\\w-\\.]+)@[\\w-]+(\\.[A-Za-z]{3})(\\.[A-Za-z]{2})?$";

        //Engine do JAva
        Pattern pattern = Pattern.compile(emailRegex);

        //Busca Resultado
        Matcher matcher = pattern.matcher(email);

        //Resultado
        if (matcher.find()) {
            
            String resultado = matcher.group();
            String grupo1 = matcher.group(0);
            String grupo2 = matcher.group(1);
            String grupo3 = matcher.group(2);
            String grupo4 = matcher.group(3);
            int inicio = matcher.start();
            int fim = matcher.end();

            System.out.printf("Resultado: %s \n" +
            "Grupo1: %s \n" +
            "Grupo2: %s \n" +
            "Grupo3: %s \n" +
            "Grupo4: %s \n" +
            "Inicio: %s \n" +
            "Fim: %s \n", resultado, grupo1, grupo2, grupo3, grupo4, inicio,fim);

        } else {
            System.out.println("Email Inválido!");
        }
            
    }
    
}
