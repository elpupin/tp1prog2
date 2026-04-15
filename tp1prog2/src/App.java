public class App {
    public static void main(String[] args) throws Exception {
        SistemaGestor nuevoSistema = new SistemaGestor("AFIP");
        nuevoSistema.maximoConexiones();
    }
}
