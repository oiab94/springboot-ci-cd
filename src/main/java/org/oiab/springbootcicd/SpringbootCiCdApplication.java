package org.oiab.springbootcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCiCdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCiCdApplication.class, args);
	}

}
