package guia_practica_1;

public class Ejercicio_6 {

    public static void getfinalPrice(double discountPercentage, double price){
        double discount = discountPercentage * price / 100;

        System.out.println("Importe descontado = " + discount);

        double finalPrice = price - discount;

        System.out.println("Precio final con descuento = " + finalPrice);
    }

}
