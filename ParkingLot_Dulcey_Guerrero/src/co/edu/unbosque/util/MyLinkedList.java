package co.edu.unbosque.util;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E>{

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
		lastNode.setNext(newNode);
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
//		Node<E> newNode = new Node<>(info);
		
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
	
	public void remove(int i) {
		Node<E> currentNode = this.first;
		Node<E> previous = new Node<>();
		
		int infoPos = -1;
		int size = size();

		if (!isEmpty()) {
			infoPos = 0;
			while (currentNode != null && infoPos<i-1) {
				infoPos++;
				previous = currentNode.getNext();
			}
			currentNode = previous.getNext();
			Node<E> nextNode = currentNode.getNext();
			int n = infoPos+1;
			while(n < size) {
				n++;
				E info = nextNode.getInfo();
				currentNode.setInfo(info);
			}
		}

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
			textList += current.getInfo().toString();
		}
		return textList.toString();
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> i = new Iterator<E>() {

			@Override
			public boolean hasNext() {
				if(!isEmpty()){
					return true;
				}else {
					return false;
				}
			}

			@Override
			public E next() {
				return first.getNext().getInfo();
			}
		};
		return i;
	}

	
}
