package Test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class StarLogin extends JFrame{
   private JPanel contentPane;
   private JTextField tfUsername, tfPassword;
   private JButton loginBtn, joinBtn;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               StarLogin frame = new StarLogin();
               
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public StarLogin() {
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
      
      tfPassword = new JTextField();
      tfPassword.setColumns(10);
      tfPassword.setBounds(157, 103, 176, 35);
      contentPane.add(tfPassword);
      
      setVisible(true);
      //회원가입 액션
      joinBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            JoinFrame frame = new JoinFrame();
         }
      });

   }
}