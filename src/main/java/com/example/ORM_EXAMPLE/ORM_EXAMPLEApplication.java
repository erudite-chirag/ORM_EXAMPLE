package com.example.ORM_EXAMPLE;

import com.example.ORM_EXAMPLE.models.AddressModel;
import com.example.ORM_EXAMPLE.models.UserModel;
import com.example.ORM_EXAMPLE.repositories.BookRepository;
import com.example.ORM_EXAMPLE.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ORM_EXAMPLEApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ORM_EXAMPLEApplication.class);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(ORM_EXAMPLEApplication.class, args);

	}

//	@Override
	public void run(String... args) throws  Exception{

//		//One to One
//// Create a new user and associate with the book
//		UserModel user = new UserModel();
//		user.setUserId(456);
//		user.setFirstName("John");
//		user.setLastName("Doe");
//
//
//		// Create a new book
//		BookModel book = new BookModel();
//		book.setBookTitle("Effective Java");
//		book.setBookId(123);
//
//		//Mapping one-to-one relation
//		book.setUser(user);
//		user.setBook(book);
//
//		userRepository.save(user); // Assume userRepository is a JpaRepository<UserModel, Integer>
//		//If using cascade property in User Model than when user will save it will auto save the book
////		bookRepository.save(book); // Assume bookRepository is a JpaRepository<BookModel, Integer>
//
//
//		UserModel user1 = userRepository.findByUserId(456);
//		logger.info("User:= {}", user1.getFirstName());
//
//		BookModel book1 = user1.getBook();
//		logger.info("BOOK:= {}",book1.getBookTitle());
//
//
//// Fetching the user and checking the associated book
//		Optional<UserModel> retrievedUser = userRepository.findById(user.getUserId());
//		if (retrievedUser.isPresent()) {
//			UserModel u = retrievedUser.get();
//			System.out.println("User: " + u.getFirstName() + " " + u.getLastName());
//			System.out.println("Book: " + u.getBook().getBookTitle());
//		}
//


		//ONE TO MANY
		UserModel user= new UserModel();
		user.setUserId(101);
		user.setFirstName("Parth");
		user.setLastName("Sharma");

		AddressModel a1 = new AddressModel();
		a1.setAddressId(1001);
		a1.setStreet("26/A");
		a1.setCity("Delhi");
		a1.setCountry("India");
		a1.setUser(user);//bidirectional mapping

		AddressModel a2 = new AddressModel();
		a2.setAddressId(1012);
		a2.setStreet("56/D");
		a2.setCity("Lucknow");
		a2.setCountry("India");
		a2.setUser(user);//bidirectional mapping

		List<AddressModel> addressModelList =new ArrayList<>();
		addressModelList.add(a1);
		addressModelList.add(a2);

		user.setAddressModelList(addressModelList);

		UserModel save = userRepository.save(user);
		logger.info("User created : with address");

	}

}
