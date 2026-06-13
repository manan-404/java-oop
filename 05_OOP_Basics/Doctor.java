import java.util.Scanner;

class Doctor {
    String name;
    String qualification;

    void setInfo(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.print("Qualification: " + qualification);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Doctor doc1 = new Doctor();

        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter qualification: ");
        String qualification = input.nextLine();

        doc1.setInfo(name, qualification);
        doc1.show();
    }
}
