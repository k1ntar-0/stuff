package part_1; // or your actual package

import javax.swing.*;

public class Welcome extends JFrame {

    private static final long serialVersionUID = 1L;
    public Welcome(String username) {
        setTitle("Welcome");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Welcome, " + username + "!", SwingConstants.CENTER);
        add(label);
    }

    Welcome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    
