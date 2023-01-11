package es.unai;

public class CartaJuego {
    private Palo palo;
    private int numero;

    public CartaJuego(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Palo: " + palo + "\n" +
                "Número " + numero;
    }
}
