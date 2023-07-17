package guia_practica_2;

public class Ejercicio_1 {

    public Ejercicio_1(int entero) {

        this.showTable(entero);

    }

    public void showTable(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }

}
