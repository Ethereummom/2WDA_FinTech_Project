package Test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UpdateFrame extends JFrame {
	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;

	static String uid, newPW = null, newName = null;

	/*
	 * Create the frame.
	 */
	public UpdateFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("정보수정");
		Font f1 = new Font("돋움", Font.BOLD, 20); // 궁서 바탕 돋움
		lblJoin.setFont(f1);
		lblJoin.setBounds(159, 41, 101, 50);
		contentPane.add(lblJoin);

		JLabel label = new JLabel("UserID");
		label.setBounds(69, 113, 69, 20);
		contentPane.add(label);

		JLabel lbPW = new JLabel("new PW");
		lbPW.setBounds(69, 163, 69, 20);
		contentPane.add(lbPW);

		JLabel lblName = new JLabel("new name");
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);

		JLabel labeluid = new JLabel(uid);
		labeluid.setBounds(159, 106, 186, 35);
		contentPane.add(labeluid);

		tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(159, 156, 186, 35);
		contentPane.add(tfPassword);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(159, 203, 186, 35);
		contentPane.add(tfName);

		joinCompleteBtn = new JButton("정보수정완료");
		joinCompleteBtn.setBounds(206, 363, 139, 29);
		contentPane.add(joinCompleteBtn);

		setVisible(true);

// 회원 정보 수정 액션
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				newPW = tfPassword.getText();
				newName = tfName.getText();

				addUserInfo aui = new addUserInfo();
				if (newPW.equals("")) 				// 회원정보 수정란에 새비밀번호가 비어있다면
					aui.updateName(uid, newName);	// 이름만 변경
				else if (newName.equals(""))		// 이름이 비어있다면
					aui.updatePW(uid, newPW);		// 비밀번호만 변경
				else {								// 아니라면 둘다 변경
					aui.updateName(uid, newName);
					aui.updatePW(uid, newPW);
				}
					
				JOptionPane.showMessageDialog(null, "수정 완료했습니다.");
				dispose();

			}
		});
	}
}