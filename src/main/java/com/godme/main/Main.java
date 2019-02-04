package com.godme.main;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.SecureRandom;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
//        IntBuffer buffer = IntBuffer.allocate(10);
//        Random random = new SecureRandom();
//        while(buffer.hasRemaining()){
//            buffer.put(random.nextInt(20));
//        }
//        buffer.flip();
//        while(buffer.hasRemaining()){
//            System.out.println(buffer.get());
//        }
//        ===========================================================
//        ByteBuffer buffer = ByteBuffer.allocate(256);
//        int lastIndex = buffer.position();
//        int nowIndex = buffer.position();
//        buffer.putInt(1);
//        nowIndex = buffer.position();
//        show("int : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.putDouble(2.0d);
//        nowIndex = buffer.position();
//        show("double : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.putFloat(3f);
//        nowIndex = buffer.position();
//        show("float : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.putLong(4l);
//        nowIndex = buffer.position();
//        show("long : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.putShort((short)5);
//        nowIndex = buffer.position();
//        show("short : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.put((byte)6);
//        nowIndex = buffer.position();
//        show("byte : " + (nowIndex - lastIndex));
//        lastIndex = nowIndex;
//        buffer.putChar('a');
//        nowIndex = buffer.position();
//        show("char : " + (nowIndex - lastIndex));
//        buffer.flip();
//        buffer.slice();
//        show(buffer.getInt());
//        show(buffer.getDouble());
//        show(buffer.getFloat());
//        show(buffer.getLong());
//        show(buffer.getShort());
//        show(buffer.get());
//        show(buffer.getChar());
//        =======================================================
//        IntBuffer buffer = IntBuffer.allocate(5);
//        for(int i = 0;i < buffer.capacity(); i++ ){
//            buffer.put(i);
//        }
//        buffer.position(1);
//        buffer.limit(4);
//        IntBuffer sliceBuffer = buffer.slice();
//        sliceBuffer.put(1, 9);
//        sliceBuffer.clear();
//        while(sliceBuffer.hasRemaining()){
//            show("slice : " + sliceBuffer.get());
//        }
//        show("====================");
//        buffer.clear();
//        while(buffer.hasRemaining()){
//            show("source : " + buffer.get());
//        }
//        ==============================================
//        IntBuffer buffer = IntBuffer.allocate(2);
//        buffer.put(1);
//        buffer.put(2);
//        IntBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
//        buffer.put(1,9);
//        readOnlyBuffer.clear();
//        while(readOnlyBuffer.hasRemaining()){
//            show("read:" + readOnlyBuffer.get());
//        }
//        =====================================
    }
    public static void show(Object obj){
        System.out.println(obj);
    }
}
