package com.kakaopay.crms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CrmsFaqCallType {
    SELECT_FAQ_LARGE_LIST_WEB("도움말 웹 대분류", CsType.WEB, "CSWE0000.SELECT_LAGE_LIST", "select"),
    SELECT_FAQ_LARGE_LIST_INAPP("도움말 인앱 대분류", CsType.INAPP, "CSWE0000.SELECT_LAGE_LIST", "select"),
    SELECT_FAQ_LARGE_LIST_PAYAPP("도움말 페이앱 대분류", CsType.PAYAPP, "CSWE0000.SELECT_APP_LAGE_LIST", "select"),
    SELECT_FAQ_LARGE_LIST_BIZAPP("도움말 비즈앱 대분류", CsType.BIZAPP, "CSWE0000.SELECT_BIZ_LAGE_LIST", "select"),

    SELECT_FAQ_MID_LIST_WEB("도움말 웹 중분류", CsType.WEB, "CSWE0000.SELECT_MID_LIST", "selectlist"),
    SELECT_FAQ_MID_LIST_INAPP("도움말 인앱 중분류", CsType.INAPP, "CSWE0000.SELECT_MID_LIST", "selectlist"),
    SELECT_FAQ_MID_LIST_PAYAPP("도움말 페이앱 중분류", CsType.PAYAPP, "CSWE0000.SELECT_APP_MID_LIST", "selectlist"),

    SELECT_FAQ_SMALL_LIST_WEB("도움말 웹 소분류", CsType.WEB, "SELECT_QAT_ANS_ETC_MOB", "selectpagerow"),
    SELECT_FAQ_SMALL_LIST_INAPP("도움말 인앱 소분류", CsType.INAPP, "CSWE0000.SELECT_QAT_ANS_ETC_MOB", "selectpagerow"),
    SELECT_FAQ_SMALL_LIST_PAYAPP("도움말 페이앱 소분류", CsType.PAYAPP, "CSWE0000.SELECT_APP_QAT_ANS_ETC", "selectpagerow"),
    SELECT_FAQ_SMALL_LIST_BIZAPP("도움말 비즈앱 소분류", CsType.BIZAPP, "CSWE0000.SELECT_BIZ_QAT_ANS_ETC", "selectpagerow");

    String callName;
    CsType csType;
    String query;
    String type;

}
