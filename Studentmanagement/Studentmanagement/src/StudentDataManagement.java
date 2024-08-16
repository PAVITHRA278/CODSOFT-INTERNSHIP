
import java.awt.BorderLayout;

import java.awt.EventQueue;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

 

import java.awt.Font;

import javax.swing.JTextField;

import javax.swing.JComboBox;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;


import javax.swing.JTable;

import javax.swing.JInternalFrame;

import javax.swing.table.DefaultTableModel;

 

import net.proteanit.sql.DbUtils;

 

import javax.swing.border.MatteBorder;

import java.awt.Color;

import java.awt.SystemColor;

import java.awt.event.ActionListener;

import java.awt.print.PrinterException;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.awt.event.ActionEvent;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

 

public class StudentDataManagement extends JFrame {

 

private JPanel contentPane;

private JTextField tf1;

private JTextField tf2;

private JTextField tf3;

private JTextField tf5;

private JTextField tf6;

private JTextField tf7;

private JTextField tf8;

private JTextField tf9;

private JTextField tf4;

private JTable table;

Connection conn;

JRadioButton r4,r5;

JComboBox comboBox;


private JTextField tf10;

private JTextField tf11;

private JTextField tf12;

 

/**

 * Launch the application.

 */

public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

StudentDataManagement frame = new StudentDataManagement();

frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

}

});

}


//Add Combo Box

void addItemToComboBox()throws SQLException{

String query = "SELECT * from studentdatamgmt";

Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(query);


while(rs.next()) {

comboBox.addItem(rs.getString("FirstName"));

}

}


      

/**

 * Create the frame.

 */

public StudentDataManagement() {

conn = DataBaseConnection.dbConn();

setFont(new Font("Dialog", Font.BOLD, 18));

setBackground(SystemColor.activeCaption);

setTitle("Student Data Management");

setIconImage(Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Pavithra\\OneDrive\\Pictures\\calm.jpg\""));

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 1273, 680);

contentPane = new JPanel();

contentPane.setBackground(new Color(176, 224, 230));

contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);

contentPane.setLayout(null);


JLabel lblNewLabel = new JLabel("STUDENT    DATA    MANAGEMENT");

lblNewLabel.setForeground(new Color(95, 100, 160));

lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));

lblNewLabel.setBounds(192, 28, 642, 44);

contentPane.add(lblNewLabel);


JLabel lblNewLabel_1 = new JLabel("First Name");

lblNewLabel_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1.setBackground(new Color(0, 128, 128));

lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1.setBounds(10, 95, 111, 27);

contentPane.add(lblNewLabel_1);


JLabel lblNewLabel_1_1 = new JLabel("Surname");

lblNewLabel_1_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_1.setBounds(10, 145, 123, 27);

contentPane.add(lblNewLabel_1_1);


JLabel lblNewLabel_1_2 = new JLabel("Age");

lblNewLabel_1_2.setForeground(new Color(0, 128, 128));

lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_2.setBounds(10, 191, 95, 27);

contentPane.add(lblNewLabel_1_2);


JLabel lblNewLabel_1_3 = new JLabel("Contact No.");

lblNewLabel_1_3.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3.setBounds(10, 329, 111, 27);

contentPane.add(lblNewLabel_1_3);


JLabel lblNewLabel_1_2_1 = new JLabel("Gender");

lblNewLabel_1_2_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_2_1.setBounds(10, 291, 95, 27);

contentPane.add(lblNewLabel_1_2_1);


JLabel lblNewLabel_1_3_1 = new JLabel("Year Of Join");

lblNewLabel_1_3_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1.setBounds(10, 367, 123, 27);

contentPane.add(lblNewLabel_1_3_1);


JLabel lblNewLabel_1_3_1_1 = new JLabel("Department");

lblNewLabel_1_3_1_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_1.setBounds(10, 443, 123, 27);

contentPane.add(lblNewLabel_1_3_1_1);


JLabel lblNewLabel_1_3_1_2 = new JLabel("Class");

lblNewLabel_1_3_1_2.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_2.setBounds(10, 481, 123, 27);

contentPane.add(lblNewLabel_1_3_1_2);


JLabel lblNewLabel_1_3_1_3 = new JLabel("Id");

