import java.util.Objects;

public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;


    public AdultUser() {
    }

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public void registerAccount() {
        if(this.age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    };

    public void requestBook() {
        if(this.bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    };

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

    public AdultUser age(int age) {
        setAge(age);
        return this;
    }

    public AdultUser bookType(String bookType) {
        setBookType(bookType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AdultUser)) {
            return false;
        }
        AdultUser adultUser = (AdultUser) o;
        return age == adultUser.age && Objects.equals(bookType, adultUser.bookType);
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
