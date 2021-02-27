
package com.Vista;
import com.Logica.FCFS;
import com.Logica.RR;
import com.Logica.SJF;

import com.Logica.Cola;
import com.Logica.Nodo;
import com.sun.imageio.plugins.jpeg.JPEG;

public class vista extends javax.swing.JFrame {
    //colas algoritmos
    Cola colaFCFS = new Cola();
    Cola colaSJF = new Cola();
    Cola colaRR = new Cola();
    Cola colasecundaria = new Cola();
    //colas a dibujar
    Cola colaBloqueados = new Cola();
    Cola colaProcesos = new Cola();
    Cola colaTemp   = new Cola();
    
    //clases para manejar los procesos de cada algoritmo
    SJF sjf = new SJF();
    RR rr = new RR();
    FCFS fcfs = new FCFS();
    
    // variables locales par dibujar
    int tiempo = 0;
    int fila = 0;
    int filaBloqueado = 0;
    
    //  temporales
    Nodo  nodotemp = new Nodo();
    
    // bandera
    // true = hay proceso en ejecucion
    boolean bandera = false;
    
    
    public vista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LineaTiempo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Procesos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Bloqueados = new javax.swing.JTable();
        Ejecutar = new javax.swing.JButton();
        BotonAnadir = new javax.swing.JButton();
        BotonEjecucion1 = new javax.swing.JButton();
        BotonEjecucion = new javax.swing.JButton();
        botonEspera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LineaTiempo.setAutoCreateRowSorter(true);
        LineaTiempo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2 ", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "Title ", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "Fin"
            }
        ));
        LineaTiempo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        LineaTiempo.setMaximumSize(new java.awt.Dimension(2222, 500));
        LineaTiempo.setPreferredSize(new java.awt.Dimension(2500, 500));
        LineaTiempo.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(LineaTiempo);

        Procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Proceso", "T Llegada", "Rafaga", "T Comienzo", "T Final", "T Retorno", "T Espera", "Cola"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Procesos);

        Bloqueados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Proceso", "Rafaga", "TiempoBloqueo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Bloqueados);

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        BotonAnadir.setText("Añadir proceso");
        BotonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnadirActionPerformed(evt);
            }
        });

        BotonEjecucion1.setBackground(new java.awt.Color(255, 255, 255));

        BotonEjecucion.setBackground(new java.awt.Color(102, 255, 0));

        botonEspera.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(Ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonEjecucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)
                                .addComponent(BotonEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(botonEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(Ejecutar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAnadir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEjecucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnadirActionPerformed
       anadirProcesosAColas();
    }//GEN-LAST:event_BotonAnadirActionPerformed

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        atender();
    }//GEN-LAST:event_EjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bloqueados;
    private javax.swing.JButton BotonAnadir;
    private javax.swing.JButton BotonEjecucion;
    private javax.swing.JButton BotonEjecucion1;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JTable LineaTiempo;
    private javax.swing.JTable Procesos;
    private javax.swing.JButton botonEspera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void anadirProcesosAColas() {
        double rafaga = Math.random()*6+3;
        double cola = Math.random()*3+1;
        //System.out.println("al insertar"+(int)cola);
        int nombre = this.fila;
        this.Procesos.getModel().setValueAt(nombre,fila, 0);
        this.Procesos.getModel().setValueAt(tiempo,fila, 1);
        this.Procesos.getModel().setValueAt((int)rafaga,fila, 2);
        this.Procesos.getModel().setValueAt((int)cola,fila, 7);
        
        
        if ((int)cola== 1) {   
            this.colaFCFS.insert(tiempo, (int)rafaga, nombre, fila, 0, 0, 0,1,0);
            //System.out.println("Inserto en FCFS");
        }else{
            if ((int)cola== 2){
                this.colaSJF.insert(tiempo, (int)rafaga, nombre, fila, 0, 0, 0,2,0);
                //System.out.println("Inserto en SJF");
            }else{
                this.colaRR.insert(tiempo, (int)rafaga, nombre, fila, 0, 0, 0,3,0);
                //System.out.println("Inserto en RR");
            }
        }
        fila++;
    }

    private void atender() {
               
        
        if (this.colaFCFS.longitud() == 0 && this.colaSJF.longitud() == 0
                && this.colaRR.longitud() == 0 && this.colasecundaria.longitud() == 0 && !bandera) {
            dibujarBloqueados();
            tiempo++;
            return;
        }
        envejecimiento();
        dibujarBloqueados();
        
        if (revisarNuevo()) {
            //System.out.println("se añadio un  nuevo proceso");
            return;
        }
        
        if(this.nodotemp.rafagaRestante < this.nodotemp.rafaga && this.nodotemp.tipoCola != 3 ){
            //System.out.println("entra");
            dibujarColas();
            if(bloquearProc()){
                double a = 3;
                //System.out.println("aaaantes"+ this.nodotemp.tipoCola);
                this.colaBloqueados.insert(this.nodotemp.llegada, this.nodotemp.rafaga, this.nodotemp.nombre, this.nodotemp.fila, 
                            this.nodotemp.rafagaRestante, (int)a, filaBloqueado, this.nodotemp.tipoCola, this.nodotemp.comienzo);
                this.LineaTiempo.getModel().setValueAt("B", this.nodotemp.fila, tiempo);
                this.Bloqueados.getModel().setValueAt(this.nodotemp.nombre, filaBloqueado, 0);
                this.Bloqueados.getModel().setValueAt(this.nodotemp.rafaga, filaBloqueado, 1);
                filaBloqueado++;
                bandera = false;
            }else{
            this.LineaTiempo.getModel().setValueAt("x", this.nodotemp.fila, tiempo);    
            }
            nodotemp.rafagaRestante++;
            tiempo++;
            
        }else{
            if (this.nodotemp.rafagaRestante < this.nodotemp.rafaga && this.nodotemp.conteo<3) {
                //System.out.println("esntro aque");
                dibujarColas();
                this.LineaTiempo.getModel().setValueAt("x", this.nodotemp.fila, tiempo);
                nodotemp.rafagaRestante++;
                tiempo++;
                this.nodotemp.conteo++;
            }else{ 
                if (this.nodotemp.rafagaRestante ==this.nodotemp.rafaga || (this.nodotemp.conteo == 3 && this.nodotemp.tipoCola == 3)) {
                    bandera = false;
                    if (this.nodotemp.rafagaRestante < this.nodotemp.rafaga) {
                        meterColaSecundaria(this.nodotemp);
                    }
                    anadirDatos();
                    
                }
            }
        }
        if(this.colaFCFS.longitud() == 0 && this.colaSJF.longitud() == 0
                && this.colaRR.longitud() == 0 && this.colasecundaria.longitud() != 0 && !bandera){
            
            this.colaRR = this.colasecundaria;
            this.colasecundaria = new Cola();
            atender();
            
        }
    }    

    private void revisarBloqueados() {
        System.out.println("bloqueos revisados");
    }

    private void dibujarColas() {
        Nodo nodo = new Nodo();
        try {

            nodo = this.colaFCFS.extraerCabeza();
            for (int i = 0; i < this.colaFCFS.longitud(); i++) {
                this.LineaTiempo.getModel().setValueAt("-",nodo.fila, this.tiempo);
                nodo = nodo.next;
            }
            
        } catch (Exception e) {
        }
        
        try {

            nodo = this.colaSJF.extraerCabeza();
            for (int i = 0; i < this.colaSJF.longitud(); i++) {
                this.LineaTiempo.getModel().setValueAt("-",nodo.fila, this.tiempo);
                nodo = nodo.next;
            }            
            
        } catch (Exception e) {
        }
        
        try {

            nodo = this.colaRR.extraerCabeza();
            for (int i = 0; i < this.colaRR.longitud(); i++) {
                this.LineaTiempo.getModel().setValueAt("-",nodo.fila, this.tiempo);
                nodo = nodo.next;
            }
            
        } catch (Exception e) {
        }
    }

    private boolean revisarNuevo() {
        
        try {
            
        } catch (Exception e) {
        }
        // al ser fifo simplelemte lo saca de la cola para ejecutarlo y ejecutarlo todo
        if(this.colaFCFS.longitud() > 0 && !bandera ){
            
            this.nodotemp  = this.colaFCFS.extraerCabeza();
            
            this.colaFCFS.extraer(1);
            //System.out.println("extrajo el FCFS");
            bandera =true;
            this.LineaTiempo.getModel().setValueAt("x", this.nodotemp.fila, tiempo);
            this.Procesos.getModel().setValueAt(tiempo, this.nodotemp.fila, 3);
            this.nodotemp.rafagaRestante++;
            this.nodotemp.comienzo = tiempo;
            dibujarColas();
            tiempo++;
            return true;
            
        }
        
        // este toca organizar la cola 
        if(this.colaSJF.longitud() > 0 && !bandera ){
            this. colaSJF = sjf.organizarCola(this.colaSJF);
            this.nodotemp  = this.colaSJF.extraerCabeza();
            this.colaSJF.extraer(1);
            //System.out.println("extrajo el SJF");
            this.LineaTiempo.getModel().setValueAt("x", this.nodotemp.fila, tiempo);
            this.Procesos.getModel().setValueAt(tiempo, this.nodotemp.fila, 3);
            this.nodotemp.rafagaRestante++;
            this.nodotemp.comienzo = tiempo;
            bandera =true;
            dibujarColas();
            tiempo++;
            return true;
        }
             
        // este tiene un periodo maximo de 4
        if(this.colaRR.longitud() > 0 && !bandera ){

            this.nodotemp  = this.colaRR.extraerCabeza();
            this.colaRR.extraer(1);
            //System.out.println("extrajo el RR");
            this.LineaTiempo.getModel().setValueAt("x", this.nodotemp.fila, tiempo);
            if (this.nodotemp.comienzo == 0) {
                this.Procesos.getModel().setValueAt(tiempo, this.nodotemp.fila, 3);
                this.nodotemp.comienzo = tiempo;
                //System.out.println("entro");
            }else{
                //System.out.println("no entro");
            }

            this.nodotemp.rafagaRestante++;

            bandera =true;
            dibujarColas();
            tiempo++;
            return true;
        }
        return false;
    }

    private void meterColaSecundaria(Nodo nodotemp) {
        
        this.colasecundaria.insert(nodotemp.llegada, nodotemp.rafaga-nodotemp.rafagaRestante, nodotemp.nombre, 
                nodotemp.fila, 0, 0, 0, nodotemp.tipoCola,nodotemp.comienzo);

    }

    private void anadirDatos() {
        
        this.Procesos.getModel().setValueAt(this.nodotemp.comienzo, this.nodotemp.fila, 3);
        this.Procesos.getModel().setValueAt(tiempo, this.nodotemp.fila, 4);
        this.Procesos.getModel().setValueAt(tiempo-this.nodotemp.llegada, this.nodotemp.fila, 5);
        this.Procesos.getModel().setValueAt(this.nodotemp.comienzo-this.nodotemp.llegada, this.nodotemp.fila, 6);
        

    }

    private boolean bloquearProc() {
        double a = Math.random()*10;
        if (a>9) {
            return true;
        }
        return false;
    }

    private void dibujarBloqueados() {
        Cola ctempo = new Cola();
        Nodo nodo = new Nodo();
        nodo = this.colaBloqueados.extraerCabeza();
        try {
            for (int i = 0; i < this.colaBloqueados.longitud(); i++) {
                if (nodo.tiempoBloqueo == 0) {
                    this.colaBloqueados.extraer(1);
                    insertarEnCola(nodo);
                    //System.out.println("despues" +nodo.tipoCola);
                    
                }else{
                    nodo.tiempoBloqueo--;
                    this.LineaTiempo.getModel().setValueAt("B", nodo.fila, this.tiempo);           
                    this.Bloqueados.getModel().setValueAt(nodo.tiempoBloqueo,nodo.filaBloqueado, 2); 
            
                    nodo = nodo.next;
                }
                                
                
                
            }
        } catch (Exception e) {
        }
        
    }

    private void insertarEnCola(Nodo nodo) {
        
        switch (nodo.tipoCola) {
            case 1:
                this.colaFCFS.insert(nodo.llegada, nodo.rafaga-nodo.rafagaRestante, 
                        nodo.nombre, nodo.fila, 0, nodo.tiempoBloqueo, 0, 1, nodo.comienzo);
                break;
            case 2:
                this.colaSJF.insert(nodo.llegada, nodo.rafaga-nodo.rafagaRestante, 
                        nodo.nombre, nodo.fila, 0, nodo.tiempoBloqueo, 0, 2, nodo.comienzo);
                
                break;
            case 3:
                this.colaRR.insert(nodo.llegada, nodo.rafaga-nodo.rafagaRestante, 
                        nodo.nombre, nodo.fila, 0, nodo.tiempoBloqueo, 0, 3, nodo.comienzo);
                
                break;
            case 0:
                System.out.println("dio 0");
                break;
            default:
                System.out.println("algo paso");
                
        }
        
    }

    private void envejecimiento() {
    Nodo nodo = new Nodo();
    nodo = this.colaSJF.extraerCabeza();
        try {
            for (int i = 0; i < this.colaSJF.longitud(); i++) {
                if (nodo.tiempoMejora == 7) {
                    this.colaSJF.extraer(1);
                    this.colaFCFS.insert(nodo.llegada, nodo.rafaga, nodo.nombre,
                            nodo.fila, nodo.rafagaRestante, nodo.tiempoBloqueo, nodo.filaBloqueado, 1, nodo.comienzo);
                    this.Procesos.getModel().setValueAt(1, nodo.fila, 7);
                }else{
                    nodo.tiempoMejora++;

                }
            
            
            } 
        }
        catch (Exception e) {
        }
// volver de cola 3 a cola 2
    nodo = this.colaRR.extraerCabeza();
    try {
            for (int i = 0; i < this.colaRR.longitud(); i++) {
                if (nodo.tiempoMejora == 7) {
                    this.colaRR.extraer(1);
                    this.colaSJF.insert(nodo.llegada, nodo.rafaga, nodo.nombre,
                            nodo.fila, nodo.rafagaRestante, nodo.tiempoBloqueo, nodo.filaBloqueado, 2, nodo.comienzo);
                    this.Procesos.getModel().setValueAt(2, nodo.fila, 7);
                }else{
                    nodo.tiempoMejora++;
                }
            
            
            } 
        }
        catch (Exception e) {
        }
        
        
    }




    
}
