/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Persones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        menu();
        String[] persones=new String[5];
        
        int numnoms=0;
       
        numnoms=afegir(persones, numnoms);
       
        mostrarPersones(persones);
        numnoms=eliminar(persones,numnoms);
        
    }
    public static int afegir(String[] noms,int numNoms)
    {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra nom");
        String nom=teclat.nextLine();
        while(!nom.equals("stop") && numNoms<noms.length)
        {
            noms[numNoms]=nom;
            numNoms++;
            System.out.println("Entra nom");
            nom=teclat.nextLine();
        }
        return numNoms;
    }
    public static int cercar(String[] noms, int numNoms, String cercat)
    {
        for(int i=0; i<noms.length; i++)
        {
            if(noms[i].equals(cercat))return i;
        }
        return -1;  //indica que no l'he trobat
              
    }
    public static int eliminar(String[] noms, int numNoms)
    {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra nom eliminar:");
        String nom=teclat.nextLine();
        int pos=cercar(noms, numNoms, nom);
        if(pos!=-1){
            for(int i=pos;  i<numNoms; i++)
            {
                noms[i]=noms[i+1];
            }
            numNoms--;
            
        }
        else {
            System.out.println("Nom no trobat");
            return numNoms;
        }
    }
    public static void menu(){
        System.out.println("Menú");
        System.out.println("1. Afegir noms a la llista");
        System.out.println("2. Eliminar un nom de la llista");
        System.out.println("3. Mostrar llista noms");
        System.out.println("Entra opció:");
    }
    public static String entraParaula() {
      
        Scanner teclat = new Scanner(System.in);
       String paraula=teclat.next();
        return paraula;
    }
    public static void afegirNom(String[] array, String paraula){
       for(int i=0; i<1; i++)
       {
           if(array[i]==null)array[i]=paraula;
       }
    }
    
    
    public static void mostrarPersones(String[] array){
        
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
        
    }
    
}
