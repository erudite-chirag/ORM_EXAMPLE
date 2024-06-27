package com.example.ORM_EXAMPLE.repositories;

import com.example.ORM_EXAMPLE.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    // Additional query methods (if needed) can be defined here
    // Example: Find user by userId

    UserModel findByUserId(Integer userId);

//    @Modifying
//    @Query("SELECT u FROM UserModel u WHERE u.firstName = :firstName")
//    UserModel findByFirstName(@Param("firstName") String firstName);

}







//package com.example.ORM_EXAMPLE.repositories;
//
//import com.example.ORM_EXAMPLE.models.UserModel;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface UserRepository extends JpaRepository <UserModel, Integer> {
//
//    Optional<UserModel> findByUsername(String username);
//
//    List<UserModel> findAll();
//
//    @Modifying
//    @Transactional
//    @Query(value="UPDATE users u SET u.first_name = :firstname, u.last_name = :lastname, u.password = :password WHERE u.username = :username", nativeQuery = true)
//    void updateUserDetails(String username, String firstname, String lastname, String password);
//
//    @Modifying
//    @Transactional
//    void deleteByUsername(String username);
//
////    @Query(value="SELECT password FROM users WHERE username = u.username", nativeQuery = true)
//    Optional<UserModel> findPasswordByUsername(String username);
//
////    String findPasswordById(int id);
//}