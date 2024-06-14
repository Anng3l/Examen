package PaqueteExamen;

public class Pasajeros extends Viajes{
    private String nombre;
    private String apellido;
    private String ci;

    //Constructores
    public Pasajeros(String tipo, String nombre, String apellido, String ci)
    {
        super(tipo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public Pasajeros()
    {
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
}
