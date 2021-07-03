/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.java.dongGoi;

/**
 *
 * @author vuong
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Employee();
        p.setName("A");
        
        Employee emp = new Employee();
        emp.setName("B");
        emp.setLuong(4.4);
        
        System.out.println(p.getName());
        System.out.println(emp.getName()+" "+emp.getLuong());
    }
}
