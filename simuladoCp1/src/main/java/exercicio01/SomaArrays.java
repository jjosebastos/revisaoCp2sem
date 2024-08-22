package exercicio01;

import java.util.Arrays;

public class SomaArrays {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++){
            vetorC[i] += vetorA[i] + vetorB[i];
        }
        System.out.println("Vetor C soma: " + Arrays.toString(vetorC));

    }
}
