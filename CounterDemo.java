import java.awt.*;
import java.awt.event.*;

public class CounterDemo extends Frame implements ActionListener {
    private Label labelCount;
    private TextField txtField;
    private Button button;
    private int count=0;
    
    CounterDemo() {
        setLayout(new FlowLayout());
        labelCount = new Label("Counter");
        add(labelCount);
        txtField = new TextField(count+"",10);
        txtField.setEditable(false);
        add(txtField);
        button = new Button("Count");
        add(button);

        button.addActionListener(this); //ActionListener added to the component button.

        setTitle("AWT Counter");
        setSize(250,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        ++count;
        txtField.setText(count+"");
    }

    public static void main(String[] args) {
        CounterDemo app = new CounterDemo();
    }
}
