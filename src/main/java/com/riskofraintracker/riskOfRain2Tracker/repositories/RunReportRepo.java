package com.riskofraintracker.riskOfRain2Tracker.repositories;

import com.riskofraintracker.riskOfRain2Tracker.models.RunReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface RunReportRepo extends JpaRepository<RunReport,Long> {
}
