package com.example.shixun2.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class Base64util
{
    public static final String converToBase64(MultipartFile file){
        byte[]bytes=new byte[0];
        try{
            bytes=file.getBytes();
            String string= Base64.encodeBase64String(bytes);
            string.replace("[\\s+\t\n\r]","");
            string="data:image/jpeg;base64,"+string;
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
