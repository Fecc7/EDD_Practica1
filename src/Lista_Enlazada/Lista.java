package Lista_Enlazada;

import edd_practica1.ObjetoJuego;

public class Lista {
    Nodo inicio=null;
    Nodo ultimo=null;
    boolean personaje=false;
    boolean castillo=false;
    boolean pila=false;
    
    public void Agregar(ObjetoJuego o){
    Nodo nuevo =new Nodo(o);
    if(inicio==null){
    inicio=nuevo;
    ultimo=nuevo;
    }
    else{
    Nodo auxiliar = null;
    for(Nodo i=inicio;i!=null;i=i.siguiente){
    auxiliar=i;
    }
    auxiliar.setSiguiente(nuevo);
    nuevo.setAnterior(auxiliar);
    ultimo=nuevo;
    }
    }
    
    public void Mostrar(){
    for(Nodo i=inicio;i!=null;i=i.siguiente){
    System.out.println(i.objeto.tipo+"___"+i.getObjeto().nombre);
    }
    }

    public boolean getPila() {
        return pila;
    }

    public void setPila(boolean pila) {
        this.pila = pila;
    }

    
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isPersonaje() {
        return personaje;
    }

    public void setPersonaje(boolean personaje) {
        this.personaje = personaje;
    }

    public boolean isCastillo() {
        return castillo;
    }

    public void setCastillo(boolean castillo) {
        this.castillo = castillo;
    }
    public void Eliminar(Nodo n){
     if(getInicio()==n && getUltimo()==n){
     setInicio(null);
     setUltimo(null);
     }   
     else if(getInicio()==n){
     setInicio(getInicio().getSiguiente());
     getInicio().setAnterior(null);
     }
     else if(getUltimo()==n){
     setUltimo(getUltimo().getAnterior());
     getUltimo().setSiguiente(null);
     }
     else{
     Nodo aux = inicio;
     Nodo ant = null;
     for (Nodo i=aux;i!=null;i=i.getSiguiente()){
     if(i==n){
     if(ant !=null){
     ant.setSiguiente(i.getSiguiente());
     i.getSiguiente().setAnterior(ant);
     }
     }
     ant=i;
     }
     }
     
    }
  
}
