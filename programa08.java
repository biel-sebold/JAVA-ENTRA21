import java.util.Scanner;

public class programa08 {
    public static void main(String[] args) {
       Scanner dig = new Scanner(System.in);
       int idade;
       String sexo;
       
       System.out.println("Digite seu Sexo (H ou M)");
       sexo = dig.nextLine();
       sexo = sexo.toLowerCase();
       
       System.out.print("Digite a sua idade");
       idade = dig.nextInt();
       
       if(sexo.equals("h") && idade >= 65 || sexo.equals("m") && idade >= 62){
           System.out.println("POde se aposentar");
       }else{
           System.out.println("Não pode se aposentar");
       }
    }
}
