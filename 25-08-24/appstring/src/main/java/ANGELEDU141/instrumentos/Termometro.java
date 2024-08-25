package ANGELEDU141.instrumentos;

import org.springframework.stereotype.Component;


//Termometro hijo de Instrumento
@Component("Bean1")
public class Termometro implements Instrumento {

    // metodo constructor
    public Termometro() {

    }

    // Metodo heredado
    @Override
    public void medir() {
        System.out.println(" ¡Medicion por Termometro!");
    }
}
