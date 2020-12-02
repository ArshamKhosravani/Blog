package com.mapsa.blog.repository;

import com.mapsa.blog.model.PaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepository extends JpaRepository<PaperEntity,Long> {
}
