package com.example.nfenow.exception;

public class MessageHandler extends RuntimeException{
    public MessageHandler(String message){
        super(message);
    }
}
