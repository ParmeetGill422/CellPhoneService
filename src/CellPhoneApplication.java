import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        phone.serialNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("What model is the phone? ");
        phone.model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        phone.carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        phone.phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        phone.owner = scanner.nextLine();

        System.out.println("\nPhone Information:");
        System.out.println("Serial Number: " + phone.serialNumber);
        System.out.println("Model: " + phone.model);
        System.out.println("Carrier: " + phone.carrier);
        System.out.println("Phone Number: " + phone.phoneNumber);
        System.out.println("Owner: " + phone.owner);
    }
}