package com.hcl.hackaton.repository;

import com.hcl.hackaton.models.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortoRepository extends JpaRepository<Portfolio,Long> {
    Portfolio findAllById(Long portfolioId);
}
