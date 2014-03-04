/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import java.util.Date;

/**
 *
 * @author dbell17
 */
public class Receipt implements ReceiptStrategy {

    private String storeName = "ABC Department Store";
    private LineItem[] itemPerLine;

//    public Receipt(LineItem[] itemPerLine) {
//        this.itemPerLine = itemPerLine;
//    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public LineItem[] getItemPerLine() {
        return itemPerLine;
    }

    public void setItemPerLine(LineItem[] itemPerLine) {
        this.itemPerLine = itemPerLine;
    }

    @Override
    public void getReceipt() {

        Date date1 = new Date();
        

        System.out.println(storeName + "        Date :" + date1.toString());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Item ID:          Item Description:       Price:         Quantity:          Discount: ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (LineItem items : itemPerLine) {
            items.getItemPurchased().getProductId();
            items.getItemPurchased().getProductName();
            items.getItemPurchased().getPrice();
            items.getQuantity();
            items.getAmountSaved();
        }
        getReceiptTotals();
    }

    public final void getReceiptTotals() {
        double overallBillTotal = getTotalBillForReciept();
        double overallTotalDiscount = getTotalDiscountForReciept();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bill Total: " + "Discount Total: ");
        System.out.println("                                                      $" + overallBillTotal + "  $" + overallTotalDiscount);
    }

    public double getTotalDiscountForReciept() {

        double discountTotal = 0.0;
        for (LineItem items : itemPerLine) {
            discountTotal += items.getAmountSaved();
        }
        return discountTotal;
    }

    private double getTotalBillForReciept() {
        double billTotal = 0.0;
        for (LineItem items : itemPerLine) {
            billTotal += items.getItemPurchased().getPrice();
        }
        return billTotal;
    }
}
