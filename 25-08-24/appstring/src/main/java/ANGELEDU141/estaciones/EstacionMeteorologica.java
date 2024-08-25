package ANGELEDU141.estaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ANGELEDU141.instrumentos.Instrumento;

@Component("estacionM")
public class EstacionMeteorologica {
	
	@Autowired
	@Qualifier("Beanveleta")
	private Instrumento instrumento;
	
	

    // Metodo constructor
    public EstacionMeteorologica() {
    }

    // Metodo simple
    public void tomarMedicion() {
    	instrumento.medir();

    }
}
