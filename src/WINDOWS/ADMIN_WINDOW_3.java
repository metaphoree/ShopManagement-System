package WINDOWS;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;

public class ADMIN_WINDOW_3 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton insert_3;
private JButton update_3;
private JButton delete_3;
public static Container container_3;
private JButton search_3;
private JButton salesman_info_3;
private JButton store_info_3;
private JButton change_password_3;
private JButton back_3;
private BufferedImage img;
private JLabel space_1;
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
private JLabel space_12;
private JLabel space_13;
private JLabel space_14;
private JLabel space_15;
private JLabel space_16;
private JLabel space_17;
private JLabel space_18;
private JLabel space_19;
private JLabel space_20;
private JLabel space_21;
private JLabel space_22;
private JLabel space_23;
private JLabel space_24;
private JLabel space_25;
private JLabel space_26;
private JLabel space_27;
private JLabel space_28;
private JLabel space_29;
private JLabel space_30;
private JLabel space_31;
private JLabel space_32;
private JLabel space_33;
private JLabel space_34;
private JLabel space_35;
private JLabel space_36;
private JLabel space_37;
private JLabel space_38;
private JLabel space_39;
private JLabel space_40;
private JLabel space_41;
private JLabel space_42;
private JLabel space_43;
private JLabel space_44;
private JLabel space_45;
private JLabel space_46;
//private JLabel space_37;




