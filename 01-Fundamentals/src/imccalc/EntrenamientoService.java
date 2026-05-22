package imccalc;

public class EntrenamientoService {


    public String obtenerRecomendacion(Atleta atleta) {
        System.out.println("SERVICE RECIBIÓ: Peso=" + atleta.getPeso() + " Altura=" + atleta.getAltura());
        // 1. Cálculo base
        double peso = atleta.getPeso();
        double altura = atleta.getAltura();

        if (altura == 0) return "Error: Altura no puede ser 0";

        double imc = peso / Math.pow(altura, 2);

        String categoria;
        if (imc < 18.5) {
            categoria = "Hypertrophy (Enfoque Superávit)";
        } else if (imc < 25) {
            categoria = "Hypertrophy (Enfoque Recomposición)";
        } else {
            categoria = "Conditioning (Enfoque Déficit)";
        }

        return "IMC: " + String.format("%.2f", imc) + " - Rutina: " + categoria;
    }
}