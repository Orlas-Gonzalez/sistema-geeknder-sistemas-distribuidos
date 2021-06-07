package view.geeknder.sd;


import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;

import controller.geeknder.sd.the_hub_geeknder;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.border.CompoundBorder;

import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import javax.swing.DefaultComboBoxModel;





@SuppressWarnings("serial")
public class Signup extends JFrame {
	
	private JPanel contentPane;
	
	private static the_hub_geeknder th = new the_hub_geeknder();

	private JTextField txtNickname;
	private JLabel lbl_User;
	private JLabel lbl_User_1;
//	private JLabel lbl_icon_logo;
	private JLabel lbl_Password;
//	private JLabel lbl_icon_pass;
	private JLabel lbl_Inicio;
	private JLabel lbl_Div;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPasswordField passwordField;
	private JTextField textCorreo;
	private JTextField textEdad;
	private JLabel lbl_Avatar;
	private JLabel lbl_About;
	private JScrollPane scrollPane_1;
	private JPanel panel_1;
	private JLabel lbl_Password_2;
	private JScrollPane scrollPane_Geek;
	private JTextField textAbout;
	private JButton btnAvatar;
	private JLabel lbl_Intereses;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lbl_Ocupacion;
	private JLabel lbl_Genero;
	private JRadioButton rdbtnFemenino;
	private JRadioButton rdbtnMasculino;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	private JLabel lblfoto;
	private JTextField textCity;
	private JLabel lbl_About_1;
//	private JLabel lbl_Singup;
	
	
	File fichero;
	private JLabel lbl_City;
	
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new FlatGradiantoMidnightBlueIJTheme());
			UIManager.put( "TextComponent.arc", 999 );
			UIManager.put( "Button.arc", 999);
			UIManager.put( "Component.focusWidth", 1 );
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {
		setTitle("Sign Up - Geeknder");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Signup.class.getResource("/images/geeknder/sd/icon_geek.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(-18, -48, 999, 499);
		contentPane.add(scrollPane_1);
		
		panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		panel.setLayout(null);
		
		scrollPane_Geek = new JScrollPane();
		scrollPane_Geek.setBounds(34, 48, 814, 438);
		panel.add(scrollPane_Geek);
		
		panel_1 = new JPanel();
		scrollPane_Geek.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{30, 108, 94, 86, 0, 10, 62, 13, 44, 44, 65, 33, 27, 0};
		gbl_panel_1.rowHeights = new int[]{108, 19, 16, 30, 20, 25, 14, 25, 20, 23, 27, 16, 38, 0, 23, 14, 23, 14, 23, 14, 25, 0, 1, 30, 0, 0, 14, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setBounds(244, 22, 340, 183);
		lbl_logo.setIcon(th.set_Icon_Label("/images/geeknder/sd/logo.png", lbl_logo, 200, 90));
		GridBagConstraints gbc_lbl_logo = new GridBagConstraints();
		gbc_lbl_logo.gridwidth = 4;
		gbc_lbl_logo.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_logo.gridx = 3;
		gbc_lbl_logo.gridy = 0;
		panel_1.add(lbl_logo, gbc_lbl_logo);
		
		lbl_User = new JLabel("�nete a Geeknder");
		lbl_User.setForeground(new Color(95, 158, 160));
		GridBagConstraints gbc_lbl_User = new GridBagConstraints();
		gbc_lbl_User.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_User.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_User.gridwidth = 4;
		gbc_lbl_User.gridx = 3;
		gbc_lbl_User.gridy = 1;
		panel_1.add(lbl_User, gbc_lbl_User);
		lbl_User.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		lbl_User_1 = new JLabel("    Usuario Geeknder");
		GridBagConstraints gbc_lbl_User_1 = new GridBagConstraints();
		gbc_lbl_User_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbl_User_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_User_1.gridwidth = 5;
		gbc_lbl_User_1.gridx = 3;
		gbc_lbl_User_1.gridy = 2;
		panel_1.add(lbl_User_1, gbc_lbl_User_1);
		lbl_User_1.setFont(new Font("Gameplay", Font.PLAIN, 10));
		
		
		
		
		txtNickname = new JTextField();
		GridBagConstraints gbc_txtNickname = new GridBagConstraints();
		gbc_txtNickname.fill = GridBagConstraints.BOTH;
		gbc_txtNickname.insets = new Insets(0, 0, 5, 5);
		gbc_txtNickname.gridwidth = 4;
		gbc_txtNickname.gridx = 3;
		gbc_txtNickname.gridy = 3;
		panel_1.add(txtNickname, gbc_txtNickname);
		txtNickname.putClientProperty("JTextField.placeholderText", "                        Crear un usuario");
		txtNickname.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		txtNickname.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickname.setBackground(Color.decode("#35354b"));
		txtNickname.setColumns(10);
		

		
		lbl_Password = new JLabel("    Correo");
		GridBagConstraints gbc_lbl_Password = new GridBagConstraints();
		gbc_lbl_Password.gridwidth = 5;
		gbc_lbl_Password.anchor = GridBagConstraints.WEST;
		gbc_lbl_Password.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_Password.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Password.gridx = 3;
		gbc_lbl_Password.gridy = 4;
		panel_1.add(lbl_Password, gbc_lbl_Password);
		lbl_Password.setFont(new Font("Gameplay", Font.PLAIN, 10));
		
		textCorreo = new JTextField();
		GridBagConstraints gbc_textCorreo = new GridBagConstraints();
		textCorreo.putClientProperty("JTextField.placeholderText", "                        Ingrese su correo");
		gbc_textCorreo.fill = GridBagConstraints.BOTH;
		gbc_textCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_textCorreo.gridwidth = 4;
		gbc_textCorreo.gridx = 3;
		gbc_textCorreo.gridy = 5;
		panel_1.add(textCorreo, gbc_textCorreo);
		textCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		textCorreo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		textCorreo.setColumns(10);
		textCorreo.setBackground(new Color(53, 53, 75));
		
		JLabel lbl_Password_1 = new JLabel("    Password");
		GridBagConstraints gbc_lbl_Password_1 = new GridBagConstraints();
		gbc_lbl_Password_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_Password_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Password_1.gridx = 3;
		gbc_lbl_Password_1.gridy = 6;
		panel_1.add(lbl_Password_1, gbc_lbl_Password_1);
		lbl_Password_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints(); 
		passwordField.putClientProperty("JTextField.placeholderText", "                       Crear Constrase�a");
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridwidth = 4;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 7;
		panel_1.add(passwordField, gbc_passwordField);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		passwordField.setBackground(new Color(53, 53, 75));
		
		lbl_Avatar = new JLabel("    Avatar");
		GridBagConstraints gbc_lbl_Avatar = new GridBagConstraints();
		gbc_lbl_Avatar.gridwidth = 5;
		gbc_lbl_Avatar.anchor = GridBagConstraints.WEST;
		gbc_lbl_Avatar.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_Avatar.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Avatar.gridx = 3;
		gbc_lbl_Avatar.gridy = 8;
		panel_1.add(lbl_Avatar, gbc_lbl_Avatar);
		lbl_Avatar.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		lbl_About_1 = new JLabel("Edad       ");
		lbl_About_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_About_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_About_1 = new GridBagConstraints();
		gbc_lbl_About_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_About_1.anchor = GridBagConstraints.EAST;
		gbc_lbl_About_1.gridx = 4;
		gbc_lbl_About_1.gridy = 9;
		panel_1.add(lbl_About_1, gbc_lbl_About_1);
		
		lblfoto = new JLabel("Imagen");
		GridBagConstraints gbc_lblfoto = new GridBagConstraints();
		gbc_lblfoto.gridheight = 3;
		gbc_lblfoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblfoto.gridx = 3;
		gbc_lblfoto.gridy = 9;
		panel_1.add(lblfoto, gbc_lblfoto);
		
		btnAvatar = new JButton("Cargar Imagen");
		btnAvatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirArchivo();				
			}
		});
		
		textEdad = new JTextField();
		GridBagConstraints gbc_textEdad = new GridBagConstraints();
		gbc_textEdad.gridwidth = 2;
		textEdad.putClientProperty("JTextField.placeholderText", "   Ingrese su edad");
		gbc_textEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEdad.insets = new Insets(0, 0, 5, 5);
		gbc_textEdad.gridx = 5;
		gbc_textEdad.gridy = 9;
		panel_1.add(textEdad, gbc_textEdad);
		textEdad.setHorizontalAlignment(SwingConstants.CENTER);
		textEdad.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		textEdad.setColumns(10);
		textEdad.setBackground(new Color(53, 53, 75));
		
		lbl_City = new JLabel("Ciudad");
		lbl_City.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_City.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_City = new GridBagConstraints();
		gbc_lbl_City.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_City.gridx = 4;
		gbc_lbl_City.gridy = 11;
		panel_1.add(lbl_City, gbc_lbl_City);
		
		textCity = new JTextField();
		textCity.putClientProperty("JTextField.placeholderText", "    Ciduad actual");
		textCity.setHorizontalAlignment(SwingConstants.CENTER);
		textCity.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		textCity.setColumns(10);
		textCity.setBackground(new Color(53, 53, 75));
		
		GridBagConstraints gbc_textCity = new GridBagConstraints();
		gbc_textCity.gridwidth = 2;
		gbc_textCity.insets = new Insets(0, 0, 5, 5);
		gbc_textCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCity.gridx = 5;
		gbc_textCity.gridy = 11;
		panel_1.add(textCity, gbc_textCity);
		GridBagConstraints gbc_btnAvatar = new GridBagConstraints();
		gbc_btnAvatar.anchor = GridBagConstraints.NORTH;
		gbc_btnAvatar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAvatar.gridx = 3;
		gbc_btnAvatar.gridy = 12;
		panel_1.add(btnAvatar, gbc_btnAvatar);
		
		textAbout = new JTextField(); 
		textAbout.putClientProperty("JTextField.placeholderText", "                            Descripci�n");
		
		lbl_About = new JLabel("Sobre mi ");
		GridBagConstraints gbc_lbl_About = new GridBagConstraints();
		gbc_lbl_About.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_About.gridx = 3;
		gbc_lbl_About.gridy = 13;
		panel_1.add(lbl_About, gbc_lbl_About);
		lbl_About.setFont(new Font("Dialog", Font.PLAIN, 10));
		textAbout.setHorizontalAlignment(SwingConstants.CENTER);
		textAbout.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		textAbout.setColumns(10);
		textAbout.setBackground(new Color(53, 53, 75));
		GridBagConstraints gbc_textAbout = new GridBagConstraints();
		gbc_textAbout.anchor = GridBagConstraints.NORTH;
		gbc_textAbout.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAbout.insets = new Insets(0, 0, 5, 5);
		gbc_textAbout.gridwidth = 4;
		gbc_textAbout.gridx = 3;
		gbc_textAbout.gridy = 14;
		panel_1.add(textAbout, gbc_textAbout);
		
		lbl_Genero = new JLabel("   Genero");
		lbl_Genero.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_Genero = new GridBagConstraints();
		gbc_lbl_Genero.gridwidth = 5;
		gbc_lbl_Genero.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_Genero.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Genero.gridx = 3;
		gbc_lbl_Genero.gridy = 15;
		panel_1.add(lbl_Genero, gbc_lbl_Genero);
		
		rdbtnFemenino = new JRadioButton("Femenino");
		GridBagConstraints gbc_rdbtnFemenino = new GridBagConstraints();
		gbc_rdbtnFemenino.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnFemenino.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFemenino.gridx = 3;
		gbc_rdbtnFemenino.gridy = 16;
		panel_1.add(rdbtnFemenino, gbc_rdbtnFemenino);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		GridBagConstraints gbc_rdbtnMasculino = new GridBagConstraints();
		gbc_rdbtnMasculino.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnMasculino.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMasculino.gridwidth = 2;
		gbc_rdbtnMasculino.gridx = 5;
		gbc_rdbtnMasculino.gridy = 16;
		panel_1.add(rdbtnMasculino, gbc_rdbtnMasculino);
		
		lbl_Ocupacion = new JLabel("    Ocupaci\u00F3n");
		lbl_Ocupacion.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_Ocupacion = new GridBagConstraints();
		gbc_lbl_Ocupacion.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_Ocupacion.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Ocupacion.gridx = 3;
		gbc_lbl_Ocupacion.gridy = 17;
		panel_1.add(lbl_Ocupacion, gbc_lbl_Ocupacion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Solo videojuegos", "Estudio", "Trabajo", "Hogar"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 18;
		panel_1.add(comboBox, gbc_comboBox);
		
		lbl_Intereses = new JLabel("    Intereses");
		lbl_Intereses.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_Intereses = new GridBagConstraints();
		gbc_lbl_Intereses.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_Intereses.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Intereses.gridx = 3;
		gbc_lbl_Intereses.gridy = 19;
		panel_1.add(lbl_Intereses, gbc_lbl_Intereses);
		
		btnNewButton_1 = new JButton("Fornaite");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 20;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton_4 = new JButton("Mario");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 4;
		gbc_btnNewButton_4.gridy = 20;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		btnNewButton_5 = new JButton("Halo");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 5;
		gbc_btnNewButton_5.gridy = 20;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		btnNewButton_6 = new JButton("Halo");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 6;
		gbc_btnNewButton_6.gridy = 20;
		panel_1.add(btnNewButton_6, gbc_btnNewButton_6);
		
		btnNewButton = new JButton("Warzone");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 21;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_3 = new JButton("Apex");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 21;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		btnNewButton_2 = new JButton("Halo");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 5;
		gbc_btnNewButton_2.gridy = 21;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		btnNewButton_7 = new JButton("Halo");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 6;
		gbc_btnNewButton_7.gridy = 21;
		panel_1.add(btnNewButton_7, gbc_btnNewButton_7);
		
		lbl_Password_2 = new JLabel("");
		lbl_Password_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		GridBagConstraints gbc_lbl_Password_2 = new GridBagConstraints();
		gbc_lbl_Password_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbl_Password_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Password_2.gridx = 3;
		gbc_lbl_Password_2.gridy = 22;
		panel_1.add(lbl_Password_2, gbc_lbl_Password_2);
		
		JButton btnLogin = new JButton("Crear Usuario");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.BOTH;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridwidth = 4;
		gbc_btnLogin.gridx = 3;
		gbc_btnLogin.gridy = 23;
		panel_1.add(btnLogin, gbc_btnLogin);
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));

		
		lbl_Inicio = new JLabel("Iniciar Sesi\u00F3n");
		GridBagConstraints gbc_lbl_Inicio = new GridBagConstraints();
		gbc_lbl_Inicio.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Inicio.gridx = 3;
		gbc_lbl_Inicio.gridy = 24;
		panel_1.add(lbl_Inicio, gbc_lbl_Inicio);
		lbl_Inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_Inicio.setForeground(Color.decode("#ff004e"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_Inicio.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main sp = new Main();
				th.center_Screen(sp);
				sp.setVisible(true);
				Signup.this.setVisible(false);
			}
		});
		lbl_Inicio.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(835, 900, 2, 441);
		scrollPane.setViewportBorder(new CompoundBorder());
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane);
		
		lbl_Div = new JLabel("|");
		lbl_Div.setBounds(60, 148, 160, 198);
		contentPane.add(lbl_Div);
		lbl_Div.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		
		
	}
	

	
	
	private void abrirArchivo() {  
		  
		   JFileChooser file=new JFileChooser();
		   file.showOpenDialog(this);
		   File archivo=file.getSelectedFile();
		   if(archivo!=null){    
			try {
		      String Dest = System.getProperty("user.dir")+ "/bin/Image-Users/" + archivo.getName(); //Cambiar el nombreee
		      Path Destino = Paths.get(Dest);
		      String Orig =archivo.getPath();
		      Path Origen =Paths.get(Orig);
		      Files.copy(Origen, Destino);	     
		      lblfoto.setIcon(th.set_Icon_Label("/Image-Users/"+ archivo.getName(), lblfoto, 95, 90));
		      lblfoto.setText("");
		    }  catch(IOException ex)
			   {
			     JOptionPane.showMessageDialog(null,ex+"" +
			           "\nNo se ha encontrado el archivo",
			                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			    }  
		   }
		 
		}
	
	
	
}





