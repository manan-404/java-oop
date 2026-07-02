import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CheckBoxRadioButtonDemo extends JFrame {
    JLabel statusLabel;

    CheckBoxRadioButtonDemo() {
        setTitle("CheckBox and RadioButton Demo");
        setSize(500, 400);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // CheckBoxes — multiple can be selected
        JLabel checkLabel = new JLabel("Select your hobbies:");
        checkLabel.setBounds(30, 20, 200, 30);
        add(checkLabel);

        JCheckBox coding = new JCheckBox("Coding");
        coding.setBounds(30, 55, 100, 25);
        add(coding);

        JCheckBox gaming = new JCheckBox("Gaming");
        gaming.setBounds(30, 85, 100, 25);
        add(gaming);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(30, 115, 100, 25);
        add(reading);

        // RadioButtons — only one can be selected at a time
        JLabel radioLabel = new JLabel("Select your gender:");
        radioLabel.setBounds(30, 160, 200, 30);
        add(radioLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(30, 195, 80, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(120, 195, 90, 25);

        // ButtonGroup ensures only one radio is selected
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        add(male);
        add(female);

        statusLabel = new JLabel("Your selections will appear here.");
        statusLabel.setBounds(30, 320, 420, 25);
        add(statusLabel);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(180, 265, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hobbies = "";
                if (coding.isSelected())  hobbies += "Coding ";
                if (gaming.isSelected())  hobbies += "Gaming ";
                if (reading.isSelected()) hobbies += "Reading ";
                if (hobbies.isEmpty())    hobbies = "None";

                String gender = male.isSelected() ? "Male" :
                                female.isSelected() ? "Female" : "Not selected";

                statusLabel.setText("Hobbies: " + hobbies + "| Gender: " + gender);
            }
        });
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxRadioButtonDemo();
    }
}
