import java.time.LocalDate;
public class Customer {
    private static int NEXT_CUSTOMER_NUMBER = 1;
    private int number;
    private String name;
    private String address;
    private String postCode;
    private int phoneNumber;
    private LocalDate dateOfBirth;

    public Customer(String aName, String anAddress, String aPostCode, int aPhoneNumber, LocalDate aDate){
        this.name = aName;
        this.address = anAddress;
        this.postCode = aPostCode;
        this.phoneNumber = aPhoneNumber;
        this.dateOfBirth = aDate;

        this.number = Customer.NEXT_CUSTOMER_NUMBER;
        Customer.NEXT_CUSTOMER_NUMBER++;
    }

    /**
     * Getter Method for Name
     * @return the Aame
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter Method for Address
     * @return the Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter Method for PostCode
     * @return the PostCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Getter Method for PhoneNumber
     * @return the PhoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Getter Method for DOB
     * @return the DOB
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Getter Method for Customer Number
     * @return the Number
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * Setter Method for Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter Method for Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter Method for PostCode
     * @param postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Setter Method for PhoneNumber
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * To String Method for displaying customer details
     */
    public void displayDetails() {
        System.out.println(this.getNumber() + "\t" + this.getName() + "\t" + this.getAddress() + "\t" + getPostCode() + "\t" + this.getPhoneNumber() + "\t" + this.getDateOfBirth().toString());
    }

    @Override
    public boolean equals(Object obj){
        boolean equal = false; //Local variable used to return whether the objects are considered equal

        if (obj == this){ //If memory references of the two objects match, we consider them equal by default
            equal = true;
        }
        else { //Memory references do not match
            if (obj instanceof Customer){ //If parameter object is an instance of the Visitor class
                Customer otherCustomer = (Customer) obj; //cast the parameter object to an object of the Visitor class

                if (otherCustomer.getNumber() == this.getNumber()){ //Compare the ID's
                    equal = true; //return true if the ID's match
                }
            }
        }

        return equal;
    }
}
