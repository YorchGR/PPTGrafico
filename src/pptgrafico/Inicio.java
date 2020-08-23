package pptgrafico;

public class Inicio extends javax.swing.JFrame {

    private int x, y;
    private ModoUnJugador PUno;
    private ReproCanciones cancionFondo = new ReproCanciones();
    private ReproCanciones eligePersonaje = new ReproCanciones();

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        unoVsComputer = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        derechos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("frameInicio"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ExitGrande.png"))); // NOI18N
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.setFocusPainted(false);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ExitPequeño.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(380, 490, 120, 44);

        unoVsComputer.setBackground(new java.awt.Color(0, 0, 0));
        unoVsComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1vscompGrande.png"))); // NOI18N
        unoVsComputer.setBorder(null);
        unoVsComputer.setBorderPainted(false);
        unoVsComputer.setContentAreaFilled(false);
        unoVsComputer.setDefaultCapable(false);
        unoVsComputer.setFocusPainted(false);
        unoVsComputer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unoVsComputer.setMaximumSize(new java.awt.Dimension(305, 60));
        unoVsComputer.setMinimumSize(new java.awt.Dimension(305, 60));
        unoVsComputer.setPreferredSize(new java.awt.Dimension(305, 60));
        unoVsComputer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1vscompPequeño.png"))); // NOI18N
        unoVsComputer.setRolloverEnabled(true);
        unoVsComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoVsComputerActionPerformed(evt);
            }
        });
        getContentPane().add(unoVsComputer);
        unoVsComputer.setBounds(290, 430, 305, 60);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.gif"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(175, -30, 580, 520);

        derechos.setFont(new java.awt.Font("8BIT WONDER", 1, 14)); // NOI18N
        derechos.setForeground(new java.awt.Color(0, 0, 0));
        derechos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Derechos.png"))); // NOI18N
        getContentPane().add(derechos);
        derechos.setBounds(340, 530, 200, 50);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAnimado.gif"))); // NOI18N
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

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int xAux = evt.getXOnScreen();
        int yAux = evt.getYOnScreen();
        this.setLocation(xAux - this.x, yAux - this.y);
    }//GEN-LAST:event_fondoMouseDragged

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cancionFondo.setCancion("inicio.mp3");
        cancionFondo.setReproduciendo(true);
        cancionFondo.start();

    }//GEN-LAST:event_formComponentShown

    private void unoVsComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoVsComputerActionPerformed
         if (cancionFondo.isReproduciendo()) {
            cancionFondo.cerrar();
            eligePersonaje.setCancion("EligePersoSoindo.mp3");
            eligePersonaje.setReproduciendo(true);
            eligePersonaje.setRepetir(false);
            eligePersonaje.start();
        }
        this.dispose();
        PUno = new ModoUnJugador();
        PUno.setVisible(true);
    }//GEN-LAST:event_unoVsComputerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JLabel derechos;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton unoVsComputer;
    // End of variables declaration//GEN-END:variables
}
