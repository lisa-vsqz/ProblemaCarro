package TiposdeCarritos;

public abstract class Vehiculo {
    private int galonesGasolina;
    private String marca;
    private String modelo;

    public void arrancar(){
        System.out.println ("arrancar");
    }

    public void acelerar(){
        System.out.println ("acelerar");
    }

    public abstract void frenar();
}