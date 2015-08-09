

package edd_practica1;

import Lista_Enlazada.Lista;
import Matriz_Ortogonal.Matriz;

public class EDD_Practica1 {


    public static void main(String[] args) {
        AgregarObjeto ventana=new AgregarObjeto();
        ventana.setVisible(true);
        Matriz n=new Matriz();
        n.AgregarColumna();
        n.AgregarColumna();
        n.AgregarColumna();
        n.AgregarFila();
        n.AgregarFila();
        n.MostrarCasillas();
    }
    
}
