package com.my;

import static com.my.HMACSHA_Util.hmacSha256;

public class Test {

    private static String plaintext = "";

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        String ciphertext = SHAUtil.shaEncrypt(plaintext);
        System.out.println("ciphertext:\n" + ciphertext);
    }

    private static void test2() {
        String value = "";
        String result1 = hmacSha256(plaintext, value);
        System.out.println("result1:\n" + result1);
    }
}
