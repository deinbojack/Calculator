import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {


    JFrame frame;
    JTextField field1;
    JPanel panel1, panel2, panel3, panel4;
    JButton button1, button2, button3, button4, button5,
            button6, button7, button8, button9, button0,
            buttonDivide, buttonTimes, buttonMinus, buttonPlus,
            buttonClear, buttonEquals;


    String op;
    int arg1;
    int arg2;

    public Calculator() {

        frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        field1 = new JTextField(15);
        field1.setHorizontalAlignment(SwingConstants.RIGHT);

        panel1 = new JPanel();
        button7 = new JButton("7");
        panel1.add(button7);
        button8 = new JButton("8");
        panel1.add(button8);
        button9 = new JButton("9");
        panel1.add(button9);
        buttonDivide = new JButton("/");
        panel1.add(buttonDivide);

        panel2 = new JPanel();
        button4 = new JButton("4");
        panel2.add(button4);
        button5 = new JButton("5");
        panel2.add(button5);
        button6 = new JButton("6");
        panel2.add(button6);
        buttonTimes = new JButton("*");
        panel2.add(buttonTimes);

        panel3 = new JPanel();
        button1 = new JButton("1");
        panel3.add(button1);
        button2 = new JButton("2");
        panel3.add(button2);
        button3 = new JButton("3");
        panel3.add(button3);
        buttonMinus = new JButton("-");
        panel3.add(buttonMinus);

        panel4 = new JPanel();
        button0 = new JButton("0");
        panel4.add(button0);
        buttonClear = new JButton("AC");
        panel4.add(buttonClear);
        buttonEquals = new JButton("=");
        panel4.add(buttonEquals);
        buttonPlus = new JButton("+");
        panel4.add(buttonPlus);


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonTimes.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);

        frame.add(field1);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);


        frame.pack();


        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String buttonName = ae.getActionCommand();

        if (buttonName.equals("1")) {
            field1.setText(field1.getText() + "1");
        }
        else if (buttonName.equals("2")) {
            field1.setText(field1.getText() + "2");
        }
        else if (buttonName.equals("3")) {
            field1.setText(field1.getText() + "3");
        }
        else if (buttonName.equals("4")) {
            field1.setText(field1.getText() + "4");
        }
        else if (buttonName.equals("5")) {
            field1.setText(field1.getText() + "5");
        }
        else if (buttonName.equals("6")) {
            field1.setText(field1.getText() + "6");
        }
        else if (buttonName.equals("7")) {
            field1.setText(field1.getText() + "7");
        }
        else if (buttonName.equals("8")) {
            field1.setText(field1.getText() + "8");
        }
        else if (buttonName.equals("9")) {
            field1.setText(field1.getText() + "9");
        }
        else if (buttonName.equals("0")) {
            field1.setText(field1.getText() + "0");
        }
        else if (buttonName.equals("/")) {
            arg1 = Integer.parseInt(field1.getText());
            op = "/";
            field1.setText("");
        }
        else if (buttonName.equals("*")) {
            arg1 = Integer.parseInt(field1.getText());
            op = "*";
            field1.setText("");
        }
        else if (buttonName.equals("-")) {
            arg1 = Integer.parseInt(field1.getText());
            op = "-";
            field1.setText("");
        }
        else if (buttonName.equals("+")) {
            arg1 = Integer.parseInt(field1.getText());
            op = "+";
            field1.setText("");
        }
        else if (buttonName.equals("AC")) {
            field1.setText("");
            op="";
        }
        else if (buttonName.equals("=")) {
            arg2 = Integer.parseInt(field1.getText());
            if (op.equals("/")) {
                field1.setText(arg1/arg2+"");
            }
            if (op.equals("*")) {
                field1.setText(arg1*arg2+"");
            }
            if (op.equals("+")) {
                field1.setText(arg1+arg2+"");
            }
            if (op.equals("-")) {
                field1.setText(arg1-arg2+"");
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

