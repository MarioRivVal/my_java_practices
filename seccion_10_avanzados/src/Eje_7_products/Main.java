package Eje_7_products;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto>  productos = new ArrayList<>();
        productos.add(new Producto("Jeep Wrangler", 80000));
        productos.add(new Producto("Casa en el rio", 450000));
        productos.add(new Producto("Porsche 911",82000));
        productos.add(new Producto("Piscina interior",56000));
        productos.add(new Producto("SPA y sauna",43200));


        productos.forEach(prod -> {
            System.out.printf("""
                    Producto: %s
                    Precio: %.2f
                    
                    """, prod.getNombre(), prod.getPrecio());
        });

        double total =0;

        for (Producto prod: productos){
            total += prod.getPrecio();
        }

        System.out.println("El total de: " + total);
    }
}
