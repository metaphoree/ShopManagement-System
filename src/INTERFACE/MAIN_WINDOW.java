package INTERFACE;

//import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RootPaneContainer;
import javax.swing.UnsupportedLookAndFeelException;

import WINDOWS.ENTRANCE;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class MAIN_WINDOW {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException, InterruptedException {
	
		
		MY_THREAD kl=new MY_THREAD();
		//((RootPaneContainer) kl).setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("opening.jpg")))));

		//kl.setBackground();
		kl.start();
		Thread.sleep(700);
		ENTRANCE en=new ENTRANCE();
		en.setVisible(true);
		en.setLocation(350, 25);
		en.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		en.setSize(1000,700);
	//JFrame new_frame=new JFrame();
//	ENTRANCE entrance=new ENTRANCE();
//	new_frame.add(entrance,BorderLayout.CENTER);
//	new_frame.setSize(800,500);
//	new_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	new_frame.setVisible(true);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


