package com.example.ORM_EXAMPLE.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "books")
public class BookModel {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    @Column(nullable = false)
    private int bookId;

    @Column(nullable = false)
    private String bookTitle;

    @JoinColumn(name = "user_id", referencedColumnName = "userId") // Defines the foreign key column
    @OneToOne
    private UserModel user;

    public BookModel(int bookId, String bookTitle, UserModel user) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.user = user;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
