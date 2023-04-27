import java.util.ArrayList;
import java.util.List;

public class Vuelo implements Observable {
    private List<Observer> observers;
    private String id;
    private String origen;
    private String destino;
    private double precio;

    public Vuelo(String id, String origen, String destino, double precio) {
        this.observers = new ArrayList<>();
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(precio);
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        notifyObservers();
    }
}
