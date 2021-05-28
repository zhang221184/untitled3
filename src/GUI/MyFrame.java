package GUI;

import GUI.sin.GraphicPanel;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

    }

    public MyFrame(String s) {
        super(s);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }
}

