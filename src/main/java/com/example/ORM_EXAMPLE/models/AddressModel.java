package com.example.ORM_EXAMPLE.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class AddressModel {
    @Id
    private int addressId;
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String country;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private UserModel user;

    public AddressModel(int addressId, String street, String city, String country) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
