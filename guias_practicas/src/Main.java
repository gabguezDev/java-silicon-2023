import guia_practica_1.Ejercicio_1;
import guia_practica_1.Ejercicio_2;
import guia_practica_1.Ejercicio_3;
import guia_practica_1.Ejercicio_4;
import guia_practica_1.Ejercicio_5;
import guia_practica_1.Ejercicio_6;
import guia_practica_1.Ejercicio_7;
import guia_practica_1.Ejercicio_8;
import guia_practica_1.Ejercicio_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ejercicio n° 1

        Ejercicio_1.sayHelloWorld();

        //Ejercicio n° 2
        System.out.print("Ingrese su nombre: ");
        String nameInput = input.nextLine();
        Ejercicio_2.sayHelloToMe(nameInput);

        //Ejercicio n° 3
        System.out.println("Ejercicio n° 3");
        System.out.print("Ingrese el numero entero A: ");
        int numAInput = input.nextInt();
        System.out.print("Ingrese el numero enter B: ");
        int numBInput = input.nextInt();
        Ejercicio_3.processTwoNumbers(numAInput,numBInput);

        //Ejercicio n° 4
        System.out.println("Ejercicio n° 4");
        System.out.print("Ingrese la primer altura (utilice coma para numeros decimales): ");
        float numCInput = input.nextFloat();
        System.out.print("Ingrese la segunda altura (utilice coma para numeros decimales): ");
        float numDInput = input.nextFloat();
        System.out.print("Ingrese la tercera altura (utilice coma para numeros decimales): ");
        float numEInput = input.nextFloat();
        Ejercicio_4.getPromHeight(numCInput,numDInput,numEInput);

        //Ejercicio n° 5
        System.out.println("Ejercicio n° 5");
        System.out.print("Ingrese el radio del circulo (utilice coma para numeros decimales): ");
        float circleRatioInput = input.nextFloat();
        Ejercicio_5.getCircleArea(circleRatioInput);
        Ejercicio_5.getCirclePerim(circleRatioInput);

        //Ejercicio n° 6
        System.out.println("Ejercicio n° 6");
        System.out.print("Ingrese el procentage de descuento (utilice coma para numeros decimales): ");
        double percentageInput = input.nextDouble();
        System.out.print("Ingrese el precio original: ");
        double originalPriceInput = input.nextDouble();
        Ejercicio_6.getfinalPrice(percentageInput, originalPriceInput);

        //Ejercicio n° 7
        System.out.println("Ejercicio n° 7");
        System.out.print("Ingrese la variable entera A: ");
        int variableAInput = input.nextInt();
        System.out.print("Ingrese la variable entera B: ");
        int variableBInput = input.nextInt();
        Ejercicio_7.changeVariables(variableAInput,variableBInput);

        //Ejercicio n° 8
        System.out.println("Ejercicio n° 8");
        System.out.print("Ingrese la temperatura en Celsius (utilice coma para numeros decimales): ");
        double celsiusTempInput = input.nextDouble();
        Ejercicio_8.getFahrenheitTemp(celsiusTempInput);
        Ejercicio_8.getKelvinTemp(celsiusTempInput);

        //Ejercicio n° 9
        System.out.println("Ejercicio n° 9");
        System.out.print("Ingrese la cantidad de pesos argentinos a cambiar (utilice coma para numeros decimales): ");
        double quantityInput = input.nextDouble();
        Ejercicio_9.getMoneyChanges(quantityInput);
    }
}