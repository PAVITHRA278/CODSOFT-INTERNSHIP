import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GradeCalculatorGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);

        // Set the background color
        frame.getContentPane().setBackground(new Color(75, 0, 130));  // Indigo color

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(75, 0, 130));  // Indigo color

        // Create GridBagConstraints for component alignment
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Padding around components
        gbc.anchor = GridBagConstraints.CENTER;  // Center components
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Make components fill horizontally

        // Heading
        JLabel headingLabel = new JLabel("Grade Calculator", SwingConstants.CENTER);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 30));
        gbc.gridwidth = 2;  // Span two columns
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(headingLabel, gbc);

        // Registration Number field
        JLabel regNoLabel = new JLabel("Registration Number:");
        regNoLabel.setForeground(Color.WHITE);
        gbc.gridwidth = 1;  // Span one column
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(regNoLabel, gbc);

        JTextField regNoField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(regNoField, gbc);

        // Department dropdown
        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(departmentLabel, gbc);

        JComboBox<String> departmentBox = new JComboBox<>(new String[] {
            "B.E. Aeronautical Engineering", "B.E. Civil Engineering", "B.E Mechanical Engineering",
            "B.E Electrical and Electronics Engineering", "B.E Electrical and Communication Engineering",
            "B.Tech Information Technology", "B.Tech Artificial Technology",
            "B.Tech Computer Science and Engineering", "Other Departments"
        });
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(departmentBox, gbc);

        // Regulation dropdown
        JLabel regulationLabel = new JLabel("Regulation:");
        regulationLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(regulationLabel, gbc);

        JComboBox<String> regulationBox = new JComboBox<>(new String[] {"2021", "2020", "2019"});
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(regulationBox, gbc);

        // Semester dropdown
        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(semesterLabel, gbc);

        JComboBox<String> semesterBox = new JComboBox<>(new String[] {
            "semester-1", "semester-2", "semester-3", "semester-4",
            "semester-5", "semester-6", "semester-7", "semester-8"
        });
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(semesterBox, gbc);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(255, 140, 0));  // Orange color
        submitButton.setForeground(Color.WHITE);
        gbc.gridwidth = 2;  // Span two columns
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(submitButton, gbc);

        submitButton.addActionListener((ActionEvent e) -> {
            // Open the MainPanel in a new JFrame, passing the data
            JFrame resultFrame = new JFrame("Main Panel");
            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            resultFrame.setSize(600, 400);

            // Pass data to MainPanel
            MainPanel mainPanel = new MainPanel(
                resultFrame,
                regNoField.getText(),
                (String) departmentBox.getSelectedItem(),
                (String) semesterBox.getSelectedItem()
            );

            resultFrame.add(mainPanel);
            resultFrame.setVisible(true);
            frame.dispose(); // Close the current window
        });

        // Add the panel to the frame
        frame.setLayout(new GridBagLayout());
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);

        // Make the layout responsive
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setLocationRelativeTo(null);  // Center the frame on the screen
    }
}
