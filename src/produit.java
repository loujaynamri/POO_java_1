public class produit {
    int id;
    String libelle;
    String marque;
    double prix;
    /*void afficher (){
        System.out.println("l'identifiant est "+this.id);
        System.out.println("libellé est "+this.libelle);
        System.out.println("marque est "+this.marque);
        System.out.println("prix est "+this.prix);
    }*/
    produit(int id,String lib,String marque){
        this.libelle=lib;
        this.marque=marque;
        this.id=id;
    };
    produit(int id,String lib,String marque,double prix){
        this.libelle=lib;
        this.marque=marque;
    };
    produit(){};

    @Override
    public String toString() {
        return this.marque +" "+this.id;
    }
}
