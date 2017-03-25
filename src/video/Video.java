package video;

import observer.Observer;
import observer.Subject;
import publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Chruściel.
 */
public class Video implements Subject, Publisher {

    private static final String publishMessage = "Video: %s added";

    /** List with all video subscribers. */
    private List<Observer> videoSubscribers;

    /**
     * Constructor of {@link Video}.
     */
    public Video() {
        this.videoSubscribers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        videoSubscribers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        videoSubscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        videoSubscribers.forEach(Observer::update);
    }

    @Override
    public void publish(String videoName) {
        System.out.println(String.format(publishMessage, videoName));
        notifyObservers();
    }
}
