package com.example.apispringbackend;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClientDTO {
    private int id;
    private String name;
    private String email;
    private int age;
    private String gender;
    private List<String> phone;
    private String address;

    public ClientDTO() {

    }

    public ClientDTO(int id, String name, String email, int age, String gender, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phone = Collections.singletonList(phone);
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Collections.singletonList(phone);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClientDTO client = (ClientDTO) o;
        return id == client.id && age == client.age && Objects.equals(name, client.name) && Objects.equals(email, client.email) && Objects.equals(gender, client.gender) && Objects.equals(phone, client.phone) && Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, age, gender, phone, address);
    }
}
