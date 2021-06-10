package com.matheuscordeiro.marvelapiasyncservices.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

public class UrlBuilder {
    private static final String PUBLIC_KEY = "301366f0ad66d4e9ca72687054826857";
    private static final String PRIVATE_KEY = "7c1e6340ae489f2f44712b157c82565be43faf9e";

    private static Instant instant = Instant.now();
    public static long timeStamp = instant.toEpochMilli();

    public static String urlBuilder(String baseUrl, String paramUrl) {
        StringBuilder stringBuilder = new StringBuilder();
        return  stringBuilder.append(baseUrl)
                .append(paramUrl)
                .append("?")
                .append("ts=")
                .append(timeStamp)
                .append("&")
                .append("apiKey=")
                .append(PUBLIC_KEY)
                .append("&")
                .append("hash=")
                .append(MD5hash(PUBLIC_KEY, PRIVATE_KEY, timeStamp)).toString();
    }

    public static String MD5hash(String publicApiKey, String privateApiKey, Long timestamp) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String toHash = timestamp + privateApiKey + publicApiKey;
            return new BigInteger(1, md.digest(toHash.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
        }
        return null;
    }
}
