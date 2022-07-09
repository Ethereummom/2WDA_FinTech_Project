package Test;

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
	JButton Start;
	JLabel UserLB;
	JLabel ComLB;
	
	private JButton updateBtn, deleteBtn;
	static String uid, upw, uname;
	
	StarUI User;
	TribeSelection()
	{
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		LoadingFrame = new JFrame();
		LoadingFrame.setTitle("Now Starcraft Loading...");
		LoadingFrame.setBounds(250,120,600,400);
		LoadingFrame.setResizable(false);
		LoadingPanel = new JPanel(){ImageIcon i = new ImageIcon("img/Loading.jpg");	
    		public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 600, 400, null);
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
		setBounds(314, 202, 600, 400);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("img/tribeselection.jpg");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 600, 400, null);
			}
		};
		panel.setLayout(null);

		makeComponent();

		getContentPane().add(panel, BorderLayout.CENTER);
		Start.addActionListener(this);
		
	}

	public void makeComponent() {
		UserTribe = new JComboBox();
		UserTribe.addItem("Terran");
		UserTribe.setBounds(300, 140, 80, 20);
		panel.add(UserTribe);


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
		
		updateBtn = new JButton("정보수정");
		updateBtn.setBounds(400, 250, 104, 29);
		panel.add(updateBtn);

		deleteBtn = new JButton("회원탈퇴");
		deleteBtn.setBounds(400, 300, 106, 29);
		panel.add(deleteBtn);
		
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addUserInfo userinfo = new addUserInfo();
				userinfo.deleteUser(uid);
				JOptionPane.showMessageDialog(null, "탈퇴하였습니다.");
				dispose();
			}
		});
		
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UpdateFrame uf = new UpdateFrame();
				uf.uid = uid;
				uf.setVisible(true);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		if(e.getSource()==Start){
			if(UserTribe.getSelectedItem()=="Terran")
				User = new StarUI(0, "User");				
			
			User.setBounds(0, 58, 640, 650);
			User.setVisible(true);
		}		
	}
	
}
