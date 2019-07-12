package com.example.android.quakereport;

public class earthquake {
    private String mag;
    private String loc;
    private String date;

    public earthquake(String magni, String locat, String dat){
        mag=magni;
        loc= locat;
        date=dat;
    }

    public String getMag(){return mag;}
    public String getloc(){return loc;}
    public String getdate(){return date;}
}
