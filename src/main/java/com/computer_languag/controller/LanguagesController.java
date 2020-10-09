package com.computer_languag.controller;

import com.computer_languag.model.ComputerLanguage;
import com.computer_languag.repository.RepositoryLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/language")
public class LanguagesController {

    final RepositoryLanguage language;

    @Autowired
    public LanguagesController(RepositoryLanguage language) {
        this.language = language;
    }

    @GetMapping("/")
    public String read() {
        return "redirect:/language";
    }

    @PostMapping("/")
    public ResponseEntity<ComputerLanguage> create(@RequestBody ComputerLanguage computerLanguage) throws URISyntaxException {
        ComputerLanguage create = language.save(computerLanguage);
        if (create == null) {
            return ResponseEntity.notFound().build();
        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(create.getId())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(create);
        }
    }

    @PutMapping("/{id}")
    public String update(@ModelAttribute("user") ComputerLanguage computerLanguage, @PathVariable Long id) {
        Optional<ComputerLanguage> user1 = language.findById(id);
        language.save(computerLanguage);
        return "redirect:/language";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@RequestParam Long id) {
        language.deleteById(id);
        return "redirect:/language";
    }

}

