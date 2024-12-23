package starez.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("db_url", dotenv.get("db_url"));
        System.setProperty("db_username", dotenv.get("db_username"));
        System.setProperty("db_pass", dotenv.get("db_pass"));
		SpringApplication.run(DemoApplication.class, args);
	}

}
