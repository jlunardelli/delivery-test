package com.jorgel.delivery.service;

import com.jorgel.delivery.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;

@Service
public class OrderService {
//    @Autowired
//    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        return order;
//        return orderRepository.save(order);
    }

    public Order findById(Integer id){
        return new Order(id, "Produto " + id, id * 3.5);
//        return orderRepository.findOne(id);
    }

    public Iterable<Order> findAll(){
        Iterable<Order> orders = new ArrayList<>();
        return orders;
//        return orderRepository.findAll();
    }

    public void delete(Integer id) {
//        orderRepository.delete(id);
    }
}
