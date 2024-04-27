package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userRegster extends JFrame{
    private JTextField nameTextField;
    private JTextField phoneTextField;
    private JTextField cccdTextField;
    private JTextField emailTextField;
    private JPanel mainPanel;
    private JButton continueButton;
    private JLabel registerLabel;
    private JLabel stepLabel;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel cccdLabel;
    private JLabel emailLabel;
    private JLabel logo;

    public userRegster(){
        setContentPane(mainPanel);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=nameTextField.getText();
                String phoneNumber=phoneTextField.getText();
                String cccd=cccdTextField.getText();
                String email=emailTextField.getText();
                if(name.isEmpty() || phoneNumber.isEmpty() || cccd.isEmpty() || email.isEmpty()){
                    JOptionPane.showMessageDialog(userRegster.this, "Please enter all the field!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{

                }

            }
        });

    }

    public static void main(String[] args) {
        new userRegster().setVisible(true);
    }
}
