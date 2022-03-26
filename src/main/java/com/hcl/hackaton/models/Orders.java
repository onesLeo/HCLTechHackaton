package com.hcl.hackaton.models;

import com.hcl.hackaton.utils.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="order_details")
@Getter
@NoArgsConstructor@AllArgsConstructor
@ToString
public class Orders {
    @Id
    @GeneratedValue
    private Long orderId;
    private TransactionType transactionType;

    @OneToOne
    private Asset asset;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Portfolio portfolio;
    private LocalDate orderDate;
    private String orderStatus;
    private int quantity;
    private double orderValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return quantity == orders.quantity && Double.compare(orders.orderValue, orderValue) == 0 && Objects.equals(orderId, orders.orderId) && Objects.equals(transactionType, orders.transactionType) && Objects.equals(asset, orders.asset) && Objects.equals(portfolio, orders.portfolio) && Objects.equals(orderDate, orders.orderDate) && Objects.equals(orderStatus, orders.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, transactionType, asset, portfolio, orderDate, orderStatus, quantity, orderValue);
    }
}
