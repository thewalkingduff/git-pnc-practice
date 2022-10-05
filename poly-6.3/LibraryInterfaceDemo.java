public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kidUser = new KidUsers();
        kidUser.setAge(10);
        // kidUser.setAge(18);
        kidUser.registerAccount();
        kidUser.setBookType("Kids");
        kidUser.setBookType("Fiction");

        AdultUser adult = new AdultUser();
        adult.setAge(23);
        // adult.setAge(5);
        adult.registerAccount();
        adult.setBookType("Kids");
        adult.setBookType("Fiction");

    }
}
