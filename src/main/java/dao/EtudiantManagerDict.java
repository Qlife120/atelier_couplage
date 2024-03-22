package dao;

import java.util.Map;
public class EtudiantManagerDict {

    public EtudiantDAOdictionnary etudiantDAOdictionnary;

    public EtudiantManagerDict(EtudiantDAOdictionnary etudiantDAOdictionnary){
        this.etudiantDAOdictionnary = etudiantDAOdictionnary;
    }

    public Etudiant getEtudByEmail(String email){
        return etudiantDAOdictionnary.getEtudByEmail(email);
    }

    public Etudiant addEtudiants(Etudiant etudiant){

        return etudiantDAOdictionnary.addEtudiants(etudiant);
    }

    public Map<String,Etudiant> getAllEtudiants(){
        return etudiantDAOdictionnary.getAllEtudaints();
    }

    public Etudiant ModifyById(String id){

        return etudiantDAOdictionnary.ModifiyById(id);
    }


}
