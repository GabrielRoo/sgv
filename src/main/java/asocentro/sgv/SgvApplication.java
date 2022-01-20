package asocentro.sgv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan (basePackages = {"asocentro.sgv.model"})
@SpringBootApplication 
public class SgvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgvApplication.class, args);
	}

}
