package com.godme.main;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedMain {
    public static void main(String[] args) throws Exception{
        RandomAccessFile file =  new RandomAccessFile("test.txt", "rw");
        MappedByteBuffer mappedByteBuffer = file.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 26);
        char ch = 'a';
        while(mappedByteBuffer.hasRemaining()){
            mappedByteBuffer.putChar(ch);
            ch += 1;
        }
        file.close();
    }
}
