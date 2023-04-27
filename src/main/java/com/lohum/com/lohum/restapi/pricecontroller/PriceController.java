package com.lohum.com.lohum.restapi.pricecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class PriceController {

    @GetMapping
    public double getPrice() {
        return 0.12;
    }
}
