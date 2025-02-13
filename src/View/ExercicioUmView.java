package View;
import Controller.ExercicioUmController;

import java.util.Scanner;

public class ExercicioUmView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioUmController ec = new ExercicioUmController();

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int resultado = ec.retornaNaturais(n);

        System.out.println("Resultado: "+ resultado);
    }
}
