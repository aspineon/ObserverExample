package observer;

/**
 * Created by Krzysztof Chruściel.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
