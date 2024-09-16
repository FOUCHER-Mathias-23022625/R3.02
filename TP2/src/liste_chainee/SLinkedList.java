package liste_chainee;

public class SLinkedList {
    private Node head;

    public SLinkedList() {
        head = null;
    }

    // Insérer au début de la liste
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    // Afficher la liste
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }

    // Supprimer un élément
    public void deleteNode(int value) {
        if (head == null) return; // Liste vide

        // Supprimer le premier nœud si c'est celui-ci à supprimer
        if (head.getElement() == value) {
            head = head.getNext(); // Supprime le premier élément
            return;
        }

        Node current = head;
        Node previous = null;

        // Parcours de la liste pour trouver le nœud à supprimer
        while (current != null && current.getElement() != value) {
            previous = current;
            current = current.getNext();
        }
        

        // Si l'élément est trouvé, le supprimer
        if (current != null) {
            previous.setNext(current.getNext());
        }
    }
    public Node AvantDernier() {
    	Node current = head;
    	Node tmp = null;
    	Node last = current.getNext();
    	
    	if(current.getNext()== null) { return head;}
    	
    	while(current.getNext() != null) {
    		tmp = current;
    		current = current.getNext();
    	}
    	return tmp;
    	
    }
    
    public void inversList() {
        Node precedent = null;
        Node current = head;
        Node suivant = null;
        
        while (current != null) {
            suivant = current.getNext();
            current.setNext(precedent);
            precedent = current;
            current = suivant;
        }
        
        head = precedent;
    }
    
    public void inversValues(int value1, int value2) {
        if (head == null) return;
        Node node1 = head, node2 = head;
        
        while (node1 != null && node1.getElement() != value1) {
            node1 = node1.getNext();
        }
        while (node2 != null && node2.getElement() != value2) {
            node2 = node2.getNext();
        }

        // SI on trouve pas un des 2 on sort
        if (node1 == null || node2 == null) return;
        int temp = node1.getElement();
        node1.setElement(node2.getElement());
        node2.setElement(temp);
    }
}
