package exercicio02;

import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {

        Exercicio02 ex02 = new Exercicio02();

        ex02.add(120);
        ex02.add(121);
        ex02.add(122);
        System.out.println("Array peek: " + ex02.peek() + Arrays.toString(ex02.arrayInteiros));
        System.out.println("Array peek: " + ex02.pop());
        System.out.println("Array " + Arrays.toString(ex02.arrayInteiros));


    }

    int[] arrayInteiros = new int[0];

    public Exercicio02() {
        int[] vetor = new int[0];

    }

    public void add(int i) {
        int[] arraysCopy = Arrays.copyOf(arrayInteiros, arrayInteiros.length + 1);
        arraysCopy[arraysCopy.length - 1] = i;
        arrayInteiros = arraysCopy;
    }

    public int peek() {
        int itemRemocao = 0;
        for (int i : arrayInteiros) {
            if (i == arrayInteiros[arrayInteiros.length - 1]) {
                itemRemocao = i;
            }
        }
        return itemRemocao;
    }

    public int pop(){
        int itemRemocao = 0;
        for (int i : arrayInteiros){
            if ( i == arrayInteiros[arrayInteiros.length - 1]){
                itemRemocao = i;
                arrayInteiros[arrayInteiros.length - 1] -= itemRemocao;
            }
        }
        return itemRemocao;
    }
}
