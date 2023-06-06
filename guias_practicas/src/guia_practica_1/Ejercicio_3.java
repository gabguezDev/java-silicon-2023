package guia_practica_1;

public class Ejercicio_3 {

    public static void processTwoNumbers(int a, int b){

        Ejercicio_3.sum(a,b);
        Ejercicio_3.minus(a,b);
        Ejercicio_3.prod(a,b);
        Ejercicio_3.div(a,b);
    }

    private static void sum(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

    }

    private static void minus(int a, int b){
        int min = a - b;
        System.out.println(a + " - " + b + " = " + min);

    }

    private static void prod(int a, int b){

        int prod = a * b;
        System.out.println(a + " x " + b + " = " + prod);

    }

    private static void div(int a, int b){
        int div = a / b;
        System.out.println(a + " / " + b + " = " + div);
    }

}
