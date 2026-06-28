interface Greetable {
    void greet(); // regular method — must be implemented

    // default method — has a body, optional to override
    default void farewell() {
        System.out.println("Goodbye! Have a nice day.");
    }
}

class FormalGreeting implements Greetable {
    public void greet() {
        System.out.println("Good morning, Sir/Ma'am.");
    }

    // Overriding the default method
    @Override
    public void farewell() {
        System.out.println("Good day to you. Farewell.");
    }
}

class CasualGreeting implements Greetable {
    public void greet() {
        System.out.println("Hey! What's up?");
    }

    // Not overriding farewell — uses default version
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        FormalGreeting formal = new FormalGreeting();
        CasualGreeting casual = new CasualGreeting();

        System.out.println("=== Formal ===");
        formal.greet();
        formal.farewell(); // overridden version

        System.out.println("\n=== Casual ===");
        casual.greet();
        casual.farewell(); // default version from interface
    }
}
