/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_practica1;

import Matriz_Ortogonal.Casilla;
import Matriz_Ortogonal.Matriz;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Francis
 */
public final class VentanaJuego extends javax.swing.JFrame {

    public static Matriz matrizortogonal=null;
    public static boolean pausa=false;
    Matriz mi=null;
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        initComponents();
        this.setLayout(null);
       Casilla.frame=this;
       mi=matrizortogonal;
      CPersonaje();
        PintarMatriz();  
        Enemigos();
        matrizortogonal.getPersonaje().Gravedar();

    }
    public static void setMatriz(Matriz m){
    matrizortogonal=m;
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Pausa = new javax.swing.JLabel();
        Graficar = new javax.swing.JLabel();
        Continuar = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Puntos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Vidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Pausa.setText("Pausa");
        Pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PausaMouseClicked(evt);
            }
        });

        Graficar.setText("Graficar Matriz");
        Graficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraficarMouseClicked(evt);
            }
        });

        Continuar.setText("Continuar");
        Continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinuarMouseClicked(evt);
            }
        });

        Reiniciar.setText("Reiniciar");
        Reiniciar.setToolTipText("");
        Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReiniciarMouseClicked(evt);
            }
        });
        Reiniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReiniciarKeyPressed(evt);
            }
        });

        jLabel5.setText("Puntos");

        Puntos.setText("0");

        jLabel7.setText("Vidas");

        Vidas.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pausa)
                        .addGap(18, 18, 18)
                        .addComponent(Graficar)
                        .addGap(18, 18, 18)
                        .addComponent(Continuar)
                        .addGap(18, 18, 18)
                        .addComponent(Reiniciar)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Puntos)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Vidas)))
                .addContainerGap(1059, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pausa)
                    .addComponent(Graficar)
                    .addComponent(Continuar)
                    .addComponent(Reiniciar)
                    .addComponent(jLabel5)
                    .addComponent(Puntos)
                    .addComponent(jLabel7)
                    .addComponent(Vidas))
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(760, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Enemigos(){
    for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){ 
    if( j.getObjeto()!=null){
    if( j.getObjeto().getTipo()==2 || j.getObjeto().getTipo()==3){
     
     j.MoverE();
    }}
    }}
    }
    public void CPersonaje(){
    for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){ 
    if( j.getObjeto()!=null){
    if( j.getObjeto().getTipo()==6){
     matrizortogonal.setPersonaje(j);
    }}
    }}
    int i=1;
    matrizortogonal.setAuxiliar(matrizortogonal.getPersonaje());
    while (i!=5 && matrizortogonal.getAuxiliar()!=null){
        if(matrizortogonal.getAuxiliar().getIzq()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getIzq());
        }
    i++;
    }
    i=1;
    while (i!=3 && matrizortogonal.getAuxiliar()!=null){
        if(matrizortogonal.getAuxiliar().getAbajo()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getAbajo());
        }
    i++;
    }
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(pausa==false){
            matrizortogonal.getPersonaje().keyPressed(evt);
        }

      //System.out.println(matrizortogonal.getPersonaje().toString());   
    
    
   /* if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
    boolean d=false;
    bucle:
   for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){    
   if( j.getObjeto()!=null){
   if(j.getDer()!=null && j.getObjeto().getTipo()==6){
   j.getDer().setObjeto(j.getObjeto());
    j.getDer().setImagen(j.getImagen());
    j.setObjeto(null);
    j.setImagen(new ImageIcon("vacio.jpg"));
    j.keyPressed(evt);
    break bucle;
      }
      }
        }
    }
    
    PintarMatriz();
    }else{System.out.println("Estupido2");}
      String nodos="digraph grafica { \n" +
" \n" +
"rankdir=TB; \n" +
" \n" +
"label= \"Matriz Ortogal\"  \n" +
"nodesep=0.8 \n" +
"node [shape=record];\n" +
"\n" +
"subgraph g{\n";
    Casilla ultimoesquina=null;
    int y=0;
    int x=-1;
    
    for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getArriba()){
    ultimoesquina=i;
    x++;
    }
    int xi=x;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getObjeto()!=null){
    nodos+="node"+x+""+y+"[label=\"<f0> "+x+"|"+j.getObjeto().getNombre()+"|"+y+"\"];\n";   }
    else{nodos+="node"+x+""+y+"[label=\"<f0> "+x+"|vacio|"+y+"\"];\n";
    }
    y++;
    }
    x--;
    }
    x=xi;y=0;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getDer()!=null){
    nodos+="node"+x+""+y+"->node"+x+""+(y+1)+";\n";
    }
    if(j.getIzq()!=null){
    nodos+="node"+x+""+y+"->node"+x+""+(y-1)+";\n";
    nodos+="{rank=same; node"+x+""+(y-1)+" node"+x+""+y+"}\n";
    }
    y++;
    }
    x--;
    }
    x=xi;y=0;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getAbajo()!=null){
    nodos+="node"+x+""+y+"->node"+(x-1)+""+y+";\n";
    }
    if(j.getArriba()!=null){
    nodos+="node"+x+""+y+"->node"+(x+1)+""+y+";\n";
    }
    y++;
    }
    x--;
    }
    nodos+="}rank=same subgraph d{ \n" +
" }\n" +
"}";
    FileWriter fichero=null;
    PrintWriter pw=null;
    try{
    fichero=new FileWriter("codigo.txt");
    pw=new PrintWriter(fichero);
    pw.print(nodos);
    }
    catch(Exception e){}
    finally{
    try{
    if(null!=fichero){
    fichero.close();
    }
    }
    catch(Exception e){}
    }
 
try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\codigo.txt";
      String fileOutputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\Matriz Ortogonal.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }*/
    }//GEN-LAST:event_formKeyPressed

    private void PausaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PausaMouseClicked
        pausa=true;
    }//GEN-LAST:event_PausaMouseClicked

    private void ContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinuarMouseClicked
