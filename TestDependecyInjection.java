package com.sample.dependencyinjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependecyInjection {

    /**
     * ClassPathXmlApplicationContext -
     * FilePathXmlApplicationContext -
     * WebPathXmlApplicationContext -
     *
     * @param args
     */
    public static void main(final String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        final TemporaryAddress temporaryAddress = (TemporaryAddress)context.getBean("tempAddress");
        System.out.print(temporaryAddress);
        final Employee employee = (Employee)context.getBean("employee");
        System.out.print(employee);
    }

}
