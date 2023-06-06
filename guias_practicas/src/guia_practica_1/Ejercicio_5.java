package guia_practica_1;

public class Ejercicio_5 {

    public static void getCircleArea(float circleRatio){
        double area = Math.pow(circleRatio,2) * Math.PI;
        System.out.println("Area del circulo = " + area);
    };
    public static void getCirclePerim(float circleRatio){
        double perim = 2 * circleRatio * Math.PI;
        System.out.println("Perimetro del circulo = " + perim);
    };
}
