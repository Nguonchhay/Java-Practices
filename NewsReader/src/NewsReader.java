import screens.MainScreen;

import javax.swing.*;

public class NewsReader {
    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen("News Reader");
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainScreen.pack();
        mainScreen.setVisible(true);
    }
}
