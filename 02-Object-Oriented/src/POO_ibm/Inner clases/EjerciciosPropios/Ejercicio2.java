class ContenedorHistorial
{
    private Object[] registros;
    private int indice = 0;

    public ContenedorHistorial() {
        registros = new Object[10];
    }

    void agregarRegistro(Object obj)
    {
        registros[indice++] = obj;
    }

    class Iterador 
    {
        private int posicionActual = 0;

        boolean tieneSiguiente(){
            if (posicionActual < indice)
            {
                return true;
            }
            else
            {
                    return false;
            }
        }

        Object siguiente(){
            return registros[posicionActual++];
        }
    }

    void procesarConFormato()
    {
        class Formateador
        {
            String formatear(Object dato)
            {
                return "[LOG SECRETO] " + dato.toString();
            }
        }

        Formateador f = new Formateador();
        for (int i = 0; i < indice; i++) {
            System.out.println(f.formatear(registros[i]));
        }
    }
}

public class Ejercicio2
{
    public static void main(String []args)
    {
        ContenedorHistorial contenedor = new ContenedorHistorial();


        contenedor.agregarRegistro("Login Exitoso");
        contenedor.agregarRegistro("Error 404");
        contenedor.agregarRegistro("Clase interna Creada");
        ContenedorHistorial.Iterador iterador = contenedor.new Iterador();

        while (iterador.tieneSiguiente())
        {
            System.out.println(iterador.siguiente());
        }
    }
}