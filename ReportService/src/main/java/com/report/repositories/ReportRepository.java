package com.report.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
    Optional<Report> findByUserId(Long userId);
}
