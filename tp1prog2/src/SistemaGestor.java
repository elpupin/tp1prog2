public class SistemaGestor {
    private String conexiones;

    public static final int MAX_CONEXIONES = 10;

    public SistemaGestor(String conexiones) {
        this.conexiones = conexiones;
    }

    public void maximoConexiones() {
        System.out.println(MAX_CONEXIONES);
    }

    //Este campo pertenece a la clase ya que trabajaria con cada objeto limitandolo a 10 conexiones
    //Su valor no puede ser reasignado debido a la declaracion final

}
