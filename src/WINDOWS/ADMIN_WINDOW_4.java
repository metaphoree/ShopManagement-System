package WINDOWS;

import interface_1.Insert_new_product;
import interface_1.Search_by_id;
import interface_1.Search_by_name;

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
import javax.swing.JTextField;

//import com.itextpdf.text.Image;

public class ADMIN_WINDOW_4 extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel insert_4;
private JLabel id_4;
private JLabel name_4;
private JLabel unit_4;
private JLabel unit_price_4;
private JLabel space_1;
public static Container container_4;
private BufferedImage img;
private JLabel space_0;
private JLabel space_2;
private JLabel space_3;
//private JLabel space_4;
private JLabel space_5;
private JLabel space_6;
private JLabel space_7;
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
private JLabel space_47;
private JLabel space_48;
private JLabel space_49;
private JLabel space_50;



//private JLabel space_;
private JLabel space_71;
private JLabel space_72;
private JLabel space_51;
private JLabel space_52;
private JLabel space_53;
private JLabel space_54;
private JLabel space_55;
private JLabel space_56;
private JLabel space_57;
private JLabel space_58;
private JLabel space_59;
private JLabel space_60;
private JLabel space_61;
private JLabel space_62;
private JLabel space_63;
private JLabel space_64;
private JLabel space_65;
private JLabel space_66;
private JLabel space_67;
private JLabel space_68;
private JLabel space_69;
private JLabel space_70;
private JLabel req_1;
private JLabel req_2;
















private JTextField  unit_price_t_4;
private JTextField id_t_4;
private JTextField name_t_4;
private JTextField unit_t_4;
private JButton insert_b_4;
private JButton back_b_4;
	//private static JPanel panel_4;
	//private static Container c4;
	private GridBagConstraints con4;
