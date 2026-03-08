import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LibSwing extends JFrame {
    JButton bLogin, bClear;
    JLabel lUser, lPass;
    JTextField tfUser, tfPass;

    LibSwing(){
        setTitle("Swing Front");
        setBounds(500,0,280,180);
        setLayout(null);

        lUser = createJBLabels("Player",10);
        lPass = createJBLabels("Pass",40);

        tfUser = createJTextFields(10);
        tfPass = createJTextFields(40);

        bLogin = createJButtons("Login",30);
        bClear = createJButtons("Clear",150);

        addLabels();
        addTextFields();
        addButtons();

        setVisible(true);
    }


    private JLabel createJBLabels(String text, int PosY ) {
        JLabel label = new JLabel(text);
        label.setBounds(10,PosY,64,24);
        return label;
    }
    private void addLabels(){
        add(lUser);
        add(lPass);
    }

    private JTextField createJTextFields(int PosY ) {
        JTextField textField = new JTextField();
        textField.setBounds(75,PosY,150,24);
        return textField;
    }
    private void addTextFields(){
        tfUser.setText("Enter your player name");
        tfPass.setText("Enter your password ");

        add(tfUser);
        add(tfPass);
    }

    private JButton createJButtons(String text, int PosX ) {
        JButton button = new JButton(text);
        button.setBounds(PosX,100,100,22);
        button.setFocusable(false);
        return button;
    }
    private void addButtons(){
        add(bLogin);
        add(bClear);
    }
}
