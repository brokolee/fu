package adhoc7;

/* If that's not the problem, then maybe you have the two Java files in different
 *  Netbeans projects.  "Projects" are an IDE construct; they don't have anything 
 *  to do with the Java language.  A "package" is part of the Java language.  In 
 *  both Netbeans and Eclipse you can have packages in the same project.  If so, 
 *  the IDE will create a classpath that includes the two packages.
 *  If you have the Java files in different projects, then you need to tell the IDE 
 *  that one project is included in the other.  In Netbeans you do this in the Project
 *   Properties (see attached image).  In Eclipse there is a similar capacity in the
 *    Build Path of the project.*/

/* Kapitel 1 - Klasse "Person" Importieren */
import de.adhoc.kap1.Person;


public class ObjContTest {
    public static void main(String[] args) {
        ObjectContainer container = new ObjectContainer();
        Person person = new Person("Käptn Blaubär", 01011111);
        container.store(person);
        
        Person outPerson = (Person) container.get();
        outPerson.print();
        
        /*Testweise eigene - nach Kurstext aktuelle "Person" Klasse in adhoc7 erstellt*/
        
        adhoc7.Person kap2Person = new adhoc7.Person("Kartoffel", "Moffel");
        System.out.println(kap2Person.getFirstname());
        
        
        /*!! CLASS CAST EXCEPTION !!*/
        
        /*String in Container abgelegt und auf Person gecastet */
        
        ObjectContainer oc = new ObjectContainer();
        oc.store("Test");
        adhoc7.Person p = (adhoc7.Person) oc.get(); // Laufzeitfehler!
        if(p != null) {
        System.out.println(p.getFirstname());
        }
        
    }
}
