package com.skindia.placeorder;

import java.util.List;

public interface OrderService {
public void placeOrder(OrderInfo orderInfo) ;
public List<Order> getOrdersByUserId(String userId);
}