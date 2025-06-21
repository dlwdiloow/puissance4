import java.util.*;


public class puissance_4 extends jeu_plateau{
    Cases[][] l_cases = new Cases[6][7];
    Scanner keyb= new Scanner(System.in);
    Joueur j1;
    Joueur j2;

    //Méthodes
    
    public puissance_4(Joueur j1,Joueur j2){
        this.j1 = j1;
        this.j2 = j2;
    }

    public Cases[][] inserer(Cases c,int nb_choisi,int ligne_valide){
        if(c.getCouleur()=="null"){
            for(int i=0;i<6;i++){
                for(int j=0;j<7;j++){
                    l_cases[i][j]=c;
                    
                }
            }
        }else{
            l_cases[ligne_valide][nb_choisi]= c;
            System.out.println(l_cases[ligne_valide][nb_choisi].getCouleur());
        }
       
        return l_cases;
    }

    public  Object[] verifier_plateau(int nb_choisi){
       // demande au programme à l'utilisateur en cours de choisir une colonne 
       boolean verif = false;
       Object[] tab = new Object[2];
       tab[0] = verif;
        
        for(int i=5;i>=0;i--){
            for(int j=0;j<7;j++){  
                
                if(nb_choisi == j && l_cases[i][nb_choisi].getCouleur()=="null"){
                    verif = true;
                    System.out.println("Place disponible");
                    tab[0] = verif;
                    tab[1] = i;
                    return tab;
                }
            
            }
        }
        tab[1]=l_cases.length-1;
        System.out.println("Place non disponible");
        return tab;
       
    }

