package com.main;

import javax.swing.border.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.etc.RSButtonMetro;

public class Aplicacion extends JFrame {

	public JPanel contentPane, Login,desplega,desplegado;
	public int x,y;
	public JButton exit;
	public JLabel label, inicio;
	public RSButtonMetro file,edit,config,exitt,about,resolucion,estandar,basica,newFile;
	public String bandera;
	public boolean b=true, menuActivo=false;
		public Aplicacion frame = this; // nesesario para el cambio de resoluciones.
	public JLabel aviso;
	public JSeparator separator,separator2,separator3,separator4; // se crean nuevos separadores- tomar en cuenta en resoluciones
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

					Aplicacion frame = new Aplicacion();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Aplicacion() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(138, 43, 226)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login = new JPanel();
		Login.setBackground(new Color(92,107,192));
		Login.setBounds(1, 1, 403, 748);
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
		exit.setRolloverSelectedIcon(new ImageIcon(Aplicacion.class.getResource("/com/img/exit.png")));
		exit.setRolloverIcon(new ImageIcon(Aplicacion.class.getResource("/com/img/exit.png")));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setContentAreaFilled(false);
		exit.setBorder(null);
		exit.setBorderPainted(false);
		exit.setIcon(new ImageIcon(Aplicacion.class.getResource("/com/img/exit2.png")));
		exit.setIconTextGap(-10);
		exit.setBounds(370, 1, 30, 30);
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
				
