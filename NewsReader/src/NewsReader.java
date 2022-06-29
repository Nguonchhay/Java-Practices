import screens.LoginScreen;
import screens.MainScreen;

import javax.swing.*;

public class NewsReader {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        MainScreen mainScreen = new MainScreen("News Reader");
        mainScreen.display();
//        LoginScreen loginScreen = new LoginScreen();
//        loginScreen.display();
    }
}
