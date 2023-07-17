package guia_practica_2;

public class Ejercicio_4 {

    public Ejercicio_4(int numero) {
        this.getFactorial(numero);
    }

    public void getFactorial(int numero) {

        int factorial = 1;
        String multiplierString = "";

        for (int i = 1; i < numero + 1; i++) {
            factorial *= i;

            if (i == numero) {
                multiplierString += i;
            } else {
                multiplierString += i + " x ";
            }
        }

        System.out.println("El factorial de " + numero + " es " + multiplierString + " = " + factorial);

    }
}
