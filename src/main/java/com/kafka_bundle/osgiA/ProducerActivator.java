package com.kafka_bundle.osgiA;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ProducerActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("ProducerBundle iniciado.");
        // Aquí puedes inicializar dependencias si es necesario
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("ProducerBundle detenido.");
    }
}