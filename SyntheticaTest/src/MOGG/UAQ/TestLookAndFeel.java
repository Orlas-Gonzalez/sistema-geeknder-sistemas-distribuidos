package MOGG.UAQ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

//import com.formdev.flatlaf.FlatDarkLaf;
//import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;

//import de.javasoft.synthetica.dark.SyntheticaDarkLookAndFeel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TestLookAndFeel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		//UIManager.setLookAndFeel(new SyntheticaDarkLookAndFeel());
		//UIManager.setLookAndFeel(new FlatDarkLaf());
		UIManager.setLookAndFeel(new FlatGradiantoDarkFuchsiaIJTheme());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLookAndFeel frame = new TestLookAndFeel();
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
	public TestLookAndFeel() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Hola como estas perra");
		btnNewButton.setBounds(111, 104, 199, 38);
		contentPane.add(btnNewButton);
	}
}
