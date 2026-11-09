package Rammstein;
public class Guitarrista extends Miembrobanda {
    private String tipoGuitarra;

    public Guitarrista(String nombre, String tipoGuitarra) {
        super(nombre, "Guitarrista");
        this.tipoGuitarra = tipoGuitarra;
    }

    @Override
    public void tocarEnVivo() {
        System.out.println(getNombre() + " toca  riffs pesados con su guitarra " + tipoGuitarra + " Guitarra electrica");
    }
}