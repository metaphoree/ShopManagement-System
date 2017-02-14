package INTERFACE;

//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MY_THREAD extends Thread{
//private static final String FONT = null;
	private JPanel front_panel;
	private JLabel front_lebel;
	private JFrame front_frame;
	private Container mainContainer;
	private BufferedImage img;
@Override
public void run() {
	

try {
	//super("my window");
	front_lebel=new JLabel("   WELCOME   TO  DEPARTMENTAL   STORE  ");
	front_lebel.setForeground(Color.CYAN);
	front_lebel.setFont(new Font("sf", Font.CENTER_BASELINE, 40));
	front_panel=new JPanel();
front_panel.setLayout(new BorderLayout());
//setLayout(new BorderLayout());
//front_panel.setBackground(Color.BLACK);
//front_panel.add(front_lebel,BorderLayout.CENTER);

img=ImageIO.read(new File("opening.jpg"));	

front_frame=new JFrame();	
	
	
	
	
 mainContainer = front_frame.getContentPane(); 
mainContainer.add(new JLabel(new ImageIcon("opening.jpg")));

	
	
	
	


	//OPENING_WINDOW nm=new OPENING_WINDOW();
	front_frame.setLocation(350, 25);
	//front_frame.add(front_panel);
front_frame.setForeground(Color.GREEN);	
	front_frame.setSize(1000, 700);
front_frame.setVisible(true);
//front_frame.setIconImage(getClass().getResource("opening.jpg"));
//front_frame.
//front_frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("opening.jpg")))));


	sleep(2000);
	//sleep(4000);
	front_frame.dispose();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}

//protected void paintComponent(Graphics g) {
//	
//    this.paintComponent(g);
//    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
//}





}


