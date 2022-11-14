package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 14/11/2022
 * Last update:   14/11/2022
 * Description:   
 * Usage:         
 ******************************************************************************************************************* */
public class Ex1 {

    public static void main(String[] args) {
        new Ex1().start();
    }

    private void start() {
        Persona persona = new Persona("test", 10, "40383992P", 2600, 140.6, 45.7);
        Persona persona1 = new Persona();
        persona1.read();

        display(persona);
        display(persona1);
    }

    private void display(Persona persona1) {
        System.out.println(persona1);
        System.out.print(persona1.getName() + ": ");
        if (persona1.getIMC() < 20) {
            System.out.println("Está por debajo de su peso");
        }else if (persona1.getIMC() >= 20 && persona1.getIMC() <= 25) {
            System.out.println("Está en su peso ideal.");
        }else {
            System.out.println("Tiene sobrepeso");
        }
    }
}
