import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class LibMigLayout extends JFrame {
    public LibMigLayout() {
        setTitle("Libreria MigLayout");
        setSize(300,250);
        setLocationRelativeTo(null);

        setLayout(new MigLayout("wrap 2", "[right][grow,fill]"));

        add(new JLabel("Jugador:"));
        add(new JTextField(15));

        add(new JLabel("Pass:"));
        add(new JTextField(15));

        add(new JLabel("Captcha:"));
        add(new JTextField(15));
        JTextArea textArea = new  JTextArea(10,10);
        textArea.append("\n  " + (int) (Math.random() * 10365));
        add(textArea,"left");

        add(new JButton("Guardar"), "span 2, center");
    }
}