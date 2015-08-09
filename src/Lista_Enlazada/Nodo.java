package Lista_Enlazada;

import edd_practica1.AgregarObjeto;
import edd_practica1.ObjetoJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Nodo {

    ObjetoJuego objeto;
    Nodo siguiente=null,anterior=null;
    JButton eliminar;
    
    public Nodo(ObjetoJuego objeto){
    this.objeto=objeto;
    eliminar=new JButton("Eliminar"); 
    }

    public void Click(final Lista l,final AgregarObjeto ao){
     ActionListener listener = new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        l.Eliminar(getNodo()); //elimina este nodo
        ao.n.setVisible(false); // la ventana de la lista no la muestra
        ao.MostrarLista(); // muestra de nuevo la lista
    }
        };
     eliminar.addActionListener(listener);
    }
    
    public ObjetoJuego getObjeto() {
        return objeto;
    }

    public void setObjeto(ObjetoJuego objeto) {
        this.objeto = objeto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public JButton getEliminar() {
        return eliminar;
    }

    public void setEliminar(JButton eliminar) {
        this.eliminar = eliminar;
    }
    
    public Nodo getNodo(){
    return this;
    }
}
