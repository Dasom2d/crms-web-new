package com.kakaopay.crms.controller;

import com.kakaopay.crms.enums.CrmsFaqCallType;
import com.kakaopay.crms.model.Faq;
import com.kakaopay.crms.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class FaqController {

    private final FaqService faqService;

    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }
    @GetMapping("/getFaqList")
    @ResponseBody
    public List<Faq> getFaqList(Faq.FaqParam faqParam) {
        return faqService.getFaqList(faqParam);
    }


}
