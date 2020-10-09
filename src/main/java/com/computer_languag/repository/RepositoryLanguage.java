package com.computer_languag.repository;

import com.computer_languag.model.ComputerLanguage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLanguage extends CrudRepository<ComputerLanguage, Long> {
    ComputerLanguage findByUsername(String name);
}
