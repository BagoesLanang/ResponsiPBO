package view;

import model.Admin;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    public LoginPage(){
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        
        JLabel userLabel = new JLabel("Username: ");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password: ");
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");
                
        add(userLabel);add(userField);
        add(passLabel);add(passField);
        add(new JLabel()); add (loginBtn);
        
        loginBtn.addActionListener(e -> {Admin admin = new Admin();
        if (admin.login(userField.getText(),new String(passField.getPassword()))){
            dispose();
            new RentalPage();
        }else {
            JOptionPane.showMessageDialog(this,  "Username atau Password Salah !");
        }
        });
        
        setVisible(true);
    }
}
