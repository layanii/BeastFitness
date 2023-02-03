package com.zephgv.mad.beastfitness;

public class UserHelperClass {

    String email,password;

    public UserHelperClass(String email, String password) {

        this.email = email;
        this.password = password;

    }

    public UserHelperClass() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
