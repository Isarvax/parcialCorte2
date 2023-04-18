package Problema1;

public enum Producto { LAPIZ("Lapiz","este producto sirve para dibujar"),CUADERNO("Cuaderno","este prodcuto sirve para escribir"),BORRADOR("Borrador","este producto sirve para borrar"),SACAPUNTA("Sacapuntas","este producto se puede sacar punta al lapiz"),CARTUCHERA("Cartuchera","este producto puedes almacenar cosas");
    private String nombre;
    private String descripcion;

    /*2. Luego, agregamos los métodos getNombre() y getDescripcion() para permitir que otros objetos accedan a los
    valores de estos atributos.
            3. A cada elemento de la enumeración deberá tener un método mostrarUso(), con una breve descripción del uso
    del elemento.
            4. Hacer su clase principal, usando cada uno de los elementos de la enumeración.*/
    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String mostrarUso(){
        return "El uso de " + descripcion;
    }
}
