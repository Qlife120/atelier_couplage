package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.EtudiantDAOdictionnary;
import dao.EtudiantManagerDict;
import metier.EtudiantManager;

import java.util.ArrayList;
import java.util.List;

public class Presentation {


    public static void main(String[] args){
        EtudiantDAOdictionnary etudiantDAOdictionnary = new EtudiantDAOdictionnary();
        EtudiantManagerDict etudiantManagerDict = new EtudiantManagerDict(etudiantDAOdictionnary);

        Etudiant e1 = new Etudiant("1","aziz","ahmed","youss1@gmail.com");
        Etudiant e2 = new Etudiant("2","aew","a","youss1@gmail.com");
        Etudiant e3 = new Etudiant("3","a2","ahme","youss1@gmail.com");
        Etudiant e4 = new Etudiant("4","azer","ah","youss3@gmail.com");

        etudiantManagerDict.addEtudiants(e1);
        etudiantManagerDict.addEtudiants(e2);
        etudiantManagerDict.addEtudiants(e3);
        etudiantManagerDict.addEtudiants(e4);

        System.out.println(etudiantManagerDict.getAllEtudiants());

        System.out.println(etudiantManagerDict.ModifyById("1"));
    }
}
