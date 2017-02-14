package interface_1;




import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
// java.awt.Dimension;
//import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

//import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
public class Product extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UIManager.LookAndFeelInfo[] look;
private String[] name;
//private final JPanel panel =new JPanel();
        private JTextField pro_id_first;
       // private Document pr1;
private JButton ok_stock;
private JLabel price_update;
private JLabel pro__update;
private JTextField t_update;
private JLabel new_price;
private JTextField t_new_price;
private JButton ok_for_update;
private JLabel id;
private JLabel quantity;
private JTextField pro_id1;
private JTextField pro_id2;
private JTextField pro_id3;
private JTextField unit1;
private JTextField unit2;
private JTextField unit3;
private JButton ok_unit;
private JButton generate_slip;
//private Font font;
private JLabel pdf;
int q=0;
boolean m=false,m1=false,m2=false;
int id1=0;
int q1=0;
int id2=0;
int q2=0;
int id3=0;
int q3=0;
double cost1=0;
double cost2=0;
double cost3=0;
int q_given1=0,q_given2=0,q_given3=0;
String to_display1=null;
String to_display2=null;
String to_display3=null;
String ids1=null;
String ids2=null;
String ids3=null;
String qs1=null;
String qs2=null;
String qs3=null;

//new 
private JLabel stock_update;
private JLabel pro_id_stock_update;
private JLabel update_stock_jl;
private JTextField pro_id_stock_update_jt;
private JTextField update_stock1;
private JButton update_stock2;
private JLabel new_product_id;
private JTextField new_product_field; 
//new1
private JLabel stock_delete;
private JLabel pro_id_stock_delete;
private JTextField pro_id_stock_delete1;
private JButton delete_stock;
//new2
private JLabel stock_insert;
private JLabel pro_id_stock_insert;
private JLabel new_stock_unit_price;
private JLabel new_stock;
private JTextField pro_id_stock_insert_jt;
private JTextField new_stock_unit_price_jt;
private JButton new_stock_bt;
private JTextField   insert_new_stock ;
private GridBagLayout layout;// layout of this frame
private GridBagConstraints constraints; 
private JLabel j_name;
private JLabel j_name2;
private JLabel j_name3;
private JLabel j_stock1;
private JLabel j_stock2;
private JLabel j_stock3;
private JLabel j_unit_price1;
private JLabel j_unit_price2;
private JLabel j_unit_price3;
private JLabel j_total_1;
private JLabel j_total_2;
private JLabel j_total_3;
private JLabel label_name;
private JLabel label_stock;
private JLabel label_unit_price;
private JLabel label_total;
private JButton get_stock_news;




























