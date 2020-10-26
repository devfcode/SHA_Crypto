package com.my;

import static com.my.HMACSHA_Util.hmacSha256;

public class Test {
    public static void main(String[] args) {
//        String plaintext = "657912";
//        String ciphertext = SHAUtil.shaEncrypt(plaintext);
//        System.out.println("ciphertext:\n" + ciphertext);

        String key = "3Ys2sz30XeBaGNDAckaZI9SoZ2dExB";
        String value = "";

        String result1 = hmacSha256(key, value);
        System.out.println("result1:\n" + result1);

    }

}
