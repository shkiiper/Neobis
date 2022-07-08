package com.example.AutoMarket.Controller;

import com.example.AutoMarket.Entity.Order;
import com.example.AutoMarket.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        return orderService.getAllOrder();
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return orderService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Order order){
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return orderService.deleteOrder(id);
    }
}