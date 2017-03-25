package blog;

import observer.Observer;
import observer.Subject;
import publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Chruściel.
 */
public class Blog implements Subject, Publisher {

    /** Publish message. */
    private static final String publishMessage = "Article: %s added";

    /** List with all blog subscribers. */
    private List<Observer> blogSubscribers;

    /**
     * Constructor of {@link Blog}.
     */
    public Blog() {
        this.blogSubscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        blogSubscribers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        blogSubscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        blogSubscribers.forEach(Observer::update);
    }

    @Override
    public void publish(String articleName) {
        System.out.println(String.format(publishMessage, articleName));
        notifyObservers();
    }
}
