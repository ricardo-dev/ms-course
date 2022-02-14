package com.mscourse.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean // criando componente a nivel de metodo -> mesma instancia para todo o projeto
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
