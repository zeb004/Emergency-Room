
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zak
 */
public class NewClass {
    public Hashtable<String, String> login(JFrame frame) {
    Hashtable<String, String> logininformation = new Hashtable<>();

    JPanel panel = new JPanel(new BorderLayout(5, 5));

    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
    label.add(new JLabel("E-Mail", SwingConstants.RIGHT));
    label.add(new JLabel("Password", SwingConstants.RIGHT));
    panel.add(label, BorderLayout.WEST);

    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
    JTextField username = new JTextField();
    controls.add(username);
    JPasswordField password = new JPasswordField();
    controls.add(password);
    panel.add(controls, BorderLayout.CENTER);

    JOptionPane.showMessageDialog(frame, panel, "login", JOptionPane.QUESTION_MESSAGE);

    logininformation.put("user", username.getText());
    logininformation.put("pass", new String(password.getPassword()));
    return logininformation;
}
    
}
