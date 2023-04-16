package com.demo_app.rest_api;

public class cloudvendor {
    private String vendor_id;
    private String vendor_name;
    private String vendor_Phno;

    public cloudvendor() {

    }

    public cloudvendor(String vendor_id, String vendor_name, String vendor_Phno) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_id;
        this.vendor_Phno = vendor_id;

    }

    public String getvendor_id() {
        return vendor_id;
    }

    public void setvendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getvendor_name() {
        return vendor_name;
    }

    public void setvendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getvendor_Phno() {
        return vendor_Phno;
    }

    public void setvendor_Phno(String vendor_Phno) {
        this.vendor_Phno = vendor_Phno;
    }

}
