package View;

import Controller.ExercicioCincoController;

import java.util.Scanner;

public class ExercicioCincoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioCincoController ec = new ExercicioCincoController();

        System.out.println("digite  valor de N: ");
        double n = sc.nextDouble();

        double resultado = ec.calculaSomatoria(n);

        System.out.println("resultado: "+ resultado);


    }
}
