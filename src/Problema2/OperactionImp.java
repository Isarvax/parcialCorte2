package Problema2;

import javax.swing.*;
import java.util.ArrayList;

public class OperactionImp implements Operaction{
    ArrayList<Product> products=new ArrayList<>();

    public void fullData(){
        products.add(new Product("Mouse","Black",State.AVAILABLE));
        products.add(new Product("Laptop","White with 16 inches",State.AVAILABLE));
        products.add(new Product("Audifonos","Grey with sound cancelation",State.AVAILABLE));
    }
    @Override
    public void create(String name, String description, State state) {
        products.add(new Product(name,description,state));
        JOptionPane.showMessageDialog(null, "Successful changes");
    }

    @Override
    public void update(int id,String name, String description, State state) {
        Product product=Utilities.searchProduct(id,products);
        if (product!= null){
            product.setDescription(description);
            product.setName(name);
            product.setState(state);
            JOptionPane.showMessageDialog(null, "Successful changes");
        }else JOptionPane.showMessageDialog(null, "The product is not found");
    }

    @Override
    public void delete(int id) {
        Product product=Utilities.searchProduct(id,products);
        if (product!= null){
            products.remove(product);
            JOptionPane.showMessageDialog(null, "Successful changes");
        }else JOptionPane.showMessageDialog(null, "The product is not found");

    }

    @Override
    public void getAll() {
        JOptionPane.showMessageDialog(null, Utilities.printProducts(products));

    }

    @Override
    public void getOne(int id) {
        Product product=Utilities.searchProduct(id,products);
        if (product!= null){
            JOptionPane.showMessageDialog(null, product);
        }else JOptionPane.showMessageDialog(null, "The product is not found");
    }
}