				setLocation(xx-x,yy-y);
			}
		});
		label.setBounds(0, 1, 404, 75);
		Login.add(label);
		
		inicio = new JLabel("TextEditor");
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
		inicio.setFont(new Font("Roboto Thin", Font.BOLD, 50));
		inicio.setBounds(10, 11, 261, 60);
		Login.add(inicio);

		separator = new JSeparator();
		separator.setBounds(1, 75, 403, 1);
		Login.add(separator);
		
		file = new RSButtonMetro();
		file.addActionListener(new ActionListener() { /**/
			int cont=1;
			public void actionPerformed(ActionEvent a) { // nesesario para el cambio de resoluciones. se movieron un 50 hacia abajo
				if (cont==1 && menuActivo==false) {
					Animacion.Animacion.bajar(174, 224,1,1, edit);
					separator3.setBounds(30, 261, 100, 1);
					Animacion.Animacion.bajar(220, 270, 1, 1, config);
					separator4.setBounds(30, 307, 100, 1);
					
					desplega.setVisible(true);	// nesesario para el cambio de resoluciones.
						Animacion.Animacion.bajar(128, 168, 2, 1, desplega); // nesesario para el cambio de resoluciones.
					newFile.setVisible(true);
					menuActivo=true;
					aviso.setBounds(180, 174, 30, 35);// nesesario para el cambio de resoluciones.
					aviso.setVisible(false);
					System.out.println("File cont: "+cont+"-menuActivo: -"+menuActivo);
					cont=0;
				}else {
					if (cont==0 && menuActivo==true) {
					Animacion.Animacion.subir(224, 174,1,1, edit);
					separator3.setBounds(30, 211, 100, 1);
					Animacion.Animacion.subir(270, 220, 1, 1, config);
					separator4.setBounds(30, 257, 100, 1);
					
					desplega.setVisible(false);
					newFile.setVisible(false);
					menuActivo=false;
					aviso.setBounds(180, 266, 30, 35);// nesesario para el cambio de resoluciones.
					aviso.setVisible(false);
					System.out.println("File cont: "+cont+"-menuActivo: -"+menuActivo);
					cont=1;
					}else {
						aviso.setBounds(180, config.getY(), 30, 35);
						aviso.setVisible(true);
					}
				}
			}
		});
		file.setHorizontalAlignment(SwingConstants.LEFT);
		file.setHorizontalTextPosition(SwingConstants.LEADING);
		file.setFocusable(false);
		file.setColorHover(new Color(142,153,243));
		file.setColorNormal(new Color(92,107,192));
		file.setColorPressed(new Color(142,153,243));
		file.setFont(new Font("Roboto Thin", Font.BOLD, 30));
		file.setText("File");
		file.setBounds(23, 128, 150, 35); 							//Modificado 
		Login.add(file);
		
		separator2 = new JSeparator();
		separator2.setBounds(30, 165, 100, 1);
		Login.add(separator2);
		
			desplega = new JPanel(); 			// nesesario para el cambio de resoluciones.
			desplega.setVisible(false);
			desplega.setBackground(new Color(73,89,154));
			desplega.setBounds(0, 128, 403, 41);
			desplega.setLayout(null);
			Login.add(desplega);
			
				newFile = new RSButtonMetro();								// nesesario para el cambio de resoluciones.
				newFile.setBounds(60, 3, 110, 35);
				desplega.add(newFile);
				newFile.setVisible(false);
				newFile.setText("New File ");
				newFile.setHorizontalAlignment(SwingConstants.CENTER);
				newFile.setFont(new Font("Roboto Thin", Font.BOLD, 20));
				newFile.setFocusable(false);
				newFile.setColorPressed(new Color(142, 153, 243));
				newFile.setColorNormal(new Color(73,89,154));
				newFile.setColorHover(new Color(142, 153, 243));
		
		edit = new RSButtonMetro();
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		edit.setHorizontalAlignment(SwingConstants.LEFT);
		edit.setText("Edit");
		edit.setFont(new Font("Roboto Thin", Font.BOLD, 30));
		edit.setFocusable(false);
		edit.setColorPressed(new Color(142, 153, 243));
		edit.setColorNormal(new Color(92, 107, 192));
		edit.setColorHover(new Color(142, 153, 243));
		edit.setBounds(23, 174, 150, 35); 							//Modificado 
		Login.add(edit);
		
		separator3 = new JSeparator();
		separator3.setBounds(30, 211, 100, 1);
		Login.add(separator3);
		
		config = new RSButtonMetro();
		config.addActionListener(new ActionListener() { //Error, impedir que halla 2 despliegues a la vez #SOLUCIONADO#
			int cont=1;
			public void actionPerformed(ActionEvent a) {
				if (cont==1 && menuActivo==false) {
					//Animacion.Animacion.bajar(266, 350, 2, 1, exitt);
					
					desplegado.setVisible(true);	// nesesario para el cambio de resoluciones.
						Animacion.Animacion.bajar(220, 260, 2, 1, desplegado); // nesesario para el cambio de resoluciones.
					aviso.setVisible(false);
					resolucion.setVisible(true);
					menuActivo=true;
					System.out.println("Option cont: "+cont+"-menuActivo: -"+menuActivo);
					cont=0;
				}else {
					if(cont==0 && menuActivo==true) {
					//Animacion.Animacion.subir(300, 256, 2, 1, exitt);
						//aviso.setBounds(180, 266, 30, 35);
						
					desplegado.setVisible(false);	// nesesario para el cambio de resoluciones.
					aviso.setVisible(false);
					resolucion.setVisible(false);
					menuActivo=false;
					System.out.println("Option ont: "+cont+"-menuActivo: -"+menuActivo);
					cont=1;
					}else {
						aviso.setBounds(180, file.getY(), 30, 35);
						aviso.setVisible(true);
					}
				}
			}
		});
		config.setText("Config");
		config.setHorizontalAlignment(SwingConstants.LEFT);
		config.setFont(new Font("Roboto Thin", Font.BOLD, 30));
		config.setFocusable(false);
		config.setColorPressed(new Color(142, 153, 243));
		config.setColorNormal(new Color(92, 107, 192));
		config.setColorHover(new Color(142, 153, 243));
		config.setBounds(23, 220, 150, 35); 							//Modificado 
		Login.add(config);
		
		separator4 = new JSeparator();
		separator4.setBounds(30, 257, 100, 1);
		Login.add(separator4);
		
		desplegado = new JPanel(); 			// nesesario para el cambio de resoluciones.
		desplegado.setVisible(false);
		desplegado.setBackground(new Color(73,89,154));
		desplegado.setBounds(0, 220, 403, 41);
		desplegado.setLayout(null);
		Login.add(desplegado);
		
			resolucion = new RSButtonMetro();
			resolucion.setBounds(60, 3, 110, 35);
			desplegado.add(resolucion);
			resolucion.addActionListener(new ActionListener(){ /**/
				int cont=1;
				public void actionPerformed(ActionEvent e) {
					if(cont==1) {
						/*Animacion de botones principales*/
						Animacion.Animacion.mover_izquierda(23, -175, 1, 1, file);
						Animacion.Animacion.mover_izquierda(23, -175, 1, 1, edit);
						Animacion.Animacion.mover_izquierda(23, -175, 1, 1, config);
						separator2.setVisible(false);
						separator3.setVisible(false);
						separator4.setVisible(false);
						/*Animacion de botones principales*/
							desplegado.setVisible(false); //Anadido
									//menuActivo=false;
							Login.add(resolucion);		  //anadido
							resolucion.setFont(new Font("Roboto Thin", Font.BOLD, 25));
							resolucion.setBounds(23, 128, 150, 35);
							resolucion.setColorPressed(new Color(92, 107, 192));
							resolucion.setColorNormal(new Color(92, 107, 192));
							resolucion.setColorHover(new Color(92, 107, 192));
							//xx
							estandar.setVisible(true);
							basica.setVisible(true);
							//xx
							bandera="resolucion";
						about.setText("Exit");
						System.out.println("Resolution cont: "+cont);
					}//fin if
					//System.out.println("Resolution listener");
				}
			});
			resolucion.setText("Resolution");
			resolucion.setFont(new Font("Roboto Thin", Font.BOLD, 20));
			resolucion.setFocusable(false);
			resolucion.setColorPressed(new Color(142, 153, 243));
			resolucion.setColorNormal(new Color(92, 107, 192));
			resolucion.setColorHover(new Color(142, 153, 243));
			resolucion.setVisible(false);
		
				estandar = new RSButtonMetro();
				estandar.setVisible(false);
				estandar.setToolTipText("Estandar");
				estandar.addActionListener(new ActionListener() { /**/
					int cont=1;
					public void actionPerformed(ActionEvent e) {
						if(b==false) {
							estandar.setColorPressed(new Color(142, 153, 243));
							estandar.setColorNormal(new Color(142, 153, 243));
							estandar.setColorHover(new Color(142, 153, 243));
								basica.setColorPressed(new Color(142, 153, 243));
								basica.setColorNormal(new Color(92, 107, 192));
								basica.setColorHover(new Color(142, 153, 243));
								System.out.println("REsolucion cmabiada a " + basica.getText());
								b=true;
							//cont = 0;
						}
					}
				});
				estandar.setColorPressed(new Color(142, 153, 243));
				estandar.setColorNormal(new Color(142, 153, 243));
				estandar.setColorHover(new Color(142, 153, 243));
				estandar.setFocusable(false);
				estandar.setFont(new Font("Roboto Thin", Font.BOLD, 15));
				estandar.setText("1920x1080");
				estandar.setBounds(95, 174, 83, 35);
				Login.add(estandar);
				
				basica = new RSButtonMetro();
				basica.setVisible(false);
				basica.addActionListener(new ActionListener() { /**/
					public void actionPerformed(ActionEvent e) {
						/*if(b==true) {
							estandar.setColorPressed(new Color(142, 153, 243));
							estandar.setColorNormal(new Color(92, 107, 192));
							estandar.setColorHover(new Color(142, 153, 243));
								basica.setColorPressed(new Color(142, 153, 243));
								basica.setColorNormal(new Color(142, 153, 243));
								basica.setColorHover(new Color(142, 153, 243));
								//new com.etc.ChangeResolution().ResolutionBasic(frame, contentPane, Login, exit, label, inicio, file, edit, config, exitt, about, resolucion, estandar, basica, separator);
								dispose();
								new com.etc.ChangeResolution().ResolutionBasic(frame);
								System.out.println("REsolucion cmabiada a " + basica.getText());
								b=false;
							//cont = 0;
						}
						*/
					}
				});
				basica.setToolTipText("Basica");
				basica.setText("1366x768 ");
				basica.setFont(new Font("Roboto Thin", Font.BOLD, 15));
				basica.setFocusable(false);
				basica.setColorPressed(new Color(142, 153, 243));
				basica.setColorNormal(new Color(92, 107, 192));
				basica.setColorHover(new Color(142, 153, 243));
				basica.setBounds(95, 220, 83, 35);
				Login.add(basica);
		
		about = new RSButtonMetro();
		about.addActionListener(new ActionListener() { /**/
			int cont=1;boolean b;
			public void actionPerformed(ActionEvent a) {
			com.etc.About x = new com.etc.About(); /*About anadirlo a resolucion basica*/
			  if(about.getText().equals("Exit") && bandera.equals("resolucion")) {
					about.setText("About");
					resolucion.setFont(new Font("Roboto Thin", Font.BOLD, 20));
					
					desplegado.setBounds(0, 260, 403, 41); // test error, hay que darle doble click al opciones. es molesto
					desplegado.add(resolucion);
					resolucion.setBounds(60, 3, 110, 35);
						//Animacion.Animacion.bajar(128, 266, 1, 1, resolucion);
					estandar.setVisible(false);
					basica.setVisible(false);
					resolucion.setColorPressed(new Color(142, 153, 243));
					resolucion.setColorNormal(new Color(92, 107, 192));
					resolucion.setColorHover(new Color(142, 153, 243));
					bandera=null;
						Animacion.Animacion.mover_derecha(-175, 23, 1, 1, file);
						Animacion.Animacion.mover_derecha(-175, 23, 1, 1, edit);
						Animacion.Animacion.mover_derecha(-175, 23, 1, 1, config);
						separator2.setVisible(true);
						separator3.setVisible(true);
						separator4.setVisible(true);
					System.out.println("About in exit value cont: "+cont);
					cont=1;
				}else {
					if(cont==1 && menuActivo==false)	{ //la opcion para saber cuando un menu esta activo o algo // tomarlo en cuenta en la resolucion
						Animacion.Animacion.mover_izquierda(23, -175, 2, 1, file);
						Animacion.Animacion.mover_izquierda(23, -175, 2, 1, edit);
						Animacion.Animacion.mover_izquierda(23, -175, 2, 1, config);
							b = x.acercaDe(Login); /*About anadirlo a resolucion basica*/
							separator2.setVisible(false);
							separator3.setVisible(false);
							separator4.setVisible(false);
						System.out.println("About cont: "+cont);
						cont=0;
					}else {
						if(cont==0 && menuActivo==false) {// tomarlo en cuenta en la resolucion
						Animacion.Animacion.mover_derecha(-175, 23, 1, 1, file);
						Animacion.Animacion.mover_derecha(-175, 23, 2, 1, edit);
						Animacion.Animacion.mover_derecha(-175, 23, 3, 1, config);
						x.quitar(b);
							separator2.setVisible(true);
							separator3.setVisible(true);
							separator4.setVisible(true);
						System.out.println("About cont: "+cont);
						cont=1;
						}else {
							aviso.setVisible(true); // tomarlo en cuenta en la resolucion
						}
					}
			   }
		  }
		});
		about.setColorPressed(new Color(142, 153, 243));
		about.setColorNormal(new Color(92, 107, 192));
		about.setColorHover(new Color(142, 153, 243));
		about.setText("About");
		about.setFont(new Font("Roboto Thin", Font.BOLD, 15));
		about.setFocusable(false);
		about.setBounds(5, 720, 55, 24);
		Login.add(about);
		
			aviso = new JLabel(" "); /*aviso anadirlo ala resolucion basica*/
			aviso.setVisible(false);
			aviso.setIconTextGap(-10);
			aviso.setIcon(new ImageIcon(Aplicacion.class.getResource("/com/img/aviso.png")));
			aviso.setFocusable(false);
			aviso.setBounds(180, 266, 30, 35);
			Login.add(aviso);
	}
}
