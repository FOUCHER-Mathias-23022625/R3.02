package liste_chainee;

public class main {
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        // Insertion des éléments
        /*
        list.insertAtBeginning(56);
        list.insertAtBeginning(4);
        list.insertAtBeginning(69);
        list.insertAtBeginning(28);
        list.insertAtBeginning(13);
        list.insertAtBeginning(54);
        list.displayList();
        list.inversList();
        list.displayList();

        // Affichage de la liste
        System.out.println("Liste actuelle : ");
        list.displayList();
        System.out.println(list.AvantDernier().getElement()); 
        

        // Suppression d'un élément
        list.deleteNode(4);

        // Affichage de la liste après suppression
        System.out.println("Liste après suppression : ");
        list.displayList();
        System.out.println(list.AvantDernier().getElement()); 
        list.inversList();
        list.displayList();
        list.inversValues(54, 69);
        list.displayList();
        */
        
        //liste double 
        
        DLListe listeDouble = new DLListe();

        // Insertion d'éléments dans la liste
        DNode node1 = new DNode(1);
        DNode node2 = new DNode(77);
        DNode node5 = new DNode(963);
        DNode node6 = new DNode(54);
        node1.next = node2;
        node2.next = node5;
        node5.next = node6;
        node6.next = node1;
        listeDouble.insertAtBeginning(node1);
        // Afficher la liste
        //System.out.println("Liste initiale : ");
        //listeDouble.displayList();
        DLListe listeDouble2 = new DLListe();
        DNode node11 = new DNode(1);
        DNode node22 = new DNode(77);
        DNode node55 = new DNode(963);
        DNode node65 = new DNode(54);
        node11.next = node22;
        node22.next = node55;
        node55.next = node65;
        node65.next = null;
        listeDouble2.insertAtBeginning(node65);
        listeDouble2.insertAtBeginning(node11);
        listeDouble2.insertAtBeginning(node22);
        listeDouble2.insertAtBeginning(node55);
       
        listeDouble2.displayList();
        // Échanger deux nœuds dans la liste doublement chaînée
        System.out.println("Échanger 20 et 40 : ");
        listeDouble2.inversValuesDoubles(29, 01);
        listeDouble2.displayList();

        // Supprimer un élément de la liste
        System.out.println("Supprimer 30 : ");
        listeDouble2.deleteNode(11);
        listeDouble2.displayList();

        // Compter le nombre de nœuds dans une liste circulaire
        System.out.println("Compter les nœuds dans une liste circulaire : ");
        System.out.println("Nombre de nœuds : " + listeDouble.circulaire());
        //listeDouble.displayList();

        // Tester l'égalité entre deux listes doublement chaînées
        DLListe list2 = new DLListe();
        DNode node20 = new DNode(4882251);
        DNode node50 = new DNode(1);
        DNode node60 = new DNode(4548);
        node60.next = null;
        node20.next = node50;
        node50.next = node60;
        list2.insertAtBeginning(node60);
        list2.insertAtBeginning(node20);
        list2.insertAtBeginning(node50);

        System.out.println("Listes égales : " + listeDouble2.equals(list2));

        // Afficher la deuxième liste
        System.out.println("Deuxième liste : ");
        list2.displayList();
        
        /* Pour une liste à nœuds uniques, il est nécessaire de parcourir la liste deux fois afin de repérer les nœuds 
         * à échanger, puis de réajuster les liens ou de modifier leurs valeurs. On procède en temps linéaire.
		Bien que les liens précédent et suivant permettent de se déplacer dans les deux directions, 
		cela ne permet pas vraiment d'accélérer cette opération d'échange. 
		Pour trouver les nœuds, il est toujour
		
		s nécessaire de parcourir la liste, ce qui maintient la complexité à O(n).
		En résumé, dans cette situation spécifique, les deux approches présentent une complexité équivalente,
		 O(n), pour l'échange de nœuds. Toutefois, l'utilisation de la liste doublement chaînée pourrait être plus 
		 bénéfique pour d'autres opérations qui nécessitent des trajets en deux sens. */
        

        
        
    }
}
