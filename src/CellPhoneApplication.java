import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First phone
        CellPhone phone1 = new CellPhone();
        System.out.print("Enter serial number for phone 1: ");
        phone1.serialNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter model for phone 1: ");
        phone1.model = scanner.nextLine();
        System.out.print("Enter carrier for phone 1: ");
        phone1.carrier = scanner.nextLine();
        System.out.print("Enter phone number for phone 1: ");
        phone1.phoneNumber = scanner.nextLine();
        System.out.print("Enter owner for phone 1: ");
        phone1.owner = scanner.nextLine();

        // Second phone
        CellPhone phone2 = new CellPhone();
        System.out.print("\nEnter serial number for phone 2: ");
        phone2.serialNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter model for phone 2: ");
        phone2.model = scanner.nextLine();
        System.out.print("Enter carrier for phone 2: ");
        phone2.carrier = scanner.nextLine();
        System.out.print("Enter phone number for phone 2: ");
        phone2.phoneNumber = scanner.nextLine();
        System.out.print("Enter owner for phone 2: ");
        phone2.owner = scanner.nextLine();

        // Display both phones
        System.out.println("\nPhone 1 Info:");
        display(phone1);
        System.out.println("\nPhone 2 Info:");
        display(phone2);

        // Dial each other
        System.out.println();
        phone1.dial(phone2.phoneNumber);
        phone2.dial(phone1.phoneNumber);
    }

    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.serialNumber);
        System.out.println("Model: " + phone.model);
        System.out.println("Carrier: " + phone.carrier);
        System.out.println("Phone Number: " + phone.phoneNumber);
        System.out.println("Owner: " + phone.owner);
    }
}