package com.labz.addressbook;

public class ContactPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phonenumber;
	private String email;

	
	
	public ContactPerson(String firstName,String lastName,String address,String city,String state,int zip,long phonenumber,String email)
    {
        this.firstName= firstName;
        this.lastName= lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phonenumber=phonenumber;
        this.email=email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zip;
    }

    public void setZipCode(int zipCode) {
        this.zip = zipCode;
    }

    public long getMobileNo() {
        return phonenumber;
    }

    public void setMobileNo(long mobileNo) {
        this.phonenumber = mobileNo;
    }

    public String getEmailId() {
        return email;
    }

    public void setEmailId(String emailId) {
        this.email = emailId;
    }
    

}
