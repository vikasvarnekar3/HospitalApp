package com.example.hospitalapp.Model;

public class Users {

    private String address,email,name,phone_no,password;

    public Users()
    {

    }

    public Users(String address, String email, String name, String phone_no, String password)
    {
        this.address = address;
        this.email = email;
        this.name = name;
        this.phone_no = phone_no;
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
