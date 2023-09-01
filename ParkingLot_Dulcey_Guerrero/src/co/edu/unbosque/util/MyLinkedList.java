package co.edu.unbosque.util;

import java.io.Serializable;
import java.util.Iterator;

public class MyLinkedList<E> implements Serializable{

	private static final long serialVersionUID = 7840129544202328722L;
	private Node<E> first;

	public MyLinkedList() {
		this.first = null;
	}

	public Node<E> getFirst() {
		return first;
	}

	public void setFirst(Node<E> first) {
		this.first = first;
	}

	public boolean isEmpty() {
		return (this.first == null ? true : false);
	}

	public void addFirst(E info) {
		Node<E> newNode = new Node<>(info);
		newNode.setNext(this.first);
		first = newNode;
	}
	
	public void add(E info) {
		Node<E> newNode = new Node<>(info);
		Node<E> lastNode = getLastNode();
		if(this.first!=null) {
			lastNode.setNext(newNode);
		} else  {
			this.first = newNode;
		}
		
	}

	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
		}
	}

	public void addLast(E info) {
		Node<E> lastNode = getLastNode();

		if (lastNode != null) {
			insert(info, lastNode);
		} else {
			this.first = new Node<>(info);
		}
	}

	public Node<E> getLastNode() {
		Node<E> current = this.first;

		while (current != null && current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}

	public int size() {
		int size = 0;
		Node<E> current = this.first;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	public E extract() {
		E data = null;
		if (first != null) {
			data = this.first.getInfo();
			this.first = this.first.getNext();
		}
		return data;
	}

	public E extract(Node<E> previous) {
		E data = null;
		if (previous != null && previous.getNext() != null) {
			data = previous.getNext().getInfo();
			previous.setNext(previous.getNext().getNext());
		}
		return data;
	}

	public Node<E> get(int n) {
		Node<E> targetNode = null;
		Node<E> currentNode = this.first;
		int counter = 0;

		while (currentNode != null && counter < n) {
			currentNode = currentNode.getNext();
			counter++;
		}
		if (currentNode != null) {
			targetNode = currentNode;
		}
		return targetNode;
	}

	public int indexOf(E info) {
		Node<E> currentNode = this.first;
		int infoPos = -1;

		if (!isEmpty()) {
			infoPos = 0;
			while (currentNode != null && !currentNode.getInfo().equals(info)) {
				infoPos++;
				currentNode = currentNode.getNext();
			}
		}
		return infoPos;

	}
	
	public void set(int i, E info) {
		Node<E> currentNode = this.first;
		
		int infoPos = -1;

		if (!isEmpty()) {
			infoPos = 0;
			while (currentNode != null && infoPos<i) {
				infoPos++;
				currentNode = currentNode.getNext();
			}
			currentNode.setInfo(info);
		}

	}
	
	public E remove(int n) {
		if(n<0 || n>=size())throw  new ArrayIndexOutOfBoundsException();
		E eliminate=null;
		if(n==0) {
			eliminate=this.first.getInfo();
			if(this.first.getNext()!=null)  this.first=this.first.getNext();
			else this.first=null;
		}
		else {
			eliminate=get(n).getInfo();
			get(n-1).setNext(get(n).getNext());
		}
		return eliminate;
	}
	
	public E extractLast() {
		E info = null;
		Node<E> current = this.first;
		int listSize = size();
		
		if(!isEmpty()) {
			if(listSize==1) {
				info = current.getInfo();
				this.first = null;
			}else {
				Node<E> previousLastNode = get(listSize-2);
				info = extract(previousLastNode);
			}
		}
		return info;
	}

	@Override
	public String toString() {
		String textList = "";
		Node<E> current = this.first;
		while (current != null) {
			textList += current.getInfo().toString() + "\n";
			current = current.getNext();
		}
		return textList.toString();
	}


	
}
