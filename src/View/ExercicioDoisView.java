package View;
import Controller.ExercicioDoisController;

import java.util.Scanner;

public class ExercicioDoisView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExercicioDoisController ec = new ExercicioDoisController();

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++){
            System.out.println("Digite o valor do indice "+(i+1)+":");
            array[i] = sc.nextInt();
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        int menorValor = ec.encontrarMenorValor(array, array.length - 1, array[array.length - 1]);

        System.out.println(menorValor);
    }
}
