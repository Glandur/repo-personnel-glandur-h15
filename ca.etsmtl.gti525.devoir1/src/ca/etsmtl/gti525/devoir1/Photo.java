/**
 *  Démo AJAX en J2EE, par Eric Boivin
 *  Cette classe est un JavaBean contenant les informations
 *  d'une seule image
 **/
 
package ca.etsmtl.gti525.devoir1;
    
public class Photo implements java.io.Serializable 
{
    
	private static final long serialVersionUID = 3708032443298530982L;
	
	private String chemin;
    private String titre;
    private int id;
    
    public String getChemin(){
        return this.chemin;    
    }
    
    public void setChemin(String chemin){
        this.chemin = chemin;    
    }
    
    public String getTitre(){
        return this.titre;    
    }
    
    public void setTitre(String titre){
        this.titre = titre;    
    }
    
    public int getId(){
        return this.id;    
    }
    
    public void setId(int id){
        this.id = id;    
    } 

} 
