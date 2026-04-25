package com.edushartn.models;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== EduShare TN  Sprint 1 ===\n");

        // --- Membre 1 : Profil & Réputation ---
        System.out.println("--- Profil & Reputation (Membre 1) ---");
        Utilisateur u1 = new Utilisateur(1, "balkis ghazouani", "ghazouaniibalkis@gmail.com");
        Utilisateur u2 = new Utilisateur(2, "hadir ben daya", "bendayahadir@gmail.com");
        u1.afficherProfil();
        u1.ajouterPoints(10);
        u1.afficherProfil();

        // --- Membre 2 : Partage de Documents ---
        System.out.println("\n--- Partage de Documents (Membre 2) ---");
        GestionDocuments gestion = new GestionDocuments();
        Document d1 = new Document(1, "Resume Analyse 1", "Mathematiques", "balkis ghazouani");
        Document d2 = new Document(2, "Cours Algorithmique", "Informatique", "hadir ben daya");
        Document d3 = new Document(3, "Fiches Macro-economie", "Economie", "yassine trifi");
        gestion.ajouterDocument(d1);
        gestion.ajouterDocument(d2);
        gestion.ajouterDocument(d3);
        gestion.afficherTousLesDocuments();
        gestion.rechercher("Informatique");

        // --- Membre 3 : Forum Q&A ---
        System.out.println("\n--- Forum Q&A (Membre 3) ---");
        Question q1 = new Question(1, "Comment resoudre une recursivite ?", u2);
        q1.afficherQuestion();
        Reponse r1 = new Reponse(1, "Tu utilises un cas de base + appel recursif.", u1);
        q1.ajouterReponse(r1);
        r1.ajouterVote();
        r1.ajouterVote();
        q1.afficherMeilleureReponse();

        // --- Membre 4 : Marketplace ---
        System.out.println("\n--- Marketplace (Membre 4) ---");
        Annonce a1 = new Annonce(1, "Calculatrice scientifique", 89.0, u1);
        a1.afficherAnnonce();
        a1.acheterProduit(u2);

        // --- Membre 5 : Admin & Modération ---
        System.out.println("\n--- Admin & Moderation (Membre 5) ---");
        Admin admin = new Admin(1, "Admin EduShare");
        Signalement s1 = new Signalement(1, "Contenu inapproprie", u2);
        admin.voirSignalements();
        admin.ajouterSignalement(s1);
        admin.voirSignalements();
        admin.supprimerContenu(s1);

        System.out.println("\n=== Fin demo Sprint 1 ===");
    }
}
