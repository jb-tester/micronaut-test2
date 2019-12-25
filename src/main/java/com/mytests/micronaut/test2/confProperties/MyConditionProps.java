package com.mytests.micronaut.test2.confProperties;

import io.micronaut.context.annotation.ConfigurationProperties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
@ConfigurationProperties("myconditions")
public class MyConditionProps {
    String cond1;
    int cond2;
    String cond3;

    public String getCond1() {
        return cond1;
    }

    public void setCond1(String cond1) {
        this.cond1 = cond1;
    }

    public int getCond2() {
        return cond2;
    }

    public void setCond2(int cond2) {
        this.cond2 = cond2;
    }

    public String getCond3() {
        return cond3;
    }

    public void setCond3(String cond3) {
        this.cond3 = cond3;
    }
}
