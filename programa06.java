import java.util.Scanner;

public class programa06 {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        double Nota;
        
        System.out.print("Digite a nota: ");
        Nota = dig.nextDouble();
        
        if(Nota>=7){
            System.out.println("Aluno Aprovado");
        } else{
            System.out.println("Aluno Reprovado");
        }
    }
    
}
