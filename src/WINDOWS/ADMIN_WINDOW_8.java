package WINDOWS;

import interface_1.INSERT_SALES_MAN;
import interface_1.Search_sales_man;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
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
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class ADMIN_WINDOW_8 extends JPanel{
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	//private static JPanel this1;
	private GridBagConstraints con8;
	private JLabel add_sale_8;
	private JLabel name_8;
	private JLabel id_8;
	public static Container container_8;
	private JLabel password_8;
	private JLabel search_8;
	private JLabel d_id_8;
	private JLabel delete_8;

	private JLabel space_1;
	private JLabel space_22;
	private JLabel space_2;
	private JLabel space_3;
	private JLabel space_4;
	private JLabel space_5;
	private JLabel space_6;
	private JLabel space_7;
	private JLabel space_8;
	private JLabel space_9;
	private JLabel space_10;
	private JLabel space_11;
	private JLabel space_13;
	private JLabel space_14;
	private JLabel space_15;
	private JLabel space_16;
	private JLabel space_17;
	private JLabel space_18;
	private JLabel space_19;
	private JLabel space_20;
	private JLabel space_21;
	private  BufferedImage img;
	private JLabel pro_id_8;
	private JLabel req_1;
	private JLabel req_2;
	private JLabel req_3;
	private JLabel cau;
	private JLabel pro_id_for_delete;
	private JTextField t_name_8;
	private JTextField t_id_8;
	private JPasswordField t_password_8;
	private JTextField  t_d_id_8;
	private JTextField t_d_name_8;
	private JButton b_delete_8;
	private JButton add_8;
	private JButton back_8;
	private  JLabel dynamic_lebel;
public ADMIN_WINDOW_8() throws IOException {
	super.setLayout(new GridBagLayout());


	

	img=ImageIO.read(new File("salesmanpic1.jpg"));
	
	
	
	cau=new JLabel("         *****PASSWORD IS CASE SENSITIVE ");
	
	cau.setForeground(Color.RED);
	cau.setFont(new Font("d",Font.BOLD, 15));
	
	

 req_1=new JLabel("required");
 	req_1.setFont(new Font("l", Font.BOLD, 20));
	 req_2=new JLabel("required");
	 req_2.setFont(new Font("l", Font.BOLD, 20));
	 req_3=new JLabel("required");
	 req_3.setFont(new Font("l", Font.BOLD, 20));
	req_1.setForeground(Color.RED);
	req_2.setForeground(Color.RED);
	req_3.setForeground(Color.RED);
	
	dynamic_lebel=new JLabel(" 0");
	dynamic_lebel.setFont(new Font("l", Font.BOLD, 20));
	 //this1=new JPanel(new GridBagLayout());
	 con8=new GridBagConstraints();

	space_1=new JLabel(" ");
	 space_2=new JLabel(" ");
space_3=new JLabel(" ");
	 space_4=new JLabel(" ");
	 space_5=new JLabel(" ");
	 space_6=new JLabel(" ");
	 space_7=new JLabel(" ");
	 space_18=new JLabel(" ");
	 space_8=new JLabel(" ");
space_9=new JLabel(" ");
space_10=new JLabel(" ");
space_13=new JLabel(" ");
space_11=new JLabel(" ");
space_22=new JLabel(" ");
space_14=new JLabel(" ");
space_15=new JLabel(" ");
space_16=new JLabel("");
space_17=new JLabel(" ");
space_19=new JLabel(" ");
space_20=new JLabel(" ");
space_21=new JLabel(" ");
 pro_id_8=new JLabel("     NAME");
 pro_id_8.setFont(new Font("f", Font.BOLD, 30));
 pro_id_for_delete=new JLabel("DELETE WITH ID:");
pro_id_for_delete.setFont(new Font("f", Font.BOLD, 30));
 pro_id_for_delete.setForeground(Color.BLACK);
 add_sale_8=new JLabel("             ");
 add_sale_8.setFont(new Font("f", Font.BOLD, 30));
 add_sale_8.setForeground(Color.BLACK);
 
 
 name_8=new JLabel   ("		            NAME:");
 name_8.setFont(new Font("f", Font.BOLD, 30));
 name_8.setForeground(Color.BLACK);
 
 
 
 
 
 id_8=new JLabel("              ID");
  
id_8.setFont(new Font("f", Font.BOLD, 30));
 id_8.setForeground(Color.BLACK);
 
 
 b_delete_8=new JButton("DELETE");
 b_delete_8.setFont(new Font("f", Font.BOLD, 30));
 b_delete_8.setForeground(Color.BLACK);
 	
 
 
 add_8=new JButton("ADD SALES MAN");
 add_8.setFont(new Font("f", Font.BOLD, 20));
 add_8.setForeground(Color.BLACK);
 	 
 
 
 back_8=new JButton("BACK");
 back_8.setFont(new Font("f", Font.BOLD, 30));
 back_8.setForeground(Color.BLACK);
 
 
 
 password_8=new JLabel("             PASSWORD:");
 password_8.setFont(new Font("f", Font.BOLD, 30));
 password_8.setForeground(Color.BLACK);
 
 
 
 
 search_8=new JLabel("");
 
 search_8.setFont(new Font("f", Font.BOLD, 20));
 search_8.setForeground(Color.BLACK);
 
 
 d_id_8=new JLabel("SEARCH  WITH ID");
 d_id_8.setFont(new Font("f", Font.BOLD, 30));
 d_id_8.setForeground(Color.BLACK);
 
 
 delete_8=new JLabel(" ");
 delete_8.setFont(new Font("f", Font.BOLD, 20));
 delete_8.setForeground(Color.BLACK);
  
 
 
 
 t_name_8=new JTextField(15);
 t_name_8.setFont(new Font("f", Font.BOLD, 20));
 t_name_8.setForeground(Color.BLACK);
 
 
 
 
 t_id_8=new JTextField(15);
t_id_8.setFont(new Font("f", Font.BOLD, 30));
t_id_8.setForeground(Color.BLACK);
	 
 
 t_password_8=new JPasswordField(15);
 t_password_8.setFont(new Font("f", Font.BOLD, 30));
 t_password_8.setForeground(Color.BLACK);
 	  
 
 t_d_id_8=new JTextField(15);
t_d_id_8.setFont(new Font("f", Font.BOLD, 30));
t_d_id_8.setForeground(Color.BLACK);
	 
 
 t_d_name_8=new JTextField(15);
 t_d_name_8.setFont(new Font("f", Font.BOLD, 30));
 t_d_name_8.setForeground(Color.BLACK);
 
	 con8.fill=GridBagConstraints.BOTH;
	 con8.weightx=1;
	 con8.weighty=1;

	 GET_PANEL.addComponent1(this,add_sale_8 , 0,0, 1,1,con8);
		GET_PANEL.addComponent1(this,space_1,1,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_2,2,0,1,1, con8);
		GET_PANEL.addComponent1(this,name_8,3,0,1,1, con8);
		GET_PANEL.addComponent1(this,t_name_8,3,1,1,1, con8);
		GET_PANEL.addComponent1(this,req_1,3,2,2,1, con8);
		GET_PANEL.addComponent1(this, space_3,4,1,1,1, con8);
		GET_PANEL.addComponent1(this,space_4,5,0,1,1, con8);
		GET_PANEL.addComponent1(this,id_8,6,0,1,1, con8);
		GET_PANEL.addComponent1(this,t_id_8,6,1,1,1, con8);
		GET_PANEL.addComponent1(this,req_2,6,2,2,1, con8);
		GET_PANEL.addComponent1(this, space_5,7,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_6 ,8,0,1,1, con8);
		GET_PANEL.addComponent1(this,password_8,9,0,1,1, con8);
		GET_PANEL.addComponent1(this,t_password_8,9,1,1,1, con8);
		GET_PANEL.addComponent1(this,req_3,9,2,2,1, con8);
		GET_PANEL.addComponent1(this,cau,9,4,1,1, con8);
		GET_PANEL.addComponent1(this, space_17,10,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_16 ,11,0,1,1, con8);
		GET_PANEL.addComponent1(this, space_18,12,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_19 ,13,0,1,1, con8);
		GET_PANEL.addComponent1(this,add_8,14,1,1,1, con8);
		//con8.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, space_7,15,0,1,1, con8);
		GET_PANEL.addComponent1(this, space_8 , 16,0,1,1,con8);
		GET_PANEL.addComponent1(this, search_8 , 17,0,1,1,con8);
		GET_PANEL.addComponent1(this, pro_id_8 ,17,3,1,1, con8);
		GET_PANEL.addComponent1(this,space_9,18,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_10 ,19,0,1,1, con8);
		GET_PANEL.addComponent1(this, d_id_8, 20,0,1,1,con8);
		GET_PANEL.addComponent1(this,dynamic_lebel, 20,3,2,1,con8);
		GET_PANEL.addComponent1(this, t_d_id_8, 20,1,2,1,con8);
		GET_PANEL.addComponent1(this, space_11, 21,0,1,1,con8);
		GET_PANEL.addComponent1(this,space_13,22,0,1,1, con8);
		GET_PANEL.addComponent1(this, delete_8 ,23,0,1,1, con8);
		//GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
		GET_PANEL.addComponent1(this,space_22 ,24,0,1,1, con8);
		GET_PANEL.addComponent1(this, pro_id_for_delete,25,0,1,1, con8);
		GET_PANEL.addComponent1(this, t_d_name_8 ,25,1,2,1, con8);
		GET_PANEL.addComponent1(this,b_delete_8,25,3,1,1, con8);
		GET_PANEL.addComponent1(this,space_14 ,26,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_15 ,27,1,1,1, con8);
	
		GET_PANEL.addComponent1(this,space_20 ,28,0,1,1, con8);
		GET_PANEL.addComponent1(this,space_21 ,29,0,1,1, con8);
		
		con8.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, back_8,30,0,1,1, con8);
//		GET_PANEL.addComponent1(panel_5, add_5 ,18,0,1,1, con5);
//		GET_PANEL.addComponent1(panel_5, t_add_5 ,18,1,1,1, con5);
//		GET_PANEL.addComponent1(panel_5,space_16,19,0,1,1, con5);
		
		back_8.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
						ADMIN_WINDOW_3 op = null;
						try {
							op = new ADMIN_WINDOW_3();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						JPanel p1=	op.get_panel_3();
						container_8.add(p1);
						container_8.validate();
						
					}
				}
				);
