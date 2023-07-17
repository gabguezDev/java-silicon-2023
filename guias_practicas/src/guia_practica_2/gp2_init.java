package guia_practica_2;

import java.util.Scanner;

public class gp2_init {

    public gp2_init() {
    }

    public void runGp2() {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------");
        System.out.println("Ejercicio n° 1");
        System.out.println("----------------");
        System.out.print("Ingrese un numero entero: ");

        Ejercicio_1 ej1 = new Ejercicio_1(input.nextInt());

        System.out.println("----------------");
        System.out.println("Ejercicio n° 2");
        System.out.println("----------------");

        System.out.print("Ingrese una palabra: ");
        Ejercicio_2 ej2 = new Ejercicio_2(input.nextLine());

        System.out.println("----------------");
        System.out.println("Ejercicio n° 3");
        System.out.println("----------------");

        System.out.println("Arreglo a ordenar de manera ascendente: {19, 3, 10, 12, 58, 20, 15, 33} ");
        int[] arreglo = {19,3,10,12,58,20,15,33};
        Ejercicio_3 ej3 = new Ejercicio_3(arreglo);


        System.out.println("----------------");
        System.out.println("Ejercicio n° 4");
        System.out.println("----------------");

        System.out.print("Ingrese un numero entero: ");
        Ejercicio_4 ej4 = new Ejercicio_4(input.nextInt());

        System.out.println("----------------");
        System.out.println("Ejercicio n° 5");
        System.out.println("----------------");

        System.out.print("Ingrese un numero entero: ");
        Ejercicio_5 ej5 = new Ejercicio_5(input.nextInt());

        System.out.println("----------------");
        System.out.println("Ejercicio n° 6");
        System.out.println("----------------");

        Ejercicio_6 ej6 = new Ejercicio_6();

        System.out.println("----------------");
        System.out.println("Ejercicio n° 7");
        System.out.println("----------------");

        Ejercicio_7 ej7 = new Ejercicio_7();

        System.out.print("Es herviboro? Si | No : ");
        ej7.askHerviboro(input.nextLine());

        System.out.print("Es mamifero? Si | No : ");
        ej7.askMamifero(input.nextLine());

        System.out.print("Es domestico? Si | No : ");
        ej7.askDomestico(input.nextLine());

        ej7.guessAnimal();
    }

}
