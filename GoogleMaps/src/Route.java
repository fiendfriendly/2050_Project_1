/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Prg 01 - Route class
 * Your name(s):
 */

public class Route {

    // TODOd: implement instance/class variables
    private Node start;
    private static final int MAX_JUMP = 5;

    // TODOd: implement the parameter-less constructor
    public Route() {
        start = null;
    }

    // TODOd: return the number of waypoints in the route
    public int size() {
        if(start == null)
            return 0;
        int count = 0;
        Node current = start;
        while(current != null) {
            count++;
            current = current.getNext();
        } return count;
    }

    // TODO: a route should not accept jumps from one waypoint to another greater than MAX_JUMP;
    //  return true/false depending whether the waypoint was successfully added or not
    public boolean add(final Waypoint waypoint) {
        Waypoint w1 = new Waypoint();
    }

    // TODO: return the waypoint at the specified index location
    public Waypoint get(int index) {
        return null;
    }

    // TODO: return a string representation of a route from its start to its end
    @Override
    public String toString() {
        return "";
    }
}