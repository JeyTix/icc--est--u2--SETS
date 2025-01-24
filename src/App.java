import java.util.Set;

import models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        System.out.println("Hello, World!");
        // runHashSet();
        // System.out.println();
        // runLinkedHashSet();
        // System.out.println();
        // runTreeSet();
        // System.out.println();
        // runTreeSetComparator();
        // System.out.println();
        agenda();

        System.out.println();
    }
    
    private static void runHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet= sets.construirHashSet();
        System.out.println("\t----- HashSet -----");
        System.out.println("Elemento del HashSet (no se garantiza orden)");
        for(String elemento: ejemploHashSet){
            System.out.println(elemento);
        }
    }

    private static void runLinkedHashSet(){
        Sets sets= new Sets();
        Set<String> ejemploLinkedHashSet= sets.construirLinkedHashSet();
        System.out.println("\t----- LinkedHashSet -----");
        System.out.println("Elemento del LinkedHashSet (Si garantiza orden)");
        for(String elemento: ejemploLinkedHashSet){
            System.out.println(elemento);
        }
    }

    private static void runTreeSet(){
        Sets sets= new Sets();
        Set<String> ejemploTreeSet= sets.construirTreeSet();
        System.out.println("\t----- TreeSet -----");
        System.out.println("Elemento del TreeSet (orden alfabetico):");
        for(String elemento: ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparator(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparacion= sets.construirTreeSetConComparacion();
        System.out.println("\t----- TreeSet con comparador -----");
        System.out.println("Elemento del TreeSet (orden descendiente):");
        for(String elemento: ejemploTreeSetConComparacion){
            System.out.println("* "+elemento);
        }
    }

    public static void agenda() {
        Sets sets = new Sets();
        Set<Contacto> contactos = sets.construirTreeSetConComparacionEjercicio();
        System.out.println("\t----- TreeSet con comparador -----");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