lblNewLabel_1_3_1_3.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_3.setBounds(10, 405, 123, 27);

contentPane.add(lblNewLabel_1_3_1_3);


JLabel lblNewLabel_1_3_1_4 = new JLabel("Father Name");

lblNewLabel_1_3_1_4.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_4.setBounds(10, 519, 123, 27);

contentPane.add(lblNewLabel_1_3_1_4);


JLabel lblNewLabel_1_3_1_4_1 = new JLabel("Mother Name\r\n");

lblNewLabel_1_3_1_4_1.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_4_1.setBounds(10, 557, 123, 27);

contentPane.add(lblNewLabel_1_3_1_4_1);


JLabel lblNewLabel_1_3_1_4_2 = new JLabel("DateOfBirth");

lblNewLabel_1_3_1_4_2.setForeground(new Color(0, 128, 128));

lblNewLabel_1_3_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_1_3_1_4_2.setBounds(10, 253, 123, 27);

contentPane.add(lblNewLabel_1_3_1_4_2);


tf1 = new JTextField();

tf1.setBackground(new Color(224, 255, 255));

tf1.setForeground(new Color(0, 0, 0));

tf1.setBounds(166, 95, 134, 32);

contentPane.add(tf1);

tf1.setColumns(10);


tf2 = new JTextField();

tf2.setBackground(new Color(224, 255, 255));

tf2.setColumns(10);

tf2.setBounds(166, 140, 134, 32);

contentPane.add(tf2);


tf3 = new JTextField();

tf3.setBackground(new Color(224, 255, 255));

tf3.setColumns(10);

tf3.setBounds(166, 191, 134, 32);

contentPane.add(tf3);


tf5 = new JTextField();

tf5.setBackground(new Color(224, 255, 255));

tf5.setColumns(10);

tf5.setBounds(166, 329, 134, 32);

contentPane.add(tf5);


tf6 = new JTextField();

tf6.setBackground(new Color(224, 255, 255));

tf6.setColumns(10);

tf6.setBounds(166, 367, 134, 32);

contentPane.add(tf6);


tf7 = new JTextField();

tf7.setBackground(new Color(224, 255, 255));

tf7.setColumns(10);

tf7.setBounds(166, 405, 134, 32);

contentPane.add(tf7);


tf8 = new JTextField();

tf8.setBackground(new Color(224, 255, 255));

tf8.setColumns(10);

tf8.setBounds(166, 519, 134, 32);

contentPane.add(tf8);


tf9 = new JTextField();

tf9.setBackground(new Color(224, 255, 255));

tf9.setColumns(10);

tf9.setBounds(166, 557, 134, 32);

contentPane.add(tf9);


JComboBox comboBox_1 = new JComboBox();

comboBox_1.setForeground(new Color(0, 128, 0));

comboBox_1.setBackground(new Color(224, 255, 255));

comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));

comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Class", "First Year", "Second Year", "Third Year"}));

comboBox_1.setBounds(166, 481, 134, 27);

contentPane.add(comboBox_1);


tf4 = new JTextField();

tf4.setBackground(new Color(224, 255, 255));

tf4.setColumns(10);

tf4.setBounds(166, 248, 134, 32);

contentPane.add(tf4);


JButton btnNewButton = new JButton("Load\r\n");

btnNewButton.setForeground(new Color(0, 0, 205));

btnNewButton.setBackground(new Color(100, 149, 237));

btnNewButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

showData();

}

});

btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));

btnNewButton.setBounds(394, 600, 105, 32);

contentPane.add(btnNewButton);



JButton btnInsert = new JButton("Insert");

btnInsert.setForeground(new Color(0, 0, 205));

btnInsert.setBackground(new Color(100, 149, 237));

btnInsert.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

    String query = "INSERT INTO studentdatamgmt VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";




