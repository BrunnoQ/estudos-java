package br.edu.brunno.hackerhank;

import java.io.*;
import java.util.*;

public class SolutionBracket {

    static char openParenteses = '(';
    static char closedParenteses = ')';
    static char openChaves = '{';
    static char closedChaves = '}';
    static char openColchetes = '[';
    static char closedColchetes = ']';

    // BEGIN BQS CODE.
    static String isBalanced(String s) {

        char[] brackets = s.toCharArray();
        LinkedList<Character> closedBrackets = new LinkedList<Character>();
        char firstElement = brackets[0];

        if (firstElement == closedParenteses || firstElement == closedChaves || firstElement == closedColchetes) {
            return "NO";
        }

        for (char b : brackets) {

            /**
             * Se for chave aberta adiciona o seu equivalente num array auxiliar
             * Se NAO remove a chave fechada da PILHA e compra com o elemento corrente que 
             * tem que ser IGUAL, se nao for a string eh desbalanceada.
             * Se o array auxiliar estiver VAZIO eh ṕorque existem mais CHAVES fechadas do
             * QUE ABERTAS, ou seja, esta desbalanceada.
             */
            if (b != closedChaves && b != closedParenteses && b != closedColchetes) {
                closedBrackets.addFirst(equivalentClosedBracket(b));
            } else {
                if (closedBrackets.isEmpty() || closedBrackets.pop() != b){
                    return "NO";
                }
            }

        }

        //Se chegou aqui eh porque o input nao veio com mais chaves fechadas do que deveria!
        if(closedBrackets.isEmpty()){
            return "YES";
        } else {
            return "NO";
        }

    }

    private static char equivalentClosedBracket(char b) {

        if (b == openParenteses) {
            return closedParenteses;
        } else if (b == openChaves) {
            return closedChaves;
        } else {
            return closedColchetes;
        }

    }
// END BQS CODE.
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            
            System.out.println(result);
        
        }

        scanner.close();
    }
}
