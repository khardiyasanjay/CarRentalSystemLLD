package org.example.carrental.service;

import org.example.carrental.enums.PaymentMode;

import java.util.Date;

public class PaymentDetails {
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;

}
