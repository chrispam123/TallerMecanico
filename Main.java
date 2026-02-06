public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller(); // creamos un nuevo taller
        // agregamos vehiculos al taller
        taller.agregarVehiculo("ABC123", "Toyota", "Corolla");
        taller.agregarVehiculo("DEF456", "Honda", "Civic");
        taller.agregarVehiculo("GHI789", "Ford", "Focus");
        // mostramos el inventario del taller
        taller.mostrarInventario();
        System.out.println("\n Cerrando el taller y guardando el inventario en un archivo de texto...");
        // guardamos el inventario en un archivo de texto
        taller.guardarInventario();
        
    }
}