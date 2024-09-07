package com.report.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.report.entities.Report;
import com.report.entities.Result;
import com.report.repositories.ReportRepository;

@Service
public class ReportServiceImpl {

    private final ReportRepository reportRepository;
    private final ResultClient resultClient;

    public ReportServiceImpl(ReportRepository reportRepository, ResultClient resultClient) {
        this.reportRepository = reportRepository;
        this.resultClient = resultClient;
    }

    public Report generateReport(Long userId) {
        // Fetch quiz results for the user
        List<Result> results = resultClient.getResultsByUser(userId);

        if (results.isEmpty()) {
            throw new RuntimeException("No quiz results found for user " + userId);
        }

        // Calculate report details
        int totalQuizzesTaken = results.size();
        double averageScore = results.stream().mapToInt(Result::getScore).average().orElse(0);
        int highestScore = results.stream().mapToInt(Result::getScore).max().orElse(0);
        int lowestScore = results.stream().mapToInt(Result::getScore).min().orElse(0);

        // Create new report
        Report report = new Report(null, userId, totalQuizzesTaken, averageScore, highestScore, lowestScore);

        // Save and return the report
        return reportRepository.save(report);
    }

    public Report getReportByUserId(Long userId) {
        Optional<Report> report = reportRepository.findByUserId(userId);
        return report.orElseThrow(() -> new RuntimeException("No report found for user " + userId));
    }
}
