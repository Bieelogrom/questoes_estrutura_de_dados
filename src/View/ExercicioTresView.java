package View;

import Controller.ExercicioTresController;

import java.util.Scanner;

public class ExercicioTresView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioTresController ec = new ExercicioTresController();

        int valor;

        do {
            System.out.print("Digite o valor para calcular: ");
            valor = sc.nextInt();
            System.out.println((valor > 12) ? "Somente valores menores ou iguais a 12!" : "");
        } while (valor > 12);

        int resultado = ec.calculaFatorial(valor);
        System.out.println("Resultado: "+ resultado);
    }
}
