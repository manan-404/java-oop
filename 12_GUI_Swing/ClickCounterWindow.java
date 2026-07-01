import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickCounterWindow extends JFrame {
    JLabel counterLabel;
    JTextField counterField;
    JButton counterButton;
    int counter = 0;

    ClickCounterWindow() {
        setTitle("Click Counter");
        setSize(400, 200);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        counterLabel = new JLabel("Counter:");
        counterLabel.setBounds(25, 60, 70, 30);
        add(counterLabel);

        counterField = new JTextField(Integer.toString(counter));
        counterField.setEditable(false);
        counterField.setToolTipText("Shows total clicks");
        counterField.setBounds(100, 60, 120, 30);
        add(counterField);

        counterButton = new JButton("Click Me");
        counterButton.setBounds(250, 60, 100, 30);
        counterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterField.setText(Integer.toString(counter));
            }
        });
        add(counterButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounterWindow();
    }
}
