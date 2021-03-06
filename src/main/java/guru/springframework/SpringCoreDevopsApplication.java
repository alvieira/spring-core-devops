package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevopsApplication.class, args);		
		
		// Testing triggering a Jenkins Build on Digital Ocean with GitHub Webhook
	}

}
