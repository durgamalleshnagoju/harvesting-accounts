package com.harvesting_accounts.service;

import com.harvesting_accounts.persist.entity.Address;
import com.harvesting_accounts.persist.entity.Person;
import com.harvesting_accounts.persist.repo.AddressRepository;
import com.harvesting_accounts.persist.repo.HarvestDetailsRepository;
import com.harvesting_accounts.persist.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GlobalRepoService {

    private final HarvestDetailsRepository harvestDetailsRepository;
    private final AddressRepository addressRepository;
    private final PersonRepository personRepository;


    public Address getAddressById(Long addressId) {
        return addressRepository.findById(addressId).get();
    }

    public Person getPersonById(Long agentId) {
        return personRepository.findById(agentId).get();
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
