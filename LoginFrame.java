/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.ul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author 001
 */
public class LoginFrame extends JFrame{
    //panel
    private JPanel headingPnl;
    private JPanel loginPnl;
    private JPanel usernamePnl;
    private JPanel passPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    //Label
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passLbl;
    //Text field
    private JTextField usernameTxtFld;
    //passwordField
    private JPasswordField passPassFld;
    //Buttons
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public LoginFrame() {
        
        setTitle("Login page");
        setSize(700, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create the panel
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        loginPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        loginPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login details"));
        
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        passPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        mainPnl = new JPanel(new BorderLayout());
        
        //create label's
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.red);
        
        usernameLbl = new JLabel("Username: ");
        
        passLbl = new JLabel("Password: ");
        
        //create text field
        usernameTxtFld = new JTextField(8);
        usernameTxtFld.setFocusable(true);
        
        //create password field
        passPassFld = new JPasswordField(8);
        
        //create buttons
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add all component to panel's
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passPnl.add(passLbl);
        passPnl.add(passPassFld);
        
        loginPnl.add(usernamePnl);
        loginPnl.add(passPnl);
        
        btnPnl.add(submitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //add panel's to mainPanel
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(loginPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add mainPanel to frame panel
        add(mainPnl);
        
        pack();
        
        setVisible(true);
    }
}
