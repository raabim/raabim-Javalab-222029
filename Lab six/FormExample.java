import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormExample {
    public static void main(String[] args) {
    
        JFrame frame = new JFrame("AWT/Swing Form Example");

       
        frame.setSize(400, 400);

        
        frame.setLayout(new FlowLayout());

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Enter your name:");
    
        JTextField textField = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        JCheckBox agreeCheckBox = new JCheckBox("I agree to the terms and conditions");

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        String[] countries = {"USA", "India", "Nepal", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        JTextArea textArea = new JTextArea(5, 20);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JPasswordField passwordField = new JPasswordField(20);

        JLabel selectedCountryLabel = new JLabel("Selected Country: None");

        // Event handling for the button click
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                boolean isAgreed = agreeCheckBox.isSelected();
                String gender = maleRadioButton.isSelected() ? "Male" : (femaleRadioButton.isSelected() ? "Female" : "Not selected");
                String country = (String) countryComboBox.getSelectedItem();
                String password = new String(passwordField.getPassword());

                String message = "Name: " + name + "\nGender: " + gender + "\nCountry: " + country +
                        "\nAgreed: " + isAgreed + "\nPassword: " + password;

                JOptionPane.showMessageDialog(frame, message, "Form Submission", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                selectedCountryLabel.setText("Selected Country: " + selectedCountry);
            }
        });

        frame.add(label1);
        frame.add(textField);
        frame.add(submitButton);
        frame.add(agreeCheckBox);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);
        frame.add(countryComboBox);
        frame.add(scrollPane);
        frame.add(passwordField);
        frame.add(selectedCountryLabel);

        frame.setVisible(true);
    }
}

