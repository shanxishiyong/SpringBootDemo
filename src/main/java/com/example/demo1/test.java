package com.example.demo1;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "hive_metastore_process \"Hive Metastore Process\" HIVE OK \"Metastore OK - Hive command took 0.006s\" 1624952296623 emr114.dtwave.com";
//        String encodStr = URLEncoder.encode(str,"utf-8");
//        int m = encodStr.indexOf('\u0000');
        final BASE64Encoder encoder = new BASE64Encoder();
        final byte[] textByte = str.getBytes("UTF-8");
        final String encodedText = encoder.encode(textByte);
        System.out.println(encodedText);
    }
}
