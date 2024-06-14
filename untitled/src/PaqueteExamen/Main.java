package PaqueteExamen;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("######### Sistema de Compra de Pasajes de Bus #########\n");
        Pasajeros pasajeros1 = new Pasajeros(null, null, null, null);
        pasajeros1.setNombre("Jose");
        pasajeros1.setApellido("Benalcázar");
        pasajeros1.setCi("092312342");
        pasajeros1.setTipo("Terrestre");
        System.out.println("Nombre: " + pasajeros1.getNombre() + "Apellido: " + pasajeros1.getApellido() + "\n");
        System.out.println("CI: " + pasajeros1.getCi() + "Tipo de viaje: " + pasajeros1.getTipo());

        Pasajeros pasajeros2 = new Pasajeros(null, null, null, null);
        pasajeros2.setNombre("Mappo");
        pasajeros2.setApellido("Astallar");
        pasajeros2.setCi("06969696969");
        pasajeros2.setTipo("Terrestre");
        System.out.println("Nombre: " + pasajeros2.getNombre() + "Apellido: " + pasajeros2.getApellido() + "\n");
        System.out.println("CI: " + pasajeros2.getCi() + "Tipo de viaje: " + pasajeros2.getTipo());

        Tickets tickets1 = new Tickets(null, null);
        tickets1.setTipo("Terrestre");
        tickets1.setId("92423");
        System.out.println("Tipo de viaje: " + tickets1.getTipo() + "\nId de ticket: " + tickets1.getId() + "\n");


        Rutas rutas1 = new Rutas();
        rutas1.setRuta(1);
        rutas1.setTipo_r(2);
        rutas1.setTipo("Terrestre");
        rutas1.setId("232323");

        System.out.println("Tipo de viaje: " + rutas1.getTipo() + "\nId de ticket: " + rutas1.getId());
        rutas1.ImprimirInfo();

        Servicios servicios1 = new Servicios(null, null, null, null, null);

    }
}