package PaqueteExamen;

public class Servicios extends Rutas {
    private Integer tipo_s;
    private String asientos;
    private String servicios;
    private String maletas;
    //Constructores
    public Servicios(String tipo, String id, Integer tipo_r, Integer ruta, Integer tipo_s)
    {
        super(tipo, id, tipo_r, ruta);
        this.tipo_s = tipo_s;
    }

    public Servicios()
    {
    }

    //Métodos
    public void MostrarServicios()
    {
        System.out.println("1) Normal\n2)VIP\n");
    }

    public Float Precio(Integer tipo_s)
    {

        return 0f;
    }

    public void MostrarInfo()
    {
        System.out.println("Tipo de viaje: " + getTipo() + "\nId de ticket: " + getId());
        System.out.println("Tipo de ruta: " + getTipo_r() + "\nRuta: " + getRuta() + "\n");
        System.out.println("tipo");
    }
}
