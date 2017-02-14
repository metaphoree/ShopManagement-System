package WINDOWS;

import interface_1.Delete_row;
import interface_1.Search_by_id;
import interface_1.Stock_update;

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

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class ADMIN_WINDOW_6 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton nit_delete;
private JButton back_6;
private BufferedImage img;
private JLabel delete_6;
private JLabel show_name;
private JLabel show_stock;
private JLabel show_unit_price;
	private JLabel id_6;
private GridBagConstraints con6;
	public static Container container_6;
	private JLabel space_6;
	private JLabel space_7;
	private JLabel space_1;
	private JLabel space_2;
	private JLabel space_9;
	private JLabel space_13;
	private JLabel space_14;
	private JLabel space_10;
	private JLabel space_11;
	private JLabel space_12;
	//private String s2="text";
	
	
	private JTextField   t_delete_6;
//private static JPanel this1;
public ADMIN_WINDOW_6() throws IOException {
	super.setLayout(new GridBagLayout());



	img=ImageIO.read(new File("delete.jpg"));
	 delete_6=new JLabel("DELETE PRODUCT");
	 delete_6.setFont(new Font("h", Font.BOLD, 30));
	 
	 
	 	 delete_6.setOpaque(true);
	 delete_6.setBackground(Color.white);
delete_6.setForeground(Color.RED);
	 
	 id_6=new JLabel("PRODUCT ID:");
	 id_6=new JLabel(" PRODUCT ID: ");
	 id_6.setFont(new Font("h", Font.BOLD, 30));	 
	 id_6.setOpaque(true);
	 id_6.setBackground(Color.white);
id_6.setForeground(Color.GREEN);
	 
	 
	 
	 
	 
	 
	 
	 con6=new GridBagConstraints();
//this1=new JPanel(new GridBagLayout());
	 space_6=new JLabel(" ");
	 space_7=new JLabel(" ");
	 space_1=new JLabel(" ");
	 space_2=new JLabel(" ");
	 space_13=new JLabel(" ");
	 space_14=new JLabel(" ");
	 space_9=new JLabel(" ");
	 space_10=new JLabel(" ");
	 space_11=new JLabel(" ");
	 space_12=new JLabel(" ");
	 back_6=new  JButton("BACK");
	 back_6.setFont(new Font("d",Font.BOLD, 25));
	 
	 t_delete_6=new JTextField(15);	
t_delete_6.setFont(new Font("f", Font.BOLD, 25));
	    show_name=new JLabel("**");
	    show_name.setFont(new Font("h", Font.BOLD,20));
	  show_stock=new JLabel("**");
	  show_stock.setFont(new Font("h", Font.BOLD,20));
	    show_unit_price=new JLabel("*****");
	    show_unit_price.setFont(new Font("h", Font.BOLD,20));
	   nit_delete=new JButton("DELETE");
	   nit_delete.setFont(new Font("d",Font.BOLD, 25));
		GET_PANEL.addComponent1(this,delete_6 , 0,0, 1,1,con6);
		GET_PANEL.addComponent1(this,space_6,1,0,1,1, con6);
		GET_PANEL.addComponent1(this,space_7,2,0,1,1, con6);
		GET_PANEL.addComponent1(this, id_6,3,0,1,1, con6);
		GET_PANEL.addComponent1(this, t_delete_6,3,1,1,1, con6);
		GET_PANEL.addComponent1(this,space_9,4,0,1,1, con6);
		GET_PANEL.addComponent1(this,space_10,5,0,1,1, con6);	
		GET_PANEL.addComponent1(this,show_name,6,0,1,1, con6);
		GET_PANEL.addComponent1(this, show_stock,6,1,1,1, con6);
		GET_PANEL.addComponent1(this,space_11,6,2,1,1, con6);
		GET_PANEL.addComponent1(this, show_unit_price,6,3,1,1, con6);
		
		
		
		
		//con6.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this,space_1,7,0,1,1, con6);
		GET_PANEL.addComponent1(this,space_2,8,0,1,1, con6);
		
		GET_PANEL.addComponent1(this,space_13,9,0,1,1, con6);
		GET_PANEL.addComponent1(this,space_14,10,0,1,1, con6);
		
		GET_PANEL.addComponent1(this,back_6,11,0,1,1, con6);
		//con6.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this,nit_delete,11,1,1,1, con6);



back_6.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				ADMIN_WINDOW_3 op = null;
				try {
					op = new ADMIN_WINDOW_3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JPanel p1=	op.get_panel_3();
				container_6.add(p1);
				container_6.validate();	
		
			
			
			
			
			
			}
		}
	
		
		
		
		
		
		
		
		
		);


nit_delete.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(t_delete_6.getText().equals("")){
					JOptionPane.showMessageDialog(null, "ID REQUIRED");
					t_delete_6.setText("");
				
				}
				
				
				else if(!(Search_by_id.search_id(t_delete_6.getText()))){
					JOptionPane.showMessageDialog(null, "ID NOT FOUND");
					t_delete_6.setText("");
				}
				
				
				
				
				
				
				
			
				else{
					try {
				
				if(Delete_row.delete(t_delete_6.getText()))
				{
					JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY");
					t_delete_6.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "SOMETHING WRONG");}
				t_delete_6.setText("");
					}
			
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				
			}
		}
		
		
}
		
		
		);
				
			
t_delete_6.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
			if(t_delete_6.getText().equals("")){
				show_name.setText("        ********");
				show_stock.setText("        ********");
                show_unit_price.setText("       ********");			
			}
			else if(!(Search_by_id.search_id(t_delete_6.getText()))){
				show_name.setText("NOT FOUND");
				show_stock.setText("NOT FOUND");
                show_unit_price.setText("NOT FOUND");	
			}
			else {
				
				show_name.setText(" NAME: "+Search_by_id.search_product_name(Integer.parseInt(t_delete_6.getText())));
				show_stock.setText(" STOCK: "+Integer.toString(Stock_update.get_stock(Integer.parseInt(t_delete_6.getText()))));
                show_unit_price.setText(" UNIT PRICE: "+Double.toString(Search_by_id.search_unit_price(t_delete_6.getText())));
			
			
			}
			
			
			
			
			
			
			
			
			
				
			}
		}
		
		
		
		);		
		
		
		
		
			
		
		







			
			
		
		
		
		
		
		
			}


protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}









public  JPanel getpanel6(){
	
	return this;
	
}



}
