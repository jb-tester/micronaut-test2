package com.mytests.micronaut.test2;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
@Client("/")
public interface MyClient1 {

    @Get
    Single<String> home();

}
