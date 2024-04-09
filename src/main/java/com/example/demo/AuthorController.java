package com.example.demo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorRepository authorRepository;

    @QueryMapping
    Iterable<Author> authors() {
        return authorRepository.findAll();
    }
}
