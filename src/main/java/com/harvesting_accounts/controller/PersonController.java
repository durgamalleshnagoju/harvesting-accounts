package com.harvesting_accounts.controller;

import com.harvesting_accounts.models.PersonRequest;
import com.harvesting_accounts.persist.entity.Person;
import com.harvesting_accounts.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/")
    public ResponseEntity<Person> addPerson(@RequestBody PersonRequest personRequest){
        return ResponseEntity.ok(personService.addPerson(personRequest));
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> getPersons(){
        return ResponseEntity.ok(personService.getAllPersons());
    }
}
