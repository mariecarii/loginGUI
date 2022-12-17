import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel displayMessage;


    public static void main(String[] args) {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        displayMessage = new JLabel("");
        displayMessage.setBounds(10,110, 300, 25 );
        panel.add(displayMessage);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();
//        System.out.println("user: " + user + "password: " + password);

        if (user.equals("Marie") && password.equals("Cari")) {

            displayMessage.setText("Login Successful");
        }
        else {
            displayMessage.setText("Invalid");
        }
    }
}
