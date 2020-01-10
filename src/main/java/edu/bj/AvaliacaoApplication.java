package edu.bj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.bj.avaliacao.model.Projeto;
import edu.bj.avaliacao.repository.ProjetoRepository;

@SpringBootApplication
public class AvaliacaoApplication {
	
	//Dados iniciais da base de dados
	@Bean
	CommandLineRunner runner(ProjetoRepository projetoRepository){
		return args -> {
			projetoRepository.save(new Projeto("Quincas Borba", "0001232394734"));
			projetoRepository.save(new Projeto("Dom Casmurro", "0001232395534"));
			projetoRepository.save(new Projeto("Memórias Póstumas de Brás Cubas", "0003432394734"));
			projetoRepository.save(new Projeto("Helena", "000123239555"));
		};
	}		

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoApplication.class, args);
	}

}
