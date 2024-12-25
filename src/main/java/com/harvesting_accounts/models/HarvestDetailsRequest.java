package com.harvesting_accounts.models;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class HarvestDetailsRequest {

    private Long addressId;
    private int minutes;
    private Long farmerId;
    private Long agentId;
    private int ratePerHour;
    private OffsetDateTime date;
}
