/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author dbell17
 */
public class LineItem {

    private String itemPerLine;
    private int quantity;
    private ItemsForSale itemPurchased;

    public String getItemPerLine() {
        return itemPerLine;
    }

    public void setItemPerLine(String itemPerLine) {
        this.itemPerLine = itemPerLine;
    }

    public void setLineItem(String lineItem, int quantity) {
        setItemPerLine(itemPerLine);
        setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ItemsForSale getItemPurchased() {
        return itemPurchased;
    }

    public void setItemPurchased(ItemsForSale itemPurchased) {
        this.itemPurchased = itemPurchased;
    }

    public double getAmountSaved() {       
        return itemPurchased.getDiscountStrategy().getDiscountedTotal(itemPurchased.getPrice(), quantity);    }
    }
