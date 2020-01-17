package pkg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class panelColorChange extends prospectVer3 {

	public panelColorChange() throws MalformedURLException 
	{
		//super();
		
		EventQueue.invokeLater(new Runnable() 
		{
			@Override
			public void run()
			{
				try 
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			    } 
				catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
				{
			                    ex.printStackTrace();
			    }
	
			 }
		 });
		
		 Timer updateTimer = new Timer(100, new ActionListener() {
            private float cont = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                mypanel.setBackground(Color.getHSBColor((cont += 0.05), 1, 1));
            }
        });

        mypanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseExited(MouseEvent e) {
                updateTimer.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                updateTimer.stop();
            }

        });
    
	 }
	
		  		        
}

	
	
	
	
