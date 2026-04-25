package com.edushartn.models;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private int points;

    public Utilisateur() {}
    public Utilisateur(int id, String nom, String email) {
        this.id = id; this.nom = nom; this.email = email; this.points = 0;
    }

    public void ajouterPoints(int p) {
        this.points += p;
        System.out.println("* " + nom + " a gagne " + p + " points ! Total : " + points);
    }
    public void afficherProfil() {
        System.out.println("👤 " + nom + " | " + email + " | Points : " + points);
    }
    public void seConnecter() { System.out.println("-> " + nom + " connecte."); }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
}
