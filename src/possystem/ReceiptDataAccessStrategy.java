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
public interface ReceiptDataAccessStrategy {
    public abstract Product findProduct(String productId);
}
