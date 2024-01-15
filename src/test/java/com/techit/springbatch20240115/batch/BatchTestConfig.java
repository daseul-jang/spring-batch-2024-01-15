package com.techit.springbatch20240115.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchTestConfig {
    @Bean
    public JobLauncherTestUtils hello3JobLauncherTestUtils(Job hello3Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello3Job);
        return utils;
    }
}
