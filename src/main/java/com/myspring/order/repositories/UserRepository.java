package com.myspring.order.repositories;

import com.myspring.order.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
