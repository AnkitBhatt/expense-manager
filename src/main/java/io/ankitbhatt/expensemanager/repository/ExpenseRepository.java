package io.ankitbhatt.expensemanager.repository;

import io.ankitbhatt.expensemanager.data.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense,Integer> {


}
