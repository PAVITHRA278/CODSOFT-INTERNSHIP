import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;









public class MainPanel extends JPanel {
    private String regNo;
    private String department;
    private String semester;
    private DefaultTableModel tableModel;
    private JTextField regNoField;
    
    
    

    @Override
    public String toString() {
        return "MainPanel [tableModel=" + tableModel + ", regNo=" + regNo + ", department=" + department + ", semester="
                + semester + "]";
    }

    public MainPanel(JFrame frame, String regNo, String department, String semester) {
        this.regNo = regNo;
        this.department = department;
        this.semester = semester;

        regNoField = new JTextField(15);
        regNoField.setText(regNo);

        // Set the layout for the main panel
        setLayout(new BorderLayout());
        setBackground(new Color(75, 0, 130));  // Indigo color

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        inputPanel.setBackground(new Color(75, 0, 130)); 

        // Create the table model with 3 columns: Subject, Grade, Credits
        tableModel = new DefaultTableModel(new Object[]{"Subject", "Grade", "Credits"}, 0);

        // Add initial rows (up to 6 subjects)
        for (int i = 1; i <= 6; i++) {
            tableModel.addRow(new Object[]{"Subject " + i, "O", getCreditsForGrade("O")});
        }

        // Create the table and set properties
        JTable table = new JTable(tableModel) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0 || column ==1 || column == 1;  // Make the "Subject" column non-editable
            }
        };

        table.setRowHeight(50);


        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(75, 0, 130));  // Indigo color



        // Set column widths
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);

        // Create dropdown for grades in the Grade column
        JComboBox<String> gradeDropdown = new JComboBox<>(new String[]{"O", "A+", "A", "B+", "B", "U"});
        table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(gradeDropdown));

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1100, 800));
        add(scrollPane, BorderLayout.CENTER);

        // Add the table to a scroll pane
        


        // Create a panel for the buttons
                      

        // Add button to add new rows
        JButton addButton = new JButton("Add Subject");
        addButton.setBackground(new Color(255, 140, 0));  // Orange color
        addButton.setForeground(Color.WHITE);
        addButton.addActionListener((ActionEvent e) -> {
            tableModel.addRow(new Object[]{"Subject " + (tableModel.getRowCount() + 1), "O", getCreditsForGrade("O")});
        });
        buttonPanel.add(addButton);

        
       

        // Generate button to calculate GPA
        JButton generateButton = new JButton("Generate GPA");
        generateButton.setBackground(new Color(255, 140, 0));  // Orange color
        generateButton.setForeground(Color.WHITE);
        generateButton.addActionListener((ActionEvent e) -> {
            // Calculate GPA logic here
            double totalCredits = 0;
            double totalPoints = 0;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String grade = (String) tableModel.getValueAt(i, 1);
                int credits = (int) tableModel.getValueAt(i, 2);
                double gradePoint = getGradePoint(grade);
                totalCredits += credits;
                totalPoints += gradePoint * credits;
            }
            double gpa = totalPoints / totalCredits;
            JOptionPane.showMessageDialog(null, 
                "Registration Number: " + regNo + "\n" +
                "Department: " + department + "\n" +
                "Semester: " + semester + "\n" +
                "Your CGPA: " + String.format("%.2f", gpa),
                "Summary",
                JOptionPane.INFORMATION_MESSAGE);
        });
        buttonPanel.add(generateButton);

        add(buttonPanel, BorderLayout.SOUTH);

    // Add a table model listener to update credits when grade changes
        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 1) {  // Grade column
                    int row = e.getFirstRow();
                    String grade = (String) tableModel.getValueAt(row, 1);
                    tableModel.setValueAt(getCreditsForGrade(grade), row, 2);
                }
            }
        });
    }

       

    


   
    // Method to get grade points based on grade
    private double getGradePoint(String grade) {
        return switch (grade) {
            case "O" -> 10.0;
            case "A+" -> 9.0;
            case "A" -> 8.0;
            case "B+" -> 7.0;
            case "B" -> 6.0;
            case "U" -> 0.0;
            default -> 0.0;
        };
    }

    // Method to get credits based on grade
    private int getCreditsForGrade(String grade) {
        return switch (grade) {
            case "O" -> 10;
            case "A+" -> 9;
            case "A" -> 8;
            case "B+" -> 6;
            case "B" -> 5;
            case "U" -> 0;
            default -> 0;
        };
    }
}