    public boolean check_plat_elt(){
        boolean verif_plein = false;
        int compteur_elt = 0;
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(l_cases[i][j].getCouleur()!="null"){
                    compteur_elt += 1;
                    
                }
            }
        }
        if(compteur_elt == 42){
            verif_plein=true;
            System.out.println("Plateau plein : "+verif_plein);
            return verif_plein;
        }
        System.out.println("Plateau plein : "+verif_plein);
        return verif_plein;
    }

    public boolean check_finish(){
        // vérifie  si l'un des joueurs réalise un puissance 4.
        boolean correct_move = false;
        
        for(int i=5;i>=0;i--){
            for(int j=0;j<7;j++){  

                if(i>=3){
                    if(l_cases[i][j].getCouleur()!="null" && l_cases[i][j]==l_cases[i-1][j]){
                        if(l_cases[i-1][j].getCouleur()!="null" && l_cases[i-1][j]==l_cases[i-2][j]){
                            if(l_cases[i-2][j].getCouleur()!="null" && l_cases[i-3][j].getCouleur()!="null" && l_cases[i-2][j]==l_cases[i-3][j]){
                                correct_move =true;
                                System.out.println("Puissance 4: "+correct_move);
                                return correct_move;
                            }
                        }

                    }
                }else if(j>=3){
                    if(l_cases[i][j].getCouleur()!="null" && l_cases[i][j-1].getCouleur()!="null" && l_cases[i][j-2].getCouleur()!="null" && l_cases[i][j-3].getCouleur()!="null"){
                        if(l_cases[i][j]==l_cases[i][j-1]){
                        if(l_cases[i][j-1]==l_cases[i][j-2]){
                            if(l_cases[i][j-2]==l_cases[i][j-3]){
                                correct_move =true;
                                System.out.println("Puissance 4: "+correct_move);
                                return correct_move;
                            }
                        }
                        }
                    }

                }if(j<4){
                    if(l_cases[i][j].getCouleur()!= "null" && l_cases[i-1][j+1].getCouleur()!= "null" && l_cases[i-2][j+2].getCouleur()!= "null" && l_cases[i-3][j+3].getCouleur()!="null"){
                        if(l_cases[i][j]==l_cases[i-1][j+1] && l_cases[i-2][j+2]==l_cases[i-1][j+1] && l_cases[i-3][j+3]==l_cases[i-2][j+2]){
                            correct_move =true;
                            System.out.println("Puissance 4: "+correct_move);
                            return correct_move;
                        }

                    }
                }
            
                
                
            }
        

        }

        for(int i=0;i<6;i++){
            for(int j=6;j>=0;j--){
                if(j<=3){

                    if(l_cases[i][j].getCouleur()!="null" && l_cases[i][j+1].getCouleur()!="null" && l_cases[i][j+2].getCouleur()!="null" && l_cases[i][j+3].getCouleur()!="null"){
                        if(l_cases[i][j]==l_cases[i][j+1]){
                        if(l_cases[i][j+1]==l_cases[i][j+2]){
                            if(l_cases[i][j+2]==l_cases[i][j+3]){
                                correct_move =true;
                                System.out.println("Puissance 4: "+correct_move);
                                return correct_move;
                            }
                        }
                        }
                }
            
            }


        }
        }
        System.out.println("Puissance 4: "+correct_move);
        return correct_move;

    }

    public void creer_plateau(String contenuPion,Cases[][] tab_cases){
        
        
        String contenu_plat = "";
        String contenu_pion= contenuPion;
        
        // variable i --> ligne  et  variable j --> colone

        // création du plateau vide 
        String message="|1|2|3|4|5|6|7|\n";
        if(contenu_pion=="_"){
            for(int i=0;i<6;i++){
                for(int j=0;j<7;j++){
                    
                   
                    
                    
                    contenu_plat += "|"+contenu_pion;
                    
                    if(j==6){
                        contenu_plat += "|\n";
                        
                        
                    }
                    
                    
                }
    
            }
            
            System.out.println(message+contenu_plat);

            
            
        }else{
            String contenu_plat_maj="|1|2|3|4|5|6|7|\n";
            
            for(int i=0;i<6;i++){
                for(int j=0;j<7;j++){
                    if(j==6){
                        if(tab_cases[i][j].getCouleur()!="R" && tab_cases[i][j].getCouleur()!="J"){
                            contenu_plat_maj+="|_|\n"; 
                        }else{
                            contenu_plat_maj+="|"+tab_cases[i][j].getCouleur()+"|\n";
                        }
                        
                        
                    }else{
                        if(tab_cases[i][j].getCouleur()!="R" && tab_cases[i][j].getCouleur()!="J"){
                            contenu_plat_maj+="|_"; 
                        }else{
                            contenu_plat_maj+="|"+tab_cases[i][j].getCouleur();
                        }
                        
                        
                    }
                    
                }
            }

            System.out.println(contenu_plat_maj);
            
            


            


        }


        
    }

   

    public void lancer_jeu(){
        // lancement du jeu avec une boucle while

        Cases case_r = new Cases(this.j1.getNomEquipe());
        Cases case_j = new Cases(this.j2.getNomEquipe());
        int nb_tours =0;
        Joueur switch_joueur =new Joueur(000, null);
        Cases c_null= new Cases("null");
        l_cases = inserer(c_null, 0, 0);
        creer_plateau("_",l_cases);
        
        boolean check_win = check_finish();
        boolean verif_elt = check_plat_elt();
        Object [] verif_plat;
        System.out.println("Le jeu est lancé !!");
        while (check_win ==false || verif_elt ==false){
            nb_tours +=1;
            if(nb_tours==1){
                switch_joueur=this.j1;
            }else if(nb_tours%2 == 0){
                switch_joueur = this.j2;
            }else if(nb_tours%2 == 1){
                switch_joueur=this.j1;
            }

            System.out.println(switch_joueur);
            System.out.println("Choisir un nombre entre 1 et 7 :");
            int nb_choisi = keyb.nextInt();
            nb_choisi -= 1;
            verif_plat= verifier_plateau(nb_choisi);
            boolean verif_elt_plat = (boolean) verif_plat[0];
            int ligne_valide = (int) verif_plat[1];
            
            if(nb_tours%2 == 0 && verif_elt_plat==true){
                l_cases=inserer(case_j,nb_choisi,ligne_valide);
                creer_plateau(case_j.getCouleur(),l_cases);
                
            }else if(nb_tours%2==1 && verif_elt_plat==true){
                l_cases=inserer(case_r,nb_choisi,ligne_valide);
                creer_plateau(case_r.getCouleur(),l_cases);
                
            }
            
            
            verif_elt = check_plat_elt();
            check_win = check_finish();

            if(check_win == true){
                System.out.println("Le jeu est terminé et vous avez réalisé un puissance 4 !");
                String message = "le gagnant le joueur numéro :"+switch_joueur.getNumero()+" qui avait l'équipe :"+switch_joueur.getNomEquipe();

                System.out.println(toString(message));
            }

            else if(verif_elt == true){
                System.out.println("Le plateau est plein, c'est donc un match nul");

            }

            
        }
    }

    public String toString(String mes){
        String message = mes;


        return message;
    }

    //GETTERS



    //SETTERS


}