Product() throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
          {
 super( "GridBagLayout");
layout = new GridBagLayout();
q=0;
final String sd=Integer.toString(q);
setLayout( layout ); 

constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.BOTH;
constraints.weightx = 1;
constraints.weighty = 1;



constraints.fill = GridBagConstraints.NONE;
pro_id_first=new JTextField(10);
addComponent(pro_id_first,0,0, 1,1);
pro_id1=new JTextField(sd,10);
pro_id2=new JTextField(sd,10);
pro_id3=new JTextField(sd,10);
addComponent(pro_id1,1,2,1,1);
addComponent(pro_id2,2,2,1,1);
addComponent(pro_id3,3,2,1,1);
unit1=new JTextField(sd,10);
addComponent(unit1,1,6,1,1);
unit2=new JTextField(sd,10);
addComponent(unit2,2,6,1,1);
unit3=new JTextField(sd,10);
addComponent(unit3,3,6,1,1);

pdf=new  JLabel("PDF FORMAT");
addComponent(pdf,7,6,1,1);
t_update=new JTextField(10);
addComponent(t_update,2,1,1,1);

t_new_price=new JTextField(10);
addComponent(t_new_price, 3,1,1,1);




ok_unit=new JButton("BUY PRODUCT");
ok_unit.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				 ids1=pro_id1.getText();
				 ids2=pro_id2.getText();
				 ids3=pro_id3.getText();
			 qs1=unit1.getText();
			 qs2=unit2.getText();
		     qs3=unit3.getText();
			
	//		String s12=null;
            q_given1=Integer.parseInt(qs1);
			q_given2=Integer.parseInt(qs2);
			q_given3=Integer.parseInt(qs3);
			System.out.println(q_given1+" "+q_given2+""+q_given3);
				cost1=q_given1*	Search_by_id.search_unit_price(ids1);
			cost2=q_given2*	Search_by_id.search_unit_price(ids2);
			cost3=q_given3*	Search_by_id.search_unit_price(ids3);
			///111		
			if(q_given1 != 0 && q_given2 == 0 && q_given3!=0)
			{
				if(q_given1 != 0){
					if(Update_by_id.get_stock(id1)!=0){
					id1 = Integer.parseInt(ids1);
					q1= Update_by_id.get_stock(id1)-q_given1;
					
					to_display1="\n"+Search_by_id.search_product_name(id1)+"\n"+"QUANTITY:"+qs1+"\n"+"COST:"+Double.toString(cost1)+"\n";}           
					System.out.println(to_display1);
				}else{
					to_display1="SORRY PRODUCT_ID 1 IS NOT IN THE STOCK";
					
				}
					if(q_given3 !=0){
						System.out.println(q_given1+" "+q_given2+""+q_given3);
					id3 = Integer.parseInt(ids3);
					q3 = Update_by_id.get_stock(id3)-q_given3;
					to_display3="\n"+Search_by_id.search_product_name(id3)+"\n"+"QUANTITY:"+qs3+"\n"+"COST:"+Double.toString(cost3)+"\n"; 
			System.out.println(to_display3);
					}		
				}
			
			else if(q_given1 == 0 && q_given3 == 0 && q_given2==0){
				
			
				JOptionPane.showMessageDialog(null,"NOTHING BOUGHT");
				pro_id1.setText(sd);
				pro_id2.setText(sd);
				pro_id3.setText(sd);
			
			
			}
			
			else {	
			if(q_given1 != 0){
					id1 = Integer.parseInt(ids1);
					q1= Update_by_id.get_stock(id1)-q_given1;
					to_display1="\n"+Search_by_id.search_product_name(id1)+"\n"+"QUANTITY:"+qs1+"\n"+"COST:"+Double.toString(cost1)+"\n";           
					
					if(q_given2 !=0){
						id2 = Integer.parseInt(ids2);
						q2 = Update_by_id.get_stock(id2)-q_given2;
						to_display2="\n"+Search_by_id.search_product_name(id2)+"\n"+"QUANTITY:"+qs2+"\n"+"COST:"+Double.toString(cost2)+"\n"; 
					if(q_given3 !=0){
						id3 = Integer.parseInt(ids3);
						q3 = Update_by_id.get_stock(id3)-q_given3;
						to_display3="\n"+Search_by_id.search_product_name(id3)+"\n"+"QUANTITY:"+qs3+"\n"+"COST:"+Double.toString(cost3)+"\n"; 
				}
					else{
						
				to_display3="\n"  +" "+"\n" ;		
						}
				}
					else{
						
						to_display2="\n"  +" "+"\n" ;		
								}
				}
				else{
					
					to_display1="\n"  +" "+"\n" ;		
							}
				/////2222
		
				
				
				if(q_given1 == 0){
					if(q_given2 !=0){
						id2 = Integer.parseInt(ids2);
						q2 = Update_by_id.get_stock(id2)-q_given2;
						to_display2="\n"+Search_by_id.search_product_name(id2)+"\n"+"QUANTITY:"+qs2+"\n"+"COST:"+Double.toString(cost2)+"\n"; 
					if(q_given3 !=0){
						id3 = Integer.parseInt(ids3);
						q3 = Update_by_id.get_stock(id3)-q_given3;
						to_display3="\n"+Search_by_id.search_product_name(id3)+"\n"+"QUANTITY:"+qs3+"\n"+"COST:"+Double.toString(cost3)+"\n"; 
				}
					else{
						
				to_display3="\n"  +" "+"\n" ;		
						}
				}
					else{
						
						to_display2="\n"  +" "+"\n" ;		
								}}
			
			
				////33333
				
				if(q_given1 == 0){
					if(q_given2 == 0){
						if(q_given3 !=0){
							id3 = Integer.parseInt(ids3);
							q3 = Update_by_id.get_stock(id3)-q_given3;
							to_display3="\n"+Search_by_id.search_product_name(id3)+"\n"+"QUANTITY:"+qs3+"\n"+"COST:"+Double.toString(cost3)+"\n"; 
					}
						else{
							
					to_display3="\n"  +" "+"\n" ;		
							}
					}}
	

			
			
			
			
			try {
			 m=Update_by_id.stock_update(id1,q1);
				System.out.println(q_given1+" "+q_given2+""+q_given3);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
             }

			try {
			// m=Update_by_id.stock_update(id1,q1);
				System.out.println(q_given1+" "+q_given2+""+q_given3);
			 m1=Update_by_id.stock_update(id2,q2);
			 //m2=Update_by_id.stock_update(id3,q3); 
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
             }

			try {
			 //m=Update_by_id.stock_update(id1,q1);
			 //m1=Update_by_id.stock_update(id2,q2);
				System.out.println(q_given1+" "+q_given2+""+q_given3);
				m2=Update_by_id.stock_update(id3,q3); 
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
             }
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			System.out.println(q_given1+" "+q_given2+""+q_given3);
			
			
			
			
			
			
			 if(m1 && m && m2){
				JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display1+to_display2+to_display3+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
			}
			 
			 
			 else if(m1==true && m==false && m2==false){
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display2+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			 else if(m1==false && m2==true && m==false ){
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display3+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			 else if(m==true && m2==false && m1==false){
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display1+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			  
			 else if(m1 && m){
					JOptionPane.showMessageDialog
					(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display1+to_display2+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			 else if(m1 && m2){
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display2+to_display3+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			 else if(m && m2){
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY BOUGHT"+"\n"+to_display1+to_display3+"\n"+"TOTAL:"+Double.toString(cost1+cost2+cost3));
				}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			else{
				JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK");	
			}
//unit1.setText(sd);
//unit2.setText(sd);
//unit3.setText(sd);
//pro_id1.setText(sd);
//pro_id2.setText(sd);
//pro_id3.setText(sd);

			}
			
			
			}

				
		
		
		
		}
		);
addComponent(ok_unit,5,6,1,1);
ok_for_update=new JButton("UPDATE PRICE");
ok_for_update.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		String s1=t_update.getText();
		int io=Integer.parseInt(s1);
				String s2=t_new_price.getText();
				
				try {
					boolean v=Update_by_id.update(io,s2);
					if(v){
						JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
					
					
					t_update.setText("");
					t_new_price.setText("");
					
					}
						else{
						JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK");
						t_update.setText("");
						t_new_price.setText("");	
						}
		} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				AudioClip clip=new AudioClip();
//
//				URL url = getClass().getResource("1.wav");
//				clip =  Applet.newAudioClip(url);
//				clip.play();
			
}
		}
		);
addComponent(ok_for_update,4,0,2,1);
price_update=new JLabel("PRICE UPDATE");
price_update.setOpaque(true);
price_update.setForeground(Color.RED);
addComponent(price_update,1,0,2,1);
id=new JLabel("PRODUCT ID");
id.setOpaque(true);
id.setForeground(Color.red);
addComponent(id,0,2,1,1);
quantity=new JLabel("QUANTITY");
price_update.setOpaque(true);
price_update.setForeground(Color.RED);
addComponent(quantity,0,6,1,1);
ok_stock=new JButton("GET THE STOCK");
addComponent(ok_stock,0, 1, 1,1);
ok_stock.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=pro_id_first.getText();
				int id=Integer.parseInt(s1);
				String s7=Search_by_id.search(id);
				if(s7!=null){
				JOptionPane.showMessageDialog(null,s7);
				pro_id_first.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK ");	
					pro_id_first.setText("");
				
				}
			}
		}
		);