//private static JPanel this1;
//private Container c3;
private GridBagConstraints con3;

 ADMIN_WINDOW_3() throws IOException {
	 
	 setLayout(new GridBagLayout()); 
	// this1=this;
	 
	 

img=ImageIO.read(new File("adminpanel.jpg"));
	 
	 
	                con3=new GridBagConstraints();
	                 insert_3=  new JButton("NEW PRODUCT");
	               insert_3.setFont(new Font("fg", Font.BOLD,25));
	                 
	                 
	                 update_3=  new JButton("UPDATE");
	               
	                 update_3.setFont(new Font("fg", Font.BOLD,25));
	                 
	                 
	                 delete_3=   new JButton("OLD PRODUCT");
	                 delete_3.setFont(new Font("fg", Font.BOLD,25));
	                 
	                 search_3=    new JButton("SEARCH PRODUCT");
	            
	                 search_3.setFont(new Font("fg", Font.BOLD,25));	                 
	                 
	                 salesman_info_3=new JButton("SALES MAN INFO UPDATE");
	                 salesman_info_3.setFont(new Font("fg", Font.BOLD,25));
	                 
	                 store_info_3=new JButton("STOCK INFO");
	                 store_info_3.setFont(new Font("fg", Font.BOLD,25));
	                 
	                 change_password_3=new JButton("CHANGE PASSWORD");
	                 change_password_3.setFont(new Font("fg", Font.BOLD,25));  
	                 space_1=new  JLabel(" ");
	                   space_2=new  JLabel(" ");
	                      space_3=new  JLabel(" ");
	                       space_4=new  JLabel(" ");
                           space_5=new  JLabel(" ");
	                          space_6=new  JLabel(" ");
	                          space_8=new JLabel(" ");
	  //               this1=new  JPanel(new GridBagLayout());
	                    back_3=new JButton("LOG OUT");
	                    back_3.setFont(new Font("fg", Font.BOLD,25));
	               	 space_13=new JLabel(" ");
	  
	               	 space_9=new JLabel(" ");
	               	 space_10=new JLabel(" ");
	               	 space_11=new JLabel(" ");
	               	 space_12=new JLabel(" ");
	               	 
	               	 space_14=new JLabel(" ");
space_7=new JLabel("");
	            	 space_15=new JLabel(" ");
	            	 
	        
	            	 
	            	 space_16=new JLabel(" ");
	            	 space_17=new JLabel(" ");
	             space_18=new JLabel(" ");
	            	 space_19=new JLabel(" ");
	            	 space_20=new JLabel(" ");
	            	 space_21=new JLabel(" ");
	            	 space_22=new JLabel(" ");
	            	 space_23=new JLabel(" ");
	            	 space_24=new JLabel(" ");
	            	 space_25=new JLabel(" ");
	            	 space_26=new JLabel(" ");
	                    
	                    
	                    
	                    
	                    
	            	 space_27=new JLabel(" ");
	            	 space_28=new JLabel(" ");
	             space_29=new JLabel    ("          ");
	            	 space_30=new JLabel("          ");
	            	 space_31=new JLabel("          ");
	            	 space_32=new JLabel("          ");
	            	 space_33=new JLabel("          ");
	            	 space_34=new JLabel("          ");
	            	 space_35=new JLabel("          ");
	            	 space_36=new JLabel("          ");
	            	 space_37=new JLabel("          ");        
	            	 space_38=new JLabel(" ");
	            	 space_39=new JLabel(" ");
	             space_40=new JLabel(" ");
	            	 space_41=new JLabel(" ");
	            	 space_42=new JLabel(" ");
	            
	            	 space_43=new JLabel(" ");
	            	 space_44=new JLabel(" ");
	            	 space_45=new JLabel(" ");
	            	 space_46=new JLabel(" ");
	            	 space_26=new JLabel(" ");   
	                    
	                    
	                    
	            	 con3.fill=GridBagConstraints.BOTH;     
	                    
	                 con3.weightx=1;
	                 con3.weighty=1;
	                    
	                    
	                    
	                    
	                    
	                    //con3.weightx=1;
//con3.weighty=1;
	                 GET_PANEL.addComponent1(this,space_1 ,0,4,1,1, con3);
	                 GET_PANEL.addComponent1(this,space_1 ,0,0,1,1, con3);
	            	 GET_PANEL.addComponent1(this, space_14 ,1,1,1,1, con3);
	            	 GET_PANEL.addComponent1(this, space_2 ,0,1,1,1, con3);
	GET_PANEL.addComponent1(this,  insert_3,1,1,1,1, con3);
	GET_PANEL.addComponent1(this,update_3 , 1,4, 1,1,con3);
	GET_PANEL.addComponent1(this,delete_3 ,3,1,1,1, con3);
	GET_PANEL.addComponent1(this, search_3 ,3,4,1,1, con3);
	GET_PANEL.addComponent1(this, space_3 ,0,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_4 , 0,3,1,1,con3);
	
	
	
	GET_PANEL.addComponent1(this, space_38 , 0,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_39 , 1,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_40 , 2,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_41 , 3,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_42 , 4,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_43 , 5,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_44 , 6,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_45 , 7,3,1,1,con3);
	GET_PANEL.addComponent1(this, space_46 , 8,3,1,1,con3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	GET_PANEL.addComponent1(this,salesman_info_3 ,5,1,1,1, con3);
	GET_PANEL.addComponent1(this, store_info_3, 5,4,1,1,con3);
	GET_PANEL.addComponent1(this, space_5 ,0,4,1,1, con3);
	
	GET_PANEL.addComponent1(this, space_6 ,0,5,1,1, con3);
	GET_PANEL.addComponent1(this,back_3 ,7,1,1,1, con3);
	GET_PANEL.addComponent1(this,change_password_3 ,7,4,1,1, con3);
	GET_PANEL.addComponent1(this, space_7 ,0,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_8 ,0,5,1,1, con3);
	
	
	GET_PANEL.addComponent1(this, space_9 ,0,1,1,1, con3);
	GET_PANEL.addComponent1(this, space_10 ,2,1,1,1, con3);
	GET_PANEL.addComponent1(this, space_11 ,4,1,1,1, con3);
	GET_PANEL.addComponent1(this, space_12 ,6,1,1,1, con3);
	GET_PANEL.addComponent1(this, space_13 ,8,1,1,1, con3);
	
	
	
	
	
	
	GET_PANEL.addComponent1(this, space_15 ,0,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_16 ,1,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_17 ,2,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_18 ,3,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_19 ,4,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_20 ,5,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_21 ,6,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_22 ,7,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_23 ,8,2,1,1, con3);
	GET_PANEL.addComponent1(this, space_24 ,0,3,1,1, con3);
	GET_PANEL.addComponent1(this, space_25 ,2,3,1,1, con3);
	GET_PANEL.addComponent1(this, space_26 ,4,3,1,1, con3);
	
	
	
	
	GET_PANEL.addComponent1(this, space_27 ,6,3,1,1, con3);
	GET_PANEL.addComponent1(this, space_28 ,8,3,1,1, con3);
	GET_PANEL.addComponent1(this, space_29 ,0,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_30 ,1,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_31 ,2,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_32 ,3,5,1,1, con3);
	
	
	
	
	
	GET_PANEL.addComponent1(this, space_33 ,4,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_34 ,5,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_35 ,6,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_36 ,7,5,1,1, con3);
	GET_PANEL.addComponent1(this, space_37 ,8,5,1,1, con3);
	//GET_PANEL.addComponent1(panel_3, space_14 ,1,1,1,1, con3);
	
	
	
	
	
	
	
	
	
	
	
	insert_3.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ADMIN_WINDOW_4 wind4 = null;
				try {
					wind4 = new ADMIN_WINDOW_4();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOW_4.container_4=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind4.getPanel_4());
				container_3.validate();
			}
		}
		
);
 update_3.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				ADMIN_WINDOW_5 wind5 = null;
				try {
					wind5 = new ADMIN_WINDOW_5();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOW_5.container_5=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind5.get_panel5());
				container_3.validate();		
			}
		}
		 
		 
		 
		 
		 );
 
 
 
 
 delete_3.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ADMIN_WINDOW_6 wind5 = null;
				try {
					wind5 = new ADMIN_WINDOW_6();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOW_6.container_6=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind5.getpanel6());
				container_3.validate();		
				
			}
		}
		 
		 );
 search_3.addActionListener(
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ADMIN_WINDOW_7 wind5 = null;
				try {
					wind5 = new ADMIN_WINDOW_7();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOW_7.container_7=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind5.get_panel7());
				container_3.validate();		
					
				
			}
		}
		 
		 
		 
		 
		 
		 );
 
 salesman_info_3.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ADMIN_WINDOW_8 wind5 = null;
				try {
					wind5 = new ADMIN_WINDOW_8();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOW_8.container_8=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind5.get_panel8());
				container_3.validate();			
				
			}
		}
		 
		 
		 
		 
		 
		 
		 
		 );
 store_info_3.addActionListener(
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ADMIN_WINDOWS_9 wind5 = null;
				try {
					wind5 = new ADMIN_WINDOWS_9();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ADMIN_WINDOWS_9.my_c9=container_3;
				container_3.removeAll();
				container_3.setLayout(new BorderLayout());
	container_3.add(wind5.get_panel9());
				container_3.validate();	
				
			}
		}
		 
		 
		 
		 
		 
		 
		 );
 
 back_3.addActionListener(
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				WINDOW_2 op = null;
				try {
					op = new  WINDOW_2();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JPanel p1=op.get_panel_2();
			
//				container_2.removeAll();		
//			container_2.setLayout(new BorderLayout());
				container_3.add(p1);
				container_3.validate();
				
			}
		}
		 
		 
		 
		 
		 );
 
 change_password_3.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				WINDOW_FOR_PASSWORD_CHANGE po = null;
				try {
					po = new WINDOW_FOR_PASSWORD_CHANGE();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				JPanel p1=po.get_pc();
				WINDOW_FOR_PASSWORD_CHANGE.container_p_change=container_3;
				//container_3.removeAll();		
			//container_3.setLayout(new BorderLayout());
				container_3.add(p1);
				container_3.validate();
				
			}
		}
		 
		 
		 
		 
		 
		 
		 );
 
 
 
 }
 protected void paintComponent(Graphics g) {
		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}

public  JPanel get_panel_3(){
	
	return this;
	
}







}