try {

PreparedStatement ps = conn.prepareStatement(query);

ps.setString(1, tf1.getText());

ps.setString(2, tf2.getText());

ps.setInt(3, Integer.parseInt(tf3.getText()));

ps.setInt(4, Integer.parseInt(tf4.getText()));

ps.setString(5, tf11.getText());

ps.setInt(6, Integer.parseInt(tf5.getText()));

ps.setInt(7, Integer.parseInt(tf6.getText()));

ps.setInt(8, Integer.parseInt(tf7.getText()));

ps.setString(9, tf12.getText());

ps.setString(10, String.valueOf(comboBox_1.getSelectedItem()));

ps.setString(11, tf8.getText());

ps.setString(12, tf9.getText());

ps.execute();


JOptionPane.showMessageDialog(null, "Data Insertion Successfully!");

showData();



} catch (SQLException e1) {

JOptionPane.showMessageDialog(null, "Data Insertion Failed!");

// TODO Auto-generated catch block

e1.printStackTrace();

}


 

}

});


btnInsert.setFont(new Font("Tahoma", Font.BOLD, 18));

btnInsert.setBounds(562, 600, 105, 32);

contentPane.add(btnInsert);


JButton btnUpdate = new JButton("Update");

btnUpdate.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

String q = "UPDATE studentdatamgmt set FirstName=? , Surname=? , Age=? , DateOfBirth=? , Gender=? , contactNo=? , YearOfJoin=? , Id=? , Department=? , class=? , FatherName=? , MotherName=? where Id=?";

try {

PreparedStatement ps = conn.prepareStatement(q);

ps.setString(1, tf1.getText());

ps.setString(2, tf2.getText());

ps.setInt(3, Integer.parseInt(tf3.getText()));

ps.setInt(4, Integer.parseInt(tf4.getText()));

ps.setString(5, tf11.getText());

ps.setInt(6, Integer.parseInt(tf5.getText()));

ps.setInt(7, Integer.parseInt(tf6.getText()));

ps.setInt(8, Integer.parseInt(tf7.getText()));

ps.setString(9, tf12.getText());

ps.setString(10, String.valueOf(comboBox_1.getSelectedItem()));

ps.setString(11, tf8.getText());

ps.setString(12, tf9.getText());

ps.setInt(13, Integer.parseInt(tf7.getText()));

ps.execute();

JOptionPane.showMessageDialog(null, "Data Updated Successfully!");

showData();


addItemToComboBox();

} catch (SQLException e1) {

// TODO Auto-generated catch block

JOptionPane.showMessageDialog(null, "Data Updated Failed!");

e1.printStackTrace();

}

}

});

btnUpdate.setForeground(new Color(0, 0, 205));

btnUpdate.setBackground(new Color(100, 149, 237));

btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));

btnUpdate.setBounds(742, 600, 105, 32);

contentPane.add(btnUpdate);


JButton btnPrint = new JButton("Print");

btnPrint.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

try {

if(table.print()) {

JOptionPane.showMessageDialog(null, "Printing Successfully!","PavithraPrinter", JOptionPane.INFORMATION_MESSAGE);

}else {

JOptionPane.showMessageDialog(null,"Printing Failed!","PavithraPrinter",JOptionPane.ERROR_MESSAGE);

}

}catch(PrinterException e1) {

e1.printStackTrace();

}

}

});

btnPrint.setForeground(new Color(0, 0, 205));

btnPrint.setBackground(new Color(100, 149, 237));

btnPrint.setFont(new Font("Tahoma", Font.BOLD, 18));

btnPrint.setBounds(913, 600, 105, 32);

contentPane.add(btnPrint);


JButton btnDelete = new JButton("Delete");

btnDelete.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

String query = "DELETE from studentdatamgmt where Id=?";

try {

PreparedStatement ps = conn.prepareStatement(query);

ps.setInt(1, Integer.parseInt(tf7.getText()));

ps.execute();

JOptionPane.showMessageDialog(null, "Data Deleted Successfully!");

showData();


} catch (SQLException e1) {

JOptionPane.showMessageDialog(null, "Data Deleted Failed!");

// TODO Auto-generated catch block

e1.printStackTrace();

}

}

});


btnDelete.setForeground(new Color(0, 0, 205));

btnDelete.setBackground(new Color(100, 149, 237));

btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));

btnDelete.setBounds(1084, 600, 105, 32);

contentPane.add(btnDelete);


JLabel lblNewLabel_2 = new JLabel("STUDENT'S DATA:-");

lblNewLabel_2.setForeground(new Color(46, 139, 87));

lblNewLabel_2.setBackground(new Color(51, 204, 204));

lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));

lblNewLabel_2.setBounds(362, 106, 221, 32);

contentPane.add(lblNewLabel_2);


