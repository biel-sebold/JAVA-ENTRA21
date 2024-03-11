/*
Faça um programa em Java que peça ao usuário digitar dois números inteiros.
Exiba na tela:
*QUAL O MAIOR NÚMERO
*QUAL O MENOR NÚMERO
*SE ELES SÕ IGUAIS
*/

import java.util.Scanner;

public class pratica02 {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        int n1, n2 = 0;
        
        System.out.print("Informe o primeiro número: ");
        n1 = dig.nextInt();
        
        System.out.print("Informe o segundo número: ");
        
        if (n1>n2){
            System.out.println("O maior número é " + n1);
            System.out.println("O menor número é " + n2);
        } else if (n2>n1){
            System.out.println("O maior número é " + n2);
            System.out.println("O menor número é " +n1);
        }else{
            System.out.println("Os números são iguais");
        }
    }    
}
