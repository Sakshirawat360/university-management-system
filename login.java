package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JTextField textFieldName;
    JPasswordField passwordField;
    JButton Login,back;
    login(){

        JLabel labelname = new JLabel("Username");
        labelname.setBounds(40,20,100,20);
        add(labelname);

        textFieldName = new JTextField();
        textFieldName.setBounds(150,20,150,20);
        add(textFieldName);

        JLabel labelpass = new JLabel("Password");
        labelpass.setBounds(40,70,100,20);
        add(labelpass);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,20);
        add(passwordField);

        Login = new JButton("Login");
        Login.setBounds(40,140,120,30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.addActionListener(this);
        add(Login);

        back = new JButton("back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/user.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);

        ImageIcon ia = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpeg"));
        Image ib = ia.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon ic = new ImageIcon(ib);
        JLabel image = new JLabel(ic);
        image.setBounds(0,0,600,300);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Login){

        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
