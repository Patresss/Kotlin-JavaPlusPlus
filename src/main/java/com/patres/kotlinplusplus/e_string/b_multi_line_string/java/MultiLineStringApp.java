package com.patres.kotlinplusplus.e_string.b_multi_line_string.java;

public class MultiLineStringApp {

    private static final String HELLO = "Hello\n" +
            "My friend\n" +
            "How are you";


    private static final String FIND_PAYMENT_AND_VENDOR_BY_ID =
                    "SELECT\n" +
                    "    PMT_ID, VENDOR_ID\n" +
                    "FROM\n" +
                    "    PAYMENT PM\n" +
                    "JOIN VENDOR V\n" +
                    "    ON P.VENDOR_ID = V.VENDOR_ID\n" +
                    "WHERE\n" +
                    "    P.PMT_ID = 3;";

    public static void main(String[] args) {
        System.out.println(HELLO);
    }

}
