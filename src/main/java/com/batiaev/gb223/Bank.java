package com.batiaev.gb223;

import com.batiaev.gb223.lesson5.Transaction;

/**
 * Bank
 *
 * @author anton
 * @since 16/07/19
 */
public class Bank {
    private static final Bank BANK = new Bank();

    public static Bank instance() {
        return BANK;
    }

    public void execute(Transaction transaction) {
        transaction.getFrom().charge(transaction.getAmount());
        transaction.getTo().charge(-transaction.getAmount());
        System.out.println(transaction);
    }

    public BankCard.Builder createNewBankCard() {
        return new BankCard.Builder();
    }
}
