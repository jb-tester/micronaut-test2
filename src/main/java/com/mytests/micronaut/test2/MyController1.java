package com.mytests.micronaut.test2;

import com.mytests.micronaut.test2.beans.UseBean1Bean2;
import com.mytests.micronaut.test2.conditionalBeans.CBean1;
import com.mytests.micronaut.test2.conditionalBeans.CBean2;
import com.mytests.micronaut.test2.confProperties.MyProps;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test2
 * *******************************
 */
@Controller
public class MyController1 {

    @Inject
    MyProps myProps;
    @Inject
    UseBean1Bean2 useBean1Bean2;
    // check conditional beans:
    //@Inject
    CBean1 cBean1;

    @Inject
    CBean2 cBean2;

    @Get(uri = "/")
    public String home(){
        System.out.println(myProps.getB11());
        return  useBean1Bean2.getBoth();
    }
}
