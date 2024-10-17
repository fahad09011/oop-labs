public class Address {
    // instances
    private String street;
    private String city;
    private String county;

    // constructor for Address class
    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }
    public String toString(){
        return street+" "+city+" "+county;
            }

}