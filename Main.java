package baskara;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Baskara formula = new Baskara();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o Valor de C: ");
        double c = sc.nextDouble();

        double resultado = formula.formula(a, b, c);

        if (String.valueOf(resultado).equalsIgnoreCase("nan")) {
            System.out.println("Dados da equação invalida");

        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
}