package ma.ens.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "<h1>TP Docker réussi !</h1><p>L'application Spring Boot communique bien avec MySQL.</p>";
	}
}