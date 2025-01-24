package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Comparar por longitud del nombre primero, luego por nombre alfabéticamente
        int resultado = Integer.compare(c1.getNombre().length(), c2.getNombre().length());
        if (resultado == 0) {
            resultado = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        }
        return resultado;
    }
}
