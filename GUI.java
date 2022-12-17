import javax.swing.*;

public class GUI {

    public static void main(String[] args) {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);




    }


}
