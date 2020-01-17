/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectingshapes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random; 


public class PaintPanel extends JPanel{
        private int ran1,ran2,ran3; 
        private Random rand = new Random();
        private int counter=0;

    public PaintPanel( int a)
{
         counter =a;
         ran1 = rand.nextInt(500); 
         ran2 = rand.nextInt(500); 
         ran3 = rand.nextInt(7);
         System.err.println(ran1);
         System.err.println(ran2);
         System.err.println(ran3);
}
    
    public void paintComponent(Graphics g) 
    {
        if (counter==1)
        {g.setColor(Color.red);
         for (int b=0; b<=20; b++)
         {
             g.drawLine(ran1, ran2, ran1, ran2);
         }
        }
    g.drawRect (ran1, ran2, ran1, ran2);
    g.draw3DRect (ran1, ran2, ran1, ran2,true);
    g.drawOval (ran1, ran2, ran1, ran2);
    g.drawArc (ran1, ran2, ran1, ran2,ran1,ran2);
    int x1Points[] = {ran1, ran2, ran1, ran2};
    int y1Points[] = {ran1, ran2, ran1, ran2};
    g.drawPolygon(x1Points, y1Points, x1Points.length); 
    }
}
