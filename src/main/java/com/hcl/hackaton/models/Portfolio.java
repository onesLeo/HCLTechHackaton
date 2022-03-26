package com.hcl.hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="portfolio_details")
@AllArgsConstructor@NoArgsConstructor
@Getter
@ToString
public class Portfolio {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "portfolio", orphanRemoval = true)
    private List<Orders> orders;

    @OneToOne
    private Customer customer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portfolio portfolio = (Portfolio) o;
        return Objects.equals(id, portfolio.id) && Objects.equals(orders, portfolio.orders) && Objects.equals(customer, portfolio.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orders, customer);
    }
}
