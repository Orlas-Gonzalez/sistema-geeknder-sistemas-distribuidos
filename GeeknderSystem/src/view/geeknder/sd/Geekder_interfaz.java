package view.geeknder.sd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;

import controller.geeknder.sd.the_hub_geeknder;

import javax.swing.JScrollPane;
import java.awt.Insets;


import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Color;

public class Geekder_interfaz extends JFrame {

	private JPanel contentPane;

	private JButton btnNewButton_7;
	
	private static the_hub_geeknder th = new the_hub_geeknder();

	/**
	 * Launch the application.
	 */
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
					Geekder_interfaz frame = new Geekder_interfaz();
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
	public Geekder_interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/geeknder/sd/icon_geek.png")));
		setTitle("Geeknder");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 480);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbed_psta�as = new JTabbedPane(JTabbedPane.TOP);
		tabbed_psta�as.setBounds(0, 0, 842, 451);
		contentPane.add(tabbed_psta�as);
		
		JPanel Panel_Match = new JPanel();
		tabbed_psta�as.addTab("Match", null, Panel_Match, null);
		Panel_Match.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 300, 2, 2);
		Panel_Match.add(scrollPane);
		
		JLabel Imagen_Usuario = new JLabel("Image");
		Imagen_Usuario.setBounds(181, 47, 215, 201);
		Panel_Match.add(Imagen_Usuario);
		
		JLabel lbl_Usuario = new JLabel("Usuario:");
		lbl_Usuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_Usuario.setBounds(436, 59, 64, 17);
		Panel_Match.add(lbl_Usuario);
		
		JLabel lbl_Edad = new JLabel("Edad:");
		lbl_Edad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_Edad.setBounds(436, 96, 64, 17);
		Panel_Match.add(lbl_Edad);
		
		JLabel lbl_Interes = new JLabel("Intereses:");
		lbl_Interes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_Interes.setBounds(436, 140, 78, 17);
		Panel_Match.add(lbl_Interes);
		
		JLabel lbl_descripcion = new JLabel("Descripci\u00F3n:");
		lbl_descripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_descripcion.setBounds(436, 179, 86, 17);
		Panel_Match.add(lbl_descripcion);

		
		JLabel lbl_Usuario_Geeknder = new JLabel("");
		lbl_Usuario_Geeknder.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbl_Usuario_Geeknder.setBounds(499, 61, 46, 14);
		Panel_Match.add(lbl_Usuario_Geeknder);
		
		JLabel lbl_Edad_Geeknder = new JLabel("");
		lbl_Edad_Geeknder.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbl_Edad_Geeknder.setBounds(481, 99, 46, 14);
		Panel_Match.add(lbl_Edad_Geeknder);
		
		JLabel lbl_Intereses_Geeknder = new JLabel("");
		lbl_Intereses_Geeknder.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbl_Intereses_Geeknder.setBounds(514, 143, 302, 25);
		Panel_Match.add(lbl_Intereses_Geeknder);
		
		JLabel lbl_Descripcion_Geeknder = new JLabel("");
		lbl_Descripcion_Geeknder.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lbl_Descripcion_Geeknder.setBounds(524, 179, 291, 47);
		Panel_Match.add(lbl_Descripcion_Geeknder);
		
		JLabel Label_Match = new JLabel("");
		Label_Match.setBounds(576, 235, 64, 37);
		Label_Match.setIcon(th.set_Icon_Label("/images/geeknder/sd/controller_geek.png", Label_Match, 62, 37));
		
		Panel_Match.add(Label_Match);
		
		
		btnNewButton_7 = new JButton("");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 6;
		gbc_btnNewButton_7.gridy = 29;
		Panel_Match.add(btnNewButton_7, gbc_btnNewButton_7);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(-16, 211, 519, 212);
		Panel_Match.add(canvas);
		
		JPanel Panel_Chats = new JPanel();
		tabbed_psta�as.addTab("Chats", null, Panel_Chats, null);
		Panel_Chats.setLayout(null);
		
		Label Label_User_Chat = new Label("Nombre usuario");
		Label_User_Chat.setBackground(new Color(72, 61, 139));
		Label_User_Chat.setBounds(348, 16, 107, 22);
		Panel_Chats.add(Label_User_Chat);
		
		Label Label_Ultimo_Mensaje = new Label("Hola mundo");
		Label_Ultimo_Mensaje.setBackground(new Color(72, 61, 139));
		Label_Ultimo_Mensaje.setBounds(403, 44, 172, 22);
		Panel_Chats.add(Label_Ultimo_Mensaje);
		
		Button button = new Button("");
		button.setBackground(new Color(72, 61, 139));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(257, 10, 333, 66);
		Panel_Chats.add(button);
		
		Label label_User_Foto = new Label("Imagen");
		label_User_Foto.setBounds(277, 16, 50, 50);
		Panel_Chats.add(label_User_Foto);
		
		JPanel Panel_Publicaciones = new JPanel();
		tabbed_psta�as.addTab("New tab", null, Panel_Publicaciones, null);
	
	}
}
