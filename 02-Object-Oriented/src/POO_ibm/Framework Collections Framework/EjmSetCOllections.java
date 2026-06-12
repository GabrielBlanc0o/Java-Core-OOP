/*
HashSet : Las collecciones tipo set en java no tienen orden y permiten valores null vacios
TreeSet : Mantiene un orden ordenado y no permite valores null vacios

veamos un ejemplo

*/

import java.util.HashSet;

public class EjmSetCOllections
{
    public static void main(String []args){

        //creamos un HashSet 
        HashSet<String> colores = new HashSet<>();

        //agregar elementos 
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo"); // duplicado

        //mostrar el HashSet
        System.out.println("Colores: " + colores);
        // no mostrar los repetidos

    }
}