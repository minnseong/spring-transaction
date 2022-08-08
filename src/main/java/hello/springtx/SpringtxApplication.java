package hello.springtx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringtxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtxApplication.class, args);
	}

}
