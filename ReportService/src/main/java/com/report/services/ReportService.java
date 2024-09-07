package com.report.services;

import com.report.entities.Report;

public interface ReportService {
    Report generateReport(Long reportId);
}