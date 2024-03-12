import java.util.Scanner;

public class programa04 {
    public static void main(String[] args) {
        Scanner digitado = new Scanner(System.in);
        int n1, n2, resultado;
        
        System.out.print("Digite o primeiro numero");
        n1 = digitado.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = digitado.nextInt();
        
        resultado = n1+n2;
        System.out.println("O resultado deu: " + resultado);
    }
}
