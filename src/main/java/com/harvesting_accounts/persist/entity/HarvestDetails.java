package com.harvesting_accounts.persist.entity;

import com.harvesting_accounts.persist.dto.HarvestDetailsDto;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "harvest_details")
public class HarvestDetails extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Person farmer;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Person agent;

    private int minutes;
    private int ratePerHour;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private OffsetDateTime date;

    public HarvestDetailsDto toDto() {
        return HarvestDetailsDto.builder().farmerName(farmer.getName()).agentName(agent.getName()).minutes(minutes).ratePerHour(ratePerHour)
                .date(date).address(address.getName()).build();
    }
}
