package screens;

import javax.swing.*;

public class LoginScreen extends JFrame {

    public LoginScreen() {
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pack();
    }

    public void display() {
        setVisible(true);
    }
}
