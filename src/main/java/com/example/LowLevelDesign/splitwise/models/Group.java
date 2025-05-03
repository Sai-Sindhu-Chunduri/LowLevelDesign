package com.example.LowLevelDesign.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Group extends BaseModel {
    private String name;

    @ManyToMany
    private List<User> members;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}

//  1         M
// Group     User      => M:M
//   M         1
//
//
//  1         1
// Group     Admin
//   M         1