import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JButton bFlatLaf = new JButton("Libreria FlatLaf ");
    private JButton bMig = new JButton("Libreria MigLayout");
    private JButton bGoodies = new JButton("Libreria JGoodies Forms");

    public View() {

        setTitle("Vista de Librerias Externas");
        setSize(400,250);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

        panel.add(bFlatLaf);
        panel.add(bMig);
        panel.add(bGoodies);

        add(panel);
    }

    public JButton getFlatLaf() {
        return bFlatLaf;
    }

    public JButton getMig() {
        return bMig;
    }

    public JButton getGoodies() {
        return bGoodies;
    }
}

