package AULA04;

public class projetoBanco {
    public static void main(String[] args) {
        //POLIMORFISMO

        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaPagamentos();

        c1.nomeTitular = "Gabriel";
        c1.numConta = 1;

        c2.nomeTitular = "Isabele";
        c2.numConta = 2;

        c1.depositar(50);
        c2.depositar(50);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.sacar(10);
        c2.sacar(10);

        System.out.println("Saldo após saque: " + c1.getSaldo());
        System.out.println("Saldo após saque: " + c2.getSaldo());

        /*System.out.println(c1.nomeTitular);
        System.out.println(c1.getSaldo());

        c1.depositar(50);
        System.out.println(c1.getSaldo());

        c1.sacar(20);
        System.out.println("Após saque; " + c1.getSaldo()); 

        c1.transferir(c2, 10);

        System.out.println("Saldo de c1 após transferência: " + c1.getSaldo());
        System.out.println("Saldo de c2 após transferência: " + c2.getSaldo()); 

        c1.sacar(20);
        System.out.println("Saldo após saque: " + c1.getSaldo());*/


    }
    
}



class Conta{

//Atributos
    public String nomeTitular;
    public int numConta;
    private double saldo;
    protected double taxaSaque = 1.0;



//Métodos 
    //(depositar)
    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    //(sacar)
    public boolean sacar(double valor){

        if(valor+this.taxaSaque<=this.saldo){
            //permite o saque
            this.saldo = this.saldo - valor - taxaSaque;
            return true;
 
        }else{
            //não permite o saque
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean transferir(Conta contaDestino, double valor){
        if(this.sacar(valor)==true) {
            contaDestino.depositar(valor);
            return true;  

        }else{
            return false;
        }
    }
}


class ContaPagamentos extends Conta{

    public boolean sacar(double valor){
        super.taxaSaque = 2.0;
        return super.sacar(valor);
    }
}

class ContaPoupanca extends Conta{
    public boolean sacar(double valor){
        super.taxaSaque = 0.50;
        return super.sacar(valor);
    }

}