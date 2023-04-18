package Problema2;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        OperactionImp operactionImp=new OperactionImp();
        operactionImp.fullData();
        String option="0";
        do {
            option= JOptionPane.showInputDialog(null, "1.Create product \n2. Delete product\n3. Update product\n4. Get one product \n 5. Get all products \n6.Exit\n\nInput your option:");
            switch (option){
                case "1":
                    operactionImp.create(JOptionPane.showInputDialog(null, "Input the name:"),JOptionPane.showInputDialog(null, "Input the description:"),Utilities.selectState());
                    break;
                case "2":

                    operactionImp.delete(Integer.parseInt(JOptionPane.showInputDialog(null, "Input the id of the product:")));
                    break;
                case "3":
                    operactionImp.update(Integer.parseInt(JOptionPane.showInputDialog(null, "Input the id of the product:")),JOptionPane.showInputDialog(null, "Input the name:"),JOptionPane.showInputDialog(null, "Input the description:"),Utilities.selectState());
                    break;
                case "4":
                    operactionImp.getOne(Integer.parseInt(JOptionPane.showInputDialog(null, "Input the id of the product:")));
                    break;
                case "5":
                    operactionImp.getAll();
                    break;
            }
        }while(!option.equals("6"));
    }
}