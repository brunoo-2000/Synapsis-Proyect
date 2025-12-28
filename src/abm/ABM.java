
package abm;
import abm.gui.*;
import javax.swing.JFrame;
public class ABM {

    
    public static void main(String[] args) {
        LoginInterfaz pi = new LoginInterfaz();
        pi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);
    }
    
}
