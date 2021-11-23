package lecture_31;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class DownloadFile implements Runnable {

    private final int id;
    private final String url;
    private final String fileName;

    public DownloadFile(String url, String fileName, int id) {
        this.id = id;
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(new Date() + " starting " + id);
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println(new Date() + " finished " + id);
        } catch (IOException e) {
            System.out.println(new Date() + " failed " + id);
        }
    }
}
