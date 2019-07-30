package com.batiaev.gb223;

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

    public BankCard.Builder createNewBankCard() {
        return new BankCard.Builder();
    }
}
