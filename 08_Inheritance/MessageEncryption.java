class Message {
    String text;

    void setText(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    public String toString() {
        return "Text: " + text;
    }
}

class SMS extends Message {
    private String recipientNumber;

    void setRecipientNumber(String number) {
        this.recipientNumber = number;
    }

    String getRecipientNumber() {
        return recipientNumber;
    }

    public String toString() {
        return super.toString() + "\nRecipient: " + recipientNumber;
    }
}

class Email extends Message {
    String sender;
    String receiver;
    String subject;

    Email(String sender, String receiver, String subject) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + "\nSender: " + sender + "\nReceiver: " + receiver + "\nSubject: " + subject;
    }
}

class MessageEncryption {
    static boolean containsKeyword(Message message, String keyword) {
        return message.toString().contains(keyword);
    }

    static void encryptMessage(Message message) {
        char[] arr = message.text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'Z') {
                arr[i] = 'A';
            } else if (arr[i] == 'z') {
                arr[i] = 'a';
            } else if ((arr[i] >= 'A' && arr[i] < 'Z') || (arr[i] >= 'a' && arr[i] < 'z')) {
                arr[i] = (char) (arr[i] + 1);
            }
        }
        System.out.print("Encrypted: ");
        for (char c : arr) System.out.print(c);
        System.out.println();
    }

    public static void main(String[] args) {
        SMS sms = new SMS();
        sms.setRecipientNumber("03001234567");
        sms.setText("I need your help");

        Email email = new Email("Tayyab", "Manan", "Result Notification");
        email.setText("Hello Manan, your result is out.");

        System.out.println("SMS contains 'need': " + containsKeyword(sms, "need"));
        System.out.println("Email contains 'Manan': " + containsKeyword(email, "Manan"));

        System.out.println("\nOriginal: " + email.getText());
        encryptMessage(email);
    }
}
