package com.hcl.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name = "customers")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Long customerId;
    private String firstName;
    private String lastName;
}
