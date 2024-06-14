package PaqueteExamen;

public class Viajes {
    private String tipo;

    //Constructores
    public Viajes(String tipo)
    {
        this.tipo = tipo;
    }

    public Viajes()
    {
    }

    //Getters y Setters

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
}
