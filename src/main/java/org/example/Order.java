package org.example;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    int idOrder;
    String dateOrder;
    float amount;
    int customerId;

}
