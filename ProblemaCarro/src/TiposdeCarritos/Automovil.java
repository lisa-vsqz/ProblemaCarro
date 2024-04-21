package TiposdeCarritos;

public class Automovil extends Terrestre {
    private Combustible combustible;
    private Traccion traccion;
    private int numeroRuedas;

    public Automovil(Combustible combustible, Traccion traccion, int numeroRuedas) {
        this.combustible = combustible;
        this.traccion = traccion;
        this.numeroRuedas = numeroRuedas;
    }
}
