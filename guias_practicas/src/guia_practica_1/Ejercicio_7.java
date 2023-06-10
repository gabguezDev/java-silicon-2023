package guia_practica_1;

public class Ejercicio_7 {

    public static void changeVariables(int a, int b){

        int aux;

        int variableA = a;
        int variableB = b;

        System.out.println("Variable A = " + variableA);
        System.out.println("Variable B = " + variableB);

        System.out.println("Procedemos a intercambiar sus valores.");

        aux = variableA;
        variableA = variableB;
        variableB = aux;

        System.out.println("Valores cambiados.");
        System.out.println("Nueva variableA = " + variableA);
        System.out.println("Nueva variableB = " + variableB);

    };
}