table = new JTable();

table.setBackground(new Color(240, 248, 255));

table.setForeground(new Color(0, 100, 0));

table.setFont(new Font("Tahoma", Font.PLAIN, 12));

table.setModel(new DefaultTableModel(

new Object[][] {

{"First Name", "Surname", "Age", "DateOfBirth", "Gender", "Contact No", "YearOfJoin", "Id", "Department", "Class", "Father Name", "Mother Name"},

{null, null, null, null, null, null, null, null, null, null, null, null},

{null, null, null, null, null, null, null, null, null, null, null, null},

{null, null, null, null, null, null, null, null, null, null, null, null},

},

new String[] {

"First Name", "Surname", "Age", "DateOfBirth", "Gender", "Contact No", "YearOfjoin", "Id", "Department", "Class", "Father Name", "Mother Name"

}

));

table.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));

table.setBounds(349, 154, 900, 435);

contentPane.add(table);


comboBox = new JComboBox();

comboBox.setBackground(new Color(224, 255, 255));

comboBox.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

String query = "SELECT * from studentdatamgmt where FirstName=?";

try {

PreparedStatement ps = conn.prepareStatement(query);

ps.setString(1, String.valueOf(comboBox.getSelectedItem()));

ResultSet rs = ps.executeQuery();


if(rs.next()) {

tf1.setText(rs.getString("FirstName"));

tf2.setText(rs.getString("Surname"));

tf3.setText(rs.getString("Age"));

tf4.setText(rs.getString("DateOfBirth"));

tf5.setText(rs.getString("contactNo"));

tf6.setText(rs.getString("YearOfJoin"));

tf7.setText(rs.getString("Id"));

tf8.setText(rs.getString("FatherName"));

tf9.setText(rs.getString("MotherName"));

}

} catch (SQLException e1) {

// TODO Auto-generated catch block

e1.printStackTrace();

}

}

});

comboBox.setBounds(597, 105, 237, 33);

contentPane.add(comboBox);


tf10 = new JTextField();

tf10.setBackground(new Color(224, 255, 255));

tf10.setToolTipText("Search Here");

tf10.addKeyListener(new KeyAdapter() {

@Override

public void keyReleased(KeyEvent e) {

String q ="Select * from studentdatamgmt where FirstName =?";

try {

PreparedStatement ps = conn.prepareStatement(q);

ps.setString(1, tf10.getText());

ResultSet rs = ps.executeQuery();

table.setModel(DbUtils.resultSetToTableModel(rs));

} catch (SQLException e1) {

// TODO Auto-generated catch block

e1.printStackTrace();

}

}

});

tf10.setBounds(869, 106, 380, 31);

contentPane.add(tf10);

tf10.setColumns(10);


tf11 = new JTextField();

tf11.setBackground(new Color(224, 255, 255));

tf11.setBounds(166, 291, 49, 26);

contentPane.add(tf11);

tf11.setColumns(10);


JLabel lblNewLabel_3 = new JLabel("M/F/O");

lblNewLabel_3.setForeground(new Color(34, 139, 34));

lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));

lblNewLabel_3.setBounds(218, 289, 64, 33);

contentPane.add(lblNewLabel_3);


tf12 = new JTextField();

tf12.setBackground(new Color(224, 255, 255));

tf12.setForeground(new Color(0, 0, 0));

tf12.setBounds(166, 443, 57, 26);

contentPane.add(tf12);

tf12.setColumns(10);


JLabel lblNewLabel_4 = new JLabel("CS / IT");

lblNewLabel_4.setForeground(new Color(0, 128, 128));

lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));

lblNewLabel_4.setBounds(233, 443, 67, 23);

contentPane.add(lblNewLabel_4);

}

 

protected void showData() {

// TODO Auto-generated method stub

String query = "Select * from studentdatamgmt";

try {

Statement stmt = conn.createStatement();

ResultSet rs = stmt.executeQuery(query);


table.setModel(DbUtils.resultSetToTableModel(rs));

} catch (SQLException e1) {

// TODO Auto-generated catch block

e1.printStackTrace();

}


}

protected String getDepartment() {

// TODO Auto-generated method stub

if(r4.isSelected())

return"CS";

else if(r5.isSelected())

return"IT";

else

return"NULL";

}

}
