/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.java.daHinh;

/**
 *
 * @author vuong
 */
public class Main {
    public static void main(String[] args) {
        animal a = new animal();
        a.keu();
        
        animal m = new Meo();
        m.keu();
        
        animal d = new Dog();
        d.keu();
    }
}
