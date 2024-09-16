package liste_chainee;

public class DLListe {
    private DNode head;
    
    public DLListe() {
        head = null;
    }

    // Insérer au début de la liste
    public void insertAtBeginning(DNode newNode) {
        if (head != null) {
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    // Afficher la liste
    public void displayList() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " <-> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }

    // Supprimer un élément
    public void deleteNode(int value) {
        if (head == null) return;

        DNode current = head;

        while (current != null && current.getElement() != value) {
            current = current.getNext();
        }

        if (current != null) {
            if (current.getPrev() != null) {
                current.getPrev().setNext(current.getNext());
            } else {
                head = current.getNext(); // Cas où l'élément supprimé est le premier
            }
            if (current.getNext() != null) {
                current.getNext().setPrev(current.getPrev());
            }
        }
    }
    public void inversValuesDoubles(int value1, int value2) {
        if (value1 == value2) return;

        DNode node1 = head, node2 = head;

        while (node1 != null && node1.getElement() != value1) {
            node1 = node1.getNext();
        }

        while (node2 != null && node2.getElement() != value2) {
            node2 = node2.getNext();
        }

        if (node1 == null || node2 == null) return;

        // Échange des éléments
        int temp = node1.getElement();
        node1.element = node2.getElement();
        node2.element = temp;
    }

    
    public int circulaire() {
        if (head == null) return 0;

        DNode temp = head;
        int count = 1;

        while (temp.getNext() != head) {
            count++;
            temp = temp.getNext();
            if (temp == null) break;  // Ajouter une sécurité si la liste n'est pas circulaire
        }

        return count;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DLListe other = (DLListe) obj;
        DNode current1 = this.head;
        DNode current2 = other.head;

        while (current1 != null && current2 != null) {
            if (current1.getElement() != current2.getElement()) {
                return false;
            }
            current1 = current1.getNext();
            current2 = current2.getNext();
        }

        return current1 == null && current2 == null;
    }


}
