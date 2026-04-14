package com.icquackson.subguard;

import org.springframework.boot.SpringApplication;

public class TestSubguardApplication {

	public static void main(String[] args) {
		SpringApplication.from(SubguardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
