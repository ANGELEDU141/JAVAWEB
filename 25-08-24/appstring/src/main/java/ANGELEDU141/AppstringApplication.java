package ANGELEDU141;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import ANGELEDU141.estaciones.EstacionMeteorologica;
import ANGELEDU141.instrumentos.veleta;


@SpringBootApplication
public class AppstringApplication  implements CommandLineRunner  {
	
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(AppstringApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println( "hello world with Spring" );
		
		
		//nueva estación
		//EstacionMeteorologica estacionVilla=new EstacionMeteorologica();
		//estacionVilla.tomarMedicion();
		
		EstacionMeteorologica estacionSJM=(EstacionMeteorologica)context.getBean("estacionM");
		estacionSJM.tomarMedicion();
		
		
		
		
		
	}
	
	@Bean(name="Beanveleta")
	public veleta veleta() {
		return new veleta();
	}
	
	
	


}
