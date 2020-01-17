package circum;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CircumferenceSlider extends JFrame {
 private JTextField areaTxt, radiusTxt, diameterTxt, circumferenceTxt;
 private JPanel txtFieldPnl;
    CircumferenceSlider() {
        super("JSlider demo");
        super.setSize(520, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(true);
        setupGUI();
        super.setVisible(true);
    }
 
    private void setupGUI() {
        super.setLayout(new BorderLayout(5, 5));
        OvalPanel drawingPanel = new OvalPanel();
        // add TXT FIELDS AND SET TO NONEDITABLE
        super.add(drawingPanel, BorderLayout.CENTER);
        JSlider radiusSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 150);
        radiusSlider.addChangeListener(drawingPanel);
        radiusSlider.setMajorTickSpacing(100);
        radiusSlider.setMinorTickSpacing(10);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        super.add(radiusSlider, BorderLayout.SOUTH);
        areaTxt = new JTextField("AREA",10);
        radiusTxt = new JTextField("RADIUS",10);
        diameterTxt = new JTextField("DIAMETER",10);
        circumferenceTxt = new JTextField("CIRCUMFERENCE",10);
        areaTxt.setEditable(false);
        radiusTxt.setEditable(false);
        diameterTxt.setEditable(false);
        circumferenceTxt.setEditable(false);
        txtFieldPnl = new JPanel();
        txtFieldPnl.add(areaTxt);
        txtFieldPnl.add(circumferenceTxt);
        txtFieldPnl.add(diameterTxt);
        txtFieldPnl.add(radiusTxt);
        add(txtFieldPnl, BorderLayout.NORTH);
        txtFieldPnl.setBorder(BorderFactory.createTitledBorder("Area, Circumference, Diameter, Radius"));
        
    }
 
    private class OvalPanel extends JPanel implements ChangeListener {
 
        private int radius = 150;
        private double area, circumference, diamter;
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider slider = (JSlider)e.getSource();
            radius = slider.getValue();
            repaint();
            updateArea();
            updateCircumference();
            updateDiameter();
            areaTxt.setText(Double.toString(area)); //(Math.round(area/100000)
            circumferenceTxt.setText(Double.toString(circumference));
            diameterTxt.setText(Double.toString(diamter));
            radiusTxt.setText(Integer.toString(radius));
        }
        private void updateDiameter()
        {
            diamter=2*radius;
        }
        private void updateArea()
        {
            area = 3.14* radius* radius;
        }
        private void updateCircumference()
        {
          circumference = 2* 3.14* radius;    
        }
        @Override
        protected void paintComponent(Graphics g) {
            if(radius == -1) return;
            Graphics2D g2d = (Graphics2D)g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(super.getBackground());
            g2d.fillRect(0, 0, super.getParent().getWidth(), super.getParent().getHeight());
            g2d.setColor(Color.BLUE);
            int x = (super.getWidth()/2) - (radius/2);
            int y = (super.getHeight()/2) - (radius/2);
            g2d.drawOval(x, y, radius, radius);
        }
    }
 
    public static void main( String[] args ) throws Exception {
        javax.swing.SwingUtilities.invokeAndWait(new Runnable(){
            @Override
            public void run() { 
                new CircumferenceSlider(); 
            }
        });
    }
}