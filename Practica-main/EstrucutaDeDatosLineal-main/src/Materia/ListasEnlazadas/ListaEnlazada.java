package Materia.ListasEnlazadas;
import Materia.Moders.Node;

public class ListaEnlazada {
    public Node head;

    public ListaEnlazada(){

    }

    public void addNode(int value){
        if(head==null){
            head = new Node(value);
            return;
        }
        Node current=head;
        while (current.next!= null) {
            current=current.next;
        }

        current.next= new Node(value);
    }
        //Metodo eliminar
        public void deleteNode(int value){
            if (head==null) return;
            if (head.value==value){
                head=head.next;
                return;
            }
            Node current=head;
            while (current.next==null) {
                if (current.next.value==value){
                    current.next=current.next.next;
                    return;
                }
                current=current.next;
            }
    }

    public void print(){
        if(head==null){
            System.out.println("Lista vacia");
            return;
        }
        Node current= head;
        while (current!=null){
            System.out.println("Node value "+current.value);
            current=current.next;
        }
        System.out.println(current.value);
        System.out.println("Fin de la lista");
    }
}
