public class Reporte {

    public void generarEncabezado() {
        System.out.println("Hola, este es el encabezado del reporte.");
    }

    public String obtenerCuerpo() {
        return "Este es el cuerpo del reporte.";
    }

    public void mostrarSecciones(String... secciones) {
        for (String seccion : secciones) {
            System.out.println(seccion);
        }
    }
}