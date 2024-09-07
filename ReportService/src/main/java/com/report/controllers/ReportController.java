package com.report.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.entities.Report;
import com.report.services.impl.ReportServiceImpl;

@RestController
@RequestMapping("/report")
public class ReportController {

    private final ReportServiceImpl reportServiceImpl;

    public ReportController(ReportServiceImpl reportServiceImpl) {
        this.reportServiceImpl = reportServiceImpl;
    }

    // Generate report for a user
    @PostMapping("/generate/{userId}")
    public Report generateReport(@PathVariable Long userId) {
        return reportServiceImpl.generateReport(userId);
    }

    // Get report by user ID
    @GetMapping("/user/{userId}")
    public Report getReportByUserId(@PathVariable Long userId) {
        return reportServiceImpl.getReportByUserId(userId);
    }
}
