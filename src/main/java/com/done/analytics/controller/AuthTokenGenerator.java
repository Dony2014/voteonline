package com.done.analytics.controller;

import java.util.Random;

/**
 * Created by Dong on 2015/12/12.
 */
public class AuthTokenGenerator {

    public static void main(String[] args) {
        AuthTokenGenerator tokenGenerator = new AuthTokenGenerator();
        byte[] source = new byte[10];

        Random random = new Random(10);
        random.nextBytes(source);

        System.out.println(tokenGenerator.getMD5(source));
    }

    public String getMD5(byte[] source) {
        String s = null;
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance("MD5");
            md.update(source);
            byte tmp[] = md.digest();
            char str[] = new char[16 * 2];
            int k = 0;
            for (int i = 0; i < 16; i++) {
                byte byte0 = tmp[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            s = new String(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
