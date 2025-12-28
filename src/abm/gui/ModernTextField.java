
package abm.gui;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModernTextField extends JTextField {

    private Icon prefixIcon;
    private Icon suffixIcon;
    private String hint = "";
    private Color borderColor = new Color(50, 50, 50); // Color del borde oscuro
    private Color fillColor = new Color(230, 230, 230); // Color de fondo gris claro

    public ModernTextField() {
        // Hacemos el componente transparente para pintar nuestro propio fondo
        setOpaque(false);
        // Margen por defecto para que el texto no toque los bordes
        setBorder(new EmptyBorder(10, 15, 10, 15));
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setSelectionColor(new Color(50, 100, 200)); // Color al seleccionar texto
    }

    // --- Métodos para configurar íconos y Hint ---
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

    // Ajusta el padding del texto dependiendo de si hay íconos
    private void initBorder() {
        int left = 15;
        int right = 15;
        // Si hay icono izquierdo, aumentamos el margen izquierdo
        if (prefixIcon != null) {
            left = prefixIcon.getIconWidth() + 20; 
        }
        // Si hay icono derecho, aumentamos el margen derecho
        if (suffixIcon != null) {
            right = suffixIcon.getIconWidth() + 20;
        }
        setBorder(new EmptyBorder(10, left, 10, right));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        // Activar suavizado (Antialiasing) para bordes finos
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // 1. Pintar el Fondo (Relleno)
        g2.setColor(fillColor);
        g2.fillRoundRect(0, 0, width - 1, height - 1, height, height); // height como radio hace que sea completamente redondo (píldora)

        // 2. Pintar el Borde
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, width - 1, height - 1, height, height);

        // 3. Pintar Íconos
        if (prefixIcon != null) {
            int y = (height - prefixIcon.getIconHeight()) / 2;
            prefixIcon.paintIcon(this, g2, 10, y); // Margen izquierdo fijo de 10px
        }
        if (suffixIcon != null) {
            int y = (height - suffixIcon.getIconHeight()) / 2;
            suffixIcon.paintIcon(this, g2, width - suffixIcon.getIconWidth() - 10, y);
        }

        // 4. Pintar el texto "Hint" (Placeholder) si el campo está vacío
        if (getText().length() == 0 && !hint.isEmpty()) {
            int h = getHeight();
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g.setColor(new Color(150, 150, 150)); // Color del texto placeholder
            g.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }

        g2.dispose();
        
        // Llamamos al padre para que pinte el texto real (input del usuario)
        super.paintComponent(g);
    }
}


