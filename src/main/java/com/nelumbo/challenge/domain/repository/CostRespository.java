package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostRespository extends JpaRepository<Cost, Integer> {
}
