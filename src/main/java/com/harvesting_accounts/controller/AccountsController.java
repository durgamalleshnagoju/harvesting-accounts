package com.harvesting_accounts.controller;

import com.harvesting_accounts.models.HarvestDetailsRequest;
import com.harvesting_accounts.persist.dto.HarvestDetailsDto;
import com.harvesting_accounts.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountsController {

    private final AccountsService accountsService;

    @PostMapping("/harvest")
    public ResponseEntity<HarvestDetailsDto> enterHarvestDetails(@RequestBody HarvestDetailsRequest request){
        return ResponseEntity.ok(accountsService.enterHarvestDetails(request));
    }

    @GetMapping("/harvest-details")
    public ResponseEntity<List<HarvestDetailsDto>> getHarvestDetails(){
        return ResponseEntity.ok(accountsService.getHarvestDetails());
    }
}
