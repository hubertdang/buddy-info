public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Jane Doe";
        this.address = "123 Waterway";
        this.phoneNumber = "6137461499";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo();
        myBuddy.setName("Homer");
        System.out.println("Hello " + myBuddy.getName());
    }
}
