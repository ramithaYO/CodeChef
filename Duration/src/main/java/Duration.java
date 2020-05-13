
import java.io.IOException;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber.Exception;


public class Duration {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String []args) throws Exception, IOException
    {

        String mp4Path= "E:\\new films\\Hotel Mumbai (2018) [WEBRip] [1080p] [YTS.AM]\\1v.mp4";

        durationCalculator(mp4Path);

    }

    public static void durationCalculator(String mp4Path) throws Exception
    {

        FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(mp4Path);
        frameGrabber.start();
        convertDuration(frameGrabber.getLengthInTime());
        frameGrabber.stop();
    }
    public static void convertDuration(float time)
    {
//        System.out.println(time);
        double t1 = time/100000000;
        double t2 = t1/36;
        int hours = (int) t2;
        double t3 = t2 - hours;
        double t4 = t3*60;
        int minutes = (int) t4;
        double t6 = t4 - minutes;
        double t7 =  t6*60;
        double seconds = Math.round(t7*100)/100.0;

        System.out.println("Duration :" + hours + ":" +minutes + ":" + seconds);
        String rtn = "Duration :" + hours + ":" +minutes + ":" + seconds ;

    }
}