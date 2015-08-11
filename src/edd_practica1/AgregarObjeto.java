

package edd_practica1;

import Lista_Enlazada.Lista;
import Lista_Enlazada.Nodo;
import Matriz_Ortogonal.Casilla;
import Matriz_Ortogonal.Matriz;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public final class AgregarObjeto extends javax.swing.JFrame{

    Lista lista=new Lista();
    public JFrame n;
    public Matriz matrizortogonal = new Matriz();
    
    public AgregarObjeto() {
        initComponents();
        ImageIcon i0=new ImageIcon("0.jpg");
        ImageIcon i1=new ImageIcon("1.jpg");
        ImageIcon i2=new ImageIcon("2.jpg");
        ImageIcon i3=new ImageIcon("3.jpg");
        ImageIcon i4=new ImageIcon("4.jpg");
        ImageIcon i5=new ImageIcon("5.jpg");
        ImageIcon i6=new ImageIcon("6.jpg");
        ImageIcon i7=new ImageIcon("7.jpg");
        T0.setIcon(i0);
        T1.setIcon(i1);
        T2.setIcon(i2);
        T3.setIcon(i3);
        T4.setIcon(i4);
        T5.setIcon(i5);
        T6.setIcon(i6);
        T7.setIcon(i7);
        MostrarEditar();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaObjeto = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();
        CrearEscenario = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ObjetoActual = new javax.swing.JLabel();
        B_Arriba = new javax.swing.JButton();
        B_Izq = new javax.swing.JButton();
        B_Der = new javax.swing.JButton();
        B_Abajo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        T0 = new javax.swing.JLabel();
        B0 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        T1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        B2 = new javax.swing.JButton();
        T2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        B3 = new javax.swing.JButton();
        T3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        B4 = new javax.swing.JButton();
        T4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        B5 = new javax.swing.JButton();
        T5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        B6 = new javax.swing.JButton();
        T6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        B7 = new javax.swing.JButton();
        T7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel);

        javax.swing.GroupLayout ListaObjetoLayout = new javax.swing.GroupLayout(ListaObjeto.getContentPane());
        ListaObjeto.getContentPane().setLayout(ListaObjetoLayout);
        ListaObjetoLayout.setHorizontalGroup(
            ListaObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaObjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        ListaObjetoLayout.setVerticalGroup(
            ListaObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaObjetoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        CrearEscenario.setSize(new java.awt.Dimension(1300, 750));
        CrearEscenario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CrearEscenarioKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jButton2.setText("Agregar Fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Columna");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ObjetoActual.setText("jLabel1");

        B_Arriba.setText("Arriba");
        B_Arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ArribaActionPerformed(evt);
            }
        });

        B_Izq.setText("Izquierda");
        B_Izq.setToolTipText("");
        B_Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_IzqActionPerformed(evt);
            }
        });

        B_Der.setText("Derecha");
        B_Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DerActionPerformed(evt);
            }
        });

        B_Abajo.setText("Abajo");
        B_Abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AbajoActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        jButton7.setText("Graficar Lista");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Graficar Matriz");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(81, 81, 81)
                        .addComponent(ObjetoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(B_Izq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_Arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Der)
                        .addGap(56, 56, 56)
                        .addComponent(jButton9))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1049, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B_Arriba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Abajo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObjetoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_Der)
                                    .addComponent(jButton9))
                                .addComponent(B_Izq))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))))))
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CrearEscenarioLayout = new javax.swing.GroupLayout(CrearEscenario.getContentPane());
        CrearEscenario.getContentPane().setLayout(CrearEscenarioLayout);
        CrearEscenarioLayout.setHorizontalGroup(
            CrearEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearEscenarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrearEscenarioLayout.setVerticalGroup(
            CrearEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearEscenarioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        T0.setText("jLabel1");

        B0.setText("Add");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("Suelo");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setText("Pared");

        B1.setText("Add");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        T1.setText("jLabel1");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setText("Goomba");

        B2.setText("Add");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        T2.setText("jLabel1");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setText("Koopa");

        B3.setText("Add");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        T3.setText("jLabel1");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setText("Ficha");

        B4.setText("Add");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        T4.setText("jLabel1");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setText("Hongo");

        B5.setText("Add");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        T5.setText("jLabel1");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setText("Mario");

        B6.setText("Add");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        T6.setText("jLabel1");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setText("Castillo");

        B7.setText("Add");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        T7.setText("jLabel1");

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B0)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void MostrarEditar(){
   // matrizortogonal.AgregarFila();
    //matrizortogonal.AgregarColumna();
    //matrizortogonal.AgregarColumna();
    
    }
    
    public void PintarMatriz(){
    if(lista.getInicio()!=null && lista.getUltimo()!=null){
    if(lista.getPila()==true){
    ObjetoActual.setIcon(new ImageIcon(lista.getUltimo().getObjeto().getTipo()+".jpg"));
    }    
    else{
    ObjetoActual.setIcon(new ImageIcon(lista.getInicio().getObjeto().getTipo()+".jpg"));
    }
    }
    else{
    ObjetoActual.setIcon(new ImageIcon("vacio.jpg"));
    }
    CrearEscenario.setVisible(false);
    //CrearEscenario=new JFrame();    
    CrearEscenario.setSize(1300, 650);
    CrearEscenario.setVisible(true);
    CrearEscenario.setLayout(null);
    jPanel3.setVisible(false);
    //jPanel2.remove(jPanel3);
    jPanel3=new JPanel();
    jPanel3.setLayout(null);
    jPanel3.setBounds(50, 100, 800, 500);
    jPanel3.setBackground(Color.red);
    int x=0,y=0;
    Casilla auxiliar=matrizortogonal.getAuxiliar();
    for(Casilla i=auxiliar;i!=null;i=i.getDer()){
    for(Casilla j=i;j!=null;j=j.getArriba()){    
    j.setEtiqueta(new JButton());
    j.getEtiqueta().setSize(50, 50);
    j.getEtiqueta().setLocation(50*x, 450-(y*50));
    j.getEtiqueta().setIcon(j.getImagen());
    j.Click(lista,this);
    jPanel3.add(j.getEtiqueta());
    y++;    }
    x++;
    y=0;}
    /*for(Casilla j=nx;j!=null;j=j.getArriba()){
    for(Casilla i=ny;i!=null;i=i.getDer()){    
    if(x==16){
    break;
    }
    JLabel c=new JLabel();
    c.setSize(50, 50);
    c.setLocation(50*x, 450-(y*50));
    c.setIcon(nx.getImagen());
    jPanel3.add(c);
    i.setEtiqueta(c);
    x++;
    }
    x=0;
    if(y==10){
    break;
    }
    y++;
    }*/
    jPanel3.setVisible(true);
    jPanel2.add(jPanel3);
    CrearEscenario.setVisible(true);
    }
    
    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(0,jTextField1.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(1,jTextField2.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(2,jTextField3.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(3,jTextField4.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(4,jTextField5.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(5,jTextField6.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(6,jTextField7.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        ObjetoJuego nuevo=new ObjetoJuego(7,jTextField8.getText());
        lista.Agregar(nuevo);
    }//GEN-LAST:event_B7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
MostrarLista();       
        

       
        


        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        matrizortogonal.AgregarFila();
        PintarMatriz();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        matrizortogonal.AgregarColumna();
        PintarMatriz();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   String[] opciones={"Pila","Cola"};
   String opcion;        
   opcion = (String) JOptionPane.showInputDialog(null, "Seleccione Forma de recorrer la lista", "Opciones", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
   if(opcion.equals("Pila")){
   lista.setPila(true);
   }
   else{
   lista.setPila(false);
   }
   System.out.println(opcion);
   System.out.println(lista.getPila());
   PintarMatriz();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void B_ArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ArribaActionPerformed
        if(matrizortogonal.getAuxiliar().getArriba()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getArriba());
        }
        PintarMatriz();
    }//GEN-LAST:event_B_ArribaActionPerformed

    private void B_IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_IzqActionPerformed
        if(matrizortogonal.getAuxiliar().getIzq()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getIzq());
        }
        PintarMatriz();
    }//GEN-LAST:event_B_IzqActionPerformed

    private void B_DerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DerActionPerformed
        if(matrizortogonal.getAuxiliar().getDer()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getDer());
        }
        PintarMatriz();
    }//GEN-LAST:event_B_DerActionPerformed

    private void B_AbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AbajoActionPerformed
     if(matrizortogonal.getAuxiliar().getAbajo()!=null){
        matrizortogonal.setAuxiliar(matrizortogonal.getAuxiliar().getAbajo());
        }
        PintarMatriz();
    }//GEN-LAST:event_B_AbajoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    
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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    String tipo="";
    Nodo inicio=null;
    if(lista.getPila()==true){
    tipo="Pila";
    inicio=lista.getUltimo();
    }else{
    tipo="Cola";
    inicio=lista.getInicio();
    }
    String nodos="digraph grafica { \n" +
" \n" +
"rankdir=TB; \n" +
" \n" +
"label= \""+tipo+"\"  \n" +
"nodesep=0.2 \n" +
"node [shape=record];\n" +
"\n" +
"subgraph g{\n";
    int x=0;
    if(lista.getPila()==true){
    for(Nodo i=inicio;i!=null;i=i.getAnterior()){
    nodos+="node"+x+"[label=\"<f0> "+x+"|"+i.getObjeto().getNombre()+"\"];\n";
    x++;
    }
    }else{
    for(Nodo i=inicio;i!=null;i=i.getSiguiente()){
    nodos+="node"+x+"[label=\"<f0> "+x+"|"+i.getObjeto().getNombre()+"\"];\n";
    x++;
    }
    }
    
    x=0;
    if(lista.getPila()==true){
    for(Nodo i=inicio;i!=null;i=i.getAnterior()){
    if(i.getSiguiente()!=null){
    nodos+="node"+(x-1)+"->node"+x+";\n";
    }    
    if(i.getAnterior()!=null){
    nodos+="node"+x+"->node"+(x+1)+";\n";
    }
    x++;
    }
    }else{
    for(Nodo i=inicio;i!=null;i=i.getSiguiente()){
    if(i.getSiguiente()!=null){
    nodos+="node"+x+"->node"+(x+1)+";\n";
    }    
    if(i.getAnterior()!=null){
    nodos+="node"+(x-1)+"->node"+x+";\n";
    }
    x++;
    }
    }
    
    nodos+="}rank=same subgraph d{ \n" +
" }\n" +
"}";
FileWriter fichero=null;
    PrintWriter pw=null;
    try{
    fichero=new FileWriter("lista.txt");
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
      
      String fileInputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\lista.txt";
      String fileOutputPath = "C:\\Users\\Francis\\Documents\\NetBeansProjects\\EDD_Practica1\\"+tipo+".jpg";
      
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void CrearEscenarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrearEscenarioKeyPressed
    
    }//GEN-LAST:event_CrearEscenarioKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
   
    }//GEN-LAST:event_formKeyPressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
    
    }//GEN-LAST:event_jPanel2KeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    VentanaJuego.setMatriz(matrizortogonal);
        VentanaJuego v=new VentanaJuego();
        v.setVisible(true);
        //CrearEscenario.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             String seleccion = JOptionPane.showInputDialog(null,"Ingrese numero de fila",JOptionPane.QUESTION_MESSAGE); 
             int n=Integer.parseInt(seleccion);
             
    }//GEN-LAST:event_jButton5ActionPerformed

