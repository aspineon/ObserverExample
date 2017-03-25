package video;

import observer.Observer;

/**
 * Created by Krzysztof Chruściel.
 */
public class VideoSubscriber implements Observer {


    /** Message with information about new article. */
    private static final String message = "Hi %s, you have %d new videos to watch";

    /** User name. */
    private final String userName;
    /** Number of new articles to read. */
    private int newVideos;

    /**
     * Constructor of {@link VideoSubscriber}.
     *
     * @param userName the user name.
     */
    public VideoSubscriber(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {
        newVideos++;
        System.out.println(String.format(message, userName, newVideos));
    }
}
