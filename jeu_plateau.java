public abstract class jeu_plateau {
    public abstract String toString(String mes);

    public abstract Cases[][] inserer(Cases c,int nb_choisi,int ligne_valide);

    public abstract Object[] verifier_plateau(int nb_choisi);

    public abstract void creer_plateau(String contenuPion,Cases[][] tab_cases);

    
    public abstract boolean check_finish();

    public abstract void lancer_jeu();

    public abstract boolean check_plat_elt();
}
