package pptgrafico;

import java.awt.Color;

public class ArenaCombate extends javax.swing.JFrame {

    private Jugador j1;
    private JugadorCPU jCPU;
    private ReproCanciones cancionFondo = new ReproCanciones();
    private ReproCanciones sonidoVolver = new ReproCanciones();
    private ModoUnJugador mj;
    private Juego jppt;
    private int x, y;
    private int ganador;

    public ArenaCombate() {
        initComponents();
    }

    public ArenaCombate(Jugador j1Aux, JugadorCPU jCPUAux) {
        initComponents();
        jMarcadorJ1.setBackground(new Color(0,0,0,0));
        jMarcadorJ2.setBackground(new Color(0,0,0,0));
        jMarcadorEmpates.setBackground(new Color(0,0,0,0));
        iniciaTablero(j1Aux, jCPUAux);
    }

    private void iniciaTablero(Jugador j1Aux, JugadorCPU jCPUAux) {
        j1 = j1Aux;
        jCPU = jCPUAux;
        jppt = new Juego(j1, jCPU);
        bResetear.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMarcadorEmpates = new javax.swing.JTextField();
        jMarcadorJ2 = new javax.swing.JTextField();
        jMarcadorJ1 = new javax.swing.JTextField();
        Victorias1 = new javax.swing.JLabel();
        eEleccionCPU = new javax.swing.JLabel();
        eEleccionJ1 = new javax.swing.JLabel();
        eGanador = new javax.swing.JLabel();
        bPapel = new javax.swing.JButton();
        bPiedra = new javax.swing.JButton();
        bTijera = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jPersonajeCPU = new javax.swing.JLabel();
        jPersonajeUno = new javax.swing.JLabel();
        bResetear = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jMarcadorEmpates.setEditable(false);
        jMarcadorEmpates.setBackground(new java.awt.Color(0, 0, 0,0));
        jMarcadorEmpates.setFont(new java.awt.Font("Act of Rejection", 1, 60)); // NOI18N
        jMarcadorEmpates.setForeground(new java.awt.Color(67, 149, 209));
        jMarcadorEmpates.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jMarcadorEmpates.setBorder(null);
        jMarcadorEmpates.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMarcadorEmpates.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMarcadorEmpates.setMaximumSize(new java.awt.Dimension(80, 80));
        jMarcadorEmpates.setMinimumSize(new java.awt.Dimension(80, 80));
        jMarcadorEmpates.setName("MarcadorJ1"); // NOI18N
        jMarcadorEmpates.setOpaque(false);
        jMarcadorEmpates.setRequestFocusEnabled(false);
        jMarcadorEmpates.setSelectedTextColor(new java.awt.Color(0, 0, 0,100));
        jMarcadorEmpates.setSelectionColor(new java.awt.Color(0, 0, 0,100));
        getContentPane().add(jMarcadorEmpates);
        jMarcadorEmpates.setBounds(430, 130, 90, 70);

        jMarcadorJ2.setEditable(false);
        jMarcadorJ2.setBackground(new java.awt.Color(0, 0, 0,0));
        jMarcadorJ2.setFont(new java.awt.Font("Act of Rejection", 1, 60)); // NOI18N
        jMarcadorJ2.setForeground(new java.awt.Color(243, 146, 0));
        jMarcadorJ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jMarcadorJ2.setBorder(null);
        jMarcadorJ2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMarcadorJ2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMarcadorJ2.setMaximumSize(new java.awt.Dimension(80, 80));
        jMarcadorJ2.setMinimumSize(new java.awt.Dimension(80, 80));
        jMarcadorJ2.setName("MarcadorJ1"); // NOI18N
        jMarcadorJ2.setOpaque(false);
        jMarcadorJ2.setRequestFocusEnabled(false);
        jMarcadorJ2.setSelectedTextColor(new java.awt.Color(0, 0, 0,100));
        jMarcadorJ2.setSelectionColor(new java.awt.Color(0, 0, 0,100));
        getContentPane().add(jMarcadorJ2);
        jMarcadorJ2.setBounds(580, 70, 90, 70);

        jMarcadorJ1.setEditable(false);
        jMarcadorJ1.setBackground(new java.awt.Color(0, 0, 0,0));
        jMarcadorJ1.setFont(new java.awt.Font("Act of Rejection", 1, 60)); // NOI18N
        jMarcadorJ1.setForeground(new java.awt.Color(39, 87, 162));
        jMarcadorJ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jMarcadorJ1.setBorder(null);
        jMarcadorJ1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMarcadorJ1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMarcadorJ1.setMaximumSize(new java.awt.Dimension(80, 80));
        jMarcadorJ1.setMinimumSize(new java.awt.Dimension(80, 80));
        jMarcadorJ1.setName("MarcadorJ1"); // NOI18N
        jMarcadorJ1.setOpaque(false);
        jMarcadorJ1.setRequestFocusEnabled(false);
        jMarcadorJ1.setSelectedTextColor(new java.awt.Color(0, 0, 0,100));
        jMarcadorJ1.setSelectionColor(new java.awt.Color(0, 0, 0,100));
        getContentPane().add(jMarcadorJ1);
        jMarcadorJ1.setBounds(260, 70, 90, 70);

        Victorias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Marcador.png"))); // NOI18N
        getContentPane().add(Victorias1);
        Victorias1.setBounds(200, 0, 540, 140);

        eEleccionCPU.setMaximumSize(new java.awt.Dimension(185, 150));
        eEleccionCPU.setMinimumSize(new java.awt.Dimension(185, 150));
        getContentPane().add(eEleccionCPU);
        eEleccionCPU.setBounds(620, 190, 221, 221);

        eEleccionJ1.setMaximumSize(new java.awt.Dimension(185, 150));
        eEleccionJ1.setMinimumSize(new java.awt.Dimension(185, 150));
        getContentPane().add(eEleccionJ1);
        eEleccionJ1.setBounds(100, 190, 221, 221);

        eGanador.setMaximumSize(new java.awt.Dimension(185, 150));
        eGanador.setMinimumSize(new java.awt.Dimension(185, 150));
        getContentPane().add(eGanador);
        eGanador.setBounds(340, 170, 250, 228);

        bPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PapelGrande.png"))); // NOI18N
        bPapel.setBorder(null);
        bPapel.setBorderPainted(false);
        bPapel.setContentAreaFilled(false);
        bPapel.setFocusPainted(false);
        bPapel.setMaximumSize(new java.awt.Dimension(221, 221));
        bPapel.setMinimumSize(new java.awt.Dimension(221, 221));
        bPapel.setName(""); // NOI18N
        bPapel.setPreferredSize(new java.awt.Dimension(221, 221));
        bPapel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PapelPequeña.png"))); // NOI18N
        bPapel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PapelSobre.png"))); // NOI18N
        bPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPapelActionPerformed(evt);
            }
        });
        getContentPane().add(bPapel);
        bPapel.setBounds(0, 280, 221, 221);

        bPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PiedraGrande.png"))); // NOI18N
        bPiedra.setBorder(null);
        bPiedra.setBorderPainted(false);
        bPiedra.setContentAreaFilled(false);
        bPiedra.setFocusPainted(false);
        bPiedra.setMaximumSize(new java.awt.Dimension(221, 221));
        bPiedra.setMinimumSize(new java.awt.Dimension(221, 221));
        bPiedra.setPreferredSize(new java.awt.Dimension(221, 221));
        bPiedra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PiedraPequeña.png"))); // NOI18N
        bPiedra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PiedraSobre.png"))); // NOI18N
        bPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPiedraActionPerformed(evt);
            }
        });
        getContentPane().add(bPiedra);
        bPiedra.setBounds(110, 110, 221, 221);

        bTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TijerasGrande.png"))); // NOI18N
        bTijera.setBorder(null);
        bTijera.setBorderPainted(false);
        bTijera.setContentAreaFilled(false);
        bTijera.setFocusPainted(false);
        bTijera.setMaximumSize(new java.awt.Dimension(221, 221));
        bTijera.setMinimumSize(new java.awt.Dimension(221, 221));
        bTijera.setPreferredSize(new java.awt.Dimension(221, 221));
        bTijera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TijerasPequeña.png"))); // NOI18N
        bTijera.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TijerasSobre.png"))); // NOI18N
        bTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTijeraActionPerformed(evt);
            }
        });
        getContentPane().add(bTijera);
        bTijera.setBounds(200, 280, 221, 221);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SalirPequeño.png"))); // NOI18N
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setDefaultCapable(false);
        bSalir.setFocusPainted(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.setMaximumSize(new java.awt.Dimension(167, 175));
        bSalir.setMinimumSize(new java.awt.Dimension(167, 175));
        bSalir.setPreferredSize(new java.awt.Dimension(100, 100));
        bSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SalirGrande.png"))); // NOI18N
        bSalir.setRolloverEnabled(true);
        bSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalirMouseClicked(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(650, 440, 167, 175);

        bVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VolverPequeño.png"))); // NOI18N
        bVolver.setBorder(null);
        bVolver.setBorderPainted(false);
        bVolver.setContentAreaFilled(false);
        bVolver.setDefaultCapable(false);
        bVolver.setFocusPainted(false);
        bVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVolver.setMaximumSize(new java.awt.Dimension(167, 175));
        bVolver.setMinimumSize(new java.awt.Dimension(167, 175));
        bVolver.setPreferredSize(new java.awt.Dimension(100, 100));
        bVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VolverGrande.png"))); // NOI18N
        bVolver.setRolloverEnabled(true);
        bVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVolverMouseClicked(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(130, 440, 167, 175);

        jPersonajeCPU.setMaximumSize(new java.awt.Dimension(185, 150));
        jPersonajeCPU.setMinimumSize(new java.awt.Dimension(185, 150));
        getContentPane().add(jPersonajeCPU);
        jPersonajeCPU.setBounds(720, 0, 185, 150);

        jPersonajeUno.setMaximumSize(new java.awt.Dimension(185, 150));
        jPersonajeUno.setMinimumSize(new java.awt.Dimension(185, 150));
        getContentPane().add(jPersonajeUno);
        jPersonajeUno.setBounds(0, 0, 185, 150);

        bResetear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReiniciarGrande.png"))); // NOI18N
        bResetear.setBorder(null);
        bResetear.setBorderPainted(false);
        bResetear.setContentAreaFilled(false);
        bResetear.setDefaultCapable(false);
        bResetear.setFocusPainted(false);
        bResetear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bResetear.setMaximumSize(new java.awt.Dimension(167, 175));
        bResetear.setMinimumSize(new java.awt.Dimension(167, 175));
        bResetear.setPreferredSize(new java.awt.Dimension(167, 175));
        bResetear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ReiniciarPequeño.png"))); // NOI18N
        bResetear.setRolloverEnabled(true);
        bResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetearActionPerformed(evt);
            }
        });
        getContentPane().add(bResetear);
        bResetear.setBounds(360, 420, 167, 175);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PantallaCombate.png"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 900, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cancionFondo.setCancion("ArenaBatalla.mp3");
        cancionFondo.setReproduciendo(true);
        cancionFondo.setRepetir(true);
        cancionFondo.start();
        jPersonajeUno.setIcon(new javax.swing.ImageIcon(getClass().getResource(j1.getAvatar())));
        jPersonajeCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource(jCPU.getAvatar())));

    }//GEN-LAST:event_formComponentShown

    private void bSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bSalirMouseClicked

    private void bVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVolverMouseClicked
        if (cancionFondo.isReproduciendo()) {
            cancionFondo.cerrar();
            sonidoVolver.setCancion("SonidoBoton.mp3");
            sonidoVolver.setReproduciendo(true);
            sonidoVolver.setRepetir(false);
            sonidoVolver.start();
        }
        this.dispose();
        mj = new ModoUnJugador();
        mj.setVisible(true);
    }//GEN-LAST:event_bVolverMouseClicked

    private void bPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPiedraActionPerformed
        jppt.realizajugada("PIEDRA");
        ganador = jppt.devuelveGanador();
        muestraGanador();
    }//GEN-LAST:event_bPiedraActionPerformed

    private void muestraGanador() {
        jppt.actualizaMarcador();
//        System.out.println("La jugada de j1 es "+j1.getEleccion());
//        System.out.println("La jugada de la CPU es "+jCPU.getEleccion());
//        System.out.println("La j1 "+j1.getEleccionGrafica());
//        System.out.println("CPU "+jCPU.getEleccionGrafica());
//        System.out.println("Victorias de 1 "+jppt.devuelveVictorias());
//        System.out.println("Victorias de CPU "+jppt.devuelveVictoriasde2());
//        System.out.println("Empates "+jppt.devuelveEmpates());
        switch (ganador) {
            case 1:
                eGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/winj1.png")));
                eEleccionCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource(jCPU.getEleccionGrafica())));
                eEleccionJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource(j1.getEleccionGrafica())));
                break;
            case 2:
                eGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/winCPU.png")));
                eEleccionCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource(jCPU.getEleccionGrafica())));
                eEleccionJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource(j1.getEleccionGrafica())));
                break;
            case 0:
                eGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Draw.png")));
                eEleccionCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource(jCPU.getEleccionGrafica())));
                eEleccionJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource(j1.getEleccionGrafica())));
                break;
        }
        eGanador.setVisible(true);
        eEleccionCPU.setVisible(true);
        eEleccionJ1.setVisible(true);
        bResetear.setVisible(true);
        bPiedra.setVisible(false);
        bPapel.setVisible(false);
        bTijera.setVisible(false);
        jMarcadorJ1.setText(String.valueOf(jppt.devuelveVictorias()));
        jMarcadorJ2.setText(String.valueOf(jppt.devuelveVictoriasde2()));
        jMarcadorEmpates.setText(String.valueOf(jppt.devuelveEmpates()));
    }

    private void bResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetearActionPerformed
        eGanador.setVisible(false);
        bPiedra.setVisible(true);
        bPapel.setVisible(true);
        bTijera.setVisible(true);
        bResetear.setVisible(false);
        eEleccionCPU.setVisible(false);
        eEleccionJ1.setVisible(false);
    }//GEN-LAST:event_bResetearActionPerformed

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int xAux = evt.getXOnScreen();
        int yAux = evt.getYOnScreen();
        this.setLocation(xAux - this.x, yAux - this.y);
    }//GEN-LAST:event_fondoMouseDragged

    private void bPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPapelActionPerformed
        jppt.realizajugada("PAPEL");
        ganador = jppt.devuelveGanador();
        muestraGanador();
    }//GEN-LAST:event_bPapelActionPerformed

    private void bTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTijeraActionPerformed
        jppt.realizajugada("TIJERA");
        ganador = jppt.devuelveGanador();
        muestraGanador();
    }//GEN-LAST:event_bTijeraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Victorias1;
    private javax.swing.JButton bPapel;
    private javax.swing.JButton bPiedra;
    private javax.swing.JButton bResetear;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bTijera;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel eEleccionCPU;
    private javax.swing.JLabel eEleccionJ1;
    private javax.swing.JLabel eGanador;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField jMarcadorEmpates;
    private javax.swing.JTextField jMarcadorJ1;
    private javax.swing.JTextField jMarcadorJ2;
    private javax.swing.JLabel jPersonajeCPU;
    private javax.swing.JLabel jPersonajeUno;
    // End of variables declaration//GEN-END:variables
}
