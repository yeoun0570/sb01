package com.ssg.sb01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //데이터베이스 변경 감지
public class Sb01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb01Application.class, args);
	}

}
