package org.estafet.java8.javaBase64;

import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String strForEncoding = "Secret_password";
        String urlForEncoding = "https://zamunda.net/bg";
        String encodedStr ;
        String encodedUrl;

        // Encoding and Decoding string
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        encodedStr = encoder.encodeToString(strForEncoding.getBytes());
        System.out.println("\nEncoded string: " + encodedStr);
        System.out.println("Decoded string: "+ new String(decoder.decode(encodedStr)));

        // Encoding and Decoding URL
        encoder = Base64.getUrlEncoder();
        decoder = Base64.getUrlDecoder();
        encodedUrl = encoder.encodeToString(urlForEncoding.getBytes());


        System.out.println("\nEncoded URL: " + encodedUrl);
        System.out.println("Decoded URL: "+ new String(decoder.decode(encodedUrl)));


    }
}
