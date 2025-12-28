package abm.gui;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

    private int radius = 20; 

    public RoundedButton(String label) {
        super(label);
        setContentAreaFilled(false);
    }

    public RoundedButton() {
        this(""); 
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint(); 
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        
        Shape shape = new RoundRectangle2D.Double(
            0, 0, getWidth() - 1, getHeight() - 1, radius, radius
        );

        
        if (getModel().isArmed()) {
            g2.setColor(getBackground().darker()); 
        } else {
            g2.setColor(getBackground()); 
        }
        g2.fill(shape);
        

        super.paintComponent(g);
        
        g2.dispose();
    }


    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Shape shape = new RoundRectangle2D.Double(
            0, 0, getWidth() - 1, getHeight() - 1, radius, radius
        );

        g2.setColor(getForeground());
        g2.draw(shape);
        
        g2.dispose();
    }
    
    @Override
    public boolean contains(int x, int y) {
        Shape shape = new RoundRectangle2D.Double(
            0, 0, getWidth(), getHeight(), radius, radius
        );
        return shape.contains(x, y);
    }
}