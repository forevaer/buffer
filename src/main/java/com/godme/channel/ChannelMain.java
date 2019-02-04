package com.godme.channel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelMain {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("test.txt","rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(512);
//        int readable = -1;
//        do{
////            buffer.clear();
//            readable = channel.read(buffer);
//            System.out.println(readable);
//            buffer.flip();
//           while(buffer.hasRemaining()){
//               System.out.println("read:" + buffer.getChar());
//           }
//        }while (readable != -1);
//        ===============================-
//        buffer.putChar('a');
//        buffer.putChar('b');
//        buffer.putChar('c');
//        buffer.flip();
//        channel.write(buffer);
//        file.close();
//        ==============================
    }
}
