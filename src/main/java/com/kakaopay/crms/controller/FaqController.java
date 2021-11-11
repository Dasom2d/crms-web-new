package com.kakaopay.crms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FaqController {

    @GetMapping("/getFaqList")
    List<Map<String, Object>> getFaqList() {
        List<Map<String, Object>> t = null;

        return t;
    }
}
