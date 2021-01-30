package com.takeit.ecommerce.controller;


import com.takeit.ecommerce.dto.Purchase;
import com.takeit.ecommerce.dto.PurchaseResponse;
import com.takeit.ecommerce.service.CheckOutService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckOutService checkoutService;

    public CheckoutController(CheckOutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}


