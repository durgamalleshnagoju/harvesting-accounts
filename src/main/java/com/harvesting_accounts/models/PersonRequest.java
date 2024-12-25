package com.harvesting_accounts.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequest {

    private String name;
    private Long addressId;
    private String mobileNumber;
}
