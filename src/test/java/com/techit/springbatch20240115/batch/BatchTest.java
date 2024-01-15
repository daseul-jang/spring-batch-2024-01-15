package com.techit.springbatch20240115.batch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@SpringBatchTest
@ActiveProfiles("test")
public class BatchTest {
    @Autowired
    private JobLauncherTestUtils hello3JobLauncherTestUtils;

    @DisplayName("hello3JobTest")
    @Test
    public void hello3JobTest() throws Exception {
        hello3JobLauncherTestUtils.launchJob();
    }
}
