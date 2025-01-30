package com.example.equinox;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorldActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello, OSGi World! Bundle started.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye, OSGi World! Bundle stopped.");
    }
}