package es.unai;

public class BarajaSpain {
    private final CartaJuego[] baraja = new CartaJuego[48];
    private int cartasExtraidas = 0;

    public BarajaSpain() {
        generacionBaraja();
    }

    //void::barajar -> mezcla cartas
    //Programa clase baraja extraer todas las cartas mezcladas

    private void generacionBaraja() {
        for (int i = 0; i < Palo.values().length; i++) {
            for (int j = 0; j < 12; j++) {
                baraja[i * j + j] = new CartaJuego(Palo.values()[i], j + 1);
            }
        }
    }

    public CartaJuego extraerCarta() {
        if (cartasExtraidas == baraja.length) {
            System.out.println("No se pueden extraer más cartas");
            return null;
        }
        cartasExtraidas++;
        return baraja[cartasExtraidas - 1];
    }
}
