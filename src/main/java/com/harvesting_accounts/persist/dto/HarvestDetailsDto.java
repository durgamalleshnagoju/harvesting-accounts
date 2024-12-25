package com.harvesting_accounts.persist.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class HarvestDetailsDto {

    private String farmerName;
    private String agentName;
    private int minutes;
    private int ratePerHour;
    private String address;
    private OffsetDateTime date;
}
