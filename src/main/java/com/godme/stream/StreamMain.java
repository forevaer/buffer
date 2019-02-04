package com.godme.stream;

import java.io.*;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("source.txt");
        FileOutputStream outputStream = new FileOutputStream("target.txt");
        int readLength = -1;
        byte[]bs  = new byte[1024];
        while((readLength=inputStream.read(bs))!= -1){
            outputStream.write(bs, 0, readLength);
        }
        inputStream.close();
        outputStream.close();
    }
}
