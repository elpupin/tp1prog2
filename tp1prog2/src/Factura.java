public class Factura extends Documento implements Exportable, Auditable {

    @Override
    public void procesar() {
        System.out.println("Procesando factura.");
    }

    public void procesar(boolean esUrgente) {
        if (esUrgente) {
            System.out.println("Procesando factura urgente.");
        } else {
            System.out.println("Procesando factura normal.");
        }
    }

    @Override
    public void exportar() {
        System.out.println("Exportando factura.");
    }

    @Override
    public void registrarAuditoria() {
        System.out.println("Registrando auditoria de factura.");
    }
}