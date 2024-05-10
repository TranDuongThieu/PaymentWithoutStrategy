/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.hcmute.paymentwithoutstrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PaymentWithoutStrategy {

    private static Map<Integer, Integer> productList = new HashMap<>();
    private static ProcessPay procPay = new ProcessPay();
    private static ProcessPay concreteProcess = new ProcessPay();
    private static Scanner scanner = new Scanner(System.in);

    int idx = 0;

    static {
        productList.put(1, 100);
        productList.put(2, 150);
        productList.put(3, 200);
        productList.put(4, 250);
    }

    public static void main(String[] args) throws InterruptedException {

        int cost;

        String continueChoice;
        do {
            System.out.print("Please, select a product:" + "\n"
                    + "\t1 - Mother board" + "\n"
                    + "\t2 - CPU" + "\n"
                    + "\t3 - HDD" + "\n"
                    + "\t4 - Memory" + "\n");
            System.out.print("--> Please, select a product:");

            int choice = Integer.parseInt(scanner.nextLine());
            cost = productList.get(choice);

            System.out.print("--> Count: ");
            int count = Integer.parseInt(scanner.nextLine());
            procPay.setTotalCost(cost * count);

            System.out.print("--> Do you wish to continue selecting products? Y/N: ");
            continueChoice = scanner.nextLine();
        } while (continueChoice.equalsIgnoreCase("Y"));

        System.out.println("-->" + procPay.getTotalCost());
        System.out.println("--> Please, select a payment method:\n"
                + "\t1 - PayPal\n"
                + "\t2 - Momo Card\n"
                + "\t3 - ZaloPay Card");
        String paymentMethod = scanner.nextLine();
//            int totalCost = procPay.getTotalCost();
        switch (paymentMethod) {
            case "1":
                concreteProcess = new PaypalPay();
                break;
            case "2":
                concreteProcess = new MomoPay();
                break;
            case "3":
                concreteProcess = new ZaloPay();
                break;
        }
        concreteProcess.setTotalCost(procPay.getTotalCost());
        concreteProcess.getDetail();

        Thread.sleep(1000);
        if (concreteProcess.isPay(concreteProcess.getTotalCost())) {
            System.out.println("--> Payment has been successful.");
        } else {
            System.out.println("--> FAIL! Please, check your data.");
        }

    }

}