pro__update=new JLabel("PRODUCT ID:");
price_update.setOpaque(true);
price_update.setForeground(Color.RED);
addComponent(pro__update, 2,0,1,1);
new_price=new JLabel("NEW PRICE");

addComponent(new_price,3,0,1,1);
stock_update=new JLabel("STOCK UPDATE");
addComponent(stock_update, 5,0,2,1);
  pro_id_stock_update=new JLabel("PRODUCT ID");
  update_stock_jl=new JLabel("NEW STOCK");
  pro_id_stock_update_jt=new JTextField(10);
  update_stock1=new JTextField(10);
 update_stock2=new JButton("UPDATE STOCK");
 update_stock2.addActionListener(
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s2= pro_id_stock_update_jt.getText();
		        String s1=update_stock1.getText();
				boolean v=false;
			int id=Integer.parseInt(s2);
			int stock=Integer.parseInt(s1);
			try {
				v=Stock_update.stock_update(id, stock);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			if(v){
				JOptionPane.showMessageDialog(null,"STOCK SUCCESSFULLY UPDATED");
				pro_id_stock_update_jt.setText("");
				update_stock1.setText("");
			}
			
			else{
				JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK");
				pro_id_stock_update_jt.setText("");
				update_stock1.setText("");
			}
			}
		}
		 );
		 
	addComponent(pro_id_stock_update, 6,0,1,1);
 addComponent(update_stock_jl, 7,0,1,1);
 addComponent(pro_id_stock_update_jt, 6,1,1,1);
 addComponent(update_stock1, 7,1,1,1);
 addComponent(update_stock2, 8,0,2,1);
  stock_delete=new JLabel("DELETE PRODUCT");
  pro_id_stock_delete=new JLabel("PRODUCT ID");
  pro_id_stock_delete1=new JTextField(10);
  delete_stock=new JButton("DELETE");
 addComponent(stock_delete, 9,0,2,1);
 addComponent(pro_id_stock_delete,10,0,1,1);
 addComponent(pro_id_stock_delete1, 10,1,1,1);
 addComponent(delete_stock,11,0,2,1);
 delete_stock.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean v=false;
				String s1=pro_id_stock_delete1.getText();
				//Delete_row jk=new Delete_row();
				try {
					v=Delete_row.delete(s1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(v){
					
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY DELETED");
					pro_id_stock_delete1.setText("");
				
				}
				else{
					JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK");
					pro_id_stock_delete1.setText("");	
					
				}
			
			}
		}
		 
		 
		 
		 
		 );

