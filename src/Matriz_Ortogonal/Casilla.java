
package Matriz_Ortogonal;

import Lista_Enlazada.Lista;
import edd_practica1.AgregarObjeto;
import edd_practica1.ObjetoJuego;
import edd_practica1.VentanaJuego;
import static edd_practica1.VentanaJuego.matrizortogonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;


public class Casilla implements KeyListener{
 Casilla Izq=null,Der=null,Arriba=null,Abajo=null;   
 ObjetoJuego objeto=null;
 boolean vacio=true;
 ImageIcon imagen=new ImageIcon("vacio.jpg");
 JButton etiqueta=new JButton();
 JLabel etiqueta2=new JLabel();
 public static VentanaJuego frame=null;
 
        
        
        public void Gravedar(){
        hiloGravedad h=new hiloGravedad();
        h.start();
        }

        private class hiloGravedad extends Thread {
        @Override
        public void run() { 
        if(getAbajo()==null){
        if(getObjeto().getTipo()==6){
        System.out.println("Game Over");
        setObjeto(null);
        setImagen(new ImageIcon("vacio.jpg"));
        }
        else{
        setObjeto(null);
        setImagen(new ImageIcon("vacio.jpg"));
        }
        }else{
         if(getAbajo().getObjeto()==null){
        frame.CPersonaje();     
        getAbajo().setObjeto(getObjeto());
        getAbajo().setImagen(getImagen());
        setObjeto(null);
        setImagen(new ImageIcon("vacio.jpg"));
        frame.CPersonaje();
        try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Casilla.class.getName()).log(Level.SEVERE, null, ex);
            }
        frame.PintarMatriz();
            
        matrizortogonal.getPersonaje().Gravedar();
        }else{
         if(getObjeto().getTipo()==6 && (getAbajo().getObjeto().getTipo()==2 || getAbajo().getObjeto().getTipo()==3) ){
         System.out.println("Game Over");
         }
         else if(getObjeto().getTipo()==6 && getAbajo().getObjeto().getTipo()==7){
         System.out.println("Win");
         }
        }
         
        }
        
        
        }
        
        }
    public void Click(final Lista l, final AgregarObjeto ao){
        
    ActionListener listener = new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    if(l.getInicio()!=null && l.getUltimo()!=null){
    if(l.getPila()==true){
    imagen=new ImageIcon(l.getUltimo().getObjeto().getTipo()+".jpg");
    setObjeto(l.getUltimo().getObjeto());
    l.Eliminar(l.getUltimo());
    }    
    else{
    imagen=new ImageIcon(l.getInicio().getObjeto().getTipo()+".jpg");
    setObjeto(l.getInicio().getObjeto());
    l.Eliminar(l.getInicio());
    }       
        ao.PintarMatriz();
    }

    }
        };
     etiqueta.addActionListener(listener);
    }  
    
    public Casilla getActual(){
    return this;
    }
    
    public JButton getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JButton etiqueta) {
        this.etiqueta = etiqueta;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(JLabel etiqueta2) {
        this.etiqueta2 = etiqueta2;
    }
  
 
 public Casilla(){
 vacio=true;
 }
 
 public Casilla(ObjetoJuego objeto){
 this.objeto=objeto;
 vacio=false;
 }

    public Casilla getIzq() {
        return Izq;
    }

    public void setIzq(Casilla Izq) {
        this.Izq = Izq;
    }

    public Casilla getDer() {
        return Der;
    }

    public void setDer(Casilla Der) {
        this.Der = Der;
    }

    public Casilla getArriba() {
        return Arriba;
    }

    public void setArriba(Casilla Arriba) {
        this.Arriba = Arriba;
    }

    public Casilla getAbajo() {
        return Abajo;
    }

    public void setAbajo(Casilla Abajo) {
        this.Abajo = Abajo;
    }

    public ObjetoJuego getObjeto() {
        return objeto;
    }

    public void setObjeto(ObjetoJuego objeto) {
        this.objeto = objeto;
        if(objeto!=null){
        imagen=new ImageIcon(objeto.getTipo()+".jpg");
        }else{
        imagen=new ImageIcon("vacio.jpg");
        }
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_RIGHT){
    if(getDer()!=null){
    if(getDer().getObjeto()==null){
    getDer().setObjeto(getObjeto());
    getDer().setImagen(getImagen());
    setObjeto(null);
    setImagen(new ImageIcon("vacio.jpg"));
    frame.CPersonaje();
    frame.PintarMatriz();
    getDer().Gravedar();
    }else{
    if(getDer().getObjeto().getTipo()==2 || getDer().getObjeto().getTipo()==3){
    System.out.println("Game Over");
    }}}}
    if(e.getKeyCode()==KeyEvent.VK_LEFT){
    if(getIzq()!=null){
    if(getIzq().getObjeto()==null){
    getIzq().setObjeto(getObjeto());
    getIzq().setImagen(getImagen());
    setObjeto(null);
    setImagen(new ImageIcon("vacio.jpg"));
    frame.CPersonaje();
    frame.PintarMatriz();
    getIzq().Gravedar();
    }else{
    if(getIzq().getObjeto().getTipo()==2 || getIzq().getObjeto().getTipo()==3){
    System.out.println("Game Over");
    }}}}
    if(e.getKeyCode()==KeyEvent.VK_UP){
    if(getArriba()!=null){
    if(getArriba().getObjeto()==null){
    getArriba().setObjeto(getObjeto());
    getArriba().setImagen(getImagen());
    setObjeto(null);
    setImagen(new ImageIcon("vacio.jpg"));
    frame.CPersonaje();
    frame.PintarMatriz();
    }else{
    if(getIzq().getObjeto().getTipo()==2 || getIzq().getObjeto().getTipo()==3){
    System.out.println("Game Over");
    }}}}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}
