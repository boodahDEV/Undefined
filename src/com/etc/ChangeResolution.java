package com.etc;

import javax.swing.border.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.etc.RSButtonMetro;

public class ChangeResolution extends JFrame{
	public JPanel contentPane, Login;
	public int x,y;
	public JButton exit;
	public JLabel label, inicio;
	public RSButtonMetro file,edit,config,exitt,about,resolucion,estandar,basica;
	public String bandera;
	public boolean b=true;
	public JFrame frame = this;
	public JSeparator separator;
	
	public void ResolutionBasic(com.main.Aplicacion anterior){
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 280, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(138, 43, 226)));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login = new JPanel();
		Login.setBackground(new Color(92,107,192));
		Login.setBounds(1, 1, 278, 523);
		contentPane.add(Login);
		Login.setLayout(null);
		
		//exit
		exit = new JButton(" ");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFocusable(false);
		exit.setRolloverSelectedIcon(new ImageIcon(this.getClass().getResource("/com/img/exit.png")));
		exit.setRolloverIcon(new ImageIcon(this.getClass().getResource("/com/img/exit.png")));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setContentAreaFilled(false);
		exit.setBorder(null);
		exit.setBorderPainted(false);
		exit.setIcon(new ImageIcon(this.getClass().getResource("/com/img/exit2.png")));
		exit.setIconTextGap(-10);
		exit.setBounds(245, 1, 30, 30);
		Login.add(exit);
		//exit
		
		label = new JLabel(" ");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent a) {
				x = a.getX();
				y = a.getY();
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent a) {
				int xx = a.getXOnScreen();
				int yy = a.getYOnScreen();
				
				frame.setLocation(xx-x,yy-y);
			}
		});
		label.setBounds(1, 1, 278, 60);
		Login.add(label);
		
		inicio = new JLabel("TextEdit");
		inicio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent a) {
				inicio.setForeground(new Color(255,255,255));
			}
		});
		inicio.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent a) {
				inicio.setForeground(new Color(197,202,233));
			}
		});
		inicio.setForeground(new Color(255, 255, 255));
		inicio.setFont(new Font("Roboto Thin", Font.BOLD, 35));
		inicio.setBounds(10, 1, 180, 45);
		Login.add(inicio);

		separator = new JSeparator();
		separator.setBounds(1, 50, 278, 1);
		Login.add(separator);
		
		file = new RSButtonMetro();
		file.setHorizontalAlignment(SwingConstants.LEFT);
		file.setHorizontalTextPosition(SwingConstants.LEADING);
		file.setFocusable(false);
		file.setColorHover(new Color(142,153,243));
		file.setColorNormal(new Color(92,107,192));
		file.setColorPressed(new Color(142,153,243));
		file.setFont(new Font("Dialog", Font.BOLD, 20));
		file.setText("File");
		file.setBounds(/*-175*/15, 85, 65, 25); 							//Modificado 
		Login.add(file);
		
		edit = new RSButtonMetro();
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		edit.setHorizontalAlignment(SwingConstants.LEFT);
		edit.setText("Edit");
		edit.setFont(new Font("Dialog", Font.BOLD, 20));
		edit.setFocusable(false);
		edit.setColorPressed(new Color(142, 153, 243));
		edit.setColorNormal(new Color(92, 107, 192));
		edit.setColorHover(new Color(142, 153, 243));
		edit.setBounds(/*-175*/15, 120, 65, 25); 							//Modificado 
		Login.add(edit);
		
		config = new RSButtonMetro();
		config.addActionListener(new ActionListener() {
			int cont=1;
			public void actionPerformed(ActionEvent a) {
				if (cont==1) {
					//Animacion.Animacion.bajar(266, 350, 2, 1, exitt);
					resolucion.setVisible(true);
					System.out.println("Option cont: "+cont);
					cont=0;
				}else {
					//Animacion.Animacion.subir(300, 256, 2, 1, exitt);
					resolucion.setVisible(false);
					System.out.println("Option cont: "+cont);
					cont=1;
				}
			}
		});
		config.setText("Config");
		config.setHorizontalAlignment(SwingConstants.LEFT);
		config.setFont(new Font("Dialog", Font.BOLD, 20));
		config.setFocusable(false);
		config.setColorPressed(new Color(142, 153, 243));
		config.setColorNormal(new Color(92, 107, 192));
		config.setColorHover(new Color(142, 153, 243));
		config.setBounds(/*-175*/15, 155, 65, 25); 							//Modificado 
		Login.add(config);
		
		about = new RSButtonMetro();
		about.addActionListener(new ActionListener() {
			int cont=1;
			public void actionPerformed(ActionEvent a) {
			  if(about.getText().equals("Exit") && bandera.equals("resolucion")) {
					about.setText("About");
					resolucion.setFont(new Font("Roboto Thin", Font.BOLD, 12));
					resolucion.setBounds(50, 85, 70, 25);
					Animacion.Animacion.bajar(85, 190, 1, 1, resolucion);
					resolucion.setColorPressed(new Color(142, 153, 243));
					resolucion.setColorNormal(new Color(92, 107, 192));
					resolucion.setColorHover(new Color(142, 153, 243));
					estandar.setVisible(false);
					basica.setVisible(false);
					bandera=null;
						Animacion.Animacion.mover_derecha(-80,15, 1, 1, file);
						Animacion.Animacion.mover_derecha(-80,15, 1, 1, edit);
						Animacion.Animacion.mover_derecha(-80,15, 1, 1, config);
						System.out.println("About in exit value cont: "+cont);
					cont=1;
				}else {
					if(cont==1)	{
						Animacion.Animacion.mover_izquierda(15, -80, 2, 1, file);
						Animacion.Animacion.mover_izquierda(15, -80, 2, 1, edit);
						Animacion.Animacion.mover_izquierda(15, -80, 2, 1, config);
						System.out.println("About cont: "+cont);
						cont=0;
					}else {
						Animacion.Animacion.mover_derecha(-80,15, 1, 1, file);
						Animacion.Animacion.mover_derecha(-80,15, 2, 1, edit);
						Animacion.Animacion.mover_derecha(-80,15, 3, 1, config);
						System.out.println("About cont: "+cont);
						cont=1;
					}
			   }
		  }
		});
		about.setColorPressed(new Color(142, 153, 243));
		about.setColorNormal(new Color(92, 107, 192));
		about.setColorHover(new Color(142, 153, 243));
		about.setText("About");
		about.setFont(new Font("Dialog", Font.BOLD, 10));
		about.setFocusable(false);
		about.setBounds(5, 502, 40, 18);
		Login.add(about);
		
		resolucion = new RSButtonMetro();
		resolucion.addActionListener(new ActionListener() {
			int cont=1;
			public void actionPerformed(ActionEvent e) {
				if(cont==1 && resolucion.getX()==50){
					/*Animacion de botones principales*/
					Animacion.Animacion.mover_izquierda(15, -80, 1, 1, file);
					Animacion.Animacion.mover_izquierda(15, -80, 1, 1, edit);
					Animacion.Animacion.mover_izquierda(15, -80, 1, 1, config);
					/*Animacion de botones principales*/
						resolucion.setFont(new Font("Roboto Thin", Font.BOLD, 20));
						resolucion.setBounds(23, 85, 110, 25);
						resolucion.setColorPressed(new Color(92, 107, 192));
						resolucion.setColorNormal(new Color(92, 107, 192));
						resolucion.setColorHover(new Color(92, 107, 192));
							estandar.setVisible(true);
							basica.setVisible(true);
						bandera="resolucion";
						about.setText("Exit");
						System.out.println("Resolution cont: "+cont);
				}
			}
		});
		resolucion.setText("Resolution");
		resolucion.setHorizontalAlignment(SwingConstants.LEFT);
		resolucion.setFont(new Font("Dialog", Font.BOLD, 12));
		resolucion.setFocusable(false);
		resolucion.setColorPressed(new Color(142, 153, 243));
		resolucion.setColorNormal(new Color(92, 107, 192));
		resolucion.setColorHover(new Color(142, 153, 243));
		resolucion.setBounds(/*23*/50, /*85*/190, 70, 25); 							//Modificado 
		resolucion.setVisible(false);
		Login.add(resolucion);
		
		estandar = new RSButtonMetro();
		estandar.setVisible(false);
		estandar.setToolTipText("Estandar");
		estandar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					estandar.setColorPressed(new Color(142, 153, 243));
					estandar.setColorNormal(new Color(142, 153, 243));
					estandar.setColorHover(new Color(142, 153, 243));
						basica.setColorPressed(new Color(142, 153, 243));
						basica.setColorNormal(new Color(92, 107, 192));
						basica.setColorHover(new Color(142, 153, 243));
						dispose();
							anterior.setVisible(true);
								anterior.estandar.setColorPressed(new Color(142, 153, 243));
								anterior.estandar.setColorNormal(new Color(142, 153, 243));
								anterior.estandar.setColorHover(new Color(142, 153, 243));
								System.out.println("REsolucion cambiada a "+anterior.estandar.getText());
								anterior.basica.setColorPressed(new Color(142, 153, 243));
								anterior.basica.setColorNormal(new Color(92, 107, 192));
								anterior.basica.setColorHover(new Color(142, 153, 243));
						b=false;
					//cont = 0;
				}
			}
		});
		estandar.setColorPressed(new Color(142, 153, 243));
		estandar.setColorNormal(new Color(92, 107, 192));
		estandar.setColorHover(new Color(142, 153, 243));
		estandar.setFocusable(false);
		estandar.setFont(new Font("Dialog", Font.BOLD, 10));
		estandar.setText("1920x1080");
		estandar.setBounds(65, 128, 65, 25);
		Login.add(estandar);
		
		basica = new RSButtonMetro();
		basica.setVisible(false);
		basica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==false) {
					estandar.setColorPressed(new Color(142, 153, 243));
					estandar.setColorNormal(new Color(92, 107, 192));
					estandar.setColorHover(new Color(142, 153, 243));
						basica.setColorPressed(new Color(142, 153, 243));
						basica.setColorNormal(new Color(142, 153, 243));
						basica.setColorHover(new Color(142, 153, 243));
						b=true;
					//cont = 0;
				}
			}
		});
		basica.setToolTipText("Basica");
		basica.setText("1366x768 ");
		basica.setFont(new Font("Dialog", Font.BOLD, 10));
		basica.setFocusable(false);
		basica.setColorPressed(new Color(142, 153, 243));
		basica.setColorNormal(new Color(142, 153, 243));
		basica.setColorHover(new Color(142, 153, 243));
		basica.setBounds(65, 160, 65, 25);
		Login.add(basica);
		
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


}
