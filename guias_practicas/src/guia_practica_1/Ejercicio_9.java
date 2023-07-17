package guia_practica_1;

public class Ejercicio_9 {

    public static void getMoneyChanges(double quantity){

        double dollarChange = getDollars(quantity);
        double realChange = getReal(quantity);
        double guaraniChange = getGuarani(quantity);
        double pesoChange = getPeso(quantity);
        double euroChange = getEuro(quantity);

        System.out.println("El cambio de peso a peso es de : " + pesoChange);
        System.out.println("El cambio de peso a dolar es de : " + dollarChange);
        System.out.println("El cambio de peso a real es de : " + realChange);
        System.out.println("El cambio de peso a guarani es de : " + guaraniChange);
        System.out.println("El cambio de peso a euro es de : " + euroChange);

    }

    public static double getDollars(double quantity){
        double dollarChangeRate = 231.68;

        double change = quantity / dollarChangeRate ;
        return change;
    };

    public static double getEuro(double quantity){
        double euroChangeRate = 250.69;

        double change = quantity / euroChangeRate ;
        return change;
    };

    public static double getPeso(double quantity){
        double pesoChangeRate = 1;

        double change = quantity / pesoChangeRate ;
        return change;
    };

    public static double getGuarani(double quantity){
        double guaraniChangeRate = (double)1 / 31;

        // la conversión no es exacta :(
        double change = quantity / guaraniChangeRate ;
        return change;
    };

    public static double getReal(double quantity){
        double realChangeRate = 46.81;

        double change = quantity / realChangeRate ;
        return change;
    };

}
