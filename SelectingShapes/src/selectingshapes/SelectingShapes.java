/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectingshapes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.JPanel;

public class SelectingShapes extends JPanel implements ItemListener{
private JComboBox<?> box1;    
private static JPanel mainPnl;
private JPanel btnPanel;
private String s1[] = { "Rectangle", "Oval", "Arc", "3DRect", "Polygon", "Line" }; 
private Random rand;
private int counter=0, colorCounter;
private final int ranMax = 250;
private Color [] arryColor = {Color.BLUE,Color.BLACK,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};
private Color finalColor;
protected JColorChooser Jcc; 

    public SelectingShapes()
    { 
    	rand = new Random();
        buildPanel();   
    }
   
    private void buildPanel()
    {
    	mainPnl = new JPanel();
    	mainPnl.setBorder(BorderFactory.createLineBorder(Color.black));
        box1 = new JComboBox(s1);
        btnPanel = new JPanel();
        mainPnl.add(btnPanel);
        btnPanel.add(box1);
        box1.addItemListener(this);
     
        // Set up color chooser for setting text color 
        Jcc = new JColorChooser(); 
        Jcc.getSelectionModel().addChangeListener(new ChangeListener () 
        {public void stateChanged(ChangeEvent e) 
        {	colorCounter =-1;
        	finalColor = Jcc.getColor();} 
        });
        Jcc.setBorder(BorderFactory.createTitledBorder( 
            "Choose Text Color")); 
        btnPanel.add(Jcc); 
        
    }
    
    
    
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	if (colorCounter !=-1)
    		finalColor = arryColor[getNewRandom (13)];
    	
    	switch (counter)
    	{
	    	case 0:
	        g.setColor(finalColor ); 
	        for (int i=0; i!= 20; i++)
	        g.drawRect(getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax),getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax+getNewRandom(ranMax)));
	        break;
	        
	    	case 1:
	    	g.setColor(finalColor); 
	        for (int i=0; i!= 20; i++)
	        g.drawOval(getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax),getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax+getNewRandom(ranMax)));
	        break;
	        
	    	case 2:
	    	g.setColor(finalColor); 
	        for (int i=0; i!= 20; i++)
	        g.drawArc(getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax),getNewRandom(ranMax),getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax));
	        break;
	        
	    	case 3:
	        g.setColor(finalColor); 
	        for (int i=0; i!= 20; i++)
	        g.draw3DRect(getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax),getNewRandom(ranMax+ranMax),getNewRandom(ranMax+getNewRandom(ranMax)),true);
	        break;
	        
	    	case 4:
	        g.setColor( finalColor); 
	        for (int i=0; i!= 20; i++)
	        {
	        int x1Points[] = {getNewRandom(ranMax+getNewRandom(ranMax)), getNewRandom(ranMax), getNewRandom(ranMax+getNewRandom(ranMax)), getNewRandom(ranMax+getNewRandom(ranMax))};
	        int y1Points[] = {getNewRandom(ranMax+getNewRandom(ranMax)), getNewRandom(ranMax), getNewRandom(ranMax+getNewRandom(ranMax)), getNewRandom(ranMax+getNewRandom(ranMax))};
	        g.drawPolygon(x1Points, y1Points, x1Points.length); 
	        }
	        break;
	        
	    	case 5:
		        g.setColor(finalColor); 
		        for (int i=0; i!= 20; i++)
		        g.drawLine(getNewRandom(ranMax+getNewRandom(ranMax)),getNewRandom(ranMax),getNewRandom(ranMax+ranMax), getNewRandom(ranMax+ranMax));
		        break;
        }
        
    	colorCounter =0;
    }
    
    private int getNewRandom(int i)
    {
    	return rand.nextInt(i);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    	if (box1.getSelectedIndex() == 0)
    	{
    		counter = 0;
    		repaint();
    	}  
    	if (box1.getSelectedIndex() == 1)
    	{
    		counter = 1;
    		repaint();
    	}
    	if (box1.getSelectedIndex() == 2)
    	{
    		counter = 2;
    		repaint();
    	}
            
    	if (box1.getSelectedIndex() == 3)
    	{
    		counter = 3;
    		repaint();
    	}
    	
    	if (box1.getSelectedIndex() == 4)
    	{
    		counter = 4;
    		repaint();
    	}
    	
    	if (box1.getSelectedIndex() == 5)
    	{
    		counter = 5;
    		repaint();
    	}
    }
    public static void main(String[] args) 
    {
    SelectingShapes s = new SelectingShapes();
    s.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
     JFrame fr = new JFrame();
     fr.setTitle("Selecting Shapes, Thomas Rivera");
     fr.setSize(1000,1000);
     fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fr.setVisible(true);
     fr.add(s, BorderLayout.CENTER);
     fr.add(mainPnl, BorderLayout.NORTH);
     //fr.pack();
  
    }
    
}
