import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {

    List<Employe> listeEmployes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0; i< listeEmployes.size(); i++){
            if(listeEmployes.get(i).getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        // System.out.println(listeEmployes);
        for(Employe e :listeEmployes){
            System.out.println(e);
        }
    }

    public void displayEmploye2() {
        Iterator<Employe> it = listeEmployes.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    public void trierEmployeParNom() {
        Collections.sort(listeEmployes,new Employe());
    }

    public void trierEmployeParPrenom() {

        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getPrenom().compareTo(o2.getPrenom()));
            }
        });
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> CrNomDep = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getNomDepartement().compareTo(o2.getNomDepartement()));
            }
        };
        Comparator<Employe> CrGrade = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getGrade() - o2.getGrade());
            }
        };

        Collections.sort(listeEmployes,CrNomDep.thenComparing(CrGrade) );

    }
}

