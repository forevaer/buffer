package com.godme.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("localhost",8989));
        int firstBufferLength = 2;
        int secondBufferLength = 5;
        int thirdBufferLength = 7;
        int allLength = firstBufferLength + secondBufferLength + thirdBufferLength;
        ByteBuffer firstBuffer = ByteBuffer.allocate(firstBufferLength);
        ByteBuffer secondBuffer = ByteBuffer.allocate(secondBufferLength);
        ByteBuffer thirdBuffer = ByteBuffer.allocate(thirdBufferLength);
        ByteBuffer[] allBuffer = new ByteBuffer[]{firstBuffer, secondBuffer, thirdBuffer};
        while(true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            int readLength = 0;
            Arrays.asList(allBuffer).forEach(buffer->buffer.clear());
            while(readLength < allLength){
                readLength += socketChannel.read(allBuffer);
                System.out.println("read Length : " + readLength);
                Arrays.asList(allBuffer).stream()
                        .map(buffer->"position:" + buffer.position() + "\tlimit: "+ buffer.limit())
                        .forEach(System.out::println);
            }
            System.out.println("readComplete");
            Arrays.asList(allBuffer).forEach(buffer->buffer.flip());
            socketChannel.write(allBuffer);
        }
    }
}
