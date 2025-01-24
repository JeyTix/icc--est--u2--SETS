import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera"); // Elemento repetido, no se añade de nuevo

        return miHashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Pera"); // Elemento repetido, se añade de nuevo

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparacion() {
        // Implementación de COMPARATOR para ordenar por longitud y luego alfabéticamente
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabéticamente
                if (resultado == 0) {
                    resultado = s1.compareToIgnoreCase(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");

        return miTreeSetComparador;
    }

    public Set<Contacto> construirTreeSetConComparacionEjercicio() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());

        contactos.add(new Contacto("Juan", "Perez", "202121"));
        contactos.add(new Contacto("Juan", "Alcatraz", "11515"));
        contactos.add(new Contacto("Maria", "Lopez", "32132"));
        contactos.add(new Contacto("Luis", "Garcia", "99946"));
        contactos.add(new Contacto("Ana", "Martinez", "3231"));
        contactos.add(new Contacto("Sofia", "Rodriguez", "021548"));


        return contactos;
    }
}
