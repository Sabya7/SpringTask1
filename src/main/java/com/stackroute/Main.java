package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Movie mv= context.getBean("movieA",Movie.class);
       Movie mv2= context.getBean("movie",Movie.class);
        System.out.println(mv==mv2);
        System.out.println(mv);
        System.out.println(mv2);

        @Deprecated
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        @Deprecated
        Movie moviev= (Movie) beanFactory.getBean("movie");
        // System.out.println(moviev);

        /*BeanDefinitionRegistry beanDefinitionRegistry=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        BeanFactory beanFactory1=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanFactory1);
        System.out.println(beanDefinitionReader.loadBeanDefinitions("beans.xml"));
      */
        @Deprecated
        BeanDefinitionRegistry factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
       // rdr.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie mv1 =((XmlBeanFactory)factory).getBean("movie",Movie.class);
        //System.out.println(mv1);
    }
}
