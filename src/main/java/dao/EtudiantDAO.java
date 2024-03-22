package dao;
import java.util.List;
import java.util.ArrayList;

public class EtudiantDAO {
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();




    public Etudiant addEtudiants(Etudiant etudiant){
        etudiants.add(etudiant);
        return etudiant;

    }
    public List<Etudiant> getAllEtudiants(){

        return etudiants;
    }


    



}
