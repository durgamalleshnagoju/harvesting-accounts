package com.harvesting_accounts.persist.repo;

import com.harvesting_accounts.persist.entity.HarvestDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarvestDetailsRepository extends JpaRepository<HarvestDetails, Long> {
}
