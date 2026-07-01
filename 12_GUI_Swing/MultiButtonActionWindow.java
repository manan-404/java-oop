import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MultiButtonActionWindow extends JFrame {
    JLabel statusLabel;
    JButton okButton;
    JButton submitButton;
    JButton cancelButton;

    MultiButtonActionWindow() {
        setTitle("Multi Button Actions");
        setSize(500, 300);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Click any button below:");
        titleLabel.setBounds(170, 60, 200, 30);
        add(titleLabel);

        okButton = new JButton("OK");
        okButton.setBounds(100, 120, 90, 30);
        add(okButton);

        submitButton = new JButton("Submit");
        submitButton.setBounds(205, 120, 90, 30);
        add(submitButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(310, 120, 90, 30);
        add(cancelButton);

        statusLabel = new JLabel("No button clicked yet.");
        statusLabel.setBounds(150, 190, 250, 30);
        add(statusLabel);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("OK button was clicked.");
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Submit button was clicked.");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel button was clicked.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiButtonActionWindow();
    }
}
