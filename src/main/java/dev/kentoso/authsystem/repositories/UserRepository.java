package dev.kentoso.authsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.kentoso.authsystem.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
