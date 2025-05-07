import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.util.ArrayList;

public class RecrutmentSystem extends JFrame {
    private final ArrayList<StaffHire> staffList = new ArrayList<>();
    private JTextField vacancyTextField;
    private JTextField designationTextField;
    private JTextField jobTypeTextField;
    private JTextField jobDateTextField;
    private JTextField staffNameTextField;
    private JTextField appointedByTextField;
    private JTextField qualificationTextField;
    private JTextField salaryTextField;

    private JCheckBox joinedCheckBox;

    private JTextField weeklyFractionalHoursTextField;
    private JTextField workingHoursTextField;
    private JTextField wagesPerHourTextField;
    private JTextField shiftsTextField;

    private JButton addFulltimeStaffButton;
    private JButton addParttimeStaffButton;
    private JButton addSalaryButton;
    private JButton addWorkingShiftsButton;
    private JButton terminateButton1;
    private JButton terminateButton2;

    private JTextField displayNumber1TextField;
    private JTextField displayNumber2TextField;

    public RecrutmentSystem() {
        setTitle("CW GridLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // 

        // Labels and Text Input.
        JLabel vacancyLabel = new JLabel("Vacancy:");
        vacancyTextField = new JTextField(10);

        JLabel designationLabel = new JLabel("Designation:");
        designationTextField = new JTextField(10);

        JLabel jobTypeLabel = new JLabel("Job Type:");
        jobTypeTextField = new JTextField(10);

        JLabel jobDateLabel = new JLabel("Job Date:");
        jobDateTextField = new JTextField(10);

        JLabel staffNameLabel = new JLabel("Staff Name:");
        staffNameTextField = new JTextField(10);

        JLabel appointedByLabel = new JLabel("Appointed By:");
        appointedByTextField = new JTextField(10);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationTextField = new JTextField(10);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryTextField = new JTextField(10);

        joinedCheckBox = new JCheckBox("Joined");
        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly Fractional Hours:");
        weeklyFractionalHoursTextField = new JTextField(10);

        JLabel workingHoursLabel = new JLabel("Working Hours:");
        workingHoursTextField = new JTextField(10);

        JLabel wagesPerHourLabel = new JLabel("Wages Per Hour:");
        wagesPerHourTextField = new JTextField(10);

        JLabel shiftsLabel = new JLabel("Shifts:");
        shiftsTextField = new JTextField(10);

        addFulltimeStaffButton = new JButton("Add Fulltime Staff");
        addParttimeStaffButton = new JButton("Add Parttime Staff");
        addSalaryButton = new JButton("Add Salary");
        addWorkingShiftsButton = new JButton("Add Working Shifts");
        terminateButton1 = new JButton("Terminate");
        terminateButton2 = new JButton("Terminate");

        JLabel displayNumber1Label = new JLabel("display Number:");
        displayNumber1TextField = new JTextField(10);

        JLabel displayNumber2Label = new JLabel("display Number:");
        displayNumber2TextField = new JTextField(10);

        //Layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(vacancyLabel, gbc);
        gbc.gridx = 1;
        add(vacancyTextField, gbc);
        gbc.gridx = 2;
        add(designationLabel, gbc);
        gbc.gridx = 3;
        add(designationTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(jobTypeLabel, gbc);
        gbc.gridx = 1;
        add(jobTypeTextField, gbc);
        gbc.gridx = 2;
        add(jobDateLabel, gbc);
        gbc.gridx = 3;
        add(jobDateTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(staffNameLabel, gbc);
        gbc.gridx = 1;
        add(staffNameTextField, gbc);
        gbc.gridx = 2;
        add(appointedByLabel, gbc);
        gbc.gridx = 3;
        add(appointedByTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(qualificationLabel, gbc);
        gbc.gridx = 1;
        add(qualificationTextField, gbc);
        gbc.gridx = 2;
        add(salaryLabel, gbc);
        gbc.gridx = 3;
        add(salaryTextField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(joinedCheckBox, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(weeklyFractionalHoursLabel, gbc);
        gbc.gridx = 1;
        add(weeklyFractionalHoursTextField, gbc);
        gbc.gridx = 2;
        add(workingHoursLabel, gbc);
        gbc.gridx = 3;
        add(workingHoursTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(wagesPerHourLabel, gbc);
        gbc.gridx = 1;
        add(wagesPerHourTextField, gbc);
        gbc.gridx = 2;
        add(shiftsLabel, gbc);
        gbc.gridx = 3;
        add(shiftsTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        add(addFulltimeStaffButton, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        add(addParttimeStaffButton, gbc);
        gbc.gridwidth = 2;

        gbc.gridx = 0;
        gbc.gridy = 8;
        add(addSalaryButton, gbc);
        gbc.gridx = 2;
        add(addWorkingShiftsButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        add(terminateButton1, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        add(terminateButton2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        add(displayNumber1Label, gbc);
        gbc.gridx = 1;
        add(displayNumber1TextField, gbc);
        gbc.gridx = 2;
        add(displayNumber2Label, gbc);
        gbc.gridx = 3;
        add(displayNumber2TextField, gbc);

        // Add action listeners to the buttons.  These listeners are intentionally empty.
        addFulltimeStaffButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Add Fulltime Staff button click
                }
            });

        addParttimeStaffButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Add Parttime Staff button click
                }
            });

        addSalaryButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Add Salary button click
                }
            });

        addWorkingShiftsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Add Working Shifts button click
                }
            });

        terminateButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Terminate button 1 click
                }
            });

        terminateButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Terminate button 2 click
                }
            });

        //Pack the window
        pack();
        //Set the window to be visible
        setVisible(true);
        setLocationRelativeTo(null); // Center the window
    }

    public static void main(String[] args) {
        // Use the Event Dispatch Thread for Swing GUIs
        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new RecrutmentSystem();
                }
            });
    }
}
