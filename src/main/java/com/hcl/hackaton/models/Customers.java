package com.hcl.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Customers {
    private Integer customerId;
    private String customersFirstName;
    private String customerLastName;
}
