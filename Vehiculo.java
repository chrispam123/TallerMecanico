public class Vehiculo {
    //atributos
    private final String placa;
    private String marca;
    private String modelo;
    //constructor
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    //getters
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;   
    }
    public String getModelo() {
        return modelo;
    }
    //setters ESCRITURA

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }
    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';


    }
}
