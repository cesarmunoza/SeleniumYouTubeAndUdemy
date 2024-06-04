package com.testing.cesar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestInvokeBrowserApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvokeBrowserApplication::main).with(TestInvokeBrowserApplication.class).run(args);
	}

}
