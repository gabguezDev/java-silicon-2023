package guia_practica_2;

class Animal {

    public String animal;
    public boolean isHerviboro;
    public boolean isMamifero;
    public boolean isDomestico;

    public Animal(String animal, boolean isHerviboro, boolean isMamifero, boolean isDomestico) {
        this.animal = animal;
        this.isHerviboro = isHerviboro;
        this.isMamifero = isMamifero;
        this.isDomestico = isDomestico;
    }

}

public class Ejercicio_7 {

    public boolean isHerviboro;
    public boolean isMamifero;
    public boolean isDomestico;


    public static Animal[] animalsList = {
            new Animal("Alce", true, true, false),
            new Animal("Caballo", true, true, true),
            new Animal("Caracol", true, false, false),
            new Animal("Cóndor", false, false, false),
            new Animal("Gato", false, true, true),
            new Animal("León", false, true, false),
            new Animal("Pitón", false, false, true),
            new Animal("Tortuga", true, false, true),
    };

    public Ejercicio_7() {
    }

    public void askHerviboro(String answer) {
        if (answer.equalsIgnoreCase("si")) {
            this.isHerviboro = true;
        } else {
            this.isHerviboro = false;
        }
    }

    public void askMamifero(String answer) {
        if (answer.equalsIgnoreCase("si")) {
            this.isMamifero = true;
        } else {
            this.isMamifero = false;
        }
    }

    public void askDomestico(String answer) {
        if (answer.equalsIgnoreCase("si")) {
            this.isDomestico = true;
        } else {
            this.isDomestico = false;
        }

    }

    public void guessAnimal() {
        for (int i = 0; i < animalsList.length; i++) {
            if (animalsList[i].isHerviboro == this.isHerviboro
                    && animalsList[i].isMamifero == this.isMamifero
                    && animalsList[i].isDomestico == this.isDomestico) {
                System.out.println("El animal correspondiente es: " + animalsList[i].animal);
            }
        }

    }

}