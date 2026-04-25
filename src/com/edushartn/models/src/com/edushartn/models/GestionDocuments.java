package com.edushartn.models;

import java.util.ArrayList;
import java.util.List;

public class GestionDocuments {

    private List<Document> listeDocuments = new ArrayList<>();

    public void ajouterDocument(Document doc) {
        listeDocuments.add(doc);
        System.out.println(" Document ajoute : " + doc.getTitre());
    }

    public void afficherTousLesDocuments() {
        System.out.println("\n Liste des documents (" + listeDocuments.size() + ") :");
        for (Document doc : listeDocuments) {
            doc.afficherDocument();
        }
    }

    public void rechercher(String motCle) {
        System.out.println("\n Resultats pour : \"" + motCle + "\"");
        boolean trouve = false;
        for (Document doc : listeDocuments) {
            if (doc.getTitre().toLowerCase().contains(motCle.toLowerCase())
             || doc.getMatiere().toLowerCase().contains(motCle.toLowerCase())) {
                doc.afficherDocument();
                trouve = true;
            }
        }
        if (!trouve) System.out.println("Aucun document trouve.");
    }
}
