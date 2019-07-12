package com.stackroute;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {
    public void print()
    {
        System.out.println("Bean has processed");
    }
}
