/**
 *  Démo AJAX en J2EE, par Eric Boivin
 *  Cette classe est le conteneur des objets Photo. C'est elle qui
 *  connaît la logique pour populer les objets.
 **/
package ca.etsmtl.gti525.devoir1; 

import java.util.ArrayList;
import java.util.List;

public class Collection 
{ 
    private List<Photo> maCollection = new ArrayList<Photo>();
    
    public Collection(){
    	//Stub de génération des Beans
        Photo photo1 = new Photo();
        Photo photo2 = new Photo();
        Photo photo3 = new Photo();
        Photo photo4 = new Photo();
        Photo photo5 = new Photo();
        
        photo1.setChemin("fallout1.jpg");
        photo2.setChemin("fallout2.jpg");
        photo3.setChemin("fallout3.jpg");
        photo4.setChemin("fallout4.jpg");
        photo5.setChemin("fallout5.jpg");
        
        photo1.setTitre("Monument");
        photo2.setTitre("Soldats");
        photo3.setTitre("Porte-avions");
        photo4.setTitre("Washington");
        photo5.setTitre("Désert");
        
        photo1.setId(1);
        photo2.setId(2);
        photo3.setId(3);
        photo4.setId(4);
        photo5.setId(5);
        
        maCollection.add(photo1);
        maCollection.add(photo2);
        maCollection.add(photo3);
        maCollection.add(photo4);
        maCollection.add(photo5);
    }
    
    /**
     * Pour obtenir le tableau de toutes les images
     * @return
     */
    public List<Photo> getImages(){
        return maCollection;
    }
    
    /**
     Pour obtenir un bean selon son id
     * @param id
     * @return
     */
     public Photo getPhoto(int id){
        return (Photo)maCollection.get(id);
    }
} 
