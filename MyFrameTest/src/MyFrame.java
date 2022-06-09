import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
		
	}

}
