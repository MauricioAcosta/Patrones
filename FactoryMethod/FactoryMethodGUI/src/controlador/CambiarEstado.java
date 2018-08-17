/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import modelo.Logger;
import modelo.LoggerFactory;

/**
 *
 * @author kirito
 */
public class CambiarEstado {

    public void cambiar(String estado) {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("Logger.properties");
            // set the properties value
            prop.setProperty("FileLogging", estado);
            // save properties to project root folder
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("A Message to Log");
    }
}
