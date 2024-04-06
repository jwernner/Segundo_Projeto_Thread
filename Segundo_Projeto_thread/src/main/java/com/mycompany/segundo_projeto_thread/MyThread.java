/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundo_projeto_thread;

/**
 *
 * @author Jorge
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread executando 1");
        System.out.println("Thread executando 2");
        System.out.println("Thread executando 3");
    }
    
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
