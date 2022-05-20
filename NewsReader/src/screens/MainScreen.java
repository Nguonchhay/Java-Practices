package screens;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {

    public MainScreen(String title) {
        super(title);
        setLayout(new GridLayout(3, 1));
        initMenuBar();
        initContent();
    }

    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // Menu
        JMenu menuFile = new JMenu("File");
        JMenu menuManage = new JMenu("Manage");
        JMenu menuAbout = new JMenu("About");
        menuBar.add(menuFile);
        menuBar.add(menuManage);
        menuBar.add(menuAbout);

        // Menu Items
        JMenuItem itemSave = new JMenuItem("Save Filter");
        JMenuItem itemQuit = new JMenuItem("Quit");
        menuFile.add(itemSave);
        menuFile.add(itemQuit);

        super.add(menuBar);
    }

    private void initContent() {
        JPanel pContent = new JPanel();
    }
}
