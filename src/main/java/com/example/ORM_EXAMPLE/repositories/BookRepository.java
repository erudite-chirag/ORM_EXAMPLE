package com.example.ORM_EXAMPLE.repositories;

import com.example.ORM_EXAMPLE.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {
    // Additional query methods (if needed) can be defined here
    // Example: Find book by bookId
    BookModel findByBookId(Integer bookId);

//    List<BookModel> getBookTitle(String bookId);
}
