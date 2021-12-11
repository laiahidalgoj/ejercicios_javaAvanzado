package sesiones345.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sesiones345.demo.entities.Bootcamper;
import sesiones345.demo.repository.BootcamperRepository;

import java.util.Arrays;

@SpringBootApplication
public class Sesiones345Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sesiones345Application.class, args);

		BootcamperRepository bootcamperRepository = context.getBean(BootcamperRepository.class);

		Bootcamper bootcamper1 = new Bootcamper(null, "laia", "intermedio" );
		Bootcamper bootcamper2 = new Bootcamper(null, "fran", "principiante" );
		Bootcamper bootcamper3 = new Bootcamper(null, "ernesto", "avanzado" );
		Bootcamper bootcamper4 = new Bootcamper(null, "paco", "avanzado" );
		Bootcamper bootcamper5 = new Bootcamper(null, "maria", "intermedio" );

		bootcamperRepository.saveAll(Arrays.asList(bootcamper1, bootcamper2, bootcamper3, bootcamper4, bootcamper5));

		System.out.println("Número de bootcampers " +  bootcamperRepository.findAll().size());
	}
}
