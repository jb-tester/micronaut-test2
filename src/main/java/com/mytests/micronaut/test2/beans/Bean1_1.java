package com.mytests.micronaut.test2.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
public class Bean1_1 implements Bean1 {


    String id ;

    @Override

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
