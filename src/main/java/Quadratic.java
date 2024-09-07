import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quadratic {
    public Quadratic() {
        JFrame frame = new JFrame("Quadratic Formula");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel formulaPanel = new JPanel();
        LTPanel aPanel = new LTPanel("a =", 10);
        LTPanel bPanel = new LTPanel("b =", 10);
        LTPanel cPanel = new LTPanel("c =", 10);
        JPanel buttonPanel = new JPanel();
        LTPanel answerPanel = new LTPanel("Answer:", 10);

        frame.add(formulaPanel);
        frame.add(aPanel);
        frame.add(bPanel);
        frame.add(cPanel);
        frame.add(buttonPanel);
        frame.add(answerPanel);


        JLabel formulaLabel = new JLabel("ax^2 + bx + c = 0");
        formulaPanel.add(formulaLabel);


        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                aPanel.setText("");
                bPanel.setText("");
                cPanel.setText("");
            }
        });

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public void quadForm() {

    }

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
    }
}