public void MostrarLista(){
        n=new JFrame("Lista");
        n.setSize(500,500);
        n.setLayout(null);
        
        JPanel p=new JPanel();
        p.setLayout(null);
       int aux=0;
        for(Nodo i=lista.getInicio();i!=null;i=i.getSiguiente()){
        i.getObjeto().nombreObjeto.setBounds(0, 50*aux, 100, 50);
        i.getEliminar().setBounds(60,50*aux,100,50);
        i.Click(lista,this);
        p.add(i.getObjeto().nombreObjeto);
        p.add(i.getEliminar());
        aux++;
        p.setPreferredSize(new Dimension(1000,50*aux));
        } 
        JScrollPane scroll=new JScrollPane();
        scroll.setBounds(5, 5, 300, 300);
        scroll.setViewportView(p);
        scroll .getViewport().setView(p);
        n.add(scroll);
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
}

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
            java.util.logging.Logger.getLogger(AgregarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarObjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B_Abajo;
    private javax.swing.JButton B_Arriba;
    private javax.swing.JButton B_Der;
    private javax.swing.JButton B_Izq;
    private javax.swing.JFrame CrearEscenario;
    private javax.swing.JFrame ListaObjeto;
    private javax.swing.JLabel ObjetoActual;
    private javax.swing.JLabel T0;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JLabel T7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    
}
