package br.com.eswconsulting.poc.pocconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocconfigclientApplication {
	
	@Value("${teste.propriedade}")
	private String propriedade;
	
	@RequestMapping("/")
    public String home() {
        return this.propriedade;
    }

	public static void main(String[] args) {
		SpringApplication.run(PocconfigclientApplication.class, args);
	}
}
