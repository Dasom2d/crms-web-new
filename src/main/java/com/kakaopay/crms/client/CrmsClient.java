package com.kakaopay.crms.client;

import com.kakaopay.crms.model.Faq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name="crms-csSend", url="https://sandbox-pay-crms.kakao.com")
public interface CrmsClient {

//    @GetMapping("/csSend.do?query=CSWE0000.SELECT_LAGE_LIST&type=select&data=none")
//    List<Map> testFeign();

    @GetMapping("/csSend.do")
    <T> List<T> csSend(@RequestParam String query, @RequestParam String type, @RequestParam String data,
                       @RequestParam String row, @RequestParam String lv3, @RequestParam String gubun);


}
