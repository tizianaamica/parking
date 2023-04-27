package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRespository extends JpaRepository<Record, Integer> {
}
