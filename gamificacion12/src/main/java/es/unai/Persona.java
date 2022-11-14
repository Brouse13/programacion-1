package es.unai;


public class Persona {
    private String name;
    private int age;
    private String dni;
    private int postal_code;
    private double height;
    private double weight;

    public Persona() {
    }

    public Persona(String name, int age, String dni, int postal_code, double height, double weight) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.postal_code = postal_code;
        this.height = height;
        this.weight = weight;
    }

    public double getIMC() {
        return height / Math.pow(height, 2);
    }

    public boolean isOverAge() {
        return age >= 18;
    }

    public boolean isElder() {
        return age >= 65;
    }

    public boolean livesIn(int cp) {
        return cp == postal_code;
    }

    public void read() {
        System.out.print("Nombre: ");
        this.name = LT.readLine();
        System.out.print("Edad: ");
        this.age = LT.readInt();
        System.out.print("DNI: ");
        this.dni = LT.readLine();
        System.out.print("Código postal: ");
        this.postal_code = LT.readInt();
        System.out.print("Altura: ");
        this.height = LT.readDouble();
        System.out.print("Peso: ");
        this.weight = LT.readDouble();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "Nombre: " + name +
                "\nEdad: " + age +
                "\nNif: " + dni +
                "\nCógigo postal: " + postal_code +
                "\nAltura: " + height + " cms" +
                "\nPeso: " + weight + " kgs";
    }
}
