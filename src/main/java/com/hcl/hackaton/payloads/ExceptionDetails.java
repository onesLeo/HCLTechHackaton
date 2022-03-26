package com.hcl.hackaton.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ExceptionDetails {
    private LocalDate timestamp;
    private String message;
    private String details;
}
