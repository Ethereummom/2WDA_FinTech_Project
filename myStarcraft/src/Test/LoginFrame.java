package Test;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {
	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn, quitBtn, changeBtn;
	private static String uid, upw, uname;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("username");
		lblLogin.setBounds(41, 52, 69, 35);
		contentPane.add(lblLogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(41, 103, 69, 35);
		contentPane.add(lblPassword);

		tfUsername = new JTextField();
		tfUsername.setBounds(157, 52, 176, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		joinBtn = new JButton("회원가입");
		joinBtn.setBounds(229, 154, 104, 29);
		contentPane.add(joinBtn);

		loginBtn = new JButton("로그인");
		loginBtn.setBounds(108, 154, 106, 29);
		contentPane.add(loginBtn);

		

		tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(157, 103, 176, 35);
		contentPane.add(tfPassword);

		setVisible(true);
		// 회원가입 액션
		joinBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JoinFrame frame = new JoinFrame();

			}
		});

		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addUserInfo a = new addUserInfo();
				try {
					String passwd = a.seleUSER(tfUsername.getText());
					if (tfPassword.getText().equals(passwd)) {
						uid = tfUsername.getText();
						upw = tfPassword.getText();
						dispose();
						TribeSelection start = new TribeSelection();
						start.uid = uid;
						start.upw = upw;
						start.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다.");
						dispose();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

	}
}