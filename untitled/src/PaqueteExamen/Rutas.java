package PaqueteExamen;

public class Rutas extends Tickets{
    private Integer tipo_r;
    private Integer ruta;

    //Constructores
    public Rutas(String tipo, String id, Integer tipo_r, Integer ruta)
    {
        super(tipo, id);
        this.tipo_r = tipo_r;
        this.ruta = ruta;
    }

    public Rutas()
    {
    }

    //Métodos
    public void TiposRuta()
    {
        System.out.println("1) De Quito a destino\n");
        System.out.println("2) De destino a Quito\n");
        Integer x = scanner.nextInt();
        setTipo_r(x);
    }

    public void MostrarRutas()
    {
        System.out.println("1) Quito-Guayaquil - $20");
        System.out.println("2) Quito-Puyo - $15");
        System.out.println("3) Quito-Tulcán - $17.50");
        System.out.println("4) Quito-Riobamba - $17,50");
    }

    public Float CalcularPrecio(Integer ruta)
    {
        Float valor = 0f;
        switch (ruta)
        {
            case 1:
                valor = 20f;
                break;

            case 2:
                valor = 15f;
                break;

            case 3:
                valor = 17.5f;
                break;

            case 4:
                valor = 17.5f;
                break;
        }
        return valor;
    }

    //Getters y Setters
    public Integer getTipo_r() {
        return tipo_r;
    }
    public Integer getRuta() {
        return ruta;
    }

    public void setTipo_r(Integer tipo_r) {
        this.tipo_r = tipo_r;
    }
    public void setRuta(Integer ruta) {
        this.ruta = ruta;
    }
}