public ADMIN_WINDOW_4() throws IOException {

	
	//super.paintComponent(g);
	
	super.setLayout(new GridBagLayout());
	
	
	req_1=new JLabel("required");
	 req_2=new JLabel("required");
	// req_1.setOpaque(true);
	req_1.setForeground(Color.RED);
	req_2.setForeground(Color.RED);
	req_1.setFont(new Font("gh",Font.BOLD,15));
	req_2.setFont(new Font("gh",Font.BOLD,15));
	
	
	
	
	
	space_30=new JLabel(" ");
	 space_31=new JLabel(" ");
	 space_32=new JLabel(" ");
	 space_33=new JLabel(" ");
	 space_34=new JLabel(" ");
	 space_35=new JLabel(" ");
	 space_36=new JLabel(" ");
	 space_37=new JLabel(" ");
	 space_38=new JLabel(" ");
	 space_39=new JLabel(" ");
 space_40=new JLabel(" ");
	 space_41=new JLabel(" ");
	 space_42=new JLabel(" ");

	 space_43=new JLabel(" ");
	 space_44=new JLabel(" ");
	 space_45=new JLabel(" ");
	 space_46=new JLabel(" ");

	 space_47=new JLabel(" ");
	 space_48=new JLabel(" ");
	 space_49=new JLabel(" ");
	 space_50=new JLabel(" ");
	
	
	 
	 space_30=new JLabel(" ");
	 space_51=new JLabel(" ");
	 space_52=new JLabel(" ");
	 space_53=new JLabel(" ");
	 space_54=new JLabel(" ");
	 space_55=new JLabel(" ");
	 space_56=new JLabel(" ");
	 space_57=new JLabel(" ");
	 space_58=new JLabel(" ");
	 space_59=new JLabel(" ");
 space_60=new JLabel(" ");
	 space_61=new JLabel(" ");
	 space_62=new JLabel(" ");

	 space_63=new JLabel(" ");
	 space_64=new JLabel(" ");
	 space_65=new JLabel(" ");
	 space_66=new JLabel(" ");

	 space_67=new JLabel(" ");
	 space_68=new JLabel(" ");
	 space_69=new JLabel(" ");
	 space_70=new JLabel(" ");
	 space_71=new JLabel(" ");
	 space_72=new JLabel(" ");
	 
	 
	img=ImageIO.read(new File("Fairtrade_supermarket_trolley.jpg"));
//	 img=new Image(); 
//	 setImageMask(img);
	 
	 
	 
	 
	 
	 
	 
	 insert_4=new JLabel("");
	 insert_4.setFont(new Font("sherif",Font.HANGING_BASELINE, 30));
	 insert_4.setForeground(Color.GREEN);
//	 insert_4.setOpaque(true);
//	 insert_4.setBackground(Color.WHITE);
 id_4=new JLabel       ("         PRODUCT ID");
id_4.setFont(new Font("sherif",Font.BOLD, 26));
	 name_4=new JLabel ("    PRODUCT NAME");
	 
	 name_4.setFont(new Font("sherif",Font.BOLD, 26));
	 name_4.setForeground(Color.RED);
	 
	 
 unit_4=new  JLabel     ("       PRODUCT UNIT");
 unit_4.setFont(new Font("sherif",Font.BOLD, 26));
 unit_4.setForeground(Color.RED);
 
 
 
 
 unit_price_4=new JLabel("           UNIT PRICE");
 unit_price_4.setFont(new Font("sherif",Font.BOLD, 26));
 unit_price_4.setForeground(Color.RED);
 
 
 
 
 
	 space_1=new JLabel(" ");
	 space_0=new  JLabel(" ");
	 space_2=new  JLabel(" ");
	 space_3=new  JLabel(" ");
	// space_4=new  JLabel(" ");
 space_5=new  JLabel(" ");
 space_6=new  JLabel(" ");
 space_7=new  JLabel(" ");
 
  back_b_4=new JButton("BACK"); 
 back_b_4.setFont(new Font("h", Font.BOLD,25));
 unit_price_t_4=new JTextField(15);
 unit_price_t_4.setFont(new Font("sherif",Font.BOLD, 25));
	 id_t_4=new JTextField(15);
	 id_t_4.setFont(new Font("sherif",Font.BOLD, 25));
	 name_t_4=new JTextField(15);
	 name_t_4.setFont(new Font("sherif",Font.BOLD, 25));
	 
	 
	 unit_t_4=new  JTextField(15);
	 unit_t_4.setFont(new Font("sherif",Font.BOLD, 25));
	 
	 
	 
	 insert_b_4=new JButton("INSERT");
	 insert_b_4.setFont(new Font("h", Font.BOLD,25));
	 //panel_4=new JPanel(new GridBagLayout());
con4=new GridBagConstraints();
con4.weightx=0.000000000000000000000000000000000000000001;
con4.weighty=0.00000001;

con4.fill=GridBagConstraints.BOTH;
GET_PANEL.addComponent1(this,  insert_4,0,1,2,1, con4);
GET_PANEL.addComponent1(this,space_1 , 1,0, 1,1,con4);
GET_PANEL.addComponent1(this,id_4 ,3,1,1,1, con4);
GET_PANEL.addComponent1(this, id_t_4 ,3,2,1,1, con4);
GET_PANEL.addComponent1(this, req_1,3,3,1,1, con4);
GET_PANEL.addComponent1(this,space_2,4,0,1,1, con4);
GET_PANEL.addComponent1(this, name_4 ,5,1,1,1, con4);
GET_PANEL.addComponent1(this, name_t_4 ,5,2,1,1, con4);
GET_PANEL.addComponent1(this, req_2,5,3,1,1, con4);
GET_PANEL.addComponent1(this, space_3 , 6,0,1,1,con4);
GET_PANEL.addComponent1(this,unit_4 ,7,1,1,1, con4);
GET_PANEL.addComponent1(this, unit_t_4, 7,2,1,1,con4);
GET_PANEL.addComponent1(this, space_5 ,8,0,1,1, con4);
//GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
GET_PANEL.addComponent1(this,unit_price_4 ,9,1,1,1, con4);
GET_PANEL.addComponent1(this,unit_price_t_4 ,9,2,1,1, con4);
GET_PANEL.addComponent1(this, space_0 ,10,0,1,1, con4);
GET_PANEL.addComponent1(this, space_6 ,11,0,1,1, con4);
GET_PANEL.addComponent1(this, space_7 ,12,0,1,1, con4);
con4.fill=GridBagConstraints.NONE;
GET_PANEL.addComponent1(this,back_b_4, 13,0,1,1,con4);
GET_PANEL.addComponent1(this,insert_b_4, 13,3,1,1,con4);


con4.fill=GridBagConstraints.BOTH;
GET_PANEL.addComponent1(this, space_30 ,0,0,1,1, con4);
GET_PANEL.addComponent1(this, space_31 ,1,0,1,1, con4);
GET_PANEL.addComponent1(this, space_32 ,2,0,1,1, con4);
GET_PANEL.addComponent1(this, space_33 ,3,0,1,1, con4);
GET_PANEL.addComponent1(this, space_34 ,4,0,1,1, con4);
GET_PANEL.addComponent1(this, space_35 ,5,0,1,1, con4);

GET_PANEL.addComponent1(this, space_36,6,0,1,1, con4);
GET_PANEL.addComponent1(this, space_37,7,0,1,1, con4);
GET_PANEL.addComponent1(this, space_38,8,0,1,1, con4);
GET_PANEL.addComponent1(this, space_39,9,0,1,1, con4);
GET_PANEL.addComponent1(this, space_40,10,0,1,1, con4);
GET_PANEL.addComponent1(this, space_41,11,0,1,1, con4);



GET_PANEL.addComponent1(this, space_42 ,12,0,1,1, con4);
GET_PANEL.addComponent1(this, space_43,13,1,1,1, con4);
GET_PANEL.addComponent1(this, space_44,13,2,1,1, con4);
GET_PANEL.addComponent1(this, space_45,13,4,1,1, con4);
GET_PANEL.addComponent1(this, space_46,0,3,1,1, con4);
GET_PANEL.addComponent1(this, space_47,1,3,1,1, con4);

GET_PANEL.addComponent1(this, space_48 ,2,3,1,1, con4);
GET_PANEL.addComponent1(this, space_49,3,3,1,1, con4);
GET_PANEL.addComponent1(this, space_50,4,3,1,1, con4);

GET_PANEL.addComponent1(this, space_51 ,5,3,1,1, con4);
GET_PANEL.addComponent1(this, space_52,6,3,1,1, con4);
GET_PANEL.addComponent1(this, space_53,7,3,1,1, con4);
GET_PANEL.addComponent1(this, space_54 ,8,3,1,1, con4);
GET_PANEL.addComponent1(this, space_55,9,3,1,1, con4);
GET_PANEL.addComponent1(this, space_56,10,3,1,1, con4);
GET_PANEL.addComponent1(this, space_57 ,11,3,1,1, con4);
GET_PANEL.addComponent1(this, space_58,12,3,1,1, con4);
GET_PANEL.addComponent1(this, space_59,0,4,1,1, con4);
GET_PANEL.addComponent1(this, space_60 ,1,4,1,1, con4);
GET_PANEL.addComponent1(this, space_61,2,4,1,1, con4);
GET_PANEL.addComponent1(this, space_62,3,4,1,1, con4);

GET_PANEL.addComponent1(this, space_63,4,4,1,1, con4);
GET_PANEL.addComponent1(this, space_64 ,5,4,1,1, con4);
GET_PANEL.addComponent1(this, space_65,6,4,1,1, con4);
GET_PANEL.addComponent1(this, space_66,7,4,1,1, con4);
GET_PANEL.addComponent1(this, space_67,8,4,1,1, con4);
GET_PANEL.addComponent1(this, space_68 ,8,4,1,1, con4);
GET_PANEL.addComponent1(this, space_69,9,4,1,1, con4);
GET_PANEL.addComponent1(this, space_70,10,3,1,1, con4);
GET_PANEL.addComponent1(this, space_71,11,4,1,1, con4);
GET_PANEL.addComponent1(this, space_72,12,3,1,1, con4);





this.getBorder();






//GET_PANEL.addComponent1(panel_4, space_45,10,0,1,1, con4);
//GET_PANEL.addComponent1(panel_4, space_46,11,0,1,1, con4);
//GET_PANEL.addComponent1(panel_4, space_47,12,0,1,1, con4);







































back_b_4.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ADMIN_WINDOW_5.container_5=container_4;
				setVisible(false);
				ADMIN_WINDOW_3 op = null;
				try {
					op = new ADMIN_WINDOW_3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JPanel p1=	op.get_panel_3();
				container_4.add(p1);
				container_4.validate();	}
		}
		);
		
