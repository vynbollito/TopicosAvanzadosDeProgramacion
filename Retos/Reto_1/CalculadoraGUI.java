import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculadoraGUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField tfDisplay;
    JButton bNum1, bNum2, bNum3, bNum4, bNum5, bNum6, bNum7, bNum8, bNum9, bNum0;
    JButton bClear, bAdd, bSub, bMul, bDiv, bEquals;

    String operator = "";
    double n1 = 0, n2 = 0, result = 0; // variable for operations
    boolean needsToClear = false; // flag for clearing the TextField

    CalculadoraGUI() {
        // frame
        frame = new JFrame("Calculadora Basica");
        frame.setSize(380, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // textField
        tfDisplay = new JTextField();
        tfDisplay.setEditable(false);
        tfDisplay.setBackground(Color.lightGray);
        tfDisplay.setBounds(10, 10, 340, 50);

        // panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(5,4));
        panel.setBounds(10, 80,340,400);

        // buttons
        bNum1 = createJButtons("1");
        bNum2 = createJButtons("2");
        bNum3 = createJButtons("3");
        bNum4 = createJButtons("4");
        bNum5 = createJButtons("5");
        bNum6 = createJButtons("6");
        bNum7 = createJButtons("7");
        bNum8 = createJButtons("8");
        bNum9 = createJButtons("9");
        bNum0 = createJButtons("0");

        bAdd = createJButtons("+");
        bSub = createJButtons("-");
        bMul = createJButtons("*");
        bDiv = createJButtons("/");
        bClear = createJButtons("C");
        bEquals = createJButtons("=");

        // Add buttons to panel
        addButtons();

        // Add elements to frame
        frame.add(tfDisplay);
        frame.add(panel);
        frame.setVisible(true);
    }

    private JButton createJButtons(String text) {
        JButton button = new JButton(text);
        button.setSize(80, 80);
        button.setFocusable(false);
        button.addActionListener(this);
        return button;
    }

    private void addButtons(){
        panel.add(bNum1);
        panel.add(bNum2);
        panel.add(bNum3);
        panel.add(bAdd);

        panel.add(bNum4);
        panel.add(bNum5);
        panel.add(bNum6);
        panel.add(bSub);

        panel.add(bNum7);
        panel.add(bNum8);
        panel.add(bNum9);
        panel.add(bMul);

        panel.add(bNum0);
        panel.add(bClear);
        panel.add(bDiv);
		panel.add(bEquals);
    }

    public void cls(){
        tfDisplay.setText("");
    }

    public Double calculate(){
        switch (operator) {
            case "+" : return n1 + n2;
            case "-" : return n1 - n2;
            case "*" : return n1 * n2;
            case "/" : return n1 / n2;
            default: return -00000.999;
        }
    }

    public void getResult(){
        try {
            n2 = Double.parseDouble(tfDisplay.getText());
            result = calculate();
            cls();
            if(result == 00000.999){
                JOptionPane.showMessageDialog(null,"Invalid operation");
            }
            else{
                tfDisplay.setText(result + "");
            }
        } catch (NumberFormatException ne) {
            System.out.println("Error: " + ne);
        }
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();

        // number buttons
        if(obj == bNum1 || obj == bNum2 || obj == bNum3 || obj == bNum4 || obj == bNum5 || obj == bNum6 || obj == bNum7 || obj == bNum8 || obj == bNum9 || obj == bNum0 ) {
            // printNumbers ;
            if(needsToClear && operator.charAt(0) != '?')
                cls();
            tfDisplay.setText(tfDisplay.getText().concat(((JButton) obj).getText()));
            needsToClear = false;
        }

        // Operation buttons
        if ( obj == bAdd || obj == bSub || obj == bMul || obj== bDiv ) {
            try {
                n1 = Double.parseDouble(tfDisplay.getText());
                cls();
                operator = ((JButton) obj).getText();
                tfDisplay.setText(operator);
                needsToClear = true;
            } catch (NumberFormatException ne) {
                System.out.println("Error: " + ne);
            }
        }
        if (e.getSource() == bClear) {
            n1 = 0;
            n2 = 0;
            result = 0;
            cls();
        }
        if (e.getSource() == bEquals) {
                getResult();
        }
    }

    public static void main(String[] args){
        new CalculadoraGUI();
    }
}
