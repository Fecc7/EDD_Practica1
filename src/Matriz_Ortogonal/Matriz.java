package Matriz_Ortogonal;


public class Matriz {

    Casilla cabeza=null;
    int nx=0,ny=0;
    Casilla auxiliar;
    Casilla Personaje=null;
    
    public Matriz(){
    Casilla c=new Casilla();
    cabeza=c;
    auxiliar=cabeza;
    nx=1;
    ny=1;       
    }
    
    public void AgregarFila(){
    Casilla aux = null;
    Casilla anterior = null;
    for(Casilla i=cabeza;i!=null;i=i.getArriba()){
    aux=i;
    }
    for(Casilla  i=aux;i!=null;i=i.getDer()){
    Casilla nueva=new Casilla();
    nueva.setAbajo(i);
    i.setArriba(nueva);
    if(anterior !=null){
    anterior.setDer(nueva);
    nueva.setIzq(anterior);
    }
    anterior=nueva;
    
    }
    nx++;
    }
    
    public void AgregarColumna(){
    Casilla aux=null;
    for(Casilla i=cabeza;i!=null;i=i.getDer()){
    aux=i;
    }
    Casilla anterior=null;
    for(Casilla i=aux;i!=null;i=i.getArriba()){
    Casilla nueva=new Casilla();
    nueva.setIzq(i);
    i.setDer(nueva);
    if (anterior!=null){
    anterior.setArriba(nueva);
    nueva.setAbajo(anterior);
    }
    anterior=nueva;
    }
    ny++;
    }
    
    public void EliminarFila(int n){}
    
    public void EliminarColumna(int n){}
    
    public void MostrarCasillas(){
    for(Casilla i=auxiliar;i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){
    System.out.print("Casilla ");  }
    System.out.println();    }
    }
    
    public void CambiarAux(Casilla c){
    auxiliar=c;
    }
    
    public Casilla getAuxiliar(){
    return auxiliar;
    }

    public Casilla getCabeza() {
        return cabeza;
    }

    public void setAuxiliar(Casilla auxiliar){
    this.auxiliar=auxiliar;
    } 
    
    public void setCabeza(Casilla cabeza) {
        this.cabeza = cabeza;
    }

    public int getNx() {
        return nx;
    }

    public void setNx(int nx) {
        this.nx = nx;
    }

    public int getNy() {
        return ny;
    }

    public void setNy(int ny) {
        this.ny = ny;
    }

    public  Casilla getPersonaje() {
        return Personaje;
    }

    public void setPersonaje(Casilla Personaje) {
        this.Personaje = Personaje;
    }

    
    
}
