package View;

import Controller.ExercicioQuatroController;

import java.util.Scanner;

public class ExercicioQuatroView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioQuatroController ec = new ExercicioQuatroController();

        System.out.print("Digite a quantidade de indices do vetor:  ");
        int indice = sc.nextInt();

        int[] array = new int[indice];

        for(int i = 0; i < array.length; i++){
            System.out.print("digite o valor do indice "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        int resultado = ec.calculaNegativos(array, array.length - 1);

        System.out.println(resultado);
    }
}
