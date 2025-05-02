import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {
    JTextField nameField, emailField;
    JPasswordField passwordField, confirmPasswordField;
    JLabel nameError, emailError, passwordError, confirmPasswordError, successMessage;

    RegistrationForm() {
        this.setTitle("Registration Form");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(7, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameError = new JLabel();
        nameError.setForeground(Color.RED);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailError = new JLabel();
        emailError.setForeground(Color.RED);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordError = new JLabel();
        passwordError.setForeground(Color.RED);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        confirmPasswordError = new JLabel();
        confirmPasswordError.setForeground(Color.RED);

        JButton registerButton = new JButton("Register");
        successMessage = new JLabel();
        successMessage.setForeground(new Color(0, 128, 0));

        registerButton.addActionListener((ActionEvent e) -> validateForm());

        this.add(nameLabel);
        this.add(nameField);
        this.add(nameError);
        this.add(emailLabel);
        this.add(emailField);
        this.add(emailError);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(passwordError);
        this.add(confirmPasswordLabel);
        this.add(confirmPasswordField);
        this.add(confirmPasswordError);
        this.add(registerButton);
        this.add(successMessage);
    }

    private void validateForm() {
        boolean valid = true;
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        nameError.setText("");
        emailError.setText("");
        passwordError.setText("");
        confirmPasswordError.setText("");
        successMessage.setText("");

        if (name.isEmpty()) {
            nameError.setText("Name is required.");
            valid = false;
        }
        if (email.isEmpty()) {
            emailError.setText("Email is required.");
            valid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email.");
            valid = false;
        }
        if (password.isEmpty()) {
            passwordError.setText("Password is required.");
            valid = false;
        }
        if (confirmPassword.isEmpty()) {
            confirmPasswordError.setText("Please confirm password.");
            valid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPasswordError.setText("Passwords do not match.");
            valid = false;
        }

        if (valid) {
            successMessage.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm().setVisible(true));
    }
}
