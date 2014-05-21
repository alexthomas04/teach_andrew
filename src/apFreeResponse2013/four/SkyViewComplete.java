package apFreeResponse2013.four;

/**
 * Created by Sonicdeadlock on 5/20/2014.
 */
public class SkyViewComplete {
    /** A rectangular array that holds the data representing a rectangular area of the sky. */
    private double[][] view;

    /** Constructs a SkyView object from a 1-dimensional array of scan data.
     * @param numRows the number of rows represented in the view
     * Precondition: numRows > 0
     * @param numCols the number of columns represented in the view
     * Precondition: numCols > 0
     * @param scanned the scan data received from the telescope, stored in telescope order
     * Precondition: scanned.length == numRows * numCols
     * Postcondition: view has been created as a rectangular 2-dimensional array
     * with numRows rows and numCols columns and the values in
     * scanned have been copied to view and are ordered as
     * in the original rectangular area of sky.
     */
    public SkyViewComplete(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        for(int x=0;x<numRows;x++){
            for(int y= (x%2==1)?numCols-1:0;(x%2==1)?(y>=0):(y<numCols);y+=(x%2==1)?-1:1){
                view[x][y]=scanned[x*numCols+y];
            }
        }
    }

    /** Returns the average of the values in a rectangular section of view.
     * @param startRow the first row index of the section
     * @param endRow the last row index of the section
     * @param startCol the first column index of the section
     * @param endCol the last column index of the section
     * Precondition: 0 <= startRow <= endRow < view.length
     * Precondition: 0 <= startCol <= endCol < view[0].length
     * @return the average of the values in the specified section of view
     */
    public double getAverage(int startRow, int endRow,
                             int startCol, int endCol)
    {
        int count= (endRow - startRow) * (endCol - startCol);
        double total=0;
        for(int x = startRow;x<endRow;x++){
            for(int y=startCol;y<endCol;y++){
                total+=view[x][y];
            }
        }
        return total/count;
    }
    // There may be instance variables, constructors, and methods that are not shown
}
