package Rammstein;

public class vocalista extends Miembrobanda {
    private int nivelLanzallamas;

    public vocalista(String nombre, int nivelLanzallamas) {
        super(nombre, "Vocalista");
        this.nivelLanzallamas = nivelLanzallamas;
    }

    @Override
    public void tocarEnVivo() {
        System.out.println(getNombre() + " canta con voz grave y usa el lanzallamas nivel " + nivelLanzallamas + " fuego extremo");
    }
}

