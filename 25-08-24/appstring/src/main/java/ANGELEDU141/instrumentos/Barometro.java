package ANGELEDU141.instrumentos;

import org.springframework.stereotype.Component;

@Component("bean2")
public class Barometro implements Instrumento {

    // metodo constructor
    public Barometro() { 
    }

    //Metodo heredado
    @Override
    public void medir() {
        System.out.println("¡Medicion por Barometro!");
    }
}
