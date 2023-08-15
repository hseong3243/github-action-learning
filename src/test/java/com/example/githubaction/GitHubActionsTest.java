package com.example.githubaction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GitHubActionsTest {

    @Test
    void generateTestResult() {
        //empty
    }

    @Test
    void generateTestReport() {
        //success
    }

    @Test
    void generateTestReport_ButFail() {
        String fail = "fail";

        assertThat(fail).isNotEqualTo("fail");
    }
}
