package View;

import Controller.ExercicioSeisController;

import java.util.Scanner;

public class ExercicioSeisView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioSeisController ec = new ExercicioSeisController();

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int resultado = ec.somarValores(a,b);

        System.out.println("Resultado: "+ resultado);
    }
}
