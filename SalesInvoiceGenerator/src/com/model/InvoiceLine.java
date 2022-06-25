/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Christine
 */
public class InvoiceLine {
private String itemName;
private double itemPrice;
private int itemCount;
private double lineTotal;
private Invoice header;

    public InvoiceLine(String itemName, double itemPrice, int itemCount, Invoice header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.header = header;
        this.setLineTotal(this.itemCount*this.itemPrice);
    }

     
    public Invoice getHeader() {
        return header;
    }

    public void setHeader(Invoice header) {
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getLineTotal(){
        return lineTotal;
    }

    private void setLineTotal(double lineTotal) {
this.lineTotal = lineTotal;
  }
     public String GetCSVData() {
        return "" + getHeader().getInvNum() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
    }
}
