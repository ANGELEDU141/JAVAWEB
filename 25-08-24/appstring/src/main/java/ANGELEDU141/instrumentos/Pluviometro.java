package ANGELEDU141.instrumentos;

import org.springframework.stereotype.Component;



@Component
public class Pluviometro implements Instrumento {

    // metodo constructor
    public Pluviometro() {

    }

    // Metodo heredado
    @Override
    public void medir() {
        System.out.println(" ¡Medicion por Pluviometro!");
    }
}