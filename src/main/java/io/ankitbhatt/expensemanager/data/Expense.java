package io.ankitbhatt.expensemanager.data;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;


@Entity @Data
public class Expense {

    @Id
    @GeneratedValue
        Integer id;
        String name;
        String description;
        Double amount;
        String type;
        Date expenseDate;

    private Expense(){

    }








}
