package com.wgw.log4jconfig;

import org.apache.logging.log4j.core.config.Configurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

public class Log4jConfigListener implements ServletContextListener {
    private final static String FILE_KEY = "log4jConfigLocation";
    public void contextInitialized(ServletContextEvent sce) {
        String fileName = getContextParam(sce);
        Configurator.initialize("Log4j2",fileName);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
    private String getContextParam(ServletContextEvent e){
        Enumeration<String> names = e.getServletContext().getInitParameterNames();
        while ( names.hasMoreElements() ){
            String name = names.nextElement();
            if ( name.trim().equals(FILE_KEY )){
                String value = e.getServletContext().getInitParameter(name);
                return value;
            }

        }
        return null;
    }
}
