import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management{
   public void displayStudents(List<Etudiant> etudiants,
                         Consumer<Etudiant> con){
       etudiants.forEach(con);
   }
    public void displayStudentsByFilter(List<Etudiant> etudiants,
                                 Predicate<Etudiant> pre, Consumer<Etudiant> con){
       etudiants.stream().filter(pre).forEach(con);
    }
    public String returnStudentsNames(List<Etudiant> etudiants,
                               Function<Etudiant, String> fun){
        String names = "";
        for (Etudiant s : etudiants) {
            names += " " + fun.apply(s);
        }
        return names;
    }
    public Etudiant createStudent(Supplier<Etudiant> sup){
        return sup.get();
    }
    public List<Etudiant> sortStudentsById(List<Etudiant> etudiants,
                                    Comparator<Etudiant> com){
        etudiants.sort(com);
        return etudiants;
    }
    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants){
        return etudiants.stream();
    }
}
