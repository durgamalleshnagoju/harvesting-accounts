package com.harvesting_accounts.persist.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private OffsetDateTime createdOn;
    private String createdBy;
    private OffsetDateTime updatedOn;
    private String updatedBy;

    @PrePersist
    public void prePersist() {
        this.createdOn = OffsetDateTime.now();
        this.createdBy = currentUser();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedOn = OffsetDateTime.now();
        this.updatedBy = currentUser();
    }

    String currentUser(){return "dummy";}
}
