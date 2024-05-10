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
public class ProcessPayment {
    private int totalCost = 0;
    public ProcessPayment() {
    }
    // <editor-fold defaultstate="collapsed" desc="Without Strategy Design Pattern">  
    public void getPaymentDetails() {
    }
    
    boolean isPaid(int totalCost) throws InterruptedException {
        return true;
    }
    // </editor-fold>    
    
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

}
