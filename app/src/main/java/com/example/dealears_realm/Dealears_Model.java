package com.example.dealears_realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Dealears_Model extends RealmObject {

    @PrimaryKey
    private String d_phone;
    private String d_name;
    private String d_address;


    public String getD_address() {
        return d_address;
    }

    public void setD_address(String d_address) {
        this.d_address = d_address;
    }



    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_phone() {
        return d_phone;
    }

    public void setD_phone(String d_phone) {
        this.d_phone = d_phone;
    }
}
