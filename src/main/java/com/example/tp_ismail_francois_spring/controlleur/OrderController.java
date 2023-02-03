package controlleur;

import modele.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;
import service.ProductService;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/orders")
    public List<Order> list(){
        return orderService.listsAll();
    }
    @PostMapping  //inserer un Order
    public void registerNewOrder(@RequestBody Order order){orderService.save(order);}
}
