package es.unai;

public class Tests {
    public static void main(String[] args) {
        Palabra palabra = new Palabra();
        while (Palabra.existWords()) {
            palabra.read();
        }
        System.out.println(palabra.contains(new char[]{'a', 'b', 'c'}));
    }
}
