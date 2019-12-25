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
@Requires(beans = {Condition1.class, Condition2.class})
public class CBean1 {
}
