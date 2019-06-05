package com.patres.kotlinplusplus.e_string.b_multi_line_string.kotlin

val FIND_PAYMENT_AND_VENDOR_BY_ID =
    """
    SELECT
        PMT_ID, VENDOR_ID
    FROM
        PAYMENT PM
    JOIN VENDOR V
        ON P.VENDOR_ID = V.VENDOR_ID
    WHERE
        P.PMT_ID = 3;
    """

private const val helloTrim = """Hello
        |My friend
        |How are you?
        """

fun main() {
    println(helloTrim.trimMargin())
}