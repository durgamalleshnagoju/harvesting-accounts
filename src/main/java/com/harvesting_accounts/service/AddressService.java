package com.harvesting_accounts.service;

import com.harvesting_accounts.persist.entity.Address;
import com.harvesting_accounts.persist.repo.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final GlobalRepoService globalRepoService;

    public Address saveAddress(Address request) {
        return addressRepository.save(request);
    }

    public List<Address> getAllAddress() {
        return globalRepoService.getAllAddress();
    }
}
