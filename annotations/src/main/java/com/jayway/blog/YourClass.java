package com.jayway.blog;

public class YourClass {

    public static void main(String[] args) {
        yourMethodAround();
    }

    @YourAnnotation
    public static void yourMethodAround(){
        System.out.println("Executing TestTarget.yourMethodAround()");
    }
}
