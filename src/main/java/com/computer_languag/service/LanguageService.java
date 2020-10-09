package com.computer_languag.service;

import com.computer_languag.repository.RepositoryLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private final RepositoryLanguage repository;

    @Autowired
    public LanguageService(RepositoryLanguage userRepository) {
        this.repository = userRepository;
    }
}
