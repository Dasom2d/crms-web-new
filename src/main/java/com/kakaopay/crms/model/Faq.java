package com.kakaopay.crms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Faq {
    private int orgCatId;
    private int sortOrder;
    private String orgCatNm;

    @Getter
    @Setter
    public static class FaqParam {
        private String query;
        private String type;
        private String data;
        private String row;
        private String lv3;
        private String gubun;

    }
}
