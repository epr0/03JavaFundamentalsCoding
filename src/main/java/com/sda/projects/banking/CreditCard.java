package com.sda.projects.banking;

public class CreditCard {
    public int cardPin;
    public String cardHolderName;


    CreditCard(String cardHolderName, int cardPin) {
        this.cardHolderName = cardHolderName;
        this.cardPin = cardPin;
    }
}
