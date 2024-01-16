package models;

public enum UserInformation {
    JUAN("Juan","Gonzales","1994/01/04","juanMG@gmail.com","123456","45678923","3424665752"),
    PEDRO("PEDRO","PEREZ","1999/01/06","pedrin@gmail.com","123456","07824567","3333333322");

    private final String firstName;
    private final String lastName;
    private final String bornDate;
    private final String email;
    private final String password;
    private final String docNumber;
    private final String phone;


    UserInformation(String firstName, String lastName, String bornDate, String email, String password, String docNumber, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.email = email;
        this.password = password;
        this.docNumber = docNumber;
        this.phone = phone;
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDocNumber() {
        return docNumber;
    }
    public String getPhone() {
        return phone;
    }
}
