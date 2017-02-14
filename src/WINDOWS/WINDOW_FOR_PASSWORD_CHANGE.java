package WINDOWS;

import interface_1.Admin_search;
import interface_1.Admin_update;
import interface_1.Search_sales_man;
import interface_1.Update_sales_man;
//import interface_1.Search_by_id;
//import interface_1.Search_by_name;
//import interface_1.Search_sales_man;
//import interface_1.Update_sales_man;

import java.awt.Color;
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
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WINDOW_FOR_PASSWORD_CHANGE extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel old_password;
	private JLabel new_password;
	private BufferedImage img;
//	private JLabel name_4;
//	private JLabel unit_4;
//	private JLabel unit_price_4;
	private JLabel space_1;
	public static Container container_p_change;
//	private JLabel space_0;
	private JLabel space_2;
	//private JLabel space_3;
	private JLabel space_4;
	private JLabel space_5;
	private JLabel space_6;
	private JLabel space_23;
	private JLabel space_24;
	//private JLabel space_7;
	private JLabel cau; 
	private JLabel space_21;
	private JLabel space_22;
	
	
	
	
	private JLabel space_31;
	private JLabel space_32;
	private JLabel space_33;
	private JLabel space_34;
	private JLabel space_35;
	//private JLabel space_7;
	//private JLabel cau; 
	private JLabel space_36;
	private JLabel space_37;
	private JLabel space_38;
	//private JLabel space_7;
	//private JLabel cau; 
	private JLabel space_39;
	private JLabel space_40;
	private JLabel space_51;
	
	
	
	
	
	
	
	
	
	private JLabel enter_id;
	private JLabel ADMIN;
	private JPasswordField  t_old_password;
	private JPasswordField t_new_password;
//	private JTextField name_t_4;
//	private JTextField unit_t_4;
	private JButton update_p;
	private JButton back_p_change;
		//private static JPanel this1;
private GridBagConstraints con_pc;
private JButton up;
private JTextField t_enter_id;
private JLabel sales_pass_change;
private JLabel id_sales_new;
private JTextField t_id_sales_new;
private JLabel password_sales_new;
private JPasswordField t_pass_sales_new;
public WINDOW_FOR_PASSWORD_CHANGE() throws IOException {
	
	super.setLayout(new GridBagLayout());


cau=new JLabel("***** PASSWORDS ARE CASE SENSITIVE");
	img=ImageIO.read(new File("passwardchange.jpg"));
	cau.setForeground(Color.RED);

	
	
	
	
	
	
	
	
	
	
	
	
	
	con_pc=new GridBagConstraints();
	//enter_id=new JLabel("ID");
	 t_enter_id=new JTextField(10);	
	 enter_id=new JLabel    ("        NAME:");	
	enter_id.setFont(new Font("h", Font.BOLD, 20));
	 space_1=new JLabel(" ");
	 //space_0=new  JLabel(" ");
	 space_2=new  JLabel(" ");
	 //space_3=new  JLabel(" ");
	 space_4=new  JLabel(" ");
 space_5=new  JLabel(" ");
 space_6=new  JLabel(" ");
 //space_7=new  JLabel(" ");
 space_21=new  JLabel(" ");
 space_22=new  JLabel(" ");
 space_23=new  JLabel(" ");
 space_24=new  JLabel(" ");
 old_password=new JLabel("OLD PASSWORD:");
 old_password.setFont(new  Font("y",Font.BOLD, 20));
  up=new JButton("UPDATE"); 
	 up.setFont(new Font("h", Font.BOLD, 20));
 
 new_password=new JLabel("NEW PASSWORD:");
new_password.setFont(new  Font("y",Font.BOLD, 20));
 
 
 t_old_password=new JPasswordField(15);
		 
 t_old_password.setFont(new  Font("y",Font.BOLD, 20));
 
 
 t_new_password=new JPasswordField(15);
 t_new_password.setFont(new  Font("y",Font.BOLD, 20));

		  sales_pass_change=new JLabel("SALES MAN :");
		  sales_pass_change.setFont(new  Font("y",Font.BOLD, 20));
		  
		  id_sales_new=new  JLabel("ID:");
		  id_sales_new.setFont(new  Font("y",Font.BOLD, 20));
		  
		  t_id_sales_new=new JTextField("");
		  t_id_sales_new.setFont(new  Font("y",Font.BOLD, 20));
		  password_sales_new=new JLabel("PASSWORD");
		  password_sales_new.setFont(new  Font("y",Font.BOLD, 20));
		  t_pass_sales_new=new JPasswordField("");
		  t_pass_sales_new.setFont(new  Font("y",Font.BOLD, 20));
		 
			space_31=new JLabel(" ");
			 space_33=new  JLabel(" ");
			 space_32=new  JLabel(" ");
			 //space_3=new  JLabel(" ");
			 space_34=new  JLabel(" ");
		 space_35=new  JLabel(" ");
		 space_36=new  JLabel(" ");
		 //space_7=new  JLabel(" ");
		 space_37=new  JLabel(" ");
		 space_38=new  JLabel(" ");
		 space_39=new  JLabel(" ");
		 space_40=new  JLabel(" ");
		 space_51=new  JLabel(" ");
		 
		  ADMIN=new JLabel("ADMIN");	 
		 ADMIN.setFont(new Font("r", Font.BOLD, 20));
		 
		 
		 
		 
		 
		 
		 update_p=new JButton("UPDATE");
		 update_p.setFont(new Font("h", Font.BOLD, 20));
		 back_p_change=new JButton("BACK");
		 back_p_change.setFont(new Font("h", Font.BOLD, 20));
	//	 this1=new JPanel(new GridBagLayout());
		 
		 con_pc.fill=GridBagConstraints.BOTH;
		 con_pc.weightx=0;
		 con_pc.weighty=0;
		 
		 
		 
		 
		 
		 
		 
		 GET_PANEL.addComponent1(this,  ADMIN,0,0,1,1, con_pc); 
		 
		 GET_PANEL.addComponent1(this,  old_password,1,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,space_1 , 2,0, 1,1,con_pc);
		 GET_PANEL.addComponent1(this,space_2,3,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, new_password ,4,0,1,1, con_pc);
		 //GET_PANEL.addComponent1(panel_p_change,space_3,4,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, t_old_password ,1,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_4 ,6,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_5 , 7,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this,t_new_password,4,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_6, 8,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_51 ,9,0,1,1, con_pc);
		 
		 GET_PANEL.addComponent1(this, enter_id, 10,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, t_enter_id ,10,1,1,1, con_pc);
		 
		
		 
		 
		 
		 
		 GET_PANEL.addComponent1(this, space_31, 11,0,1,1,con_pc);
//		 GET_PANEL.addComponent1(this, space_32 ,12,0,1,1, con_pc);
		GET_PANEL.addComponent1(this, sales_pass_change, 13,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_33, 14,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_34 ,15,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,id_sales_new ,18,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_36, 17,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_35 ,18,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,t_id_sales_new ,18,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_37, 20,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_38 ,21,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,password_sales_new ,22,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_39, 23,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_40 ,24,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,t_pass_sales_new ,22,1,1,1, con_pc);	 
		 
		 
		 
		 
		 
		 
		 
		 
		 //GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
		 con_pc.fill=GridBagConstraints.NONE;
		 GET_PANEL.addComponent1(this, space_21, 23,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_22 ,24,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,back_p_change ,25,0,1,1, con_pc);
		 
		 GET_PANEL.addComponent1(this,update_p ,10,2,1,1, con_pc);
		 GET_PANEL.addComponent1(this,up ,22,2,1,1, con_pc); 
		 
		 GET_PANEL.addComponent1(this, space_23, 26,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_24 ,27,0,1,1, con_pc); 
		 
		 GET_PANEL.addComponent1(this,cau,28,1,1,1, con_pc);
		// GET_PANEL.addComponent1(pael_p_change, space_0 ,10,0,1,1, con_pc);


back_p_change.addActionListener(
		
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				//WINDOW_FOR_PASSWORD_CHANGE po=new WINDOW_FOR_PASSWORD_CHANGE();
				ADMIN_WINDOW_3 kl = null;
				try {
					kl = new ADMIN_WINDOW_3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				JPanel p1=kl.get_panel_3();
				//WINDOW_FOR_PASSWORD_CHANGE.container_p_change=container_3;
				//container_3.removeAll();		
			//container_3.setLayout(new BorderLayout());
				container_p_change.add(p1);
				container_p_change.validate();
				
			}
		}
		
		
		
		
		
		);





