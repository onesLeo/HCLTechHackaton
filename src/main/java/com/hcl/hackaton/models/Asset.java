package com.hcl.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asset_details")
public class Asset {
    @Id
    @GeneratedValue
    private Long id;
    private String runningBalance;
    private String securityName;
    private int availableQuantity;
    private String description;
    private double unitPrice;
    private LocalDate lastUpdatedPriceDate;
}
