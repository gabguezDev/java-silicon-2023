package guia_practica_1;

public class Ejercicio_8 {

    public static void getFahrenheitTemp(double celsiusTemp){
        double kelvinTemp = 273.15 + celsiusTemp;
        System.out.println("Temperatura en Kelvin = " + kelvinTemp);
    };

    public static void getKelvinTemp(double tempCelsius){
        double fahrenheitTemp = 1.8 * tempCelsius;
        System.out.println("Temperatura en Fahrenheit = " + fahrenheitTemp);
    };
}
