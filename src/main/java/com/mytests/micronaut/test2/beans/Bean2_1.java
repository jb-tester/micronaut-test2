package com.mytests.micronaut.test2.beans;

import io.micronaut.context.annotation.Value;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
public class Bean2_1 implements Bean2 {

    String id;

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
