/*
Fique pedindo para o usuário digitar números, até que ele digite zero. 
Em s/*eguida, mostre na tela a soma de todos os números digitados.
 */

import java.util.Scanner;

public class pratica04 {
    public static void main(String[] args) {
        Scanner dig = new Scanner (System.in);
        int  num, soma=0;
        
        do{
            System.out.print("Digite um número: ");
            num = dig.nextInt();
            soma = soma+num;        
        }while(num!=0);
        
        System.out.println("A soma dos números deu " + soma);
        
    }
    
}
