package com.lvh.phan6.model;

public class Student {
    private String MSHS;
    private String TenHS;
    private String Lop;

    public Student() {
    }

    public Student(String MSHS, String tenHS, String lop) {
        this.MSHS = MSHS;
        TenHS = tenHS;
        Lop = lop;
    }

    public String getMSHS() {
        return MSHS;
    }

    public void setMSHS(String MSHS) {
        this.MSHS = MSHS;
    }

    public String getTenHS() {
        return TenHS;
    }

    public void setTenHS(String tenHS) {
        TenHS = tenHS;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
}
