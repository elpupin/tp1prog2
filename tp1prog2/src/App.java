public class App {

    public static void enviarAImpresion(Exportable documentoExportable) {
        documentoExportable.exportar();
    }

    public static void main(String[] args) {

        // Seccion 2
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Lucas");
        Usuario usuario3 = new Usuario("Lucas", 20);

        usuario1.actualizarPerfil("correo@gmail.com");
        usuario2.actualizarPerfil("correo@gmail.com", 123456789);

        Reporte reporte = new Reporte();
        reporte.mostrarSecciones("Inicio", "Desarrollo", "Final");
        reporte.mostrarSecciones();

        // Seccion 3
        Documento doc1 = new Factura();
        Documento doc2 = new Recibo();

        doc1.procesar();
        doc2.procesar();

        Factura factura = new Factura();
        factura.procesar(true);

        // Seccion 4
        factura.exportar();
        factura.registrarAuditoria();

        enviarAImpresion(factura);
    }
}