package br.edu.brunno.geral;

import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
      
        PriorityQueue<String> filaDoBanco = new PriorityQueue<String>();

        filaDoBanco.add("Brunno");
        filaDoBanco.add("Renata");
        filaDoBanco.add("Stephanie");
        filaDoBanco.add("Amanda");
        filaDoBanco.add("Amanda2");
        filaDoBanco.add("Amanda3");

        System.out.println(filaDoBanco.stream().collect(Collectors.toList()));

        
    }

}