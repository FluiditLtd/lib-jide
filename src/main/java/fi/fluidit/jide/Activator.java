package fi.fluidit.jide;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Activator implements BundleActivator {
    public void start(BundleContext context) throws Exception {
        Logger.getLogger(Activator.class.getName()).log(Level.INFO, "JIDE OSS bundle loaded");
    }

    public void stop(BundleContext context) throws Exception {

    }
}