/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.java.truuTuong;

/**
 *
 * @author vuong
 */
public class Student extends person{

    @Override
    public void study(String subject) {
        System.out.println("Hello "+subject);
    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.study("English");
    }
}
