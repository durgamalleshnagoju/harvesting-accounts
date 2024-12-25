package com.harvesting_accounts.service;

import com.harvesting_accounts.models.PersonRequest;
import com.harvesting_accounts.persist.entity.Person;
import com.harvesting_accounts.persist.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final GlobalRepoService globalRepoService;

    public Person addPerson(PersonRequest request) {
        return personRepository.save(Person.builder().address(globalRepoService.getAddressById(request.getAddressId())).name(request.getName())
                .mobileNumber(request.getMobileNumber()).build());
    }

    public List<Person> getAllPersons() {
        return globalRepoService.getAllPersons();
    }
}
