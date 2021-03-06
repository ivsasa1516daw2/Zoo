package animals;

import animals.Animal;
/**
 * Classe que representa a una Au
 * Hereta de la classe Animal i
 * implementa les interficies Terrestre i Aeri
 * 
 */
public class Au extends Animal implements Terrestre, Aeri {
    /**
     * Constructor de la classe Au
     * @param nom
     * @param pare
     * @param mare 
     */
    public Au(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    /**
     * Constructor sobrecarregat de la classe Au
     * @param nom
     */    
    public Au(String nom) {
        super(nom);
    }
    /**
     * Implementació del mètode volar de la interficie Aeri
     * @see Aeri
     */
    @Override
    public void volar(){
        System.out.println("El animal"+this.getNom()+" està volant");
    }
    /**
     * Implementació del mètode caminar de la interficie Terrestre
     * @see Terrestre
     */
    @Override
    public void caminar(){
        System.out.println("El animal"+this.getNom()+" està caminant");
    }
}