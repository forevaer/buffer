package com.godme.buffer;


public class IntBuffer {
    private int capacity;
    private int limit;;
    private int position;
    private int mark;
    private int [] arr;
    private IntBuffer(int capacity){
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.limit = this.capacity;
        this.position = 0;
        this.mark = -1;
    }
    public static IntBuffer allocate(int capacity){
        return new IntBuffer(capacity);
    }
    public int capacity(){
        return this.capacity;
    }
    public IntBuffer position(int position){
        this.position = position;
        return this;
    }
    public IntBuffer limit(int limit) {
        this.limit = limit;
        return this;
    }
    public IntBuffer mark(){
        this.mark = this.position;
        return this;
    }
    public IntBuffer reset(){
        this.position = this.mark;
        return this;
    }
    public IntBuffer clear(){
        this.position = 0;;
        this.limit = this.capacity;
        return this;
    }
    public IntBuffer flip(){
        this.limit = position;
        this.position = 0;
        return this;
    }
    public IntBuffer put(int value){
        if(this.position < this.limit){
            this.arr[position++] = value;
        }
        return this;
    }
    public int get() throws Exception {
        if(this.position < this.limit){
            return this.arr[this.position++];
        }
        throw new Exception("last index");
    }
    public boolean hasRemaining(){
        return position < limit;
    }
    public int remaining(){
        return limit - position;
    }
}
