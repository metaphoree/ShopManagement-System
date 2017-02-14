package WINDOWS;

//import interface_1.Search_sales_man;
import interface_1.Search_sales_man;
import interface_1.Update_sales_man;

import java.awt.Color;
//import java.awt.BorderLayout;
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

public class SALES_MAN_WINDOWS_1 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel old_password;
	private JLabel new_password;
private  JLabel caution;
	private JLabel space_1;
	public static Container container_sale_1;
//	private JLabel space_0;
	private JLabel space_2;
	//private JLabel space_3;
	private JLabel enter_id;
	private JTextField t_enter_id;
	private JLabel space_4;
	private JLabel space_13;
	private JLabel space_5;
	private JLabel space_6;
	private JLabel space_9;
	private JLabel space_10;
	private JLabel space_14;
	private JLabel space_15;
	//private JLabel notice;
	private BufferedImage img;
//	private JLabel space_7;
	private JPasswordField  t_old_password;
	private JPasswordField t_new_password;
//	private JTextField name_t_4;
//	private JTextField unit_t_4;
	private JButton update_p;
	private JButton back_p_change;
	//	private static JPanel this1;
private GridBagConstraints con_pc;





public SALES_MAN_WINDOWS_1() throws IOException {
	
	super.setLayout(new GridBagLayout());

caution=new JLabel("****PASSWORDS ARE CASE SENSITIVE");
caution.setFont(new Font("hj", Font.BOLD, 25));
caution.setForeground(Color.RED);

	img=ImageIO.read(new File("password.jpg"));

	
	
	
	
	
	
	con_pc=new GridBagConstraints();
	
	 t_enter_id=new JTextField(10);	
	 t_enter_id.setFont(new Font("hj", Font.BOLD, 25));
	 enter_id=new JLabel    ("        NAME:");
	 enter_id.setFont(new Font("hj", Font.BOLD, 25));
	
	space_1=new JLabel(" ");
	
	 space_14=new  JLabel(" ");
	 space_15=new  JLabel(" ");
	
	//space_0=new  JLabel(" ");
	 space_2=new  JLabel(" ");
	 space_10=new  JLabel(" ");
	 space_9=new  JLabel(" ");
	 //space_3=new  JLabel(" ");
	 space_13=new  JLabel(" ");
	 space_4=new  JLabel(" ");
 space_5=new  JLabel(" ");
 space_6=new  JLabel(" ");
 //notice=new JLabel("ALLTHREE LEBEL MUST BE FILLED");
 //space_7=new  JLabel(" ");
     old_password=new JLabel("CURRENT PASSWORD:");
	 old_password.setFont(new Font("hj", Font.BOLD, 25));
     
     new_password=new JLabel("NEW PASSWORD:");
     new_password .setFont(new Font("hj", Font.BOLD, 25)); 
     
     t_old_password=new JPasswordField(15);
     t_old_password.setFont(new Font("hj", Font.BOLD, 25));
		 t_new_password=new JPasswordField(15);
		 t_new_password.setFont(new Font("hj", Font.BOLD, 25));

		  update_p=new JButton("UPDATE");
		  update_p .setFont(new Font("hj", Font.BOLD, 25));
		 back_p_change=new JButton("BACK");
		 back_p_change.setFont(new Font("hj", Font.BOLD, 25));
	//	 this1=new JPanel(new GridBagLayout());
		 
		 con_pc.fill=GridBagConstraints.BOTH;
//		 con_pc.weightx=1;
//		 con_pc.weighty=1;
		 
		 GET_PANEL.addComponent1(this,  old_password,0,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,space_1 , 1,0, 1,1,con_pc);
		 GET_PANEL.addComponent1(this,space_2,2,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, new_password ,4,0,1,1, con_pc);
		 //GET_PANEL.addComponent1(panel_p_change,space_3,4,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, t_old_password ,0,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_4 ,5,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_5 , 6,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this,t_new_password,4,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_6, 7,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_5 ,8,0,1,1, con_pc);
		 //GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
		 GET_PANEL.addComponent1(this, enter_id, 9,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, t_enter_id ,9,1,1,1, con_pc);
		 
		 GET_PANEL.addComponent1(this, space_9, 10,0,1,1,con_pc);
		 GET_PANEL.addComponent1(this, space_10 ,11,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_13 ,12,0,1,1, con_pc);
		 
		 con_pc.fill=GridBagConstraints.NONE;
		 GET_PANEL.addComponent1(this,back_p_change ,13,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this,update_p ,13,1,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_14 ,14,0,1,1, con_pc);
		 GET_PANEL.addComponent1(this, space_15 ,15,0,1,1, con_pc);	
		 GET_PANEL.addComponent1(this,caution ,16,1,1,1, con_pc);
		 
		 // GET_PANEL.addComponent1(panel_p_change, space_0 ,10,0,1,1, con_pc);


back_p_change.addActionListener(
		
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				//WINDOW_FOR_PASSWORD_CHANGE po=new WINDOW_FOR_PASSWORD_CHANGE();
				SALES_MAN_WINDOWS_2 kl = null;
				try {
					kl = new SALES_MAN_WINDOWS_2();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				JPanel p1=kl.get_sale_panel();
				//WINDOW_FOR_PASSWORD_CHANGE.container_p_change=container_3;
			//	container_sale_1.removeAll();		
			//container_sale_1.setLayout(new BorderLayout());
				container_sale_1.add(p1);
				container_sale_1.validate();
				
			}
		}
		
		
		
		
		
		);


update_p.addActionListener(
		
		new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
			try {
			if(!(Search_sales_man.search_name(t_enter_id.getText()))){
				JOptionPane.showMessageDialog(null,"NAME DOSENT MATCH ");
				t_enter_id.setText("");
			
			}
			else if(!(Search_sales_man.search_password_by_name(t_enter_id.getText(),t_old_password.getText()))){
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
				
				else if(	Update_sales_man.password_update(t_new_password.getText(), t_old_password.getText()))
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















}

protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}
public  JPanel get_pc2(){
	
	return this;
	
	
}

}
