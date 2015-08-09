
package edd_practica1;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ObjetoJuego {
public int tipo;
public String nombre;

JLabel imagen=new JLabel();
JLabel nombreObjeto;

 public ObjetoJuego(int tipo,String nombre){
 this.tipo=tipo;
 this.nombre=nombre;
 nombreObjeto=new JLabel(nombre);
 }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public JLabel getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(JLabel nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }
 
 
}
