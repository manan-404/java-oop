import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AlphabetButtonGrid extends JFrame {
    JTextField displayField;
    JButton[] buttons = new JButton[26];

    AlphabetButtonGrid() {
        setTitle("Alphabet Button Grid");
        setSize(640, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel displayLabel = new JLabel("Letter clicked:");
        displayLabel.setBounds(100, 30, 110, 30);
        add(displayLabel);

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setToolTipText("Shows the last letter clicked");
        displayField.setBounds(215, 30, 200, 30);
        add(displayField);

        int x = 30;
        int y = 100;
        int btnWidth = 70;
        int btnHeight = 30;
        int hGap = 15;
        int vGap = 15;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("?");
            buttons[i].setBounds(x, y, btnWidth, btnHeight);

            final int index = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String letter = String.valueOf((char) ('A' + index));
                    buttons[index].setText(letter);
                    displayField.setText(letter);
                }
            });

            add(buttons[i]);
            x += btnWidth + hGap;

            if (x > 550) {
                x = 30;
                y += btnHeight + vGap;
            }
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new AlphabetButtonGrid();
    }
}
