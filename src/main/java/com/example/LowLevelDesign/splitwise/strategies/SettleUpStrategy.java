package com.example.LowLevelDesign.splitwise.strategies;

import com.example.LowLevelDesign.splitwise.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
