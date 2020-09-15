package com.mytests.micronaut.test2.conditionalBeans;

import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
@Singleton
@Requires(property = "myconditions.cond3", pattern = "condition\\d{1,3}")
public class CBean2 {
}
