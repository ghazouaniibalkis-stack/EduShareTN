package com.edushartn.models;

public class Reponse {
    private int id;
    private String contenu;
    private Utilisateur auteur;
    private int votes;

    public Reponse() {}
    public Reponse(int id, String contenu, Utilisateur auteur) {
        this.id = id; this.contenu = contenu; this.auteur = auteur; this.votes = 0;
    }

    public void ajouterVote() {
        votes++;
        System.out.println(" Vote ajoute. Total : " + votes);
    }
    public int getVotes() { return votes; }
    public String getContenu() { return contenu; }
}
