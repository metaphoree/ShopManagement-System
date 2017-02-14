package WINDOWS;

import java.awt.Component;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

public class GET_PANEL {


	  static void addComponent1(JPanel panel, Component component,
			  int row,int column, int width,int height,GridBagConstraints constraints1 )
			  {
			     constraints1.gridx = column; // set gridx
			 constraints1.gridy = row; // set gridy
			 constraints1.gridwidth = width; // set gridwidth
			 constraints1.gridheight = height; // set gridheight
			// layout.setConstraints( component, constraints ); // set constraints
			 panel.add(component, constraints1);
			 
			 
			 //add( component ); // add component

			 }












}
