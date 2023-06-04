package Personas;
import java.util.*;
import Personas.Persona;
public class ListaPersonas {
    Vector listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector();
    }
    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
