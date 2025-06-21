public class Joueur {
    private int numero;
    private int compteur;
    private String nom_equipe;


    public Joueur(int numero,String nom_equipe){
        this.compteur = 21;
        this.nom_equipe = nom_equipe;
        this.numero = numero;
    }

    // Méthodes

    public void actualiser_compt(int compteur){
        this.compteur = compteur;
        
    }

    public String toString(){
        String message = "Le joueur n°"+this.numero+" s'engage avec l'équipe  "+this.nom_equipe;
        return message;
    }

    // GETTERS

    public int getCompteur(){
        return this.compteur;
    }

    public String getNomEquipe(){
        return this.nom_equipe;
    }

    public int getNumero(){
        return this.numero;
    }

    //SETTERS

    public void setCompteur(int compteur){
        this.compteur = compteur;
    }

    public void setNomEquipe(String nom_equipe){
        this.nom_equipe = nom_equipe;
    }


}
