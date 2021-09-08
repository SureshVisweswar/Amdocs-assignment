package com.amdocs.assignment;

public class Users {
    private String username;
    private String password;
    private String address;
    private String phoneno;
    Users() {}
    Users( String username,String password){
        this.username=username;
        this.password=password;
        this.address=address;
        this.phoneno=phoneno;
    }
    public String getUsername(){return this.username;}
    public String getaddress(){return this.address;}
    public String getphoneno(){return this.phoneno;}
    public String getpassword() { return this.password;}
    public void setusername(String username) { this.username = username;}
    public void setaddress(String address) { this.address = address;}
    public void setphoneno(String phoneno) { this.phoneno = phoneno;}
    public void setpassword(String password) { this.password = password;}

}
