package com.harvesting_accounts.models;

import com.harvesting_accounts.persist.enums.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class TransactionRequest {

    private Long personId;
    private int amount;
    private TransactionType transactionType;
    private String reason;
    private OffsetDateTime date;
}
