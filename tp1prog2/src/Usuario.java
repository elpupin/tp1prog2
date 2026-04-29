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

    


    /*  
    En una clase Usuario, aplica la sobrecarga de constructores: 
    crea un constructor por defecto (sin parámetros), uno que reciba solo el nombre, y 
    otro que reciba nombre y edad para inicializar el objeto de distintas maneras.
     En la misma clase, aplica la sobrecarga de 
    métodos creando un método actualizarPerfil(String correo) y 
    otro actualizarPerfil(String correo, int telefono).  */
}
