import javax.swing.*;
import java.awt.event.*;
class Login_1 extends JFrame implements ActionListener {
    JTextField t1;
    JLabel l4;
    JButton b1, b2;
    JPasswordField t2;
    Login_1() {
        setLayout(null);
       
        JLabel l1, l2, l3;
        l1 = new JLabel("Login form using text field:");
        l2 = new JLabel("Enter student username:");
        l3 = new JLabel("Enter correct Password :");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        l1.setBounds(180, 0, 200, 150);
        l2.setBounds(130, 100, 150, 60);
        t1.setBounds(280, 120, 100, 30);
        l3.setBounds(130, 150, 150, 60);
        t2.setBounds(280, 170, 100, 30);
        b1.setBounds(180, 240, 100, 30);
        b2.setBounds(300, 240, 100, 30);
        l4.setBounds(200, 300, 200, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(l4);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("suraj") && s2.equals("SurajM@9529")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("Login Failed");
            }
        } else if (ae.getSource() == b2) {
        
            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }

    public static void main(String args[]) {
        Login_1 jf1 = new Login_1();
        jf1.setVisible(true);
        jf1.setSize(500, 500);
        jf1.setTitle("Login Form");
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
