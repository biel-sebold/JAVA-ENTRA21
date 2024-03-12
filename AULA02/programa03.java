package AULA02;
import java.util.Scanner;

public class programa03 {
    
    public static void main(String[] args) {
       Scanner valor = new Scanner (System.in);
       
       int numero;
       
       System.out.println("Digite um numero:");
       numero = valor.nextInt();
               
       System.out.print("O numero digitado foi " + numero);        
    } 
}