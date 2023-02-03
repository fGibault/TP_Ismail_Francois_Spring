package service;

import modele.Order;
import repository.OrderRepository;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;
    public List<Order> listsAll() {

        return orderRepository.findAll();
    }

    public void save(Order order) {
        orderRepository.save(order);
    }
}
