package controller.geeknder.sd;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class the_hub_geeknder {
	
	public void center_Screen(JFrame frm) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frm.setLocation(dim.width/2-frm.getSize().width/2, dim.height/2-frm.getSize().height/2);
	}
	
	public Icon set_Icon_Label(String url, JLabel icon_label, int w, int h) {
		ImageIcon imgIcon = new ImageIcon(getClass().getResource(url));
		ImageIcon imgScale = new ImageIcon(imgIcon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH));
		return imgScale;
	}
}
