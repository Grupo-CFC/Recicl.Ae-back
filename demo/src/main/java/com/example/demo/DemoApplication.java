package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.Pontuacao;
import com.example.demo.repositories.PontuacaoRepository;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public CommandLineRunner init(@Autowired PontuacaoRepository pontuacaoRepository) {
		return args -> {
			
			pontuacaoRepository.inserir(
					new Pontuacao((long)100000, 50, 50));
			pontuacaoRepository.inserir(
					new Pontuacao((long)101010, 100, 2050));
			List<Pontuacao> listaPontuacao = pontuacaoRepository.obterTodos();
			listaPontuacao.forEach(System.out::println);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
