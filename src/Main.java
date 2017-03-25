import blog.Blog;
import blog.BlogSubscriber;
import video.Video;
import video.VideoSubscriber;

public class Main {

    public static void main(String[] args) {
        createVideoChannel();
        System.out.println("###########################");
        createBlogChannel();
    }

    private static void createVideoChannel() {
        Video video = new Video();

        VideoSubscriber subscriberAgnieszka = new VideoSubscriber("Agnieszka");
        video.registerObserver(subscriberAgnieszka);

        video.publish("CodeCoupleVideo");

        VideoSubscriber subscriberKrzysztof = new VideoSubscriber("Krzysztof");
        video.registerObserver(subscriberKrzysztof);

        video.publish("New CodeCoupleVideo");
    }


    private static void createBlogChannel() {
        Blog blog = new Blog();

        BlogSubscriber subscriberAgnieszka = new BlogSubscriber("Agnieszka");
        blog.registerObserver(subscriberAgnieszka);

        blog.publish("Observer");

        BlogSubscriber subscriberKrzysztof = new BlogSubscriber("Krzysztof");
        blog.registerObserver(subscriberKrzysztof);

        blog.unregisterObserver(subscriberAgnieszka);

        blog.publish("Design");
        blog.publish("DesignSecond");
        blog.publish("DesignThird");

    }


}
