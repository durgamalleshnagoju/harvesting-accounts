package com.harvesting_accounts.persist.dto;

import com.harvesting_accounts.persist.enums.TransactionType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class TransactionDto {

    private int amount;
    private String personName;
    private String reason;
    private TransactionType transactionType;
    private OffsetDateTime date;
}
