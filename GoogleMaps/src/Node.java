/*
 * CS 250 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Prg 01 - Node class
 * Your name(s):
 */

// TODO: implement a node class to represent a waypoint object in a route
public class Node {
	private Node next;
	
	public Node() {
		next = null;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}