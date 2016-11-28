package com.example.repository;

import com.example.entity.Visits;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mateusz on 28.11.16.
 */
public interface VisitRepository extends JpaRepository<Visits, Integer> {
}
