package Problema2;

import Problema1.Producto;

import javax.swing.*;
import java.util.ArrayList;

public class Utilities {
    public static Product searchProduct(int id, ArrayList<Product> products){
        for (Product product:products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public static String printProducts(ArrayList<Product> products){
        String message="";
        for (Product product:products){
             message+=product + "\n";
        }
        return message;
    }

    public static State selectState(){
        State status=null;
        String statusOption= JOptionPane.showInputDialog(null, "1.Available\n2. No available\n\nInput your option:");
        switch (statusOption) {
            case "1":
                status = State.AVAILABLE;
                break;
            case "2":
                status = State.NOAVAILABLE;
                break;
        }
        return status;
    }

}
