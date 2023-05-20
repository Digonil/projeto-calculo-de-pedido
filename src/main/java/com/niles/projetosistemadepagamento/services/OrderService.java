package com.niles.projetosistemadepagamento.services;

import com.niles.projetosistemadepagamento.entitities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - (order.getBasic()) * (1 - order.getDiscount()) + shippingService.shipment(order);
    }
}
