package com.example.LowLevelDesign.splitwise.repository;

import com.example.LowLevelDesign.splitwise.models.ExpenseUser;
import com.example.LowLevelDesign.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
    List<ExpenseUser> findByUser(User user);
}
