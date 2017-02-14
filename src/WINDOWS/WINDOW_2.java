package WINDOWS;

//import interface_1.Search_table_01;

import interface_1.Search_table_01;

import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import javax.swing.UnsupportedLookAndFeelException;

public class WINDOW_2 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel name_2;
private BufferedImage img;
private JLabel password_2;
private JTextField name_field_2;
private JPasswordField pass_field_2;
//private static JPanel this1;
private GridBagConstraints c2;
private JLabel space_1;
private JLabel space_2;
private JButton log_in_2;
private JLabel space_3;
private JLabel space_4;
private JLabel space_5;
 public static Container container_2;
 public static Container container_back_2;
private JLabel space_6;
private JButton back_2;
 WINDOW_2() throws IOException {
	 
	 super.setLayout(new GridBagLayout());

 img=ImageIO.read(new File("admin.jpg"));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	c2=new GridBagConstraints();
	//this1=new JPanel(new  GridBagLayout());
	 name_2=new JLabel    ("ADMIN NAME:    ");
	 name_2.setFont(new Font("df", Font.BOLD,25));
	 
	 log_in_2=new JButton("LOG IN");
	 log_in_2.setFont(new Font("df", Font.BOLD,25));
	 password_2=new JLabel("PASSWORD  :");
	 password_2.setFont(new Font("df", Font.BOLD,25));
	 
	 //name_2.setOpaque(Color.BLUE);
	 name_field_2=new JTextField("",20);
	 name_field_2.setFont(new Font("df", Font.BOLD,25));
	 
	 pass_field_2=new JPasswordField("",20);
	 pass_field_2.setFont(new Font("df", Font.BOLD,25));
	 space_1=new JLabel(" ");
	 space_2=new JLabel(" ");
	  space_3=new JLabel(" ");
	  space_6=new JLabel(" ");
		 space_4=new JLabel(" ");
		  space_5=new JLabel(" ");
	  back_2=new JButton("BACK");
	  back_2.setFont(new Font("df", Font.BOLD,25));
	GET_PANEL.addComponent1(this,name_2,0,0,1,1,c2);
	GET_PANEL.addComponent1(this,name_field_2,0,1,1,1,c2);
	GET_PANEL.addComponent1(this,space_4,1,0,1,1,c2);
	GET_PANEL.addComponent1(this,space_5,2,0,1,1,c2);
	GET_PANEL.addComponent1(this,space_6,3,0,1,1,c2);
	//GET_PANEL.addComponent1(panel_2,password_2,1,0,1,1,c2);
	GET_PANEL.addComponent1(this,password_2,4,0,1,1,c2);
	GET_PANEL.addComponent1(this,pass_field_2,4,1,1,1,c2);
	GET_PANEL.addComponent1(this,space_1,5,0,1,1,c2);
	GET_PANEL.addComponent1(this,space_2,6,0,1,1,c2);
	GET_PANEL.addComponent1(this,space_3,7,0,1,1,c2);
    GET_PANEL.addComponent1(this,log_in_2,8,1,1,1,c2);
    GET_PANEL.addComponent1(this,back_2,8,0,1,1,c2);
log_in_2.addActionListener(
		
		new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
	
				Search_table_01 jk=new Search_table_01();
				//@SuppressWarnings("deprecation")
			int u=jk.search_n_p(name_field_2.getText(),pass_field_2.getText() );
			
//				try {
//					wind3 = new ADMIN_WINDOW_3();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				if (name_field_2.getText().equals("")&&pass_field_2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"YOU HAVENT ENTER ANY THING ");
				}
					
					
					
					
					else if(u==2){
					setVisible(false);
				ADMIN_WINDOW_3 wind3 = null;
				try {
				wind3=	new ADMIN_WINDOW_3();
				} catch (IOException e) {
			
					e.printStackTrace();
				}
				ADMIN_WINDOW_3.container_3=container_2;
				//container_2.removeAll();
				//ADMIN_WINDOW_3 op = null;
				JPanel p1=wind3.get_panel_3();
				container_2.setLayout(new BorderLayout());
	container_2.add(p1);
				container_2.validate();
			//	container_back_2=container_2.getParent();
				}
	else	if(u==3){
		JOptionPane.showMessageDialog(null,"NAME INCORRECT");
					
				}
	else		if(u==4){
					JOptionPane.showMessageDialog(null,"PASSWORD INCORRECT");
					
				}
	else		if(u==5){
					JOptionPane.showMessageDialog(null,"YOU ARE NOT AN ADMIN");
					
				}
//				
				
				
				
				
				
			}
				
		}
		);
		back_2.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
//					
//			
				JPanel p1=ENTRANCE.get_Main_panel();
		
				setVisible(false);
//				container_2.removeAll();		
//			container_2.setLayout(new BorderLayout());
				container_2.add(p1);
				container_2.validate();
				//container_2.removeAll();
				//container_2.validate();
						
					}
				}
				
				);
		
		
		




}

 protected void paintComponent(Graphics g) {
		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}



public  JPanel get_panel_2(){
	
return this;
}












}
