import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        View view = new View();
        new Controller(view);
        view.setVisible(true);
    }
}
