package WINDOWS;

import interface_1.Search_by_id;
import interface_1.Search_by_name;
import interface_1.Stock_update;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
//import java.awt.GridLayout;
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
import javax.swing.JTextField;

public class ADMIN_WINDOW_5 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel update_5;
//private static String s1;
private JLabel old_id_5;
private JLabel new_id_5;
public static Container container_5;
private JLabel new_name_5;
private JLabel unit_price_5;
private JLabel update_unit_5;
private JLabel add_5;
private String my;
private JLabel remove_5;
private JLabel space_1;
//private JLabel space_0;
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
private String gh;
private BufferedImage img;
private JTextField   t_old_id_5;
private JTextField t_new_id_5;
private JTextField t_new_name_5;
private JTextField t_unit_price_5;
private JTextField  t_update_unit_5;
private JTextField t_add_5;
private JTextField t_remove_5;
private JButton b_update_5 ;
private JButton back_5;
private JButton current_stock_value;

//private static JPanel this1; 
private GridBagConstraints con5;

private JLabel condition_5;




public ADMIN_WINDOW_5() throws IOException {
	
	
	
	super.setLayout(new GridBagLayout());



	img = ImageIO.read(new File("Un.jpg"));
	
	
	
	
	
	
	current_stock_value=new  JButton("CURRENT STOCK");
	current_stock_value.setFont(new Font("h", Font.BOLD, 25));
	gh="";
	my=" ";
	condition_5=new JLabel("       YOU MUST GIVE A OLD ID FIRST");
	condition_5.setForeground(Color.RED); 
	update_5=new JLabel     ("UPDATE PANEL:");
	update_5.setFont(new Font("s",Font.BOLD,30));
	update_5.setForeground(Color.MAGENTA);
	update_5.setBackground(Color.WHITE);
	old_id_5=new JLabel     ("      CURRENT ID:");

	old_id_5.setFont(new Font("s",Font.BOLD, 30));
	old_id_5.setForeground(Color.RED);
	new_id_5=new JLabel         ("         NEW ID:");
	new_id_5.setFont(new Font("s",Font.BOLD, 30));
	new_id_5.setForeground(Color.RED);
	
	
	
	new_name_5=new JLabel   ("       NEW NAME:");
	new_name_5.setFont(new Font("s",Font.BOLD, 30));
	new_name_5.setForeground(Color.RED); 
	
	
	
	unit_price_5=new JLabel ("     UNIT PRICE:");
	unit_price_5.setFont(new Font("s",Font.BOLD, 30));
	unit_price_5.setForeground(Color.RED);
	
	
	
	update_unit_5=new JLabel    ("       NEW UNIT:");
	update_unit_5.setFont(new Font("s",Font.BOLD, 30));
	update_unit_5.setForeground(Color.RED); 
	
	
	add_5=new JLabel        ("       ADD UNIT:");
	add_5.setFont(new Font("s",Font.BOLD, 30));
	add_5.setForeground(Color.RED); 
	
	
	
	remove_5=new JLabel     ("    REMOVE UNIT:");
	remove_5.setFont(new Font("s",Font.BOLD, 30));
	remove_5.setForeground(Color.RED); 
	
	
	
	
	
	space_1=new JLabel(" ");
	// space_0=new JLabel(" ");
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
 space_14=new JLabel(" ");
 space_15=new JLabel(" ");
 space_16=new JLabel("");
 space_17=new JLabel(" ");
space_18=new JLabel(" ");
//this1=new JPanel(new GridBagLayout());
con5=new GridBagConstraints();
//s1=" ";
t_old_id_5=new JTextField(gh,15);
t_old_id_5.setFont(new Font("s", Font.BOLD, 20));


	 t_new_id_5=new JTextField(gh,15);
	 t_new_id_5.setFont(new Font("s", Font.BOLD, 20));
	 
	 t_new_name_5=new JTextField(gh,15);
	 t_new_name_5.setFont(new Font("s", Font.BOLD, 20));
	 
	 t_unit_price_5=new JTextField(gh,15);
	 t_unit_price_5.setFont(new Font("s", Font.BOLD, 20));
	 
	  t_update_unit_5=new JTextField(gh,15);
	  t_update_unit_5.setFont(new Font("s", Font.BOLD, 20));
	  
	 t_add_5=new JTextField(gh,15);
	 t_add_5.setFont(new Font("s", Font.BOLD, 20));
	 
	 
	 t_remove_5=new JTextField(gh,15);
	 t_remove_5.setFont(new Font("s", Font.BOLD, 20));
	 b_update_5 =new JButton("UPDATE STOCK");
	 b_update_5.setFont(new Font("h", Font.BOLD, 25));
	 
	 back_5=new JButton("BACK");
	 back_5.setFont(new Font("h", Font.BOLD, 25));
	 back_5.setBackground(Color.GRAY);
	// back_5.setForeground(Color.GREEN);
	 con5.fill=GridBagConstraints.BOTH;
	 con5.weightx=1;
	 con5.weighty=1;
	GET_PANEL.addComponent1(this,update_5 , 0,0, 1,1,con5);
	GET_PANEL.addComponent1(this,space_1,1,0,1,1, con5);
	GET_PANEL.addComponent1(this,space_9,2,0,1,1, con5);
	GET_PANEL.addComponent1(this, old_id_5,3,0,1,1, con5);
	GET_PANEL.addComponent1(this, t_old_id_5,3,1,1,1, con5);
	GET_PANEL.addComponent1(this, condition_5,4,0,1,1, con5);
	GET_PANEL.addComponent1(this,space_2,4,0,1,1, con5);
	GET_PANEL.addComponent1(this,space_10,5,0,1,1, con5);
	GET_PANEL.addComponent1(this,remove_5, 6,0,1,1,con5);
	GET_PANEL.addComponent1(this,t_remove_5, 6,1,1,1,con5);
	GET_PANEL.addComponent1(this,space_11,7,0,1,1, con5);
	GET_PANEL.addComponent1(this, space_3,8,0,1,1, con5);
	GET_PANEL.addComponent1(this, add_5 ,9,0,1,1, con5);
	GET_PANEL.addComponent1(this, t_add_5 ,9,1,1,1, con5);
	GET_PANEL.addComponent1(this,space_13,10,0,1,1, con5);
	GET_PANEL.addComponent1(this,space_4 ,11,0,1,1, con5);
	GET_PANEL.addComponent1(this, unit_price_5, 12,0,1,1,con5);
	GET_PANEL.addComponent1(this, t_unit_price_5, 12,1,1,1,con5);
	GET_PANEL.addComponent1(this,space_14,13,0,1,1, con5);
	GET_PANEL.addComponent1(this, space_5 ,14,0,1,1, con5);
	//GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
	GET_PANEL.addComponent1(this,update_unit_5 ,15,0,1,1, con5);
	GET_PANEL.addComponent1(this,t_update_unit_5 ,15,1,1,1, con5);
	GET_PANEL.addComponent1(this,space_15,16,0,1,1, con5);
	GET_PANEL.addComponent1(this, space_6 ,17,0,1,1, con5);
	GET_PANEL.addComponent1(this, new_name_5 , 18,0,1,1,con5);
	GET_PANEL.addComponent1(this, t_new_name_5 , 18,1,1,1,con5);
	GET_PANEL.addComponent1(this,space_16,19,0,1,1, con5);
	GET_PANEL.addComponent1(this, space_7 ,20,0,1,1, con5);
	GET_PANEL.addComponent1(this, new_id_5 ,21,0,1,1, con5);
	GET_PANEL.addComponent1(this, t_new_id_5 ,21,1,1,1, con5);
	GET_PANEL.addComponent1(this,space_8, 22,0,1,1,con5);
	GET_PANEL.addComponent1(this,space_17,23,0,1,1, con5);
	GET_PANEL.addComponent1(this,space_18,24,0,1,1, con5);
	con5.fill=GridBagConstraints.NONE;
	GET_PANEL.addComponent1(this,current_stock_value ,3,2,1,1, con5);
	GET_PANEL.addComponent1(this,back_5 ,25,0,1,1, con5);
	GET_PANEL.addComponent1(this,b_update_5 ,25,2,2,1, con5);
	
back_5.addActionListener(
		
		
		
		
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
		container_5.add(p1);
		container_5.validate();	
			}
		}
		
		);
