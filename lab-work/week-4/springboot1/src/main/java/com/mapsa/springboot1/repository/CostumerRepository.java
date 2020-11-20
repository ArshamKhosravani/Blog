package com.mapsa.springboot1.repository;

import com.mapsa.springboot1.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer,Long> {
}
