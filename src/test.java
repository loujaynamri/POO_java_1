import java.util.*;
public class test {
    public static void main(String[] args) {
        produit prod1=new produit();
        prod1.id=12;
        prod1.libelle="grain d'or";
        prod1.marque="tato";
        prod1.prix=9.500;
        produit prod2=new produit(111,"beurre","still");
        System.out.println(prod1.marque+" "+prod1.id);
        System.out.println(prod2.toString());
        /*produit prod3=new produit(222,"yaourt","vitalait");
        produit prod4=new produit(333,"tomat","sicam",5.300);
        prod1.afficher();
        prod2.afficher();
        prod3.afficher();
        prod4.afficher();
        prod2.prix=1.700;
        prod2.afficher();
        prod3.prix=6.200;
        prod3.afficher();*/

        /*
        produit prod1=new produit();
        Scanner s =new Scanner(System.in);
        System.out.println("donner l'identifient: ");
        prod1.id=s.nextInt();
        System.out.println("donner libelle: ");
        prod1.libelle=s.next();
        System.out.println("donner marque: ");
        prod1.marque=s.next();
        prod1.afficher();*/

    }
}
