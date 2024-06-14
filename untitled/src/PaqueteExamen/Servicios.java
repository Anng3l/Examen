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
        Float j = 0.30f;
        Float valor = 0f;
        switch (getTipo_s())
        {
            case 1:
                Integer x;
                System.out.println("Selecciones su asiento\n");
                System.out.println("1) ventana   2) pasillo   3)Al final   4)Adelante\n");
                x = scanner.nextInt();
                if (x == 1)
                {
                    setAsientos("Ventana");
                } else if (x == 2) {
                    setAsientos("Pasillo");
                } else if (x == 3) {
                    setAsientos("Al final");
                } else if (x == 4) {
                    setAsientos("Adelante");
                }
                j = 0f;
                break;

            case 2:
                setServicios("Televisión, internet, Cafetera, Snacks");
                setMaletas("2 Maletas");
                break;
        }
        return j;
    }

    public void MostrarInfo()
    {
        System.out.println("Tipo de viaje: " + getTipo() + "\nId de ticket: " + getId());
        System.out.println("Tipo de ruta: " + getTipo_r() + "\nRuta: " + getRuta() + "\n");
        System.out.println("tipo");
    }

    //Getters y Setters
    public Integer getTipo_s() {
        return tipo_s;
    }
    public String getAsientos() {
        return asientos;
    }
    public String getMaletas() {
        return maletas;
    }
    public String getServicios() {
        return servicios;
    }

    public void setTipo_s(Integer tipo_s) {
        this.tipo_s = tipo_s;
    }
    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    public void setMaletas(String maletas) {
        this.maletas = maletas;
    }
    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
}
