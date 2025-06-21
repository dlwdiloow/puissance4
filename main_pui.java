import javax.swing.*;
import java.awt.*;
import java.util.*;

public class main_pui{
    public static void main(String[] args) {
        Joueur j1 = new Joueur(001, "R");
        Joueur j2 = new Joueur(002, "J");


        puissance_4 jeupPuissance_4 = new puissance_4(j1, j2);
        jeupPuissance_4.lancer_jeu();
    }
}