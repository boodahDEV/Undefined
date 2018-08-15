package com.etc;
import javax.swing.*;

import java.awt.*;


public class About{
	public JLabel label1,label2,label6,label3,label4,label5,label7;
	public void acercaDe(JPanel Login) {
		// TODO Auto-generated method stub
		
		label1 = new JLabel("Acerca De");
		label1.setBounds(138, 118, 110, 32);
		Login.add(label1);
		label1.setForeground(new Color(255, 255, 255));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Roboto Thin", Font.BOLD, 20));
		
		label2 = new JLabel("-------------------------");
		label2.setBounds(145, 144, 100, 14);
		Login.add(label2);
		label2.setForeground(new Color(255, 255, 255));
		
		label3 = new JLabel("Apache License");
		label3.setBounds(145, 195, 100, 14);
		Login.add(label3);
		label3.setForeground(new Color(255, 255, 255));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		
		label4 = new JLabel("Version 2.0, January 2004");
		label4.setBounds(120, 210, 147, 14);
		Login.add(label4);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.WHITE);
		
		label5 = new JLabel(" http://www.apache.org/licenses/");
		label5.setBounds(100, 230, 188, 14);
		Login.add(label5);
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setForeground(Color.WHITE);
		
		label6 = new JLabel("Copyright \u00A9 2018 by @boodah");
		label6.setBounds(50, 270, 291, 14);
		Login.add(label6);
		label6.setForeground(new Color(255, 255, 255));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		
		label7 = new JLabel("Solicita tu contribucion en \n boodah21@protonmail.com");
		label7.setBounds(50, 285, 291, 14);
		Login.add(label7);
		label7.setForeground(new Color(255, 255, 255));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void remove() {
		
	}
}
