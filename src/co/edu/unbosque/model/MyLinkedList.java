package co.edu.unbosque.model;

public class MyLinkedList<E> {

	protected Node<E> first;

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

	public void add(E info) {

		Node<E> newNode = new Node<E>(info);
		newNode.setNext(this.first);
		first = newNode;
	}

	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<E>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
		}

	}

	public void addLast(E info) {
		Node<E> lastNode = getLastNode();
		if (lastNode != null) {
			insert(info, lastNode);
		} else {
			this.first = new Node<E>(info);
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
		if (this.first != null) {
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
		Node<E> current = this.first;
		int infopos = -1;
		
		if(!isEmpty()) {
			infopos = 0;
			while(current != null && !current.getInfo().equals(info)) {
				infopos++;
				current = current.getNext();
			}
		}
		return infopos;
	}
	
	public E extractLast() {
		E info = null;
		Node<E> current = this.first;
		int listSize = size();
		if(!isEmpty()) {
			if(listSize == 1) {
				info = current.getInfo();
				this.first = null;
			}else {
				Node<E> previousLastNode = get(listSize-2);
				info = extract(previousLastNode);
			}
		}return info;
		
	}

	@Override
	public String toString() {
		String listText = "";
		Node<E> current = this.first;
		while (current != null) {
			listText += current.getInfo().toString();
			if (current.getNext() != null) {
				listText += "-->";
			}
			current = current.getNext();
		}
		return listText;
	}
}
