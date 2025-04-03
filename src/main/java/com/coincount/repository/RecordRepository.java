package com.coincount.repository;

import com.coincount.model.Record;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RecordRepository extends JpaRepository <Record, Long> {

    List<Record> findByCategory(String category);
}
