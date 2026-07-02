import javax.swing.*;

class JOptionPaneDemo {
    public static void main(String[] args) {
        // 1. Message dialog — just shows info
        JOptionPane.showMessageDialog(null, "Welcome to Java Swing!");

        // 2. Input dialog — takes text input from user
        String name = JOptionPane.showInputDialog("Enter your name:");

        // 3. Confirm dialog — yes/no/cancel
        int choice = JOptionPane.showConfirmDialog(null,
            "Hello " + name + "! Do you like Java?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION);

        // 4. Message based on confirm choice
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                "Great! Keep coding.",
                "Response",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                "That's okay. You'll like it soon!",
                "Response",
                JOptionPane.WARNING_MESSAGE);
        }
    }
}
