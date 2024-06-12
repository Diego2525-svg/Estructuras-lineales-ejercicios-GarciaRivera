package Materia.Moders;
import Materia.Moders.Node;
import Materia.ListasEnlazadas.*;
public class Ejercicio_03_linkedLists {

    public Node head;
    public int getByPos(ListaEnlazada lista,int position) {
        if (lista.head == null) {
            throw new IllegalArgumentException("La lista está vacía.");
        }
       int size = lista.getSize();
       if (position>size){
        throw new IllegalArgumentException("Fuera de rango");
       }

       int targetPos=size-position;
       Node current= lista.head;    
       for(int i=0;i<targetPos;i++){
        
        current=current.next;
       }
       return current.value;
    }
  
}
