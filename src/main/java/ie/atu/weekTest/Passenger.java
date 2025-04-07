package ie.atu.weekTest;

public class Passenger {
    String title;
    String firstName;
    String lastName;
    int age;
    String idCode;

    public Passenger() {
        title = "Mr";
        firstName = "Paul";
        lastName = "Lennon";
        age = 21;
        idCode = "123456";
    }

    public Passenger(String title, String firstName, String lastName, int age, String idCode){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
}
