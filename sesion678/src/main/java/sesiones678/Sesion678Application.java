package sesiones678;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sesiones678.Singleton.Inmueble;

@SpringBootApplication
public class Sesion678Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sesion678Application.class, args);

		Inmueble inmueble = Inmueble.getInstance();
		inmueble.setId(1L);
		inmueble.setUbicacion("Barcelona");
		inmueble.setClasificacion("Incorporación");
		inmueble.setTipoInmueble("Edificio");

		Inmueble inmueble2 = Inmueble.getInstance();
		inmueble2.setId(2L);
		inmueble2.setUbicacion("Zaragoza");
		inmueble2.setClasificacion("Ubicación");
		inmueble2.setTipoInmueble("Terreno");

		Inmueble inmueble3 = Inmueble.getInstance();
		inmueble3.setId(3L);
		inmueble3.setUbicacion("Zaragoza");
		inmueble3.setClasificacion("Ubicación");
		inmueble3.setTipoInmueble("Terreno");

		System.out.println("Id: " + inmueble.getId() + "\nUbicación: " +  inmueble.getUbicacion() + "\nClasificación: "
				+ inmueble.getClasificacion() + "\nTipo de inmueble: " + inmueble.getTipoInmueble() + "\nValor: " + inmueble);

		System.out.println("Id: " + inmueble2.getId() + "\nUbicación: " +  inmueble2.getUbicacion() + "\nClasificación:"
				+ " " + inmueble2.getClasificacion() + "\nTipo de inmueble: " + inmueble2.getTipoInmueble() + "\nValor: " + inmueble2);

		System.out.println("Id: " + inmueble3.getId() + "\nUbicación: " +  inmueble3.getUbicacion() + "\nClasificación:"
				+ " " + inmueble3.getClasificacion() + "\nTipo de inmueble: " + inmueble3.getTipoInmueble() + "\nValor: " + inmueble3);


	}
}
