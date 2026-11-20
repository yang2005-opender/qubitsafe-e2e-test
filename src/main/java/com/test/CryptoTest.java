package com.test;

import java.security.KeyPairGenerator;
import java.security.MessageDigest;

public class CryptoTest {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("test-data".getBytes());

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        keyGen.generateKeyPair();
    }
}
