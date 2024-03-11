/*
Faça um programa em Java que peça ao usuário digitar dois números inteiros.
Exiba na tela:
*SOMA DOS NÚMEROS
*SUBTRAÇÃO DOS NÚMEROS
*MULTIPLICAÇÃO DOS NÚMEROS
 */

import java.util.Scanner;

public class pratica01 {
    public static void main(String[] args) {
        Scanner digitado = new Scanner(System.in);
        int n1, n2, soma, sub, mul;
        
        
        System.out.print("Digite o primeiro numero");
        n1 = digitado.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = digitado.nextInt();
        
        
        soma = n1+n2;
        System.out.println("O resultado deu: " + soma);
        
        sub = n1-n2;
        System.out.println("O resultado deu: " + sub);
        
        mul = n1*n2;
        System.out.println("O resultado deu: " + mul);
    }
    
}
