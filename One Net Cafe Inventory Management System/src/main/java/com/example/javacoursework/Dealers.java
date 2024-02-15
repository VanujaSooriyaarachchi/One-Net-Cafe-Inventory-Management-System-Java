package com.example.javacoursework;

public class Dealers {
    String dealerName;
    String dealerContact;
    String dealerLocation;

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerContact() {
        return dealerContact;
    }

    public void setDealerContact(String dealerContact) {
        this.dealerContact = dealerContact;
    }

    public String getDealerLocation() {
        return dealerLocation;
    }

    public void setDealerLocation(String dealerLocation) {
        this.dealerLocation = dealerLocation;
    }

    public Dealers(String dealerName, String dealerContact, String dealerLocation){
        this.dealerName = dealerName;
        this.dealerContact = dealerContact;
        this.dealerLocation = dealerLocation;
    }
}
