package com.jayway.blog;

public class AnnotationTest {


    public static void main(String[] args) {
        //com.jayway.blog.YourClass.yourMethodAround();
        yourMethodAround();
    }

    @YourAnnotation
    public static void yourMethodAround(){
        System.out.println("Executing TestTarget.yourMethodAround()");
    }

}
