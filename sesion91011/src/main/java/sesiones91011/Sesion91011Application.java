package sesiones91011;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import sesiones91011.Iterator.User;
import sesiones91011.Iterator.Users;

@SpringBootApplication
public class Sesion91011Application {

	public static void main(String[] args) {

		Users users = new Users();

		users.create(new User(1L, "Laia", "Hidalgo Jiménez", 29));
		users.create(new User(2L, "Francesc", "Hidalgo Jiménez", 28));
		users.create(new User(3L, "Marc", "Mora Hidalgo", 29));
		users.create(new User(4L, "Jordi", "Paz Hidalgo", 29));

		while (users.hasMore()) {
			User user = users.next();
			System.out.println("The user is: " + user.getId() + ". " + user.getNombre() + " " + user.getApellidos() + ", " + user.getEdad() + " años");
		}


		users.create(new User(5L, "Mariana", "Gutierrez", 27));
		User user = users.next();
		System.out.println("The user is: " + user.getId() + ". " + user.getNombre() + " " + user.getApellidos() + ", " + user.getEdad() + " años");

		// re-iterate
		users.reset();
		while (users.hasMore()) {
			user = users.next();
			System.out.println("The user is: " + user.getId() + ". " + user.getNombre() + " " + user.getApellidos() + ", " + user.getEdad() + " años");

		}
	}
}


