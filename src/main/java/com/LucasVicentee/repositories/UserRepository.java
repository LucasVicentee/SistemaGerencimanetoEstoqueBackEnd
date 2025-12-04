package com.LucasVicentee.repositories;

import com.LucasVicentee.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