update_p.addActionListener(
		
		new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
			try {
			if(!(Admin_search.search_name(t_enter_id.getText()))){
				JOptionPane.showMessageDialog(null,"NAME DOSENT MATCH ");
				t_enter_id.setText("");
			
			}
			else if(!(Admin_search.search_password_by_name(t_enter_id.getText(),t_old_password.getText()))){
				JOptionPane.showMessageDialog(null,"OLD PASSWORD DOSENT MATCH ");
			t_old_password.setText("");
			
			}
			else if(t_new_password.getText().equals("")){
				JOptionPane.showMessageDialog(null,"ENTER NEW PASSWORD ");
			t_new_password.setText("");
			
			}
			
			
			else if(t_enter_id.getText().equals("")){
				JOptionPane.showMessageDialog(null,"ENTER NAME");
			}
			else if(t_old_password.getText().equals("")){
				JOptionPane.showMessageDialog(null,"ENTER OLD PASSWORD");
			}
			else if(t_new_password.getText().equals("")){
				JOptionPane.showMessageDialog(null,"ENTER NEW PASSWORD");
			}
				
				else if(	Admin_update.password_update(t_new_password.getText(), t_old_password.getText()))
				{
					JOptionPane.showMessageDialog(null,"PASSWORD SUCCESSFULLY UPDATED");
				
				t_new_password.setText("");
				t_old_password.setText("");
				t_enter_id.setText("");
				
				}
				else{
					JOptionPane.showMessageDialog(null,"PLEASE FILL UP PASSWORD BOX ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		}
		
	);


//t_pass_sales_new
up.addActionListener(
new ActionListener() {
			
			//@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
			try {
			if(t_id_sales_new.getText().equals("")){
				JOptionPane.showMessageDialog(null,"ENTER ID ");
				t_id_sales_new.setText("");}
		
			else if(!(Search_sales_man.search_id(t_id_sales_new.getText()))){

				JOptionPane.showMessageDialog(null,"ID NOT FOUND ");
				t_id_sales_new.setText("");
			
			
			}
			
			else if(Update_sales_man.password_update_single( t_pass_sales_new.getText(),t_id_sales_new.getText()))
			{
				//Search_sales_man.
				JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
				t_id_sales_new.setText("");
				t_pass_sales_new.setText("");
			
			}
			
			else{
				JOptionPane.showMessageDialog(null,"SOME THING WRONG");
			}
			
			
			
			
			
			
			
			}
			
			catch (SQLException e) {
				// TODO: handle exception
			e.printStackTrace();
			
			
			}
			}}
			
	);

	

		
		
		
		
		
		
		
		







}




















protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}

public  JPanel get_pc(){
	
	return this;
	
	
}

}
