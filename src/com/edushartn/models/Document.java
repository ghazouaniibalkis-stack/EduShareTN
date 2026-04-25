package com.edushartn.models;

public class Document {

    private int id;
    private String titre;
    private String matiere;
    private String auteur;

    public Document() {}

    public Document(int id, String titre, String matiere, String auteur) {
        this.id = id;
        this.titre = titre;
        this.matiere = matiere;
        this.auteur = auteur;
    }

    public void afficherDocument() {
        System.out.println(" [" + id + "] " + titre + " | Matiere: " + matiere + " | Par: " + auteur);
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public String getMatiere() { return matiere; }
    public String getAuteur() { return auteur; }

    public void setId(int id) { this.id = id; }
    public void setTitre(String titre) { this.titre = titre; }
    public void setMatiere(String matiere) { this.matiere = matiere; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    @Override
    public String toString() {
        return "Document{id=" + id + ", titre=" + titre + ", matiere=" + matiere + "}";
    }
}
