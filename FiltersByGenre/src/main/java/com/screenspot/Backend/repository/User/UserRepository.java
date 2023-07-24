package com.screenspot.Backend.repository.User;

import com.screenspot.Backend.entiry.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
