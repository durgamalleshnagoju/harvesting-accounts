package com.harvesting_accounts.controller;

import com.harvesting_accounts.persist.entity.Address;
import com.harvesting_accounts.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<Address> saveAddress(@RequestBody Address request){
        return ResponseEntity.ok(addressService.saveAddress(request));
    }

    @GetMapping("/")
    public ResponseEntity<List<Address>> getAddress(){
        return ResponseEntity.ok(addressService.getAllAddress());
    }
}
