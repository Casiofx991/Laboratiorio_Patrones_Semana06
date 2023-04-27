public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(double precio) {
        System.out.println(nombre + " ha sido notificado del cambio de precio: " + precio);
    }
}