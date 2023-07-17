package guia_practica_2;

public class Ejercicio_5 {

    public Ejercicio_5(int numero) {

        this.getFibonacci(numero);


    }

    public void getFibonacci(int numero) {

        int[] fibonacci = new int[numero];

        for (int i = 0; i < fibonacci.length; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.print("Serie de Fibonacci = ");
        for (int i = 0; i < fibonacci.length; i++) {
            if (i == fibonacci.length - 1) {
                System.out.print(fibonacci[i]+ "...");
            } else {
                System.out.print(fibonacci[i] + ", ");
            }
        }
    }
}
