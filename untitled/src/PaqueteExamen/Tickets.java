package PaqueteExamen;

import javax.xml.transform.Source;

public class Tickets extends Viajes{
    private String id;

    //Constructores
    public Tickets(String tipo, String id)
    {
        super(tipo);
        this.id = id;
    }

    public Tickets()
    {
    }


    //Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
