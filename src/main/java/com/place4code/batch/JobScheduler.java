package com.place4code.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;

public class JobScheduler {

    private final Job importUserJob;
    private final JobLauncher jobLauncher;


    public JobScheduler(final Job importUserJob,
                        final JobLauncher jobLauncher) {
        this.importUserJob = importUserJob;
        this.jobLauncher = jobLauncher;
    }

    @Scheduled(cron = "${task.cron}")
    void run() throws Exception {
        jobLauncher.run(importUserJob, new JobParameters());
    }

}
