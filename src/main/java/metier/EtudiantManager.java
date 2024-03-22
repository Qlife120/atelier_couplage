package metier;

import dao.Etudiant;
import dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {

    public EtudiantDAO etudiantDAO;


    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant getEtudByEmail(String email){

        for(Etudiant etudiant: etudiantDAO.getAllEtudiants()){
            if(email==etudiant.getEmail()){
                return etudiant;
            }
        }
        return null;
    }

    public Etudiant addEtudiants(Etudiant etudiant){
        if(getEtudByEmail(etudiant.getEmail()) == null){
            etudiantDAO.getAllEtudiants() .add(etudiant);
            return etudiant;
        }

        return  etudiant;

    }


    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants();
    }




}
