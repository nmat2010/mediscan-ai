package com.example.mediscan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BillController {
    @PostMapping("/upload-bill")
    public String uploadBill() {
        return "Bill uploaded";
    }
}
