package com.example.apispringbackend;

public class PhoneDTO {
    private String number;

    public PhoneDTO(){
    }

    public PhoneDTO(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
