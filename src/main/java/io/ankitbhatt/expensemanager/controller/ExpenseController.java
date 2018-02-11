package io.ankitbhatt.expensemanager.controller;

import io.ankitbhatt.expensemanager.data.Expense;
import io.ankitbhatt.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

        @Autowired
        private ExpenseService expenseService;

        @GetMapping(path = "/expenses")
        public List<Expense> getAllExpenses(){
                return expenseService.getAllExpenses();
        }

        @GetMapping(path = "/expenses/{id}")
        public Expense getAllExpenses(@PathVariable Integer id){
                return expenseService.getExpense(id);
        }

        @RequestMapping(path = "/expenses",method = RequestMethod.POST)
        public void getAllExpenses(@RequestBody Expense expense){
                expenseService.addExpense(expense);
        }

        @RequestMapping(method=RequestMethod.PUT, value="/expenses/{id}")
        public void updateExpense(@RequestBody Expense expense,@PathVariable Integer id) {
                expenseService.updateExpense(id,expense);
        }

        @RequestMapping(method=RequestMethod.DELETE, value="/expenses/{id}")
        public void deleteExpense(@PathVariable Integer id) {
                expenseService.deleteExpense(id);
        }

}
