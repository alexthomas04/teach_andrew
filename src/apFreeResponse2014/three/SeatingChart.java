package apFreeResponse2014.three;

import java.util.List;

/**
 * Created by Sonicdeadlock on 5/20/2014.
 */
public class SeatingChart {
    /** seats[r][c] represents the Student in row r and column c in the classroom. */
    private Student[][] seats;
    /** Creates a seating chart with the given number of rows and columns from the students in
     * studentList. Empty seats in the seating chart are represented by null.
     * @param rows the number of rows of seats in the classroom
     * @param cols the number of columns of seats in the classroom
     * Precondition: rows > 0; cols > 0;
     * rows * cols >= studentList.size()
     * Postcondition:
     * - Students appear in the seating chart in the same order as they appear
     * in studentList, starting at seats[0][0].
     * - seats is filled column by column from studentList, followed by any
     * empty seats (represented by null).
     * - studentList is unchanged.
     */
    public SeatingChart(List<Student> studentList,
                        int rows, int cols)
    { /* to be implemented in part (a) */ }
    /** Removes students who have more than a given number of absences from the
     * seating chart, replacing those entries in the seating chart with null
     * and returns the number of students removed.
     * @param allowedAbsences an integer >= 0
     * @return number of students removed from seats
     * Postcondition:
     * - All students with allowedAbsences or fewer are in their original positions in seat
     * - No student in seats has more than allowedAbsences absences.
     * - Entries without students contain null.
     */
    public int removeAbsentStudents(int allowedAbsences)
    { /* to be implemented in part (b) */ return 0;}
    // There may be instance variables, constructors, and methods that are not shown.
}
