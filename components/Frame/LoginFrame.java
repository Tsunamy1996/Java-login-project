package components.Frame;

import javax.swing.JFrame;

public class LoginFrame {

	JFrame frame;

	public LoginFrame() {
		frame = new JFrame("Login Frame");
		frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
	}

}
