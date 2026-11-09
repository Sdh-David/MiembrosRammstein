package Rammstein;

public class Main {
    public static void main(String[] args) {
        managerderammstein gestor = new managerderammstein();
        gestor.cargarDesdeCSV("src/Rammstein/rammstein.csv");

        System.out.println("QUE EMPIECE EL SHOWWWW");
        
        
        for (Miembrobanda miembro : gestor.getBanda()) {
            miembro.tocarEnVivo();
        }
    }
}