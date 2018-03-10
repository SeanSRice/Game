import java.awt.Component;

import javax.swing.JFrame;

public class VideoGameFrame {

	public static void main(String[] args) {
		JFrame gf = new JFrame("Sean/Charlie Video Game");
		gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VideoGamePanel vgp = new VideoGamePanel();
		
		gf.getContentPane().add(vgp);
		gf.pack();
		gf.setVisible(true);
	}

}
