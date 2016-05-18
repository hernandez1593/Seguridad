package itcr.ac.cr.seguridad;

/**
 * Created by alejandro on 5/18/2016.
 */
public class GlobalUser {

    private static String id;

    //private static String nombre;
    //private static String cedula;
    //private static String correo;


    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        GlobalUser.id = id;
    }

    //en caso de utilizarse mas valores en la clase descomentar
    /*
    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        GlobalUser.correo = correo;
    }


    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        GlobalUser.cedula = cedula;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        GlobalUser.nombre = nombre;
    }
    */
}
