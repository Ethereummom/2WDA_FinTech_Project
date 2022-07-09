package Test;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class JoinFrame extends JFrame {
   private JPanel contentPane;
   private JLabel lblJoin;
   private JButton joinCompleteBtn;
   private JTextField tfUsername;
   private JTextField tfPassword;
   private JTextField tfName;
   private JTextField tfEmail;
   private JTextField tfPhone;
   
   private static String uid, upw, uname;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               JoinFrame frame = new JoinFrame();
               
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public JoinFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(430, 490);
      setLocationRelativeTo(null);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      lblJoin = new JLabel("회원가입");
      Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
      lblJoin.setFont(f1); 
      lblJoin.setBounds(159, 41, 101, 20);
      contentPane.add(lblJoin);
      
      JLabel label = new JLabel("UserID");
      label.setBounds(69, 113, 69, 20);
      contentPane.add(label);
      
      JLabel lblUsername = new JLabel("Password");
      lblUsername.setBounds(69, 163, 69, 20);
      contentPane.add(lblUsername);
      
      JLabel lblName = new JLabel("Name");
      lblName.setBounds(69, 210, 69, 20);
      contentPane.add(lblName);
      

      
      tfUsername = new JTextField();
      tfUsername.setColumns(10);
      tfUsername.setBounds(159, 106, 186, 35);
      contentPane.add(tfUsername);
      
      tfPassword = new JPasswordField();
      tfPassword.setColumns(10);
      tfPassword.setBounds(159, 156, 186, 35);
      contentPane.add(tfPassword);
      
      tfName = new JTextField();
      tfName.setColumns(10);
      tfName.setBounds(159, 203, 186, 35);
      contentPane.add(tfName);
      

      
      joinCompleteBtn = new JButton("회원가입완료");
      joinCompleteBtn.setBounds(206, 363, 139, 29);
      contentPane.add(joinCompleteBtn);
      
      setVisible(true);
      //회원가입완료 액션
      joinCompleteBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 uid = tfUsername.getText();
        	 upw = tfPassword.getText();
        	 uname = tfName.getText();
        	 addUserInfo a = new addUserInfo();
             a.addUSER(uid, upw, uname);
             dispose();
             LoginFrame start = new LoginFrame();
             start.setVisible(true);
            
         }
      });
   }
}