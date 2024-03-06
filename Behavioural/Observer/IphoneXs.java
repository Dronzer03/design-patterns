import java.util.ArrayList;
import java.util.List;

public class IphoneXs implements Subject {
    List<Observer> observerList = new ArrayList<>();
    boolean inStock = false;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    @Override
    public void setState(boolean inStock) {
        if (this.inStock != inStock) {
            notifyObservers();
        }
        this.inStock = inStock;
    }
}
