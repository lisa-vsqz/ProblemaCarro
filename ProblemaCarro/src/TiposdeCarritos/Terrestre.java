package TiposdeCarritos;

public class Terrestre extends Vehiculo {
    private Traccion traccion;
    private int numeroRuedas;
    public void abrirPuerta(){
        System.out.println("Abrir Puerta");
    }
    public void setIracccion(Traccion traccion) {
        this.traccion = traccion;
    }

    @Override
    public void frenar() {
        System.out.println("vehiculo terrestre frenado");
    }
}
