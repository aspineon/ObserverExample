package blog;

import observer.Observer;

/**
 * Created by Krzysztof Chruściel.
 */
public class BlogSubscriber implements Observer {

    /** Message with information about new article. */
    private static final String message = "Hi %s, you have %d new articles to read";

    /** User name. */
    private final String userName;
    /** Number of new articles to read. */
    private int newArticles;

    /**
     * Constructor of {@link BlogSubscriber}.
     *
     * @param userName the user name.
     */
    public BlogSubscriber(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {
        newArticles++;
        System.out.println(String.format(message, userName, newArticles));
    }
}
