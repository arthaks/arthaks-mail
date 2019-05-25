package org.arthaks.lion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.arthaks.*.mapper")
public class LionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LionApplication.class, args);
	}


}
