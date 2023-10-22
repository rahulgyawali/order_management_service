package com.project.orderservice.service;

import com.project.orderservice.dao.OrderRepository;
import com.project.orderservice.model.Order;
import com.project.orderservice.model.OrderLineItems;
import com.project.orderservice.request.OrderLineItemsRequest;
import com.project.orderservice.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest request){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = request.getOrderLineItemsRequestList()
                .stream()
                .map(this :: mapOrderLine)
                .toList();
        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItems mapOrderLine(OrderLineItemsRequest orderLineItemsRequest){
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsRequest.getPrice());
        orderLineItems.setSkuCode(orderLineItemsRequest.getSkuCode());
        orderLineItems.setQuantity(orderLineItemsRequest.getQuantity());
        return orderLineItems;
    }
}
