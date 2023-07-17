package guia_practica_2;

import java.util.Arrays;

public class Ejercicio_3 {

    public Ejercicio_3(int[] arreglo) {

        this.sortArray(arreglo);

    }

    public int[] sortArray(int[] arreglo) {
        int[] sortedArr = arreglo;

        Arrays.sort(arreglo);

        System.out.print("Arreglo ordenado = ");
        System.out.print("{");
        for (int i = 0; i < arreglo.length; i++) {
            if (i != arreglo.length - 1) {
                System.out.print(arreglo[i] + ", ");
            } else {
                System.out.print(arreglo[i]);
            }
        }
        System.out.print("}");

        return sortedArr;
    }
}
