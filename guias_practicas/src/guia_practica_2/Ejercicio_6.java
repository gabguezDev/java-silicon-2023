package guia_practica_2;

public class Ejercicio_6 {

    public Ejercicio_6() {
        this.getList();
    }

    public void getList() {
        for (int i = 2; i < 20; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && (i != 2 || i != 3 || i != 5)) {
                System.out.print(" [" + i + "] ");
            }

            if (i == 2 || i == 3 || i == 5) {
                System.out.print(" [" + i + "] ");
            }

        }
    }

}
