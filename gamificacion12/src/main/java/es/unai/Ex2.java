package es.unai;

public class Ex2 {
    public static void main(String[] args) {
        new Ex2().start();
    }

    private void start() {
        Persona[] personas = new Persona[5];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            personas[i].read();
        }

        System.out.println("Menores de edad:");
        for (int i = 0; i < personas.length; i++) {
            if(!personas[i].isOverAge()) {
                System.out.println(personas[i]);
            }
        }

        System.out.println("Mayores de edad:");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].isOverAge()) {
                System.out.println(personas[i]);
            }
        }

        System.out.println("Pertenecen a la 3ª edad:");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].isElder()) {
                System.out.println(personas[i]);
            }
        }

        System.out.println("Personas en su peso:");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getIMC() <= 20 && personas[i].getIMC() >= 25) {
                System.out.println(personas[i]);
            }
        }

        System.out.println("Personas con sobrepeso:");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getIMC() >= 25) {
                System.out.println(personas[i]);
            }
        }
    }
}
