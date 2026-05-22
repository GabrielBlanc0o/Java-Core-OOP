package imccalc;
import java.lang.Math;


public class OLD_EntrenamientoService {

    /*LOGGICA*/


    private static final double IMCMINIMO = 16;
    private static final double IMCM = 17;
    private static final double IMCMM = 18.5;
    private static final double IMCMMM = 25;
    private static final double IMCL = 30;
    private static final double IMCXL = 35;
    private static final double IMCXXL = 40;

    public boolean calculoDeIMC(Atleta atleta,String categoriaConsultada ){

        double formula = atleta.getPeso() / Math.pow(atleta.getAltura(),2);

        boolean imcBajo = formula < IMCMINIMO;
        boolean imcRiesgoPeso = formula >= IMCMINIMO && formula < IMCM;
        boolean imcDelgado = formula >= IMCM && formula < IMCMM;
        boolean imcNormal = formula >= IMCMM && formula < IMCMMM;
        boolean imcSobrePeso = formula >= IMCMMM && formula < IMCL;
        boolean imcObesoTipo1 = formula >= IMCL && formula < IMCXL;
        boolean imcObesoTipo2 = formula >= IMCXL && formula <= IMCXXL;
        boolean imcObesoTipo3 = formula > IMCXXL;

        // Evalúa la consulta del usuario usando una estructura switch
        switch (categoriaConsultada.toLowerCase()) {
            case "bajo":        return imcBajo;
            case "riesgo":      return imcRiesgoPeso;
            case "delgado":     return imcDelgado;
            case "normal":      return imcNormal;
            case "sobrepeso":   return imcSobrePeso;
            case "obeso1":      return imcObesoTipo1;
            case "obeso2":      return imcObesoTipo2;
            case "obeso3":      return imcObesoTipo3;
            default:            return false; // Si el usuario ingresa un texto inválido
        }





    }
}
