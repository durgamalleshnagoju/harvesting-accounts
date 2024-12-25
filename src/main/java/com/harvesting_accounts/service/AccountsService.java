package com.harvesting_accounts.service;

import com.harvesting_accounts.models.HarvestDetailsRequest;
import com.harvesting_accounts.persist.dto.HarvestDetailsDto;
import com.harvesting_accounts.persist.entity.HarvestDetails;
import com.harvesting_accounts.persist.repo.AddressRepository;
import com.harvesting_accounts.persist.repo.HarvestDetailsRepository;
import com.harvesting_accounts.persist.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountsService {

    private final HarvestDetailsRepository harvestDetailsRepository;
    private final AddressRepository addressRepository;
    private final PersonRepository personRepository;
    private final GlobalRepoService globalRepoService;


    public HarvestDetailsDto enterHarvestDetails(HarvestDetailsRequest request) {
        log.info("entering harvesting details[{}]", request);
        HarvestDetails harvestDetails = HarvestDetails.builder().address(globalRepoService.getAddressById(request.getAddressId()))
                .agent(globalRepoService.getPersonById(request.getAgentId())).farmer(globalRepoService.getPersonById(request.getFarmerId())).build();
        harvestDetailsRepository.save(harvestDetails);
        return harvestDetails.toDto();
    }

    public List<HarvestDetailsDto> getHarvestDetails() {
        return harvestDetailsRepository.findAll().stream().map(HarvestDetails::toDto).toList();
    }
}
