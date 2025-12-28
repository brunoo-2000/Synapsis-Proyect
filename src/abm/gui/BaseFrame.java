
package abm.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;

public class BaseFrame extends JFrame {

    public BaseFrame() {
        configurarIcono();
    }

    private void configurarIcono() {
        setTitle("Synapsis beta v1.00");
        try {
            Image icon = new ImageIcon(getClass().getResource("/iconos/icono.png")).getImage();
            this.setIconImage(icon);
        } catch (Exception e) {
            System.err.println("Advertencia: No se pudo cargar el icono de la aplicación. Usando icono por defecto.");
        }
    }
}
