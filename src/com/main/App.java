package com.main;

import javax.swing.*;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import com.etc.RSButtonMetro;




public class App extends JFrame {

	private JPanel contentPane;
	public int x,y;
	public RSButtonMetro doc[] = new RSButtonMetro[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					App frame = new App();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public App() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1220, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(41,98,255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menubar = new JPanel();
		menubar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent a) {
				x = a.getX();
				y = a.getY();
			}
		});
		menubar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent a) {
				int xx = a.getXOnScreen();
				int yy = a.getYOnScreen();
				
				setLocation(xx-x,yy-y);
			}
		});
		menubar.setBounds(0, 0, 1219, 30);
		menubar.setBackground(new Color(41,98,255));
		contentPane.add(menubar);
		menubar.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(41,121,255));
		separator.setForeground(new Color(41,121,255));
		separator.setBounds(1, 28, 1219, 2);
		menubar.add(separator);
		
		RSButtonMetro file = new RSButtonMetro();
		file.setColorPressed(new Color(41,121,255));
		file.setColorNormal(new Color(41,98,255));
		file.setColorHover(new Color(44,121,255));
		file.setFocusable(false);
		file.setFont(new Font("Century Gothic", Font.BOLD, 14));
		file.setText("File");
		file.setBounds(0, 10, 30, 15);
		menubar.add(file);
		
		RSButtonMetro help = new RSButtonMetro();
		help.setFont(new Font("Century Gothic", Font.BOLD, 13));
		help.setColorPressed(new Color(41,121,255));
		help.setColorNormal(new Color(41,98,255));
		help.setColorHover(new Color(41,121,255));
		help.setFocusable(false);
		help.setText("Help");
		help.setBounds(33, 10, 30, 15);
		menubar.add(help);
		
		JPanel control = new JPanel();
		control.setBounds(1144, 0, 75, 30);
		menubar.add(control);
		control.setBackground(new Color(41,98,255));
		control.setLayout(null);
		
		JButton min = new JButton(" ");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(App.ICONIFIED);
			}
		});
		min.setBounds(10, 2, 25, 20);
		min.setRolloverSelectedIcon(new ImageIcon(App.class.getResource("/com/img/min2.png")));
		min.setRolloverIcon(new ImageIcon(App.class.getResource("/com/img/min2.png")));
		min.setIcon(new ImageIcon(App.class.getResource("/com/img/min.png")));
		min.setIconTextGap(-5);
		min.setFocusable(false);
		min.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		min.setContentAreaFilled(false);
		min.setBorderPainted(false);
		min.setBorder(null);
		control.add(min);
		
		JButton exit = new JButton(" ");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.exit(0);
			}
		});
		exit.setBounds(43, 3, 25, 20);
		exit.setRolloverSelectedIcon(new ImageIcon(App.class.getResource("/com/img/exit2.png")));
		exit.setRolloverIcon(new ImageIcon(App.class.getResource("/com/img/exit2.png")));
		exit.setIconTextGap(-5);
		exit.setIcon(new ImageIcon(App.class.getResource("/com/img/exit.png")));
		exit.setFocusable(false);
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setBorder(null);
		control.add(exit);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 1219, 25);
		panel.setBackground(new Color(41,98,255));
		contentPane.add(panel);
		panel.setLayout(null);
	
/**/
	for(int x=0;x<10;x++) {
		doc[x] = new RSButtonMetro();
		doc[x].setBounds(-91, 0, 90, 25);
		doc[x].setFocusable(false);
		doc[x].setFont(new Font("Century Gothic", Font.PLAIN, 12));
		doc[x].setColorPressed(new Color(41,98,255));
		doc[x].setColorNormal(new Color(41,110,255));
		doc[x].setColorHover(new Color(41,121,255));
		doc[x].setText("new file ");
	}
/**/	
		JButton add = new JButton(" ");
		add.setRolloverSelectedIcon(new ImageIcon(App.class.getResource("/com/img/add2.png")));
		add.setRolloverIcon(new ImageIcon(App.class.getResource("/com/img/add2.png")));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
			//implementar una condicion para añadir documentos o ficheros de manera 
				Animacion.Animacion.mover_derecha(5, 100, 2, 2, add);
				Animacion.Animacion.mover_derecha(-91, 5, 2, 2, doc[0]);
			}
		});
		add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add.setIcon(new ImageIcon(App.class.getResource("/com/img/add.png")));
		add.setIconTextGap(-5);
		add.setFocusable(false);
		add.setContentAreaFilled(false);
		add.setBorderPainted(false);
		add.setBorder(null);
		add.setBounds(5, 2, 25, 20);
		panel.add(add);
	}
}
