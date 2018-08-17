package controlador;

import graficos.MarcoLogger;
import javax.swing.JFrame;

public class LoggerTest {

    public static void main(String[] args) {
        MarcoLogger marco = new MarcoLogger();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
