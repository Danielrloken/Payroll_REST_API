package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class PayrollApplication {
	private static final Logger log = LoggerFactory.getLogger(PayrollApplication.class);

	public static void main(String[] args) {
		log.info("starting application party");
		SpringApplication.run(PayrollApplication.class, args);
	}

}
