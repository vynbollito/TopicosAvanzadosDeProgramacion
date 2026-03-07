import javax.swing.*;
import java.awt.*;

public class LibFlatLaf extends JFrame {

    public LibFlatLaf() {

        setTitle("Libreria_FlatLaf");
        setSize(450,300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JToolBar toolBar = new JToolBar("Barra_Avance");
        JTextField textField = new JTextField("Text Field");
        JComboBox<String> combo = new JComboBox<>(new String[]{"Opcion_1","Opcion_2","Opcion_3","Opcion_4"});
        JCheckBox check = new JCheckBox("Opción");
        JSlider slider = new JSlider();
        JRadioButton radioButton = new JRadioButton("Seleccionar");
        JButton bBack = new JButton("Regresar");
        JButton bContinue = new JButton("Continuar");
        JButton bCancel = new JButton("Cancelar");
        JProgressBar jProgressBar = new JProgressBar();

        toolBar.add(bBack);
        toolBar.add(bContinue);
        toolBar.add(bCancel);
        panel.add(toolBar);
        panel.add(textField);
        panel.add(combo);
        panel.add(check);
        panel.add(radioButton);
        panel.add(slider);
        panel.add(jProgressBar);
        jProgressBar.setValue(67);
        jProgressBar.setStringPainted(true);

        add(panel);
    }
}