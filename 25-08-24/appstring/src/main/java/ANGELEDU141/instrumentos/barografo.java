package ANGELEDU141.instrumentos;

import org.springframework.stereotype.Component;

public class barografo {


	@Component("Bean1")
	public class Barometro implements Instrumento {

	    // metodo constructor
	    public Barometro () {

	    }

	    // Metodo heredado
	    @Override
	    public void medir() {
	        System.out.println(" ¡Medicion por Barometro !");
	    }
	}


}
