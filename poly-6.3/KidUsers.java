import java.util.Objects;

public class KidUsers implements LibraryUser{
    private int age;
    private String bookType;

    public void registerAccount() {
        if(this.age <= 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    };

    public void requestBook() {
        if(this.bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    };

    public KidUsers() {
    }

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return this.bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public KidUsers age(int age) {
        setAge(age);
        return this;
    }

    public KidUsers bookType(String bookType) {
        setBookType(bookType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof KidUsers)) {
            return false;
        }
        KidUsers kidsUsers = (KidUsers) o;
        return age == kidsUsers.age && Objects.equals(bookType, kidsUsers.bookType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, bookType);
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", bookType='" + getBookType() + "'" +
            "}";
    }
    
}
