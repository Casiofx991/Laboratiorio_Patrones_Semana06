public class Main {
    public static void main() {
        Vuelo vuelo = new Vuelo("V123", "Nueva York", "Los Ángeles", 300.0);

        Cliente cliente1 = new Cliente("John Doe");
        Cliente cliente2 = new Cliente("Jane Smith");

        vuelo.registerObserver(cliente1);
        vuelo.registerObserver(cliente2);

        vuelo.setPrecio(350.0);
    }
}