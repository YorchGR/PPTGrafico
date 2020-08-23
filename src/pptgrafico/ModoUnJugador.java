package pptgrafico;

public class ModoUnJugador extends javax.swing.JFrame {

    private int x, y;
    private ReproCanciones cancionFondo = new ReproCanciones();
    private ReproCanciones sonidoVolver = new ReproCanciones();
//    private ReproCanciones sonidoSeleccion = new ReproCanciones();
//    private ReproCanciones sonidoSeleccionCPU = new ReproCanciones();
    private ReproCanciones continuar = new ReproCanciones();
    private Inicio ini;
    private String elecciónPer;
    private String RutaElecciónPer = "/imagenes/Personajes/";
    private String eleccionAvatar;
    private Jugador j1;
    private JugadorCPU cpu;
    private ArenaCombate ac;

    public ModoUnJugador() {
        initComponents();
        inicializarEtiquetas();
    }

    private void inicializarEtiquetas() {
        eZangiefGrande.setVisible(false);
        eZangiefNombre.setVisible(false);
        eSakuraNombre.setVisible(false);
        eSakuraGrande.setVisible(false);
        eSagatNombre.setVisible(false);
        eSagatGrande.setVisible(false);
        eRiuGrande.setVisible(false);
        eRiuNombre.setVisible(false);
        eChunLiGrande.setVisible(false);
        eChunLiNombre.setVisible(false);
        eDalshinGrande.setVisible(false);
        eDalshinNombre.setVisible(false);
        eBalrogGrande.setVisible(false);
        eBalrogNombre.setVisible(false);
        eBlankaGrande.setVisible(false);
        eBlankaNombre.setVisible(false);
        eAkumaGrande.setVisible(false);
        eAkumaNombre.setVisible(false);
        bContinuar.setVisible(false);
        bResetear.setVisible(false);
        ePersonajeUnoElegido.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bResetear = new javax.swing.JButton();
        bContinuar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        eAkumaNombre = new javax.swing.JLabel();
        eAkumaGrande = new javax.swing.JLabel();
        bAkumaPequeño = new javax.swing.JButton();
        eBlankaNombre = new javax.swing.JLabel();
        eBlankaGrande = new javax.swing.JLabel();
        bBlankaPequeño = new javax.swing.JButton();
        eBalrogNombre = new javax.swing.JLabel();
        eBalrogGrande = new javax.swing.JLabel();
        bBalrogPequeño = new javax.swing.JButton();
        eDalshinNombre = new javax.swing.JLabel();
        eDalshinGrande = new javax.swing.JLabel();
        bDalshinPequeño = new javax.swing.JButton();
        eChunLiNombre = new javax.swing.JLabel();
        eChunLiGrande = new javax.swing.JLabel();
        bChunLiPequeño = new javax.swing.JButton();
        eRiuNombre = new javax.swing.JLabel();
        eRiuGrande = new javax.swing.JLabel();
        bRiuPequeño = new javax.swing.JButton();
        eSagatNombre = new javax.swing.JLabel();
        eSagatGrande = new javax.swing.JLabel();
        bSagatPequeño = new javax.swing.JButton();
        eZangiefNombre = new javax.swing.JLabel();
        eZangiefGrande = new javax.swing.JLabel();
        bZangiefPequeño = new javax.swing.JButton();
        eSakuraNombre = new javax.swing.JLabel();
        eSakuraGrande = new javax.swing.JLabel();
        bSakuraPequeño = new javax.swing.JButton();
        chooseDos = new javax.swing.JLabel();
        ePersonajeUnoElegido = new javax.swing.JLabel();
        ePersonajeDosElegido = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("PanelUnJugador"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

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

        bContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VS.png"))); // NOI18N
        bContinuar.setBorder(null);
        bContinuar.setBorderPainted(false);
        bContinuar.setContentAreaFilled(false);
        bContinuar.setDefaultCapable(false);
        bContinuar.setFocusPainted(false);
        bContinuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bContinuar.setMaximumSize(new java.awt.Dimension(100, 100));
        bContinuar.setMinimumSize(new java.awt.Dimension(100, 100));
        bContinuar.setPreferredSize(new java.awt.Dimension(100, 100));
        bContinuar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VSPequeño.png"))); // NOI18N
        bContinuar.setRolloverEnabled(true);
        bContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(bContinuar);
        bContinuar.setBounds(300, 150, 270, 260);

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
        bSalir.setBounds(640, 440, 167, 175);

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
        bVolver.setBounds(80, 440, 167, 175);

        eAkumaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Akuma.png"))); // NOI18N
        eAkumaNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eAkumaNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eAkumaNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eAkumaNombre);
        eAkumaNombre.setBounds(290, 470, 330, 110);

        eAkumaGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/AkumaGrande.png"))); // NOI18N
        eAkumaGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eAkumaGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eAkumaGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eAkumaGrande);
        eAkumaGrande.setBounds(550, 330, 150, 160);

        bAkumaPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/AkumaPequeño.png"))); // NOI18N
        bAkumaPequeño.setBorder(null);
        bAkumaPequeño.setBorderPainted(false);
        bAkumaPequeño.setContentAreaFilled(false);
        bAkumaPequeño.setDefaultCapable(false);
        bAkumaPequeño.setFocusPainted(false);
        bAkumaPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAkumaPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bAkumaPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bAkumaPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bAkumaPequeño.setRolloverEnabled(true);
        bAkumaPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bAkumaPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bAkumaPequeñoMouseExited(evt);
            }
        });
        bAkumaPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAkumaPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bAkumaPequeño);
        bAkumaPequeño.setBounds(550, 330, 150, 160);

        eBlankaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Blanka.png"))); // NOI18N
        eBlankaNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eBlankaNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eBlankaNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eBlankaNombre);
        eBlankaNombre.setBounds(290, 470, 330, 110);

        eBlankaGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/BlankaGrande.png"))); // NOI18N
        eBlankaGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eBlankaGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eBlankaGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eBlankaGrande);
        eBlankaGrande.setBounds(380, 340, 150, 160);

        bBlankaPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/BlankaPequeño.png"))); // NOI18N
        bBlankaPequeño.setBorder(null);
        bBlankaPequeño.setBorderPainted(false);
        bBlankaPequeño.setContentAreaFilled(false);
        bBlankaPequeño.setDefaultCapable(false);
        bBlankaPequeño.setFocusPainted(false);
        bBlankaPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBlankaPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bBlankaPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bBlankaPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bBlankaPequeño.setRolloverEnabled(true);
        bBlankaPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBlankaPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBlankaPequeñoMouseExited(evt);
            }
        });
        bBlankaPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBlankaPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bBlankaPequeño);
        bBlankaPequeño.setBounds(380, 340, 150, 160);

        eBalrogNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Balrog.png"))); // NOI18N
        eBalrogNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eBalrogNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eBalrogNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eBalrogNombre);
        eBalrogNombre.setBounds(290, 470, 330, 110);

        eBalrogGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/BalrogGrande.png"))); // NOI18N
        eBalrogGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eBalrogGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eBalrogGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eBalrogGrande);
        eBalrogGrande.setBounds(180, 330, 150, 160);

        bBalrogPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/BalrogPequeño.png"))); // NOI18N
        bBalrogPequeño.setBorder(null);
        bBalrogPequeño.setBorderPainted(false);
        bBalrogPequeño.setContentAreaFilled(false);
        bBalrogPequeño.setDefaultCapable(false);
        bBalrogPequeño.setFocusPainted(false);
        bBalrogPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBalrogPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bBalrogPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bBalrogPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bBalrogPequeño.setRolloverEnabled(true);
        bBalrogPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBalrogPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBalrogPequeñoMouseExited(evt);
            }
        });
        bBalrogPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBalrogPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bBalrogPequeño);
        bBalrogPequeño.setBounds(180, 330, 150, 160);

        eDalshinNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Dalshin.png"))); // NOI18N
        eDalshinNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eDalshinNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eDalshinNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eDalshinNombre);
        eDalshinNombre.setBounds(290, 470, 330, 110);

        eDalshinGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/DalshinGrande.png"))); // NOI18N
        eDalshinGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eDalshinGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eDalshinGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eDalshinGrande);
        eDalshinGrande.setBounds(560, 190, 150, 160);

        bDalshinPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/DalshinPequeño.png"))); // NOI18N
        bDalshinPequeño.setBorder(null);
        bDalshinPequeño.setBorderPainted(false);
        bDalshinPequeño.setContentAreaFilled(false);
        bDalshinPequeño.setDefaultCapable(false);
        bDalshinPequeño.setFocusPainted(false);
        bDalshinPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDalshinPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bDalshinPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bDalshinPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bDalshinPequeño.setRolloverEnabled(true);
        bDalshinPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bDalshinPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bDalshinPequeñoMouseExited(evt);
            }
        });
        bDalshinPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDalshinPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bDalshinPequeño);
        bDalshinPequeño.setBounds(560, 190, 150, 160);

        eChunLiNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Chunli.png"))); // NOI18N
        eChunLiNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eChunLiNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eChunLiNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eChunLiNombre);
        eChunLiNombre.setBounds(290, 470, 330, 110);

        eChunLiGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/ChunliGrande.png"))); // NOI18N
        eChunLiGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eChunLiGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eChunLiGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eChunLiGrande);
        eChunLiGrande.setBounds(380, 210, 150, 160);

        bChunLiPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/ChunliPequeño.png"))); // NOI18N
        bChunLiPequeño.setBorder(null);
        bChunLiPequeño.setBorderPainted(false);
        bChunLiPequeño.setContentAreaFilled(false);
        bChunLiPequeño.setDefaultCapable(false);
        bChunLiPequeño.setFocusPainted(false);
        bChunLiPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bChunLiPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bChunLiPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bChunLiPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bChunLiPequeño.setRolloverEnabled(true);
        bChunLiPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bChunLiPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bChunLiPequeñoMouseExited(evt);
            }
        });
        bChunLiPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChunLiPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bChunLiPequeño);
        bChunLiPequeño.setBounds(380, 210, 150, 160);

        eRiuNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Riu.png"))); // NOI18N
        eRiuNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eRiuNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eRiuNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eRiuNombre);
        eRiuNombre.setBounds(290, 470, 330, 110);

        eRiuGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/RiuGrande.png"))); // NOI18N
        eRiuGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eRiuGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eRiuGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eRiuGrande);
        eRiuGrande.setBounds(180, 190, 150, 160);

        bRiuPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/RiuPequeño.png"))); // NOI18N
        bRiuPequeño.setBorder(null);
        bRiuPequeño.setBorderPainted(false);
        bRiuPequeño.setContentAreaFilled(false);
        bRiuPequeño.setDefaultCapable(false);
        bRiuPequeño.setFocusPainted(false);
        bRiuPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRiuPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bRiuPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bRiuPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bRiuPequeño.setRolloverEnabled(true);
        bRiuPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRiuPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRiuPequeñoMouseExited(evt);
            }
        });
        bRiuPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRiuPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bRiuPequeño);
        bRiuPequeño.setBounds(190, 190, 150, 160);

        eSagatNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Sagat.png"))); // NOI18N
        eSagatNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eSagatNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eSagatNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eSagatNombre);
        eSagatNombre.setBounds(290, 470, 330, 110);

        eSagatGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/SagatGrande.png"))); // NOI18N
        eSagatGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eSagatGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eSagatGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eSagatGrande);
        eSagatGrande.setBounds(560, 50, 150, 160);

        bSagatPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/SagatPequeño.png"))); // NOI18N
        bSagatPequeño.setBorder(null);
        bSagatPequeño.setBorderPainted(false);
        bSagatPequeño.setContentAreaFilled(false);
        bSagatPequeño.setDefaultCapable(false);
        bSagatPequeño.setFocusPainted(false);
        bSagatPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSagatPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bSagatPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bSagatPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bSagatPequeño.setRolloverEnabled(true);
        bSagatPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSagatPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSagatPequeñoMouseExited(evt);
            }
        });
        bSagatPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSagatPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bSagatPequeño);
        bSagatPequeño.setBounds(560, 50, 150, 160);

        eZangiefNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Zangief.png"))); // NOI18N
        eZangiefNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eZangiefNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eZangiefNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eZangiefNombre);
        eZangiefNombre.setBounds(290, 470, 330, 110);

        eZangiefGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/ZangiefGrande.png"))); // NOI18N
        eZangiefGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eZangiefGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eZangiefGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eZangiefGrande);
        eZangiefGrande.setBounds(180, 50, 150, 160);

        bZangiefPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/ZangiefPequeño.png"))); // NOI18N
        bZangiefPequeño.setBorder(null);
        bZangiefPequeño.setBorderPainted(false);
        bZangiefPequeño.setContentAreaFilled(false);
        bZangiefPequeño.setDefaultCapable(false);
        bZangiefPequeño.setFocusPainted(false);
        bZangiefPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bZangiefPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bZangiefPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bZangiefPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bZangiefPequeño.setRolloverEnabled(true);
        bZangiefPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bZangiefPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bZangiefPequeñoMouseExited(evt);
            }
        });
        bZangiefPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZangiefPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bZangiefPequeño);
        bZangiefPequeño.setBounds(190, 50, 150, 160);

        eSakuraNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/Sakura.png"))); // NOI18N
        eSakuraNombre.setMaximumSize(new java.awt.Dimension(120, 130));
        eSakuraNombre.setMinimumSize(new java.awt.Dimension(120, 130));
        eSakuraNombre.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eSakuraNombre);
        eSakuraNombre.setBounds(290, 470, 330, 110);

        eSakuraGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/SakuraGrande.png"))); // NOI18N
        eSakuraGrande.setMaximumSize(new java.awt.Dimension(120, 130));
        eSakuraGrande.setMinimumSize(new java.awt.Dimension(120, 130));
        eSakuraGrande.setPreferredSize(new java.awt.Dimension(120, 130));
        getContentPane().add(eSakuraGrande);
        eSakuraGrande.setBounds(380, 40, 150, 160);

        bSakuraPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Personajes/SakuraPequeño.png"))); // NOI18N
        bSakuraPequeño.setBorder(null);
        bSakuraPequeño.setBorderPainted(false);
        bSakuraPequeño.setContentAreaFilled(false);
        bSakuraPequeño.setDefaultCapable(false);
        bSakuraPequeño.setFocusPainted(false);
        bSakuraPequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSakuraPequeño.setMaximumSize(new java.awt.Dimension(120, 130));
        bSakuraPequeño.setMinimumSize(new java.awt.Dimension(120, 130));
        bSakuraPequeño.setPreferredSize(new java.awt.Dimension(120, 130));
        bSakuraPequeño.setRolloverEnabled(true);
        bSakuraPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSakuraPequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSakuraPequeñoMouseExited(evt);
            }
        });
        bSakuraPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSakuraPequeñoActionPerformed(evt);
            }
        });
        getContentPane().add(bSakuraPequeño);
        bSakuraPequeño.setBounds(380, 40, 150, 160);

        chooseDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Choose1.png"))); // NOI18N
        getContentPane().add(chooseDos);
        chooseDos.setBounds(160, 0, 600, 100);
        getContentPane().add(ePersonajeUnoElegido);
        ePersonajeUnoElegido.setBounds(20, 50, 380, 470);
        getContentPane().add(ePersonajeDosElegido);
        ePersonajeDosElegido.setBounds(500, 50, 380, 470);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantalla selección.png"))); // NOI18N
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

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int xAux = evt.getXOnScreen();
        int yAux = evt.getYOnScreen();
        this.setLocation(xAux - this.x, yAux - this.y);
    }//GEN-LAST:event_fondoMouseDragged

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cancionFondo.setCancion("ElegirPersonaje.mp3");
        cancionFondo.setReproduciendo(true);
        cancionFondo.start();
    }//GEN-LAST:event_formComponentShown

    private void bVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVolverMouseClicked
        if (cancionFondo.isReproduciendo()) {
            cancionFondo.cerrar();
            sonidoVolver.setCancion("SonidoBoton.mp3");
            sonidoVolver.setReproduciendo(true);
            sonidoVolver.setRepetir(false);
            sonidoVolver.start();
        }
        this.dispose();
        ini = new Inicio();
        ini.setVisible(true);
    }//GEN-LAST:event_bVolverMouseClicked

    private void bSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bSalirMouseClicked

    private void bZangiefPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bZangiefPequeñoMouseEntered
        eZangiefGrande.setVisible(true);
        eZangiefNombre.setVisible(true);
    }//GEN-LAST:event_bZangiefPequeñoMouseEntered

    private void bZangiefPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bZangiefPequeñoMouseExited
        eZangiefGrande.setVisible(false);
        eZangiefNombre.setVisible(false);
    }//GEN-LAST:event_bZangiefPequeñoMouseExited

    private void bSakuraPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSakuraPequeñoMouseEntered
        eSakuraGrande.setVisible(true);
        eSakuraNombre.setVisible(true);
    }//GEN-LAST:event_bSakuraPequeñoMouseEntered

    private void bSakuraPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSakuraPequeñoMouseExited
        eSakuraGrande.setVisible(false);
        eSakuraNombre.setVisible(false);
    }//GEN-LAST:event_bSakuraPequeñoMouseExited

    private void bZangiefPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZangiefPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "ZangiefSelect.png";
        eleccionAvatar = RutaElecciónPer + "ZangiefAva.png";
        PersonajeElegido();
        //cancionSelecionado(true)
    }//GEN-LAST:event_bZangiefPequeñoActionPerformed

    private void bSakuraPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSakuraPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "SakuraSelect.png";
        eleccionAvatar = RutaElecciónPer + "SakuraAva.png";
        PersonajeElegido();
        //cancionSelecionado(true)
    }//GEN-LAST:event_bSakuraPequeñoActionPerformed

    private void bSagatPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSagatPequeñoMouseEntered
        eSagatGrande.setVisible(true);
        eSagatNombre.setVisible(true);
    }//GEN-LAST:event_bSagatPequeñoMouseEntered

    private void bSagatPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSagatPequeñoMouseExited
        eSagatGrande.setVisible(false);
        eSagatNombre.setVisible(false);
    }//GEN-LAST:event_bSagatPequeñoMouseExited

    private void bSagatPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSagatPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "SagatSelect.png";
        eleccionAvatar = RutaElecciónPer + "SagatAva.png";
        PersonajeElegido();

    }//GEN-LAST:event_bSagatPequeñoActionPerformed

    private void bRiuPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRiuPequeñoMouseEntered
        eRiuGrande.setVisible(true);
        eRiuNombre.setVisible(true);
    }//GEN-LAST:event_bRiuPequeñoMouseEntered

    private void bRiuPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRiuPequeñoMouseExited
        eRiuGrande.setVisible(false);
        eRiuNombre.setVisible(false);
    }//GEN-LAST:event_bRiuPequeñoMouseExited

    private void bRiuPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRiuPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "RiuSelect.png";
        eleccionAvatar = RutaElecciónPer + "RiuAva.png";
        PersonajeElegido();

    }//GEN-LAST:event_bRiuPequeñoActionPerformed

    private void bChunLiPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bChunLiPequeñoMouseEntered
        eChunLiGrande.setVisible(true);
        eChunLiNombre.setVisible(true);
    }//GEN-LAST:event_bChunLiPequeñoMouseEntered

    private void bChunLiPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bChunLiPequeñoMouseExited
        eChunLiGrande.setVisible(false);
        eChunLiNombre.setVisible(false);
    }//GEN-LAST:event_bChunLiPequeñoMouseExited

    private void bChunLiPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChunLiPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "ChunLiSelect.png";
        eleccionAvatar = RutaElecciónPer + "ChunLiAva.png";
        PersonajeElegido();

    }//GEN-LAST:event_bChunLiPequeñoActionPerformed

    private void bDalshinPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDalshinPequeñoMouseEntered
        eDalshinGrande.setVisible(true);
        eDalshinNombre.setVisible(true);
    }//GEN-LAST:event_bDalshinPequeñoMouseEntered

    private void bDalshinPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDalshinPequeñoMouseExited
        eDalshinGrande.setVisible(false);
        eDalshinNombre.setVisible(false);
    }//GEN-LAST:event_bDalshinPequeñoMouseExited

    private void bDalshinPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDalshinPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "DalshinSelect.png";
        eleccionAvatar = RutaElecciónPer + "DalshinAva.png";
        PersonajeElegido();

    }//GEN-LAST:event_bDalshinPequeñoActionPerformed

    private void bBalrogPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBalrogPequeñoMouseEntered
        eBalrogGrande.setVisible(true);
        eBalrogNombre.setVisible(true);
    }//GEN-LAST:event_bBalrogPequeñoMouseEntered

    private void bBalrogPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBalrogPequeñoMouseExited
        eBalrogGrande.setVisible(false);
        eBalrogNombre.setVisible(false);
    }//GEN-LAST:event_bBalrogPequeñoMouseExited

    private void bBalrogPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBalrogPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "BalrogSelect.png";
        eleccionAvatar = RutaElecciónPer + "BalrogAva.png";
        PersonajeElegido();

    }//GEN-LAST:event_bBalrogPequeñoActionPerformed

    private void bBlankaPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBlankaPequeñoMouseEntered
        eBlankaGrande.setVisible(true);
        eBlankaNombre.setVisible(true);
    }//GEN-LAST:event_bBlankaPequeñoMouseEntered

    private void bBlankaPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBlankaPequeñoMouseExited
        eBlankaGrande.setVisible(false);
        eBlankaNombre.setVisible(false);
    }//GEN-LAST:event_bBlankaPequeñoMouseExited

    private void bBlankaPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBlankaPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "BlankaSelect.png";
        eleccionAvatar = RutaElecciónPer + "BlankaAva.png";
        PersonajeElegido();
    }//GEN-LAST:event_bBlankaPequeñoActionPerformed

    private void bAkumaPequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAkumaPequeñoMouseEntered
        eAkumaGrande.setVisible(true);
        eAkumaNombre.setVisible(true);
    }//GEN-LAST:event_bAkumaPequeñoMouseEntered

    private void bAkumaPequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAkumaPequeñoMouseExited
        eAkumaGrande.setVisible(false);
        eAkumaNombre.setVisible(false);
    }//GEN-LAST:event_bAkumaPequeñoMouseExited

    private void bAkumaPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAkumaPequeñoActionPerformed
        elecciónPer = RutaElecciónPer + "AkumaSelect.png";
        eleccionAvatar = RutaElecciónPer + "AkumaAva.png";
        PersonajeElegido();
    }//GEN-LAST:event_bAkumaPequeñoActionPerformed

    private void bContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContinuarActionPerformed
        if (cancionFondo.isReproduciendo()) {
            cancionFondo.cerrar();
            continuar.setCancion("luchar.mp3");
            continuar.setReproduciendo(true);
            continuar.setRepetir(false);
            continuar.start();
        }
        this.dispose();
        ac = new ArenaCombate(j1, cpu);
        ac.setVisible(true);

    }//GEN-LAST:event_bContinuarActionPerformed

    private void bResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetearActionPerformed
        reseteaEtiquetas();
    }//GEN-LAST:event_bResetearActionPerformed

    private void PersonajeElegido() {
        ePersonajeUnoElegido.setIcon(new javax.swing.ImageIcon(getClass().getResource(elecciónPer)));
        j1 = new Jugador(eleccionAvatar);
        PersonajeCPU();
        escondeEtiquetas();
    }

    private void escondeEtiquetas() {
        bContinuar.setVisible(true);
        bResetear.setVisible(true);
        ePersonajeUnoElegido.setVisible(true);
        ePersonajeDosElegido.setVisible(true);
        eZangiefGrande.setVisible(false);
        eZangiefNombre.setVisible(false);
        bZangiefPequeño.setVisible(false);
        eSakuraNombre.setVisible(false);
        eSakuraGrande.setVisible(false);
        bSakuraPequeño.setVisible(false);
        eSagatNombre.setVisible(false);
        eSagatGrande.setVisible(false);
        bSagatPequeño.setVisible(false);
        eRiuNombre.setVisible(false);
        eRiuGrande.setVisible(false);
        bRiuPequeño.setVisible(false);
        eChunLiGrande.setVisible(false);
        eChunLiNombre.setVisible(false);
        bChunLiPequeño.setVisible(false);
        eDalshinGrande.setVisible(false);
        eDalshinNombre.setVisible(false);
        bDalshinPequeño.setVisible(false);
        eBalrogGrande.setVisible(false);
        eBalrogNombre.setVisible(false);
        bBalrogPequeño.setVisible(false);
        eBlankaGrande.setVisible(false);
        eBlankaNombre.setVisible(false);
        bBlankaPequeño.setVisible(false);
        eAkumaGrande.setVisible(false);
        eAkumaNombre.setVisible(false);
        bAkumaPequeño.setVisible(false);
    }

    public void reseteaEtiquetas() {
        inicializarEtiquetas();
        ePersonajeUnoElegido.setVisible(false);
        ePersonajeDosElegido.setVisible(false);
        bZangiefPequeño.setVisible(true);
        bSakuraPequeño.setVisible(true);
        bSagatPequeño.setVisible(true);
        bRiuPequeño.setVisible(true);
        bChunLiPequeño.setVisible(true);
        bDalshinPequeño.setVisible(true);
        bBalrogPequeño.setVisible(true);
        bBlankaPequeño.setVisible(true);
        bAkumaPequeño.setVisible(true);
        bContinuar.setVisible(false);
        bResetear.setVisible(false);
    }

    public void PersonajeCPU() {
        cpu = new JugadorCPU();
        ePersonajeDosElegido.setIcon(new javax.swing.ImageIcon(getClass().getResource(cpu.getJugador())));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAkumaPequeño;
    private javax.swing.JButton bBalrogPequeño;
    private javax.swing.JButton bBlankaPequeño;
    private javax.swing.JButton bChunLiPequeño;
    private javax.swing.JButton bContinuar;
    private javax.swing.JButton bDalshinPequeño;
    private javax.swing.JButton bResetear;
    private javax.swing.JButton bRiuPequeño;
    private javax.swing.JButton bSagatPequeño;
    private javax.swing.JButton bSakuraPequeño;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JButton bZangiefPequeño;
    private javax.swing.JLabel chooseDos;
    private javax.swing.JLabel eAkumaGrande;
    private javax.swing.JLabel eAkumaNombre;
    private javax.swing.JLabel eBalrogGrande;
    private javax.swing.JLabel eBalrogNombre;
    private javax.swing.JLabel eBlankaGrande;
    private javax.swing.JLabel eBlankaNombre;
    private javax.swing.JLabel eChunLiGrande;
    private javax.swing.JLabel eChunLiNombre;
    private javax.swing.JLabel eDalshinGrande;
    private javax.swing.JLabel eDalshinNombre;
    private javax.swing.JLabel ePersonajeDosElegido;
    private javax.swing.JLabel ePersonajeUnoElegido;
    private javax.swing.JLabel eRiuGrande;
    private javax.swing.JLabel eRiuNombre;
    private javax.swing.JLabel eSagatGrande;
    private javax.swing.JLabel eSagatNombre;
    private javax.swing.JLabel eSakuraGrande;
    private javax.swing.JLabel eSakuraNombre;
    private javax.swing.JLabel eZangiefGrande;
    private javax.swing.JLabel eZangiefNombre;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
