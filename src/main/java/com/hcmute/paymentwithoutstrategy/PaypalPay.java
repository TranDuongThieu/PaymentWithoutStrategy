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
public class PaypalPay extends ProcessPay {

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("-----Pay with PayPal-----");
        System.out.print("Enter the user's email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        // Validate account...
        System.out.print("Validate your account...\n\n");
    }

    @Override
    boolean isPay(int totalCost) throws InterruptedException {
        System.out.println("--> Paying " + totalCost + " using PayPal.");
        return super.isPay(totalCost);
    }

}
