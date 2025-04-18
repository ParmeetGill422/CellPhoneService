public class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    public void dial(String targetNumber) {
        System.out.println(owner + "'s phone is calling " + targetNumber);
    }
}