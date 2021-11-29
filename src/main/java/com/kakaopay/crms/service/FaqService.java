package com.kakaopay.crms.service;

import com.kakaopay.crms.client.CrmsClient;
import com.kakaopay.crms.enums.CrmsFaqCallType;
import com.kakaopay.crms.model.Faq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class FaqService {
    @Autowired
    CrmsClient crmsClient;

    public List<Faq> getFaqList(Faq.FaqParam faqParam) {
        return crmsClient.csSend(faqParam.getCrmsFaqCallType().getQuery(), faqParam.getCrmsFaqCallType().getType(), faqParam.getData(), faqParam.getRow(), faqParam.getLv3(), faqParam.getGubun());
    }
}
