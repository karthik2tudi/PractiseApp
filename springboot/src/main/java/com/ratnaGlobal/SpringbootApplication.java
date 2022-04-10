package com.ratnaGlobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan("com.ratnalobal")
@EntityScan("com.ratnalobal")
@EnableJpaRepositories(basePackages="com.ratnalobal")*/
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
