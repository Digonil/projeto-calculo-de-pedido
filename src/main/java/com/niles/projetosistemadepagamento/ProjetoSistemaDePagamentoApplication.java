package com.niles.projetosistemadepagamento;

import com.niles.projetosistemadepagamento.entitities.Order;
import com.niles.projetosistemadepagamento.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.niles"})
public class ProjetoSistemaDePagamentoApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoSistemaDePagamentoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer input = 1;

        while (input == 1) {

            System.out.println("Type the order identification: ");
            Integer orderId = sc.nextInt();

            System.out.println("Type the basic value: ");
            Double basic = sc.nextDouble();

            System.out.println("Type the discount: ");
            Double discount = sc.nextDouble();

            Order order = new Order(orderId, basic, discount);

            Double totalValue = orderService.total(order);

            System.out.println("Order identification: " + order.getOrderId());
            System.out.println("Total value: R$ " + totalValue);

            System.out.println("Insert 1 to calculate the another product price or 0 to exit: ");
            input = sc.nextInt();
        }

        System.out.println("Thank you!!!");

    }
}
