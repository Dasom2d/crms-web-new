package com.kakaopay.crms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum CsType {

    WEB("WEB", "고객센터 웹"),
    INAPP("INAPP", "카카오톡 인앱"),
    PAYAPP("PAY_APP", "카카오페이앱"),
    BIZAPP("BIZ_APP", "카카오페이 비즈니스앱");

    String type;
    String description;

}
