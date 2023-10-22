package com.project.orderservice.controller;

import com.project.orderservice.request.OrderRequest;
import com.project.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String orderPlaced(@RequestBody OrderRequest request){
        orderService.placeOrder(request);
        return  "Order Placed Successfully";
    }
}
