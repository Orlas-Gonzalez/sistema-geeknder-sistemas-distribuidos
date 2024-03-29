package view.geeknder.sd;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;

import controller.geeknder.sd.the_hub_geeknder;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Main extends JFrame {

	private JPanel contentPane;

	private static the_hub_geeknder th = new the_hub_geeknder();
	private JTextField txtNickname;
	private JPasswordField psd_Password;
	private JLabel lbl_User;
	private JLabel lbl_icon_logo;
	private JLabel lbl_Password;
	private JLabel lbl_icon_pass;
	private JLabel lbl_Pass_Forgot;
	private JLabel lbl_Div;
	private JLabel lbl_Singup;
	
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
					Main frame = new Main();
					th.center_Screen(frame);
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/geeknder/sd/icon_geek.png")));
		setTitle("Sign In - Geeknder");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setBounds(244, 22, 350, 190);
		lbl_logo.setIcon(th.set_Icon_Label("/images/geeknder/sd/logo.png", lbl_logo, 350, 190));
		contentPane.add(lbl_logo);
		
		txtNickname = new JTextField();
		txtNickname.putClientProperty("JTextField.placeholderText", "             Ingresar Usuario Geeknder");
		txtNickname.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		txtNickname.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickname.setBounds(273, 253, 300, 30);
		txtNickname.setBackground(Color.decode("#35354b"));
		contentPane.add(txtNickname);
		txtNickname.setColumns(10);
		
		psd_Password = new JPasswordField();
		psd_Password.putClientProperty("JTextField.placeholderText", "                 Ingrese Su Contraseņa");
		psd_Password.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		psd_Password.setHorizontalAlignment(SwingConstants.CENTER);
		psd_Password.setBounds(273, 315, 300, 30);
		psd_Password.setBackground(Color.decode("#35354b"));
		contentPane.add(psd_Password);
		
		lbl_User = new JLabel("Usuario GEEKNDER");
		lbl_User.setFont(new Font("Gameplay", Font.PLAIN, 14));
		lbl_User.setBounds(285, 232, 162, 14);
		contentPane.add(lbl_User);
		
		lbl_icon_logo = new JLabel("");
		lbl_icon_logo.setBounds(452, 232, 14, 14);
		lbl_icon_logo.setIcon(th.set_Icon_Label("/images/geeknder/sd/user_geek.png", lbl_icon_logo, 14, 14));
		contentPane.add(lbl_icon_logo);
		
		lbl_Password = new JLabel("Password Geeknder");
		lbl_Password.setFont(new Font("Gameplay", Font.PLAIN, 14));
		lbl_Password.setBounds(285, 294, 190, 14);
		contentPane.add(lbl_Password);
		
		lbl_icon_pass = new JLabel("");
		lbl_icon_pass.setBounds(473, 294, 14, 14);
		lbl_icon_pass.setIcon(th.set_Icon_Label("/images/geeknder/sd/lock_geek.png", lbl_icon_pass, 14, 14));
		contentPane.add(lbl_icon_pass);
		
		JButton btnLogin = new JButton("Iniciar Sesi\u00F3n");
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		btnLogin.setBounds(273, 351, 300, 30);
		contentPane.add(btnLogin);
		
		lbl_Pass_Forgot = new JLabel("Olvide Mi Contrase\u00F1a");
		lbl_Pass_Forgot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_Pass_Forgot.setForeground(Color.decode("#ff004e"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_Pass_Forgot.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Estas En Olvide Mi Contraseņa");
			}
		});
		lbl_Pass_Forgot.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		lbl_Pass_Forgot.setBounds(314, 392, 122, 14);
		contentPane.add(lbl_Pass_Forgot);
		
		lbl_Div = new JLabel("|");
		lbl_Div.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		lbl_Div.setBounds(441, 392, 3, 14);
		contentPane.add(lbl_Div);
		
		lbl_Singup = new JLabel("Registrarme");
		lbl_Singup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_Singup.setForeground(Color.decode("#0039ff"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_Singup.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Signup sp = new Signup();
				th.center_Screen(sp);
				sp.setVisible(true);
				Main.this.setVisible(false);
			}
		});
		lbl_Singup.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		lbl_Singup.setBounds(452, 392, 74, 14);
		contentPane.add(lbl_Singup);
	}
}
