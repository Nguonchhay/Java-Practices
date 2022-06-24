package screens;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {

    public MainScreen(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pack();
        initMenuBar();
        initContent();
    }

    public void display() {
        setVisible(true);
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
        itemQuit.addActionListener(e -> {
            super.dispose();
        });
        menuFile.add(itemSave);
        menuFile.add(itemQuit);

        super.setJMenuBar(menuBar);
    }

    private void initContent() {
        JPanel pContent = new JPanel();

        JPanel lContent = new JPanel();
        DefaultListModel<String> newsData = new DefaultListModel<>();
        newsData.addElement("AA");
        newsData.addElement("AA");
        newsData.addElement("AA");
        JList listNews = new JList(newsData);
        lContent.add(listNews);

        JPanel rContent = new JPanel();
        rContent.setLayout(new BoxLayout(rContent, BoxLayout.Y_AXIS));
        JLabel lblTitle = new JLabel("News Title");

        rContent.add(lblTitle);

        pContent.add(lContent);
        pContent.add(rContent);
        pContent.setLayout(new BoxLayout(pContent, BoxLayout.X_AXIS));

        super.add(pContent);
    }
}
