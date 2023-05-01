package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Integer> {

}
