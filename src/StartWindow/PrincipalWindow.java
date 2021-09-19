package StartWindow;

import javax.swing.*;

public class PrincipalWindow extends JFrame{
    private JButton jugarButton;
    private JTextField namePlayerField;
    private JPanel mainPanel;

    public PrincipalWindow() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        PrincipalWindow widnow = new PrincipalWindow();
    }
}
