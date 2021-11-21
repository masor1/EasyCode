package lecture_31;

import java.util.Date;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";

    public static void main(String[] args) {
        System.out.println("starting " + new Date());
        Thread downloadThread = new Thread(() -> {
            new DownloadFile(URL, "video.mp4").start(2);
        });
        downloadThread.start();
        System.out.println("finishing " + new Date());

    }
}

