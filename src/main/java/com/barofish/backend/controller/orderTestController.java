package com.barofish.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Controller
public class orderTestController {

    @GetMapping("/")
    public String requestTest() {
        return "hello1";
    }

    @GetMapping("helloworld")
    public String test() {
        return "hello1";
    }

    @GetMapping("card")
    public String cardTest() {
        return "card";
    }

    @GetMapping("virtualAccount")
    public String virtualAccountTest() {
        return "virtualAccount";
    }

    @GetMapping("success?paymentKey={paymentKey}&orderId={orderId}&amount={amount}")
    public String cardSuccess(@PathVariable("paymentKey") String paymentKey,
                              @PathVariable("orderId") String orderId,
                              @PathVariable("amount") int amount) {
        log.info("paymentKey={}", paymentKey);
        log.info("orderId={}", orderId);
        log.info("amount={}", amount);
        return "cardPaymentSuccess";
    }
}
