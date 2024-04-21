import TiposdeCarritos.Automovil;
import TiposdeCarritos.Combustible;
import TiposdeCarritos.Traccion;
import TiposdeCarritos.Vehiculo;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        //UTILIZANDO REFLEXION
        //Explicación: cuando creamos una instancia de Automovil, aunque la referencia sea de tipo Vehiculo, en realidad estamos creando un objeto de tipo Automovil
        // Si solo se tiene la clase abstracta Vehiculo y no hay subclases concretas, entonces no puedes crear instancias directas de Vehiculo


        final String CLAZZ = "TiposdeCarritos.Automovil";
        Vehiculo[] vehiculos = new Vehiculo[10];

        try {
            Class<?> vehi = Class.forName(CLAZZ);

            for (int i = 0; i < vehiculos.length; i++) {

                Class<?>[] tiposParametros = {Combustible.class, Traccion.class, int.class};
                java.lang.reflect.Constructor<?> constructor = vehi.getConstructor(tiposParametros);
                vehiculos[i] = (Vehiculo) constructor.newInstance(Combustible.GASOLINA, Traccion.DELANTERA, 4);
                System.out.println("vehículo num: " + i);
                vehiculos[i].arrancar();

            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e){
            throw new RuntimeException(e);
        }
    }

}

//SIN REFELXION

/*
        Vehiculo[] vehiculos = new Vehiculo[10];
        try {
            for (int i = 0; i < vehiculos.length; i++) {
                vehiculos[i] = new Automovil(Combustible.GASOLINA, Traccion.DELANTERA, 4);
                System.out.println("vehículo num: " + i);
                vehiculos[i].arrancar();
            }
        }catch( Exception e){
            throw  new RuntimeException(e);
        }*/