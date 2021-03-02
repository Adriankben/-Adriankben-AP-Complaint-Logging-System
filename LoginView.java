package com.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;


public class LoginView extends JFrame implements ActionListener, ItemListener
{
    private JLabel lblUsername, lblPassword, lblUsertype;
    private JTextField txtUsername;
    private JPasswordField pswdField;
    private JButton btnLogin;
    private JPanel panWhole;
    private JComboBox<String> comboBox;
    String[] countries = {"Customer","Employee"};
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public LoginView ()
    {
        initializeComponents();
        setPanelsProperties();
        addComponentsToPanels();
        addPanelsToWindow();
        setWindowProperties();
        registerListeners();
    }

    private void initializeComponents ()
    {
        lblUsername = new JLabel("Customer ID");
        lblPassword = new JLabel("Password: ");
        lblUsertype = new JLabel("User Type: ");

        txtUsername = new JTextField();
        pswdField = new JPasswordField();
        comboBox = new JComboBox<>(countries);

        btnLogin = new JButton("Login");
        panWhole = new JPanel();
    }

    private void setPanelsProperties ()
    {
        panWhole.setLayout(null);

        lblUsertype.setBounds(10, 40, 80, 25);
        comboBox.setBounds(100, 40, 165, 25);

        lblUsername.setBounds(10, 80, 80, 25);
        txtUsername.setBounds(100, 80, 165, 25);

        lblPassword.setBounds(10, 120, 80, 25);
        pswdField.setBounds(100, 120, 165, 25);

        btnLogin.setBounds(100, 160, 80, 25);
    }

    private void addComponentsToPanels ()
    {
        panWhole.add(lblUsername);
        panWhole.add(lblPassword);
        panWhole.add(lblUsertype);

        panWhole.add(txtUsername);
        panWhole.add(pswdField);
        panWhole.add(comboBox);

        panWhole.add(btnLogin);
    }

    private void addPanelsToWindow ()
    {
        this.add(panWhole);
    }

    private void setWindowProperties ()
    {
        this.setSize(350, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Login Screen");
    }

    private void registerListeners ()
    {
        comboBox.addItemListener(this);
        btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnLogin)
        {
            String uName = txtUsername.getText();
            String pWord = String.valueOf(pswdField.getPassword());
            //String option = comboBox.getSelectedItem().toString();


            System.out.println(uName + " " + pWord);
            try
            {
                String query = "SELECT * FROM user WHERE idnum=? and password=?";

                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/multiuserlogin","root","Hol935go.54");
                pst = con.prepareStatement(query);
                pst.setString(1, uName);
                pst.setString(2, pWord);
                rs = pst.executeQuery();
                if (rs.next())
                {

                    JOptionPane.showMessageDialog(this, "Credentials valid. You are logged in as " + rs.getString("usertype"));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Credentials invalid. Try again");
                }
            }
            catch (SQLException throwables)
            {
                JOptionPane.showMessageDialog(this, throwables.getMessage());
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        new LoginView();
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        switch (comboBox.getSelectedIndex()+1)
        {
            case 1: lblUsername.setText("Customer ID:");
            break;

            case 2: lblUsername.setText("Employee ID:");
                break;
        }

    }
}
