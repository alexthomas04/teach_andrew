package apFreeResponse2013.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexthomas on 5/20/14.
 */
public class MusicDownloadsComplete {
    private List<DownloadInfo> downloadList;
    public MusicDownloadsComplete()
    { downloadList = new ArrayList<DownloadInfo>(); }

    /** Returns a reference to the DownloadInfo object with the requested title if it exists.
     * @param title the requested title
     * @return a reference to the DownloadInfo object with the
     * title that matches the parameter title if it exists in the list;
     * null otherwise.
     * Postcondition:
     * - no changes were made to downloadList.
     */
    public DownloadInfo getDownloadInfo(String title)
    {
        for (int i = 0; i < downloadList.size(); i++) {
            if(downloadList.get(i).getTitle().equals(title))
                return downloadList.get(i);
        }
        return null;
    }

    /** Updates downloadList with information from titles.
     * @param titles a list of song titles
     * Postcondition:
     * - there are no duplicate titles in downloadList.
     * - no entries were removed from downloadList.
     * - all songs in titles are represented in downloadList.
     * - for each existing entry in downloadList, the download count is increased by
     * the number of times its title appeared in titles.
     * - the order of the existing entries in downloadList is not changed.
     * - the first time an object with a title from titles is added to downloadList, it
     * is added to the end of the list.
     * - new entries in downloadList appear in the same order
     * in which they first appear in titles.
     * - for each new entry in downloadList, the download count is equal to
     * the number of times its title appeared in titles.
     */
    public void updateDownloads(List<String> titles)
    {
        for (int i = 0; i < titles.size(); i++) {
            if(getDownloadInfo(titles.get(i))!=null){
                DownloadInfo di = new DownloadInfo(titles.get(i));
                downloadList.add(di);
            }else{
                getDownloadInfo(titles.get(i)).incrementTimesDownloaded();
            }
        }
    }
}
