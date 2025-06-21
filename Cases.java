import java.awt.Image;

import java.awt.*;

public class Cases extends Pion {
    public Cases(String pion){
        super(pion);
    }

    

    // Méthodes



    public String toString(){
        String message = "Ce pion est une case "+ super.pion;
        return message;
    }

    public String getCouleur(){
        return super.pion;
    }
    
}
