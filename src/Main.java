import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double saldo=1080.53;
        System.out.println("Qual valor do saque?");
        double valorSacar=scan.nextDouble();

        if (valorSacar<saldo){
            System.out.println("Saldo insuficiente!!!");
        }else {
            System.out.println("Saque realizado com sucesso!!!");
        }

    }
}