pausa=false;
        Casilla.frame=this;
      CPersonaje();
        PintarMatriz();  
        Enemigos();
        matrizortogonal.getPersonaje().Gravedar();
    }//GEN-LAST:event_ContinuarMouseClicked

    private void ReiniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReiniciarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReiniciarKeyPressed

    private void ReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarMouseClicked
 ReiniciarJuego();
    }//GEN-LAST:event_ReiniciarMouseClicked

    public void ReiniciarJuego(){
 pausa=false;
 matrizortogonal=mi;
        Casilla.frame=this;
      CPersonaje();
        PintarMatriz();  
        Enemigos();
        matrizortogonal.getPersonaje().Gravedar();   
    }
    private void GraficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficarMouseClicked
     String nodos="digraph grafica { \n" +
" \n" +
"rankdir=TB; \n" +
" \n" +
"label= \"Matriz Ortogal\"  \n" +
"nodesep=0.8 \n" +
"node [shape=record];\n" +
"\n" +
"subgraph g{\n";
    Casilla ultimoesquina=null;
    int y=0;
    int x=-1;
    
    for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getArriba()){
    ultimoesquina=i;
    x++;
    }
    int xi=x;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getObjeto()!=null){
    nodos+="node"+x+""+y+"[label=\"<f0> "+x+"|"+j.getObjeto().getNombre()+"|"+y+"\"];\n";   }
    else{nodos+="node"+x+""+y+"[label=\"<f0> "+x+"|vacio|"+y+"\"];\n";
    }
    y++;
    }
    x--;
    }
    x=xi;y=0;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getDer()!=null){
    nodos+="node"+x+""+y+"->node"+x+""+(y+1)+";\n";
    }
    if(j.getIzq()!=null){
    nodos+="node"+x+""+y+"->node"+x+""+(y-1)+";\n";
    nodos+="{rank=same; node"+x+""+(y-1)+" node"+x+""+y+"}\n";
    }
    y++;
    }
    x--;
    }
    x=xi;y=0;
    for(Casilla i=ultimoesquina;i!=null;i=i.getAbajo()){
    y=0;
    for(Casilla j=i;j!=null;j=j.getDer()){
    if(j.getAbajo()!=null){
    nodos+="node"+x+""+y+"->node"+(x-1)+""+y+";\n";
    }
    if(j.getArriba()!=null){
    nodos+="node"+x+""+y+"->node"+(x+1)+""+y+";\n";
    }
    y++;
    }
    x--;
    }
    nodos+="}rank=same subgraph d{ \n" +
" }\n" +
"}";
    FileWriter fichero=null;
    PrintWriter pw=null;
    try{
    fichero=new FileWriter("codigo.txt");
    pw=new PrintWriter(fichero);
    pw.print(nodos);
    }
    catch(Exception e){}
    finally{
    try{
    if(null!=fichero){
    fichero.close();
    }
    }
    catch(Exception e){}
    }
 
try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\codigo.txt";
      String fileOutputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\Matriz Ortogonal.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    }//GEN-LAST:event_GraficarMouseClicked

    public JLabel getPuntos(){
    return Puntos;
    }
    public JLabel getVidas(){
    return Vidas;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    public void PintarMatriz(){
    //this.setVisible(false);
    //jPanel2.setVisible(false);
    //jPanel2.remove(jPanel3);
    jPanel2=new JPanel();
    jPanel2.setLayout(null);
    jPanel2.setBounds(100, 100, 800, 500);
    jPanel2.setBackground(Color.red);
    int x=0,y=0;
    Casilla auxiliar=matrizortogonal.getAuxiliar();
    for(Casilla i=auxiliar;i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){    
    j.setEtiqueta2(new JLabel());
    j.getEtiqueta2().setSize(50, 50);
    j.getEtiqueta2().setLocation(50*x, 450-(y*50));
    j.getEtiqueta2().setIcon(j.getImagen());
    //j.Click(lista,this);
    jPanel2.add(j.getEtiqueta2());
    y++;    }
    x++;
    y=0;}
    //jPanel2.setVisible(true);
    this.add(jPanel2);
    //this.setVisible(true);
    
   SwingUtilities.updateComponentTreeUI(jPanel2);
jPanel2.validate(); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continuar;
    private javax.swing.JLabel Graficar;
    private javax.swing.JLabel Pausa;
    private javax.swing.JLabel Puntos;
    private javax.swing.JLabel Reiniciar;
    private javax.swing.JLabel Vidas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
