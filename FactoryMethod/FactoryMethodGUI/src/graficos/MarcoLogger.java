/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author kirito
 */
public class MarcoLogger extends JFrame {

    public MarcoLogger() {
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = mipantalla.getScreenSize();
        setBounds(tamañoPantalla.width / 4, tamañoPantalla.height / 4, tamañoPantalla.width / 2, tamañoPantalla.height / 2);
        setTitle("Mensaje");
        PanelLogger panel = new PanelLogger();
        add(panel);
        panel.setForeground(Color.black);
    }
}
