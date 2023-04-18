package Problema1;

public class Main {
    public static void main(String[] args) {
        //uso del enumerado
       /* (LAPIZ, CUADERNO,BORRADOR, SACAPUNTA, CARTUCHERA).*/
        System.out.println("Lapiz---------------------------");//Lapiz
        System.out.println(Producto.LAPIZ.getNombre());
        System.out.println(Producto.LAPIZ.getDescripcion());
        System.out.println(Producto.LAPIZ.mostrarUso());
        System.out.println("Cuaderno---------------------------");//CUADERNO
        System.out.println(Producto.CUADERNO.getNombre());
        System.out.println(Producto.CUADERNO.getDescripcion());
        System.out.println(Producto.CUADERNO.mostrarUso());
        System.out.println("Borrador---------------------------");//BORRADOR
        System.out.println(Producto.BORRADOR.getNombre());
        System.out.println(Producto.BORRADOR.getDescripcion());
        System.out.println(Producto.BORRADOR.mostrarUso());
        System.out.println("Sacapunta---------------------------");//SACAPUNTA
        System.out.println(Producto.SACAPUNTA.getNombre());
        System.out.println(Producto.SACAPUNTA.getDescripcion());
        System.out.println(Producto.SACAPUNTA.mostrarUso());
        System.out.println("Cartuchera---------------------------");//CARTUCHERA
        System.out.println(Producto.CARTUCHERA.getNombre());
        System.out.println(Producto.CARTUCHERA.getDescripcion());
        System.out.println(Producto.CARTUCHERA.mostrarUso());
        //melo se hizo
        //
    }
}
