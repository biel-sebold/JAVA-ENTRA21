package AULA02;
/*
Peça ao usuário para digitar um número inteiro. Em seguida, mostre na tela a
tabuada desse número até 100.
 */

import java.util.Scanner;

public class pratica03 {
    public static void main(String[] args) {
       Scanner dig = new Scanner(System.in);
       int num;
       
       System.out.print("Digite um número inteiro: ");
       num = dig.nextInt();
       
       for(int i=0; i<=100; i++){
           System.out.println( num + "x" + i + "=" + num*i );
       }
    }
}  
       /*
       int i=0;      
       while(i<=100){
           System.out.println( num + "x" + i + "=" + num*i );
           i++;
       }
    }*/
