import screens.MainScreen;

import javax.swing.*;

public class NewsReader {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        MainScreen mainScreen = new MainScreen("News Reader");
        mainScreen.display();
    }
}
