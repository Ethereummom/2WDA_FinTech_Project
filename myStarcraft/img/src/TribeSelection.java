import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;

class TribeSelection extends JFrame implements ActionListener
{
	JFrame LoadingFrame;
	JPanel LoadingPanel;
	JPanel panel;
	JLabel LoadingLB;

	JComboBox UserTribe;
	JComboBox ComTribe;
	JButton Start;
	JLabel UserLB;
	JLabel ComLB;
	
	StarUI User, Com;
	TribeSelection()
	{
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		LoadingFrame = new JFrame();
		LoadingFrame.setTitle("Now Starcraft Loading...");
		LoadingFrame.setBounds(250,120,700,700);
		LoadingFrame.setResizable(false);
		LoadingPanel = new JPanel(){ImageIcon i = new ImageIcon("img/Loading.jpg");	
    		public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);
    		}
		};
		LoadingLB = new JLabel();
		LoadingLB.setOpaque(false);
		LoadingLB.setFont(new Font("Dialog.plain", 0, 14));
		LoadingLB.setHorizontalAlignment(SwingConstants.CENTER);
		LoadingLB.setForeground(new Color(200,200,238));
		LoadingLB.setBounds(310,570,60,15);
		LoadingPanel.add(LoadingLB);
		
		
		
		LoadingPanel.setLayout(null);
		LoadingFrame.getContentPane().add(LoadingPanel, BorderLayout.CENTER);
		LoadingFrame.setVisible(true);
		for(int i =0;i<4;i++){
			LoadingLB.setText("Loading");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LoadingLB.setText("");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		LoadingFrame.setVisible(false);
		setTitle("TribeSelection");
		setBounds(314, 202, 389, 382);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("img/tribeselection.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 389, 382, null);
			}
		};
		panel.setLayout(null);

		makeComponent();

		getContentPane().add(panel, BorderLayout.CENTER);
		Start.addActionListener(this);
		
	}

	public void makeComponent()
	{
		UserTribe = new JComboBox();
		UserTribe.addItem("Random");
		UserTribe.addItem("Terran");
		UserTribe.addItem("Protoss");
		UserTribe.addItem("Zerg");
		UserTribe.setBounds(200, 140, 80, 20);
		panel.add(UserTribe);

		ComTribe = new JComboBox();
		ComTribe.addItem("Random");
		ComTribe.addItem("Terran");
		ComTribe.addItem("Protoss");
		ComTribe.addItem("Zerg");
		ComTribe.setBounds(200, 200, 80, 20);
		panel.add(ComTribe);

		Start = new JButton(){ImageIcon i = new ImageIcon("img/Okbutton.jpg");
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, 127, 22, null);
		}
	};
		Start.setText("Start");
		Start.setBounds(140, 300, 127, 22);
		panel.add(Start);

		UserLB = new JLabel(){ImageIcon i = new ImageIcon("img/UserLB.jpg");
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, 70, 20, null);
		}
	};
		UserLB.setText("User");
		UserLB.setOpaque(false);
		UserLB.setForeground(new Color(200,200,238));
		UserLB.setBounds(110, 140, 70, 20);
		panel.add(UserLB);

		ComLB = new JLabel(){ImageIcon i = new ImageIcon("img/ComputerLB.jpg");
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, 70, 20, null);
		}
	};
		ComLB.setText("Com");
		ComLB.setOpaque(false);
		ComLB.setForeground(new Color(200,200,238));
		ComLB.setBounds(110, 200, 70, 20);
		panel.add(ComLB);
	}

	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		if(e.getSource()==Start){
			if(UserTribe.getSelectedItem()=="Terran")
				User = new StarUI(0, "User");				
			
			else if(UserTribe.getSelectedItem()=="Protoss")
				User = new StarUI(1, "User");				
			
			else if(UserTribe.getSelectedItem()=="Zerg")
				User = new StarUI(2, "User");				
							
			else
				User = new StarUI(rand.nextInt(3),"User");
			
			
			
			if(ComTribe.getSelectedItem()=="Terran")
				Com = new StarUI(0, "Computer");				
			
			else if(ComTribe.getSelectedItem()=="Protoss")
				Com = new StarUI(1, "Computer");				
			
			else if(ComTribe.getSelectedItem()=="Zerg")
				Com = new StarUI(2, "Computer");
							
			else
				Com = new StarUI(rand.nextInt(3),"Computer");
			
			User.setBounds(0, 58, 640, 650);
			User.setVisible(true);
			User.setEnemy(Com);
			Com.setBounds(640, 58, 640, 650);
			Com.setVisible(true);
			Com.setEnemy(User);
		}		
	}
	
	public static void main(String[] args)
	{
		TribeSelection start = new TribeSelection();
		start.setVisible(true);
	}
}
