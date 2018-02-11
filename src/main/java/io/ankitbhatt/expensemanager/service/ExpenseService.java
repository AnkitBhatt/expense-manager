package io.ankitbhatt.expensemanager.service;

import io.ankitbhatt.expensemanager.data.Expense;
import io.ankitbhatt.expensemanager.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        List<Expense> expenses= new ArrayList<>();
        expenseRepository.findAll().forEach(expenses :: add);
        return expenses;
    }

    public Expense getExpense(Integer id){
        return expenseRepository.findOne(id);
    }

    public void addExpense(Expense expense){
        expenseRepository.save(expense);
    }

    public void updateExpense(int id, Expense expense){
        expense.setId(id);
        expenseRepository.save(expense);
    }

    public void deleteExpense(Integer id){
        expenseRepository.delete(id);
    }





}
