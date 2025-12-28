
package abm.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModernPasswordField extends JPasswordField {

    private Icon prefixIcon;
    private Icon suffixIcon;
    private String hint = "";
    private Color borderColor = new Color(50, 50, 50); // Mismo borde oscuro
    private Color fillColor = new Color(230, 230, 230); // Mismo fondo gris

    public ModernPasswordField() {
        setOpaque(false); // Transparente para pintar nuestro propio diseño
        setBorder(new EmptyBorder(10, 15, 10, 15));
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setSelectionColor(new Color(50, 100, 200));
        setEchoChar('•'); // Carácter de punto moderno (puedes cambiarlo a '*')
    }

    // --- Métodos de configuración ---
    public void setPrefixIcon(Icon icon) {
        this.prefixIcon = icon;
        initBorder();
    }

    public void setSuffixIcon(Icon icon) {
        this.suffixIcon = icon;
        initBorder();
    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    private void initBorder() {
        int left = 15;
        int right = 15;
        if (prefixIcon != null) {
            left = prefixIcon.getIconWidth() + 20;
        }
        if (suffixIcon != null) {
            right = suffixIcon.getIconWidth() + 20;
        }
        setBorder(new EmptyBorder(10, left, 10, right));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // 1. Pintar Fondo
        g2.setColor(fillColor);
        g2.fillRoundRect(0, 0, width - 1, height - 1, height, height);

        // 2. Pintar Borde
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, width - 1, height - 1, height, height);

        // 3. Pintar Íconos
        if (prefixIcon != null) {
            int y = (height - prefixIcon.getIconHeight()) / 2;
            prefixIcon.paintIcon(this, g2, 10, y);
        }
        if (suffixIcon != null) {
            int y = (height - suffixIcon.getIconHeight()) / 2;
            suffixIcon.paintIcon(this, g2, width - suffixIcon.getIconWidth() - 10, y);
        }

        // 4. Pintar Hint si la contraseña está vacía
        // Nota: Usamos getPassword() por seguridad en lugar de getText()
        if (getPassword().length == 0 && !hint.isEmpty()) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(new Color(150, 150, 150));
            g2.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }

        g2.dispose();
        
        // IMPORTANTE: Llamar a super para que pinte los puntos de la contraseña
        super.paintComponent(g);
    }
}
