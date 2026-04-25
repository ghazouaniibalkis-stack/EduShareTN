package com.edushartn.models;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private String contenu;
    private Utilisateur auteur;
    private List<Reponse> reponses = new ArrayList<>();

    public Question() {}
    public Question(int id, String contenu, Utilisateur auteur) {
        this.id = id; this.contenu = contenu; this.auteur = auteur;
    }

    public void afficherQuestion() {
        System.out.println("? [" + id + "] " + contenu + " (par " + auteur.getNom() + ")");
    }
    public void ajouterReponse(Reponse r) {
        reponses.add(r);
        System.out.println(" Reponse ajoutee a la question #" + id);
    }
    public void afficherMeilleureReponse() {
        Reponse meilleure = null;
        for (Reponse r : reponses) {
            if (meilleure == null || r.getVotes() > meilleure.getVotes()) meilleure = r;
        }
        if (meilleure != null) {
            System.out.println(" Meilleure reponse (" + meilleure.getVotes() + " votes) : " + meilleure.getContenu());
        }
    }
}
