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
  
   private Product[] products = {
       new Product("A999", "Men's Jacket", 89.95, new QtyDiscount(.25, 5, 12)),
       new Product("A197", "Women's Jacket", 79.95, new PercentOffDiscount(.20)),  
       new Product("A897", "Men's Suit", 189.95, new PercentOffDiscount(.15)),      
       new Product("A812", "Women's Suit", 149.95, new PercentOffDiscount(.20)),        
       new Product("A659", "Women's Sweater", 49.95, new PercentOffDiscount(.05)),      
       new Product("A789", "Men's Jeans", 19.95, new QtyDiscount(.10, 4, 12))  
   };
        

    @Override
    public final Product findProduct(final String productId) {
        Product product = null;
        
        // validation is needed for method parameter
        if (productId == null || productId.length() == 0) {
            System.out.println("Sorry, no product was entered.  Try again.");
        } else {
            for (Product p : products) {
                if (productId.equals(p.getProductId())) {
                    product = p;
                    break;
                }
            }
        }

        return product;
    }
    
}
