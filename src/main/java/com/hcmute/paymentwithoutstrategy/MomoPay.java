/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmute.paymentwithoutstrategy;

import java.util.Scanner;

/**
 *
 * @author thieu
 */
public class MomoPay extends ProcessPay {

    private CreditCard card;
    private static Scanner scanner = new Scanner(System.in);

//    public MomoPay(CreditCard card)
//    {
//        supe;
//        this.card = card;
//    }

    
    @Override
    public void getDetail() {
        System.out.println("-----Pay with Momo-----");
        System.out.print("Enter the card number: ");
        String number = scanner.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = scanner.nextLine();
        System.out.print("Enter the CVV code: ");
        String cvv = scanner.nextLine();
        card = new CreditCard(number, date, cvv);
        System.out.print("Validate credit card number...\n\n");
        super.getDetail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    boolean isPay(int totalCost) throws InterruptedException {
        System.out.println("--> Paying " + totalCost + " using Momo.");
        return true;
    }

    @Override
    public int getTotalCost() {
        return super.getTotalCost(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
