import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;

public class LibGoodies extends JFrame {
    public LibGoodies() {

        setTitle("Liberia JGoodies Forms");
        setSize(400,350);
        setLocationRelativeTo(null);

        FormLayout layout = new FormLayout(
                "left:pref, 4dlu, fill:200px",
                "pref, 6dlu, pref, 8dlu, pref, 8dlu, pref"
        );

        DefaultFormBuilder builder = new DefaultFormBuilder(layout);

        builder.append("Jugador:", new JTextField());
        builder.append("Pass:", new JPasswordField());
        builder.append(new JButton("Login"));

        add(builder.getPanel());
    }
}