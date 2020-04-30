package com.wander.demoSBJpa1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wander.demoSBJpa1.entities.TipoTelefone;
import com.wander.demoSBJpa1.repositories.TipoTelefoneRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private TipoTelefoneRepository tipoTelefoneRepository;

	@Override
	public void run(String... args) throws Exception {
		TipoTelefone T1 = new TipoTelefone(null,"Celular","(##) #.####-####", 1);
		TipoTelefone T2 = new TipoTelefone(null,"Comercial","(##) ####-####", 1);
		
		tipoTelefoneRepository.saveAll(Arrays.asList(T1,T2));
	}
}
