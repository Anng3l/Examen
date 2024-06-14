package PaqueteExamen;

public class Tickets extends Pasajeros{
    private String id;

    //Constructores
    public Tickets(String tipo, String nombre, String apellido, String ci, String id)
    {
        super(tipo, nombre, apellido, ci);
        this.id = id;
    }

    public Tickets()
    {
    }
}
