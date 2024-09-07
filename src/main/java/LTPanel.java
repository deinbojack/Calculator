import javax.swing.*;

public class LTPanel extends JPanel {
    private JLabel label;
    private JTextField textField;

    public LTPanel(String labelStr, int fieldSize) {
        super();

        label = new JLabel(labelStr);
        this.add(label);

        textField = new JTextField(fieldSize);
        this.add(textField);
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String text) {
        textField.setText(text);
    }
}
