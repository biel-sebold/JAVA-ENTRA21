package AULA03;

import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] notas = new int[3];
        double media;

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = entrada.nextInt();
        }

        for(int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    
}
