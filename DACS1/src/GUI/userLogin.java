package GUI;
import javax.swing.*;
import java.awt.event.*;

public class userLogin extends JFrame {
    private JPanel mainPanel;
    private JLabel welcomeField;
    private JTextField userNameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel logoLabel;
    private JButton singUpButton;
    private JLabel singUpLabel;
    private JLabel userIcon;
    private JLabel hideIcon;
    private JLabel showIcon;


    public userLogin(){
        init();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=userNameField.getText();
                String password= String.valueOf(passwordField.getPassword());
                if(username.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(userLogin.this, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else{

                }
            }
        });
        hideIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setEchoChar((char)0);
                hideIcon.setVisible(false);
                hideIcon.setEnabled(false);
                showIcon.setVisible(true);
                showIcon.setEnabled(true);

            }
        });
        showIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setEchoChar('\u2022');
                showIcon.setVisible(false);
                showIcon.setEnabled(false);
                hideIcon.setVisible(true);
                hideIcon.setVisible(true);
            }
        });
        singUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new userRegster().setVisible(true);

            }
        });
    }
    public void init() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        userNameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userNameField.getText().equals("User name")) {
                    userNameField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (userNameField.getText().equals("")) {
                    userNameField.setText("User name");
                }
            }
        });
        passwordField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (passwordField.getText().equals("Password")) {
                    passwordField.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (passwordField.getText().equals("")) {
                    passwordField.setText("Password");
                }
            }
        });
    }
    public static void main(String[] args) {
            new userLogin().setVisible(true);
    }
}
