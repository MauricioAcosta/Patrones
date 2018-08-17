package modelo;

import java.util.*;
import java.io.*;

public class LoggerFactory {

    String valor;

    public boolean isFileLoggingEnabled() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("Logger.properties");
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            valor = prop.getProperty("FileLogging");
            if (valor.equalsIgnoreCase("ON") == true) {
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            return false;
        }
    }

    //Factory Method
    public Logger getLogger() {
        if (isFileLoggingEnabled()) {
            return new FileLogger();
        } else {
            return new ConsoleLogger();
        }
    }

}
