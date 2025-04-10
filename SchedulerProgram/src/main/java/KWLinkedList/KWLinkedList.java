package KWLinkedList;

import java.util.Iterator;
import java.util.ListIterator;

public class KWLinkedList<E> {
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	private static class Node<T> {
		public T data;
		public Node<T> next;
		public Node<T> prev;

		public Node(T item) {
			data = item;
			next = null;
		}
	}
	
	public Iterator<E> iterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listiterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listiterator(int index){
		return new KWListIterator(index);
	}
	
	private class KWListIterator implements ListIterator<E>{
		// data member and constructor
		
		private Node<E> nextItem; //refer the next node
		private Node<E> lastItemReturned;
		private int index;
		
		public KWListIterator(int index) {
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void set(E e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add(E e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public int indexOf(E item) {
		
		return 0;
	}
	
	public void add(int index, E item) {
		
	}
	
	public E get(int index) {
		
		return null;
	}
	public boolean remove(int index) {
		return true;
	}
	
	public void remove(E obj) {
		
	}
	
	public int size() {
		return size;
	}
}
