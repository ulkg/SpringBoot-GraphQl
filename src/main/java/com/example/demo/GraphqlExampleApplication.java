
package com.example.demo;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlExampleApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return arg -> {
			Author josh = authorRepository.save(new Author(null, "josh"));
			Author mark = authorRepository.save(new Author(null, "mark"));

			bookRepository.saveAll(List.of(
					new Book("Reactive Spring", "publisher", josh),
					new Book("Cloud native", "publisher2", mark),
					new Book("Spring boot", "publisher2", josh)));
		};
	}
}
