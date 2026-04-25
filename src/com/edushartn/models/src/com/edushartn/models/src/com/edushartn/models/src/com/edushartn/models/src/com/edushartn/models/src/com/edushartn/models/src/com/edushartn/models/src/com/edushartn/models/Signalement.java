package com.edushartn.models;

public class Signalement {
    private int id;
    private String description;
    private Utilisateur signalePar;

    public Signalement() {}
    public Signalement(int id, String description, Utilisateur signalePar) {
        this.id = id; this.description = description; this.signalePar = signalePar;
    }

    public void afficherSignalement() {
        System.out.println("[" + id + "] " + description + " (signale par " + signalePar.getNom() + ")");
    }
    public String getDescription() { return description; }
}