//insert

  stock_insert=new JLabel("INSERT PRODUCT");
  pro_id_stock_insert=new JLabel("PRODUCT NAME");
  new_stock_unit_price=new JLabel("UNIT PRICE");
  new_stock=new JLabel("NEW STOCK");
  pro_id_stock_insert_jt=new JTextField(10);
  new_stock_unit_price_jt=new JTextField(10);
  insert_new_stock =new JTextField(10);
  new_stock_bt=new JButton("INSERT");
   new_product_id=new JLabel("PRODUCT ID");
  new_product_field=new JTextField(10);
 addComponent( stock_insert,5,2,2,1);
 addComponent(pro_id_stock_insert, 6,2,1,1);
 addComponent(new_stock_unit_price, 7,2,1,1);
 addComponent(new_stock, 8,2,1,1);
 addComponent(pro_id_stock_insert_jt,6,3,1,1);
 addComponent(new_stock_unit_price_jt, 7,3,1,1);
 addComponent(insert_new_stock, 8,3,1,1);
 addComponent(new_product_id, 9,2,1,1 );
 addComponent(new_product_field,9,3,1,1 );
 addComponent(new_stock_bt, 10,2,2,1);
 constraints.fill = GridBagConstraints.BOTH;
 generate_slip=new JButton("GENERATE MEMO");
 addComponent(generate_slip,8,6,1,1);
 new_stock_bt.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			boolean n=false;	
			try {
				n=Insert_new_product.insert(new_product_field.getText(),pro_id_stock_insert_jt.getText(),  new_stock_unit_price_jt.getText(), insert_new_stock.getText());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(n){
				
				JOptionPane.showMessageDialog(null,"SUCCESSFULLY INSERTED");
				pro_id_stock_insert_jt.setText("");
				new_stock_unit_price_jt.setText(""); 
				insert_new_stock.setText("");
				new_product_field.setText("");
			
			
			
			}
			else{
				
				JOptionPane.showMessageDialog(null,"PRODUCT NOT AVAILABLE IN THE STOCK");
				pro_id_stock_insert_jt.setText("");
				new_stock_unit_price_jt.setText(""); 
				insert_new_stock.setText("");
				new_product_field.setText("");
			
			
			}
						}
		}
		 
		 );
 generate_slip.addActionListener(
		 
		 new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				PDF_CREATOR pr=new PDF_CREATOR();		
			//	pr.open();
			 
				if(cost1 !=0 && cost2!=0 && cost3!= 0 ){
			 //PDF_CREATOR pr=new PDF_CREATOR();
			 try {
				pr.addTitlePage( 1,ids1, Search_by_id.search_product_name(id1),Search_by_id.search_unit_price(ids1), qs1, cost1);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 try {
			pr.add_table(1,ids2, Search_by_id.search_product_name(id2),Search_by_id.search_unit_price(ids2), qs2, cost2);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
				pr.add_table(1,ids3, Search_by_id.search_product_name(id3),Search_by_id.search_unit_price(ids3), qs3, cost3);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 try {
			pr.add();
			myprint(pr);	
			 pr.close1();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
				
	else if(cost1 !=0 && cost2!=0 && cost3== 0 ){
		 try {
				pr.addTitlePage( 1,ids1, Search_by_id.search_product_name(id1),Search_by_id.search_unit_price(ids1), qs1, cost1);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 try {
			pr.add_table(1,ids2, Search_by_id.search_product_name(id2),Search_by_id.search_unit_price(ids2), qs2, cost2);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
				pr.add();
				
				myprint(pr);	
				 pr.close1();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 
		 
		 
		}	
	else if(cost1 !=0 && cost2==0 && cost3!= 0 ){
		 try {
				pr.addTitlePage( 1,ids1, Search_by_id.search_product_name(id1),Search_by_id.search_unit_price(ids1), qs1, cost1);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 try {
				pr.add_table(1,ids3, Search_by_id.search_product_name(id3),Search_by_id.search_unit_price(ids3), qs3, cost3);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 try {
				pr.add();
				myprint(pr);	
				 pr.close1();	
		 
		 } catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 
		 
	
	}	
	else if(cost1 == 0 && cost2!=0 && cost3!= 0 ){
		 try {
				pr.addTitlePage( 1,ids2, Search_by_id.search_product_name(id2),Search_by_id.search_unit_price(ids2), qs2, cost2);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 try {
			pr.add_table(1,ids3, Search_by_id.search_product_name(id3),Search_by_id.search_unit_price(ids3), qs3, cost3);
			pr.add();
			myprint(pr);	
			
			pr.close1();
		 
		 
		 } catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
//		 try {
//				
//				 
//			} catch (DocumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		 
		 
		 
		 
		 
	}
	else if(cost1 ==0 && cost2==0 && cost3!= 0 ){
		 try {
				pr.addTitlePage( 1,ids3, Search_by_id.search_product_name(id3),Search_by_id.search_unit_price(ids3), qs3, cost3);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 try {
				pr.add();
				
				myprint(pr);	
				 pr.close1();
				 
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 
		 
		 
		 
		 
	}
	else if(cost1 ==0 && cost2!=0 && cost3== 0 ){
		 try {
				pr.addTitlePage( 1,ids2, Search_by_id.search_product_name(id2),Search_by_id.search_unit_price(ids2), qs2, cost2);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 try {
				pr.add();
				myprint(pr);	
				 pr.close1();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 
		 
	}
	else if(cost1 !=0 && cost2==0 && cost3== 0 ){
		 try {
			 //pr.open();
			pr.addTitlePage( 1,ids1, Search_by_id.search_product_name(id1),Search_by_id.search_unit_price(ids1), qs1, cost1);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 try {
				pr.add();
				myprint(pr);	
				 pr.close1();	
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		 
		 
		 
		 
		 
		 
		 
	}
	else if(cost1 ==0 && cost2==0 && cost3== 0 ){
		
	}
			
		 unit1.setText(sd);
		 unit2.setText(sd);
		 unit3.setText(sd);
		 pro_id1.setText(sd);
		 pro_id2.setText(sd);
		 pro_id3.setText(sd);
		 cost1=0;cost2=0;cost3=0;
		  id1=0;
		 q1=0;
		  id2=0;
		  q2=0;
		 id3=0;
		  q3=0;
//	pr1.close();
//		 
//		 try {
//			pr.add_empty_line(4);
//		} catch (DocumentException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		   
		  if (Desktop.isDesktopSupported()) {
			    try {
			    	//pr.close1();
			        File myFile = new File("D://CASH_MEMO/MEMO2.pdf");
			        Desktop.getDesktop().open(myFile);
			    } catch (IOException ex) {
			        // no application registered for PDFs
			    }
			}

		 
			 
		 
		 
		 
//			pr.close1();
			
			}
			
			public void myprint(PDF_CREATOR pr){
				
				 
				 try {
						pr.new_paragraph("NIT TOTAL : "+ Double.toString(cost1+cost2+cost3)+"  TK ONLY.");
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 try {
						pr.add_empty_line(1);
					} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 
				 
				try {
						pr.new_paragraph("PLEASE PAY YOUR SHOPPING BILL");
				//		pr.new_paragraph("THANK YOU FOR SHOPPING IN KUET DS.");
				
				} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				try {
			//		pr.new_paragraph("PLEASE PAY YOURE BILL");
				pr.new_paragraph("THANK YOU FOR SHOPPING IN KUET DEPARTMENTAL STORE.");
			
			} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			}
		 );
 
 j_name=new JLabel("null");
 j_name2=new JLabel("null");
 j_name3 =new JLabel("null");
j_stock1=new JLabel("0");
  j_stock2=new JLabel("0");
j_stock3=new JLabel("0");
 j_unit_price1=new JLabel("0");
 j_unit_price2=new JLabel("0");
 j_unit_price3=new JLabel("0");
j_total_1=new JLabel("0");
j_total_2=new JLabel("0");
  j_total_3=new JLabel("0");
  label_name=new JLabel("NAME");
 label_stock=new JLabel("STOCK");
 label_unit_price=new JLabel("UNIT PRICE");
 label_total=new JLabel("TOTAL");
  get_stock_news=new JButton(" AVAILABLE ITEMS");
 addComponent(j_name,1,3,1,1);
 addComponent(j_name2,2,3,1,1);
 addComponent(j_name3,3,3,1,1);
 addComponent(j_stock1,1,4,1,1);
 addComponent(j_stock2,2,4,1,1);
 addComponent(j_stock3,3,4,1,1);
 addComponent(j_unit_price1,1,5,1,1);
 addComponent(j_unit_price2,2,5,1,1);
 addComponent(j_unit_price3,3,5,1,1);
 addComponent(j_total_1,1,7,1,1);
 addComponent(j_total_2,2,7,1,1);
 addComponent(j_total_3,3,7,1,1);
 addComponent(label_name,0,3,1,1);
 addComponent(label_stock,0,4,1,1);
 addComponent(label_unit_price,0,5,1,1);
 addComponent(label_total,0,7,1,1);
addComponent(get_stock_news,10,6,1,1);
 
pro_id1.addCaretListener(
		new CaretListener() {
					@Override
				public void caretUpdate(CaretEvent arg0) {
					// TODO Auto-generated method stub
//					pro_id1.getFocusCycleRootAncestor();
					try {
						j_name.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id1.getText())));
					} catch ( NumberFormatException e) {
						// TODO Auto-generated catch block
						return;
						//e.printStackTrace();
					}
					j_stock1.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(pro_id1.getText()))));				
					j_unit_price1.setText(Double.toString(Search_by_id.search_unit_price(pro_id1.getText())));
					
					//j_name.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id1.getText())));
					}});		
pro_id2.addCaretListener(
		new CaretListener() {
					@Override
				public void caretUpdate(CaretEvent arg0) {
					// TODO Auto-generated method stub
//					pro_id1.getFocusCycleRootAncestor();
					try {
						j_name2.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id2.getText())));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						return;
						//e.printStackTrace();
					}
					j_stock2.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(pro_id2.getText()))));				
					j_unit_price2.setText(Double.toString(Search_by_id.search_unit_price(pro_id2.getText())));
									
					//j_name.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id1.getText())));
					}});				
pro_id3.addCaretListener(
		new CaretListener() {
					@Override
				public void caretUpdate(CaretEvent arg0) {
					// TODO Auto-generated method stub
//					pro_id1.getFocusCycleRootAncestor();
					try {
						j_name3.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id3.getText())));
						j_stock3.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(pro_id3.getText()))));				
						j_unit_price3.setText(Double.toString(Search_by_id.search_unit_price(pro_id3.getText())));
						
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						return;
						//e.printStackTrace();
					}
					//j_name.setText(Search_by_id.search_product_name(Integer.parseInt(pro_id1.getText())));
					}});		
