package Materia;

import java.util.EmptyStackException;

public class QueueG <T>{
        
    private NodeGeneric<T> primero; //Tambien llamado head - front
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG(){
        this.primero = null;
        this.ultimo = null;
    }

    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        } else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size ++;
    }

    public T remove(){
        if(isEmpty())
            throw new EmptyStackException();
        T aux = primero.getValue();
        primero = primero.getNext();
        size --;
        return aux;
    }

    public int size(){
        return size;
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException(); return primero.getValue();
    }

    public void printCola(){
        NodeGeneric<T> aux = primero;

        while(aux != null){
            System.out.print(aux.getValue() +" | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return primero == null;
    }
}
