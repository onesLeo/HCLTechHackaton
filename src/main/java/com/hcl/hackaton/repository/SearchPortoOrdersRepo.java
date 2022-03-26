package com.hcl.hackaton.repository;

import com.hcl.hackaton.models.Asset;
import com.hcl.hackaton.models.Orders;
import com.hcl.hackaton.utils.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SearchPortoOrdersRepo extends JpaRepository<Orders, Long> {
    Orders findAllByOrderId(Long orderId);
    List<Orders> findAllByAsset(Asset asset);
    List<Orders> findAllByTransactionType(TransactionType transactionType);
    List<Orders> findAllByOrderDateBetween(LocalDate from, LocalDate to);
    List<Orders> findAllByAssetAndTransactionTypeAndOrderDateBetween(Asset asset,TransactionType type,LocalDate from, LocalDate to);
}
