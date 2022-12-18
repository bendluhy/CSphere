package me.bendluhy.gfx.core;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Window {
    JFrame frame;
    JTextArea text;

    public Window(float version)
    {
        FlatDarculaLaf.setup();
        frame = new JFrame("CSphere V" + version);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initMenu();
        text = new JTextArea(10, 10);
        text.setBackground(Color.gray);
        frame.add(text);
        frame.setVisible(true);

    }

    public void initMenu()
    {
        JMenuBar menuBar = new JMenuBar();


        //Save Group
        JMenu filemenu = new JMenu("File");
        filemenu.setMnemonic(KeyEvent.VK_A);
        filemenu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(filemenu);

        //Edit Group
        JMenu editmenu = new JMenu("Edit");
        filemenu.setMnemonic(KeyEvent.VK_A);
        filemenu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(editmenu);

        JMenuItem savemenu = new JMenuItem("Save");
        savemenu.setMnemonic(KeyEvent.VK_S);
        filemenu.add(savemenu);

        frame.setJMenuBar(menuBar);
    }
}
