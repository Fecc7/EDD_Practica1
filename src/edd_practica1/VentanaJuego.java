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

/**
 *
 * @author Francis
 */
public class VentanaJuego extends javax.swing.JFrame {

    public static Matriz matrizortogonal=null;
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        initComponents();
        this.setLayout(null);
      CPersonaje();
        PintarMatriz();  
    }
    public static void setMatriz(Matriz m){
    matrizortogonal=m;
    }
    public void Personaje(){
    
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
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1566, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(760, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CPersonaje(){
    for(Casilla i=matrizortogonal.getCabeza();i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){ 
    if( j.getObjeto()!=null){
    if(j.getDer()!=null && j.getObjeto().getTipo()==6){
     matrizortogonal.setPersonaje(j);
    }}
    }}
    
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    Casilla.frame=this;
    matrizortogonal.getPersonaje().keyPressed(evt);
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
    this.setVisible(false);
    jPanel2.setVisible(false);
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
    jPanel2.setVisible(true);
    this.add(jPanel2);
    this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}