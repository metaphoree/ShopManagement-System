package WINDOWS;
//import interface_1.Product;

//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
//import java.awt.Toolkit;
//import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Icon;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.itextpdf.text.Image;

//import com.itextpdf.text.Image;

public class ENTRANCE extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton admin;
private JLabel space_1;
//private JLabel space_0;
private BufferedImage img;
private JLabel space_2;
private JLabel space_3;
private JLabel space_4;
private JLabel space_5;
private JLabel space_6;
//private JLabel space_7;
private java.awt.Image background;
private JLabel space_8;
private JLabel space_9;
private JLabel space_10;
private ImageIcon op;
private Container mainContainer;
private JLabel space_11;
private Icon Jic1;
private Icon Pic2;
private JLabel icon_1;
private JLabel icon_2;


private JLabel space_12;
private UIManager.LookAndFeelInfo[] look;
//private BorderLayout layout;
//private JFrame frame;
private JButton sales_man;
private String[] name;
private Container contain;
public static JPanel main_panel;
private GridBagConstraints constraints;	
public ENTRANCE() throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
	super("WELCOME TO DEPARTMENTAL STORE");
	//this.setIconImage(arg0);
	space_1=new JLabel(" ");
	// space_0=new JLabel(" ");
	 space_2=new JLabel(" ");
 space_3=new JLabel(" ");
	 space_4=new JLabel(" ");
	 space_5=new JLabel(" ");
	 space_6=new JLabel(" ");
	// space_7=new JLabel(" ");
//	 space_18=new JLabel(" ");
	 space_8=new JLabel(" ");
 space_9=new JLabel(" ");
 //space_10=new JLabel(" ");
 space_10=new JLabel(" ");
 space_11=new JLabel(" ");
 space_12=new JLabel(" ");
	
 Icon bug1 = new ImageIcon( "adminbutton.gif");
 Icon bug12 = new ImageIcon( "salesmanbutton.gif");
//  icon_1=new JLabel();
//  icon_2=new  JLabel(); 
//   Jic1=new ImageIcon(getClass().getResource("adminbutton.gif"));
//   Pic2=new ImageIcon(getClass().getResource( "adminbutton.gif"));
//  // =new ImageIcon( getClass().getResource( names[ 3])); 
// icon_1.setIcon(Jic1);
// icon_2.setIcon(Pic2);
 
 
 //op=new ImageIcon("opening.jpg");
 
 
 
 
 
 
 
//	img=ImageIO.read(new File("opening.jpg"));
	constraints=new GridBagConstraints();
	contain=this.getContentPane();
	//WINDOW_2.container_2=this.getContentPane();
	//layout=new BorderLayout();
//	setLayout(layout);
	admin=new JButton(" ADMIN",bug1);
	admin.setFont(new Font("hj", Font.BOLD,30));
	
	sales_man=new JButton("SALES MAN",bug12);
	sales_man.setFont(new Font("hj", Font.BOLD,30));
	
	// mainContainer = this.getContentPane(); 
	constraints.weightx=1;
	constraints.weighty=1;
	constraints.fill=GridBagConstraints.BOTH;
	main_panel=new JPanel(new GridBagLayout());

//	 background = Toolkit.getDefaultToolkit()Graphics gGraphics g.createImage("pic3.jpg");
//	 main_panel.drawImage(background, 0, 0, null);
	
//	GET_PANEL.addComponent1(main_panel,icon_1,0,1,1,1,constraints);
//	GET_PANEL.addComponent1(main_panel,icon_2,0,2,1,1,constraints);
	
	GET_PANEL.addComponent1(main_panel,admin,1,1,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,sales_man,3,1,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_1,0,0,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_2,1,0,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_3,2,0,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_4,3,1,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_5,4,0,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_6,0,1,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_8,1,2,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_9,2,2,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_10,3,2,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_11,4,1,1,1,constraints);
	GET_PANEL.addComponent1(main_panel,space_12,4,2,1,1,constraints);
//	  BufferedImage myPicture = ImageIO.read(new File("image.jpg"));
//      JLabel picLabel = new JLabel(new ImageIcon( myPicture ));
   // java.awt.Image background = Toolkit.getDefaultToolkit().createImage("imafe.jpg");
//    ((Object) main_panel).drawImage(background, 0, 0, null);  
	
//	main_panel.add(new JLabel(op));
    
    
    //URL nm=getClass().getResource("imafe.jpg");
  //  Window.getOwnerlessWindows();
//	main_panel.
	
	
	
	

//	main_panel.set
	
	
	main_panel.setBackground(Color.white);
	
	
	
	
	
	
	addPanel(main_panel);
	//contain.add(new JLabel(new ImageIcon("opening.jpg")));

admin.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			WINDOW_2 JK = null;
			try {
				JK = new WINDOW_2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			//addPanel(JK.get_panel_2());	
		
			contain.removeAll();
			contain.add(JK.get_panel_2());
			contain.validate();
			WINDOW_2.container_2=contain;
			
			}
		}
		
		
		);
sales_man.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			SALES_MAN_WINDOW kl = null;
			try {
				kl = new SALES_MAN_WINDOW();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contain.removeAll();
			contain.add(kl.get_panel_sales());
			contain.validate();
			SALES_MAN_WINDOW.container_sales=contain;	
				
			}
		}
		
		
		
		
		);












change();
}



	
	public static JPanel get_Main_panel(){
		
		return main_panel;
	}
	
	
	
	protected void paintComponent(Graphics g) {
		
	    paintComponent(g);
	    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
	
	
	
	
	



//	  private void addComponent(JPanel panel, Component component,
//			  int row,int column, int width,int height )
//			  {
//			     constraints.gridx = column; // set gridx
//			 constraints.gridy = row; // set gridy
//			 constraints.gridwidth = width; // set gridwidth
//			 constraints.gridheight = height; // set gridheight
//			// layout.setConstraints( component, constraints ); // set constraints
//			 panel.add(component, constraints);
//			 
//			 
//			 //add( component ); // add component
//
//			 }
	  public void change() throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		  look=UIManager.getInstalledLookAndFeels();
		  name=new String[look.length];
		  for(int u=0;u<look.length;u++){
		      name[u]=look[u].getName();}
		  for(int h=0;h<look.length;h++){
		      if(name[h]=="Nimbus"){
		          try
		          {
		          UIManager.setLookAndFeel(look[h].getClassName());
		          SwingUtilities.updateComponentTreeUI(ENTRANCE.this);
		          }
		          catch(ClassNotFoundException k){
		              
		              
		          }
		      }
		  }}	  


public void addPanel(JPanel p1){
	add(p1,BorderLayout.CENTER);	
}








}