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
public class FakeDatabase implements ReceiptDataAccessStrategy{
     
    
    
    
    
//    products[0] = new ItemsForSale ("A100", "Packer's Superbowl 2011 Cap", 30.00, PercentOffDiscount);
    
   private ItemsForSale[] products = {
       new ItemsForSale("A999", "Men's Jacket", 89.95, new QtyDiscount(.25, 5)),
       new ItemsForSale("A197", "Women's Jacket", 79.95, new PercentOffDiscount(.20)),  
       new ItemsForSale("A897", "Men's Suit", 189.95, new PercentOffDiscount(.15)),      
       new ItemsForSale("A812", "Women's Suit", 149.95, new PercentOffDiscount(.20)),        
       new ItemsForSale("A659", "Women's Sweater", 49.95, new PercentOffDiscount(.05)),      
       new ItemsForSale("A789", "Men's Jeans", 19.95, new QtyDiscount(.10, 4))  
   };
        
    

//    private void addToArray(final LineItem item) {
//        // needs validation
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = item;
//        lineItems = tempItems;
//    }

    @Override
    public final ItemsForSale findProduct(final String productId) {
        ItemsForSale product = null;
        
        // validation is needed for method parameter
        if (productId == null || productId.length() == 0) {
            System.out.println("Sorry, no product was entered.  Try again.");
        } else {
            for (ItemsForSale p : products) {
                if (productId.equals(p.getProductId())) {
                    product = p;
                    break;
                }
            }
        }

        return product;
    }
    
}
