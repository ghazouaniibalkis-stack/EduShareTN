package com.edushartn.models;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private int id;
    private String nom;
    private List<Signalement> signalements = new ArrayList<>();

    public Admin() {}
    public Admin(int id, String nom) { this.id = id; this.nom = nom; }

    public void ajouterSignalement(Signalement s) {
        signalements.add(s);
        System.out.println(" Signalement recu : " + s.getDescription());
    }
    public void voirSignalements() {
        System.out.println("Signalements en attente : " + signalements.size());
        for (Signalement s : signalements) s.afficherSignalement();
    }
    public void supprimerContenu(Signalement s) {
        signalements.remove(s);
        System.out.println("contenu supprime par admin" +nom);
    }
}
