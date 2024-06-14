package PaqueteExamen;

import java.util.Scanner;

public class Viajes {
    private String tipo;
    Scanner scanner = new Scanner(System.in);

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
