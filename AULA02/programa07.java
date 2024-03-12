package AULA02;
import java.util.Scanner;

public class programa07 {
    public static void main(String[] args) {
       String nome;
       Scanner dig = new Scanner(System.in);
       
       
       System.out.print("Por favor, insira seu nome: ");
       nome = dig.nextLine();
       
       System.out.println("O nome digitado foi " +nome);
       
       System.out.println("");
       
       
       if(nome.equals("Gabriel")){
           System.out.println("O nome é Gabriel");
       }else{
           System.out.println("O nome NÃO é Gabriel");
       }
    }
}