insert_b_4.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				
				
		
						
			if(id_t_4.getText().equals("") && name_t_4.getText().equals("")){
					 
					 JOptionPane.showMessageDialog(null," ID AND NAME REQUIRED ");
					
					 id_t_4.setText("");
						name_t_4.setText("");
						unit_price_t_4.setText("");
						unit_t_4.setText("");
			
			
			}	
					
				
				
				
				
				
				else	 if(id_t_4.getText().equals("") ){
					JOptionPane.showMessageDialog(null,"ID IS REQUIRED ");
					id_t_4.setText("");
					name_t_4.setText("");
					unit_price_t_4.setText("");
					unit_t_4.setText("");				
								}		
			
				
				else if( name_t_4.getText().equals("")){
		JOptionPane.showMessageDialog(null,"NAME IS REQUIRED ");
	
		id_t_4.setText("");
		name_t_4.setText("");
		unit_price_t_4.setText("");
		unit_t_4.setText("");
	
	
	}
				 
				 
				 
				 
				 
				 
				 
				
			else if((Search_by_id.search_id(id_t_4.getText()))&& (Search_by_name.search_name(name_t_4.getText()))){
					JOptionPane.showMessageDialog(null," ID AND NAME ALREADY EXIST");
				
					id_t_4.setText("");
					name_t_4.setText("");
					unit_price_t_4.setText("");
					unit_t_4.setText("");
			
			
			}	
				
				
				
				
				
				else if((Search_by_id.search_id(id_t_4.getText()))){
					JOptionPane.showMessageDialog(null," ID ALREADY EXIST");
					id_t_4.setText("");
					name_t_4.setText("");
					unit_price_t_4.setText("");
					unit_t_4.setText("");
				
				
				}
				 
				 else if((Search_by_name.search_name(name_t_4.getText()))){
						JOptionPane.showMessageDialog(null," NAME ALREADY EXIST");
					
						id_t_4.setText("");
						name_t_4.setText("");
						unit_price_t_4.setText("");
						unit_t_4.setText("");
				 }
			
				 else	if(!(Search_by_id.search_id(id_t_4.getText()))){
						try {
						if(Insert_new_product.insert(id_t_4.getText(), name_t_4.getText(),Double.toString(0.0),Integer.toString(0)))
						{
							JOptionPane.showMessageDialog(null,"SUCCESSFULLY INSERTED");
						
						id_t_4.setText("");
						name_t_4.setText("");
						unit_price_t_4.setText("");
						unit_t_4.setText("");
						}
						else{
							JOptionPane.showMessageDialog(null,"SOMETHING WRONG");
							id_t_4.setText("");
							name_t_4.setText("");
							unit_price_t_4.setText("");
							unit_t_4.setText("");
						
						
						}
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
						}
						
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				 
				 
				 
				else	if(!(Search_by_id.search_id(id_t_4.getText()))){
				try {
				if(Insert_new_product.insert(id_t_4.getText(), name_t_4.getText(),unit_price_t_4.getText(),unit_t_4.getText()))
				{
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY INSERTED");
				
				id_t_4.setText("");
				name_t_4.setText("");
				unit_price_t_4.setText("");
				unit_t_4.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null,"SOMETHING WRONG");
					id_t_4.setText("");
					name_t_4.setText("");
					unit_price_t_4.setText("");
					unit_t_4.setText("");
				
				
				}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				}
				
			
			
			
			
			
			
			
			
			
			}
		}
		
		
		);		
		









}




protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}
















public  JPanel getPanel_4(){
	
	return this;
	
	
}





}
