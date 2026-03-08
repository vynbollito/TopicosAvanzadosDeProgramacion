public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
        view.getSwing().addActionListener(e -> new LibSwing().setVisible(true) );
        view.getFlatLaf().addActionListener(e -> new LibFlatLaf().setVisible(true));
        view.getMig().addActionListener(e -> new LibMigLayout().setVisible(true));
        view.getGoodies().addActionListener(e -> new LibGoodies().setVisible(true));
    }
}
