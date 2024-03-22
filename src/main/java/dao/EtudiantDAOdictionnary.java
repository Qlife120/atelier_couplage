package dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EtudiantDAOdictionnary {

     private Map<String, Etudiant>  etudiantsMap = new HashMap<String, Etudiant>();


     public Etudiant getEtudByEmail(String email){
          for(Map.Entry<String,Etudiant> e: etudiantsMap.entrySet()){
               if(email == e.getValue().getEmail()){
                    return e.getValue();
               }

          }
          return null;

     }

     public Etudiant addEtudiants(Etudiant etudiant){
          if(getEtudByEmail(etudiant.getEmail())==null){
               etudiantsMap.put(etudiant.getId(), etudiant);
               return etudiant;
          }
          return etudiant;

     }

     public Map<String,Etudiant> getAllEtudaints(){
          return etudiantsMap;
     }

     public Etudiant ModifyName(Etudiant etudiant){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the new name: ");
          String name = scanner.nextLine();
          etudiant.setNom(name);
          return etudiant;
     }
     public Etudiant ModifyPrenom(Etudiant etudiant){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the new first name: ");
          String prenom = scanner.nextLine();
          etudiant.setPrenom(prenom);
          return etudiant;
     }

     public Etudiant ModifyEmail(Etudiant etudiant){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the new mail: ");
          String email = scanner.nextLine();
          etudiant.setEmail(email);
          return etudiant;
     }

     public Etudiant ModifiyById(String id){
          for(Map.Entry<String,Etudiant> e: etudiantsMap.entrySet()){
               if(id == e.getKey()){

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("choose 1 to modify name, 2 for prenom , 3 for email.");
                    int choice = scanner.nextInt();
                    switch (choice){
                         case 1: return ModifyName(e.getValue());
                         case 2 : return  ModifyPrenom(e.getValue());
                         case 3 : return ModifyEmail(e.getValue());
                         default: System.out.println("Choose another Number");
                    }

               }

          }
          return null;

     }







}
