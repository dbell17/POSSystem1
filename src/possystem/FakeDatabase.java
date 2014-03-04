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
    
   public static final ItemsForSale[] products = new ItemsForSale[3];
   static{
   products[0] = new ItemsForSale("A100", "Packer's Superbowl 2011 Cap", 30.00, PercentOffDiscount(.15));
   }  
         
        
    

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
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
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
