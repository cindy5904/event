package org.example.reservationevenement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ReservationEvenementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationEvenementApplication.class, args);
	}

}
