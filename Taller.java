import java.util.ArrayList; // incialiazmos el arraylist para guardar los autos
public class Taller{
    
    private ArrayList<Vehiculo>inventario; // creamos el arraylist inventario de tipo vehiculo
    //constructor
    public Taller() {
        this.inventario = new ArrayList<>(); // inicializamos el arraylist vacia
        }
    //metodo para agregar un vehiculo al inventario
    public boolean agregarVehiculo(String placa, String marca, String modelo) {
        //verificar si el vehiculo ya existe en el inventario    
        if (placa == null || marca == null || modelo == null) { // si alguno de los datos es nulo no se agrega el vehiculo
            return false; // no se pudo agregar el vehiculo 
            
        }      
        
        for (Vehiculo v : inventario) {
            if (v.getPlaca().equals(placa)) { // si la placa ya existe no se agrega
                return false; // no se pudo agregar el vehiculo
            }
        }
        //si no existe se crea un nuevo vehiculo y se agrega al inventario
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo);
        inventario.add(nuevoVehiculo);
        System.out.println("Vehiculo guardado en memoria");
        return true; // se agrego el vehiculo exitosamente
    }

    //metodo para mostrar el inventario de vehiculos
    public void mostrarInventario() {
        System.out.println("Inventario de vehiculos:");
        for (Vehiculo v : inventario) {
            System.out.println(v);
        }
     }
}
