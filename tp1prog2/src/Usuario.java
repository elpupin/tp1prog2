public class Usuario {
    private String nombre;
    private int edad;

    public Usuario() {
        this.nombre = "Usuario por defecto";
        this.edad = 0;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void actualizarPerfil(String correo) {
        System.out.println("Correo actualizado: " + correo);
    }

    public void actualizarPerfil(String correo, int telefono) {
        System.out.println("Correo actualizado: " + correo);
        System.out.println("Telefono actualizado: " + telefono);
    }
}