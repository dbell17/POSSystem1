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
public class PosSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       CashRegister cr = new CashRegister();
       cr.startNewSale();           
       cr.addNewItem("A999", 1, new FakeDatabase());
       cr.displayInvoice();
    }
    
}
