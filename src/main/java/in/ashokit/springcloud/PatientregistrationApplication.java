package in.ashokit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEurekaClient
public class PatientregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientregistrationApplication.class, args);
	}

}
