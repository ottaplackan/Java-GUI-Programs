import java.awt.*;
import java.awt.event.*;

public class CalculatorDemo extends Frame implements ActionListener, TextListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button add, sub, div, mult, clr, eq;
    String s, s1, s2, s3, s4;
    int no1, no2, result;
    TextField txtField;

    CalculatorDemo() {
        GridLayout gLayout = new GridLayout(4,5);
        setLayout(gLayout);
        
        txtField = new TextField(10);
        add(txtField);
        
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        add = new Button("+");
        sub = new Button("-");
        mult = new Button("x");
        div = new Button("/");
        eq = new Button("=");
        clr = new Button("C");
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(add);
        add(sub);
        add(mult);
        add(div);
        add(eq);
        add(clr);
        setVisible(true);
        setSize(450,350);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        clr.addActionListener(this);
        eq.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        s = e.getActionCommand(); //Return which button we click.
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")) {
            s1 = txtField.getText()+s;
            txtField.setText(s1);
        }
        if(s.equals("+")) {
            s2 = txtField.getText();
            txtField.setText("");
            s3 = "+";
        }
        if(s.equals("-")) {
            s2 = txtField.getText();
            txtField.setText("");
            s3 = "-";
        }
        if(s.equals("x")) {
            s2 = txtField.getText();
            txtField.setText("");
            s3 = "x";
        }
        if(s.equals("/")) {
            s2 = txtField.getText();
            txtField.setText("");
            s3 = "/";
        }
        if(s.equals("=")) {
            s4 = txtField.getText();
            no1 = Integer.parseInt(s2);
            no2 = Integer.parseInt(s4);
            if(s3.equals("+")) {
                result = no1+no2;
            }
            if(s3.equals("-")) {
                result = no1-no2;
            }
            if(s3.equals("x")) {
                result = no1*no2;
            }
            if(s3.equals("/")) {
                result = no1/no2;
            }
            txtField.setText(String.valueOf(result));
        }
        if(s.equals("C")) {
            txtField.setText("");
        }
    }

    public static void main(String[] args) {
        CalculatorDemo cDemo = new CalculatorDemo();
    }
}
