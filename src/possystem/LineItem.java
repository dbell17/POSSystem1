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

    private int quantity;
    private Product product;
    private ReceiptDataAccessStrategy fakeDatabase;

    public LineItem(int quantity, String productId, ReceiptDataAccessStrategy fakeDatabase ) {
        setQuantity(quantity);
        this.fakeDatabase = fakeDatabase;
        System.out.println("");
        product = findProductById(productId);
        
    }

    private Product findProductById(String id){
        return fakeDatabase.findProduct(id);
    }
//    public String getItemPerLine() {
//        return itemOutput;
//    }
//
//    public void setItemOutput(String itemOutput) {
//        this.itemOutput = itemOutput;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getItemPurchased() {
        return product;
    }

    public void setItemPurchased(Product itemPurchased) {
        this.product = itemPurchased;
    }

    public double getAmountSaved() {       
        return product.getDiscountStrategy().getDiscountedTotal(product.getPrice(), quantity);    
    }
    public double getSubtotal(){
    
    return product.getPrice() * quantity;
}
}