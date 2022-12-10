package com.example.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class JokeProviderServiceImpl implements JokeProviderService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @PostConstruct
    private void init() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String provideJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
