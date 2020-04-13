package com.example.exam2o;

public class clist  {
    private int id;
    private String Name,number;


    public clist(int id, String name, String number) {
        this.id = id;
        Name = name;
        this.number = number;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }


}