add_8.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		//INSERT_SALES_MAN nm=new INSERT_SALES_MAN();
		try {
		
			
			
			if(t_id_8.getText().equals("") || t_name_8.getText().equals("")|| t_password_8.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"PLEASE FILL UP THE FORM TO ADD");
			}
			
			else if (Search_sales_man.search_id(t_id_8.getText())){
				JOptionPane.showMessageDialog(null,"ID ALREADY EXIST");
				}
			
			else if (Search_sales_man.search_name(t_name_8.getText())){
				JOptionPane.showMessageDialog(null,"NAME ALREADY EXIST");
				}
			
			
			
			
			
else if(INSERT_SALES_MAN.insert(t_id_8.getText(), t_name_8.getText(),t_password_8.getText())){
				JOptionPane.showMessageDialog(null,"SUCCESS");
			}
			else{
				JOptionPane.showMessageDialog(null,"FAILED");
				
			}
		} catch (HeadlessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			}
		}
		
		
		
		
		);

b_delete_8.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				INSERT_SALES_MAN nm=new INSERT_SALES_MAN();
				try {
					
						if(t_d_name_8.getText().equals(""))
					{
				JOptionPane.showMessageDialog(null,"ENTER ID");
					t_d_name_8.setText("");
					}
					
					
					
					else	if(!(Search_sales_man.search_id(t_d_name_8.getText())))
							{
						JOptionPane.showMessageDialog(null,"ID NOT FOUND");
							t_d_name_8.setText("");
							}
				else	if(nm.delete(t_d_name_8.getText())){
						
						JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY");	
						t_d_name_8.setText("");
					}
					else{
						JOptionPane.showMessageDialog(null,"FAILED");	
						t_d_name_8.setText("");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		);
t_d_id_8.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
			//	INSERT_SALES_MAN  jk=new  INSERT_SALES_MAN();
				
				if(t_d_id_8.getText().equals("")){
					dynamic_lebel.setText("0");	
				}
				else if(!(Search_sales_man.search_id(t_d_id_8.getText()))){
					dynamic_lebel.setText("NOT FOUND");	
				}
else{
				dynamic_lebel.setText(INSERT_SALES_MAN.search_sales_man_name(t_d_id_8.getText()));
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		);

}



protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}







public  JPanel get_panel8(){
	return this;
	}




















}
