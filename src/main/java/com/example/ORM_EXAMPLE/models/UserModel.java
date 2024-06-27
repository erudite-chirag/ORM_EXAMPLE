package com.example.ORM_EXAMPLE.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserModel {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;

    @Column(nullable = false, unique = true)
    private int userId;

    @Column(nullable = false)
    private String firstName;

    @Column( nullable = false)
    private String lastName;

    @JoinColumn(name = "book_id", referencedColumnName = "bookId") // Defines the foreign key column
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private BookModel book;

    //many address:
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AddressModel> addressModelList = new ArrayList<>();


    public UserModel(int userId, String firstName, String lastName, BookModel book, List<AddressModel> addressModelList) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
        this.addressModelList = addressModelList;
    }

    public List<AddressModel> getAddressModelList() {
        return addressModelList;
    }

    public void setAddressModelList(List<AddressModel> addressModelList) {
        this.addressModelList = addressModelList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }
}

