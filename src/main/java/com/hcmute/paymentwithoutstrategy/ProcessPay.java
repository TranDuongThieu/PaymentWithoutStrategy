/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmute.paymentwithoutstrategy;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ProcessPay {
    private int totalCost = 0;
    private boolean isClosed = false;
    private CreditCard card;
    private static Scanner scanner = new Scanner(System.in);

    public ProcessPay() {
    }
    
    // <editor-fold defaultstate="collapsed" desc="Without Strategy Design Pattern">  
    public void getDetail() {
    }
    
    boolean isPay(int totalCost) throws InterruptedException {
        return true;
    }
    // </editor-fold>    
    
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