b_update_5.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				
				if(t_old_id_5.getText().equals(gh)){
					JOptionPane.showMessageDialog(null, "ID REQUIRED");
				}
				
				
				
				else if(Search_by_id.search_id(t_old_id_5.getText())){
				if(!(t_remove_5.getText().equals(gh))){
			
try {
	Stock_update.remove_stock_update(Integer.parseInt(t_old_id_5.getText()),Integer.parseInt(t_remove_5.getText()));
} catch (NumberFormatException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
my=my.concat("        UNIT REMOVED");
}
if(!(t_add_5.getText().equals(gh))){
	try {
		Stock_update.add_stock_update(Integer.parseInt(t_old_id_5.getText()),Integer.parseInt(t_add_5.getText()));
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
		

my=my.concat("         UNIT  ADDED\n");


}
if(!(t_unit_price_5.getText().equals(gh))){
	try {
		Stock_update.update_unit_price(Integer.parseInt(t_old_id_5.getText()),t_unit_price_5.getText());
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	



	my=my.concat("        UNIT PRICE UPDATED\n");


}
if(!(t_update_unit_5.getText().equals(gh))){
	try {
Stock_update.stock_update(Integer.parseInt(t_old_id_5.getText()),Integer.parseInt(t_update_unit_5.getText()));
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	

	my=my.concat("          UNIT UPDATED\n");




}
if(!(t_new_name_5.getText().equals(gh))){
	try {
		
		if(Search_by_name.search_name(t_new_name_5.getText())){ 
			
			JOptionPane.showMessageDialog(null, "NAME ALREADY  EXIST");
			
			my=	my.concat("       TRY DIFFERENT NAME");
		
		}
		else{
		Stock_update.name_stock_update(Integer.parseInt(t_old_id_5.getText()),t_new_name_5.getText());
		my=	my.concat("        NAME UPDATED");}
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	






}
					
if(!(t_new_id_5.getText().equals(gh))){
	
	try {
		
		if(Search_by_id.search_id(t_new_id_5.getText())){
			JOptionPane.showMessageDialog(null, "ID ALREADY EXIST");
			
			my=my.concat("            TRY DIFFERENT ID");	
		}
		else{
		Stock_update.id_stock_update(Integer.parseInt(t_old_id_5.getText()),Integer.parseInt(t_new_id_5.getText()));
		my=my.concat("             ID UPDATED\n");
		}} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}

                 
JOptionPane.showMessageDialog(null,my);
                 }

                 else{
                	 
                	 JOptionPane.showMessageDialog(null,"ID NOT FOUND");                	 
                	 
                 }
			
t_add_5.setText(gh);
t_add_5.setSelectedTextColor(Color.GREEN);
t_new_id_5.setText(gh);
t_new_name_5.setText(gh);
t_old_id_5.setText(gh);
t_remove_5.setText(gh);
t_unit_price_5.setText(gh);
t_update_unit_5.setText(gh);
my="";

//t_add_5.setText(gh);

			
			
			}
		}
		
		
		
		
		
		
		
		);

current_stock_value.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String sd=t_old_id_5.getText();
				
				//t_add_5.setText(gh);
				//t_add_5.setSelectedTextColor(Color.GREEN);
			//	t_new_id_5.setText(gh);
				if(sd.equals("")){
					JOptionPane.showMessageDialog(null,"ID REQUIRED");
				}
				
				else  if(Search_by_id.search_id(sd)){
				t_new_name_5.setText(Search_by_id.search_product_name(Integer.parseInt(sd)));
				//t_old_id_5.setText(gh);
				//t_remove_5.setText(gh);
				t_unit_price_5.setText(Double.toString(Search_by_id.search_unit_price(sd)));
				t_update_unit_5.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sd))));
				}
				else{
					t_new_name_5.setText("NOT FOUND");	
					t_unit_price_5.setText("NOT FOUND");
					t_update_unit_5.setText("NOT FOUND");
				
				
				
				
				
				
				
				
				}
			
			
			}
		}
		);
		
		
		
		
		
		
		
		
		











}


protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}



public  JPanel get_panel5(){
	
	return this;
	
}






}