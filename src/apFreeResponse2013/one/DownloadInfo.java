package apFreeResponse2013.one;

/**
 * Created by alexthomas on 5/20/14.
 */
public class DownloadInfo {

    private String songTitle;
    private int downloadCount=0;
    public DownloadInfo(String title){
        songTitle=title;
    }
    public String getTitle(){
        return songTitle;
    }
    public void incrementTimesDownloaded(){
        downloadCount++;
    }
}
