package com.hcl.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="audit_action")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuditAction {
    @Id
    @GeneratedValue
    private Long id;
    private String actionType;
    @OneToOne
    private Portfolio portfolio;
    private LocalDate actionTS;
    private String description;
    private LocalDate lastUpdatedPriceDate;
}
