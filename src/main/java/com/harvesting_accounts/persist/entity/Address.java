package com.harvesting_accounts.persist.entity;

import com.harvesting_accounts.persist.enums.District;
import com.harvesting_accounts.persist.enums.Mandal;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address extends BaseEntity{

    private String name;
    private Mandal mandal;
    private District district;
}
