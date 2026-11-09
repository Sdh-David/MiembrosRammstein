package Rammstein;

public class Miembrobanda {
    private String nombre;
    private String rol;

    public Miembrobanda(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void tocarEnVivo() {
        System.out.println(this.nombre + " se está preparando en el escenario.");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}