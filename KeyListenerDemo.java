import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends Frame implements KeyListener {
	Label label;
	TextArea textArea;
	KeyListenerDemo() {
	    label = new Label();
	    label.setBounds(20, 50, 100, 200);
	    textArea = new TextArea;
	    textArea.setBounds(20, 80, 300, 300);
	    add(label);
	    add(textArea);
	    textArea.addKeyListener(this);
	    setSize(500, 500);
	    setVisible(true);
	}
	
	public void keyPressed(KeyEvent e) {
	    label.setText("Key is Pressed.");
	}
	public void keyReleased(KeyEvent e) {
	    label.setText("Key is Released.");
	}
	public void keyTyped(KeyEvent e)  {
	    label.setText("Key is Typed.");
	}
}

public class KeyListenerDemo {	
	public static void main(String[] args) {
	    new KeyListenerDemo();
	}
}