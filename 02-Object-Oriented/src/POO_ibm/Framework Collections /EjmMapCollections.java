/*
Clave valor  , claves unicas pero los valores pueden ser duplicados

ejm
*/

import java.util.HashMap;

public class EjmMapCollections
{
    public static void main(String []args)
    {
        HashMap<String, Integer> mapEdad = new HashMap<>();

        mapEdad.put("Gabriel", 18);
        mapEdad.put("Pepita", 50);
        mapEdad.put("Coco", 5);
        
        int edad = mapEdad.get("Gabriel");
        System.out.println("Edad Gabriel: " + edad);
    }    
}