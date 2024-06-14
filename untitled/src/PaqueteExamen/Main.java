package PaqueteExamen;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1\n");
        System.out.println("######### Sistema de Compra de Pasajes de Bus #########\n");
        Pasajeros pasajeros1 = new Pasajeros(null, null, null, null);
        pasajeros1.setNombre("Jose");
        pasajeros1.setApellido("Benalcázar");
        pasajeros1.setCi("092312342");
        pasajeros1.setTipo("Terrestre");
        System.out.println("Nombre: " + pasajeros1.getNombre() + "Apellido: " + pasajeros1.getApellido() + "\n");
        System.out.println("CI: " + pasajeros1.getCi() + "Tipo de viaje: " + pasajeros1.getTipo());

        System.out.println("2\n");
        Pasajeros pasajeros2 = new Pasajeros(null, null, null, null);
        pasajeros2.setNombre("Mappo");
        pasajeros2.setApellido("Astallar");
        pasajeros2.setCi("06969696969");
        pasajeros2.setTipo("Terrestre");
        System.out.println("Nombre: " + pasajeros2.getNombre() + "Apellido: " + pasajeros2.getApellido() + "\n");
        System.out.println("CI: " + pasajeros2.getCi() + "Tipo de viaje: " + pasajeros2.getTipo());

        System.out.println("3\n");
        Tickets tickets1 = new Tickets(null, null);
        tickets1.setTipo("Terrestre");
        tickets1.setId("92423");
        System.out.println("Tipo de viaje: " + tickets1.getTipo() + "\nId de ticket: " + tickets1.getId() + "\n");


        System.out.println("4\n");
        Rutas rutas1 = new Rutas();
        rutas1.setRuta(1);
        rutas1.setTipo_r(2);
        rutas1.setTipo("Terrestre");
        rutas1.setId("232323");
        System.out.println("Tipo de viaje: " + rutas1.getTipo() + "\nId de ticket: " + rutas1.getId());
        rutas1.ImprimirInfo();

        System.out.println("5\n");
        Servicios servicios1 = new Servicios(null, null, null, null, null);
        servicios1.setTipo("Terrestre");
        servicios1.setId("9990");
        servicios1.MostrarRutas();
        servicios1.setTipo_r(2);
        servicios1.setRuta(3);
        servicios1.MostrarServicios();
        servicios1.setTipo_s(1);

        //Completos


        System.out.println("1\n");
        Pasajeros pasajeros3 = new Pasajeros("Terrestre", "Jose", "Jujuy", "09231234234");


        System.out.println("2\n");
        Pasajeros pasajeros4 = new Pasajeros("Terrestre", "Juan", "Perez", "11112323233");

        System.out.println("3\n");
        Servicios servicios2 = new Servicios("Terrestre", "12323", 2, 4, 2);
        servicios2.MostrarInfo();

    }
}