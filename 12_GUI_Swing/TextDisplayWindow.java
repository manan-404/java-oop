import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextDisplayWindow extends JFrame {
    JTextField inputField;
    JTextField displayField;
    JButton okButton;

    TextDisplayWindow() {
        setTitle("Text Display");
        setSize(600, 300);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel inputLabel = new JLabel("Input:");
        inputLabel.setBounds(50, 90, 60, 30);
        add(inputLabel);

        inputField = new JTextField("Type a message here...");
        inputField.setBounds(110, 90, 400, 30);
        add(inputField);

        JLabel displayLabel = new JLabel("Output:");
        displayLabel.setBounds(50, 150, 60, 30);
        add(displayLabel);

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setToolTipText("This field is not editable");
        displayField.setBounds(110, 150, 400, 30);
        add(displayField);

        okButton = new JButton("OK");
        okButton.setBounds(250, 210, 100, 30);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(inputField.getText());
            }
        });
        add(okButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextDisplayWindow();
    }
}
