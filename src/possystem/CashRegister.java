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
public class CashRegister {

    private Receipt receipt;

    public void startNewSale() {
        receipt = new Receipt();
    }

    public void addNewItem(String productId, int qty, ReceiptDataAccessStrategy fakeDatabase) {
        receipt.addItemToReceipt(productId, qty, fakeDatabase);
    }

    public void displayInvoice() {
        receipt.getReceipt();
    }
}
