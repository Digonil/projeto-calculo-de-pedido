package com.niles.projetosistemadepagamento.services;

import com.niles.projetosistemadepagamento.entitities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private double shipmentValue;

    public double shipment(Order order) {

        if (order.getBasic() < 100) {
            shipmentValue = 20.00;
        } else if (order.getBasic() <= 200) {
            shipmentValue = 12.00;
        } else {
            shipmentValue = 0.0;
        }
        return shipmentValue;
    }
}