//cost1=q_given1*	Search_by_id.search_unit_price(ids1);
		unit1.addCaretListener(
				new CaretListener() {
					@Override
					public void caretUpdate(CaretEvent arg0) {
					//	cost2=q_given2*	Search_by_id.search_unit_price(ids2);
						//cost3=q_given3*	Search_by_id.search_unit_price(ids3);
	                 double s1;
					try {
						s1 = Double.parseDouble(unit1.getText())*Search_by_id.search_unit_price(pro_id1.getText());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						return;
						//e.printStackTrace();
					}					
						j_total_1.setText(Double.toString(s1));
					}});	
		unit2.addCaretListener(
				new CaretListener() {
					@Override
					public void caretUpdate(CaretEvent arg0) {
					//	cost2=q_given2*	Search_by_id.search_unit_price(ids2);
						//cost3=q_given3*	Search_by_id.search_unit_price(ids3);
	                 double s1;
					try {
						s1 = Double.parseDouble(unit2.getText())*Search_by_id.search_unit_price(pro_id2.getText());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
					return;
						//	e.printStackTrace();
					}					
						j_total_2.setText(Double.toString(s1));
					}});
		unit3.addCaretListener(
				new CaretListener() {
					@Override
					public void caretUpdate(CaretEvent arg0) {
					//	cost2=q_given2*	Search_by_id.search_unit_price(ids2);
						//cost3=q_given3*	Search_by_id.search_unit_price(ids3);
	                 double s1;
					try {
						s1 = Double.parseDouble(unit3.getText())*Search_by_id.search_unit_price(pro_id3.getText());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						return;
						//e.printStackTrace();
					}					
						j_total_3.setText(Double.toString(s1));
					}});
								
			get_stock_news.addActionListener(
					
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
					PDF_CREATOR_FOR_STOCK pb=new PDF_CREATOR_FOR_STOCK();
					try {
						pb.get_row();
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						pb.add();
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			pb.close1();
			  if (Desktop.isDesktopSupported()) {
				    try {
				    	//pr.close1();
				        File myFile = new File("D://CASH_MEMO/STOCK_NEWS.pdf");
				        Desktop.getDesktop().open(myFile);
				    } catch (IOException ex) {
				        // no application registered for PDFs
				    }
				}
				
						}});	
				

 

 
 
 
 
 
 
 
 
 
 
 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		change();
          
          }    
  private void addComponent( Component component,
 int row,int column, int width,int height )
 {
    constraints.gridx = column; // set gridx
constraints.gridy = row; // set gridy
constraints.gridwidth = width; // set gridwidth
constraints.gridheight = height; // set gridheight
layout.setConstraints( component, constraints ); // set constraints
add( component ); // add component

}       
  
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
         SwingUtilities.updateComponentTreeUI(Product.this);
         }
         catch(ClassNotFoundException k){
             
             
         }
     }
 }
 }
  }
