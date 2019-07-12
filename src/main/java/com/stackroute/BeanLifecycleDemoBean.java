package com.stackroute;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class BeanLifecycleDemoBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties are set");
    }
    public void customInit()
    {
        System.out.println("Initialized bean");
    }
    public void customDestroy()
    {
        System.out.println("Destroyed bean");
    }
}
