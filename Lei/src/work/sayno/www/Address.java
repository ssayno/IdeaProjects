package work.sayno.www;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipcode;
    public Address(){}
    public Address(String country, String province, String city, String street, String zipcode){
        this.setCountry(country);
        this.setProvince(province);
        this.setCity(city);
        this.setStreet(street);
        this.setZipcode(zipcode);
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
