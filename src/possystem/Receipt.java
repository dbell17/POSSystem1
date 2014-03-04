/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dbell17
 */
public class Receipt implements ReceiptStrategy {

    private String storeName = "ABC Department Store";
    private LineItem[] itemPerLine;

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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("ABC Receipt" + "\n" + getStoreName() + "\n" + dateFormat.format(date) 
                + "\n" + "xxxxxxxxxxx");
    }
}
