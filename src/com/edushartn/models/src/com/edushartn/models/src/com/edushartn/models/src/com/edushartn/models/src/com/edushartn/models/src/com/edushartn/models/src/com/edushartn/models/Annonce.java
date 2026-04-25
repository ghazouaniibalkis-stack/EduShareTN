package com.edushartn.models;

public class Annonce {
    private int id;
    private String produit;
    private double prix;
    private Utilisateur vendeur;
    private boolean disponible;

    public Annonce() {}
    public Annonce(int id, String produit, double prix, Utilisateur vendeur) {
        this.id = id; this.produit = produit; this.prix = prix;
        this.vendeur = vendeur; this.disponible = true;
    }

    public void afficherAnnonce() {
        System.out.println(" [" + id + "] " + produit + " — " + prix + " DT | Vendeur : " + vendeur.getNom() + (disponible ? " oui" : " Vendu"));
    }
    public void acheterProduit(Utilisateur acheteur) {
        if (disponible) {
            disponible = false;
            System.out.println("£ " + acheteur.getNom() + " a achete \"" + produit + "\" pour " + prix + " DT");
        } else {
            System.out.println("Produit deja vendu.");
        }
    }
}
