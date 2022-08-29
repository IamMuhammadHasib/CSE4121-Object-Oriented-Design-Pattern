public class objectCreation {
    private static objectCreation instance = new objectCreation();

    private objectCreation() {
    }

    public static objectCreation getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println(">> This is a single object.");
    }
}