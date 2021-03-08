import java.awt.Container;

import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel userLabel = new JLabel("User Name");
    JTextField userName = new JTextField();
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password");
    
    LoginFrame() {
        setLocationSize();
        addComponent();
        setLayout(null);
        setVisible(true);
        login.addActionListener(this);
        reset.addActionListener(this);
        showPassword.addActionListener(this);
    }
    
    public void setLocationSize() {
        userLabel.setBounds(50, 150, 100, 30);
        userName.setBounds(150, 150, 150, 30);
        passwordLabel.setBounds(50, 220, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        login.setBounds(50, 300, 100, 30);
        reset.setBounds(200, 300, 100, 30);
    }
    public void addComponent() {
        container.add(userLabel);
        container.add(userName);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(login);
        container.add(reset);
        container.add(showPassword);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login {
            String userNameText;
            String password;
            userNameText = userName.getText();
            password = passwordField.getText();
            if(userNameText.equalsIgnoreCase("sjcet") && password.equalsIgnoreCase("sjcet123")) {
                JOptionPane.showMessageDialog(this, "Login Successfull.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }
        }
        if(e.getSource()==reset) {
            userName.setText("");
            passwordField.setText("");
        }
        if(e.getSource()==showPassword) {
            if(showPassword.isSelected()) {
                passwordField.setEchoChar((char)0);
            }
            else {
                passwordField.setEchoChar("*");
            }
        }
    }
}
    
    public class Login {	
	public static void main(String[] args) {
	   
	}
}
