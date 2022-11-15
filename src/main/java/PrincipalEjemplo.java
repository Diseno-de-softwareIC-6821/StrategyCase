import AbstractClasses.MartialArt;
import Clasess.loggers.MemoryLogger;
import Clasess.player.Player;
import Factories.MartialArtFactory;
import java.util.ArrayList;

public class PrincipalEjemplo extends javax.swing.JFrame {
    
    ArrayList<MartialArt> martialStrategies;
    MemoryLogger logger;
    Player player1;
    Player player2;

    public PrincipalEjemplo() {
        initComponents();
        
        ArrayList<MartialArt> martialStrategies = new ArrayList<>();
        
        MemoryLogger logger = new MemoryLogger();

        Player player1 = new Player.PlayerBuilder()
                .setName("John")
                .setMartialArts(MartialArtFactory.getMartialArts())
                .setHealth(200)
                .setLoggerService(logger)
                .build();

        Player player2 = new Player.PlayerBuilder()
                .setName("Ethan")
                .setMartialArts(MartialArtFactory.getMartialArts())
                .setHealth(200)
                .setLoggerService(logger)
                .build();

        //player1.attack(player2, 1);
        //player2.randomAttack(player1);
        
        ArteMarcia1_J1.setText(player1.getMartialStrategy(0).getName());
        ArteMarcia2_J1.setText(player1.getMartialStrategy(1).getName());
        ArteMarcia3_J1.setText(player1.getMartialStrategy(2).getName());
        
        ArteMarcia1_J2.setText(player2.getMartialStrategy(0).getName());
        ArteMarcia2_J2.setText(player2.getMartialStrategy(1).getName());
        ArteMarcia3_J2.setText(player2.getMartialStrategy(2).getName());
        
        J1_Movimiento1.setText(player1.getMartialStrategy(0).getMoveName(1));
        J1_Movimiento2.setText(player1.getMartialStrategy(0).getMoveName(2));
        J1_Movimiento3.setText(player1.getMartialStrategy(0).getMoveName(3));
        
        J1_Movimiento4.setText(player1.getMartialStrategy(1).getMoveName(1));
        J1_Movimiento5.setText(player1.getMartialStrategy(1).getMoveName(2));
        J1_Movimiento6.setText(player1.getMartialStrategy(1).getMoveName(3));
        
        J1_Movimiento7.setText(player1.getMartialStrategy(2).getMoveName(1));
        J1_Movimiento8.setText(player1.getMartialStrategy(2).getMoveName(2));
        J1_Movimiento9.setText(player1.getMartialStrategy(2).getMoveName(3));
        
        J2_Movimiento1.setText(player2.getMartialStrategy(0).getMoveName(1));
        J2_Movimiento2.setText(player2.getMartialStrategy(0).getMoveName(2));
        J2_Movimiento3.setText(player2.getMartialStrategy(0).getMoveName(3));
        
        J2_Movimiento4.setText(player2.getMartialStrategy(1).getMoveName(1));
        J2_Movimiento5.setText(player2.getMartialStrategy(1).getMoveName(2));
        J2_Movimiento6.setText(player2.getMartialStrategy(1).getMoveName(3));
        
        J2_Movimiento7.setText(player2.getMartialStrategy(2).getMoveName(1));
        J2_Movimiento8.setText(player2.getMartialStrategy(2).getMoveName(2));
        J2_Movimiento9.setText(player2.getMartialStrategy(2).getMoveName(3));


        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J1label = new javax.swing.JLabel();
        SeleccionarAM_J2 = new javax.swing.JButton();
        ImagenAM_J3 = new javax.swing.JPanel();
        VidaYGolpes_J1 = new javax.swing.JButton();
        J2label = new javax.swing.JLabel();
        VidaYGolpes_J2 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        InfoBox_J1 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        InfoBox_J2 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        Vida_J1 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        Vida_J2 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        DescripcionAM_J1 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        DescripcionAM_J2 = new javax.swing.JTextArea();
        AsignarJ2 = new javax.swing.JButton();
        AtacarseButton1 = new javax.swing.JButton();
        AsignarJ1 = new javax.swing.JButton();
        SeleccionarAM_J1 = new javax.swing.JButton();
        Ataque_J1 = new javax.swing.JButton();
        Ataque_J2 = new javax.swing.JButton();
        ArteMarcia2_J2 = new javax.swing.JLabel();
        ArteMarcia1_J1 = new javax.swing.JLabel();
        ArteMarcia3_J2 = new javax.swing.JLabel();
        ArteMarcia1_J2 = new javax.swing.JLabel();
        ArteMarcia2_J1 = new javax.swing.JLabel();
        ArteMarcia3_J1 = new javax.swing.JLabel();
        J1_Movimiento3 = new javax.swing.JLabel();
        J1_Movimiento1 = new javax.swing.JLabel();
        J1_Movimiento2 = new javax.swing.JLabel();
        J1_Movimiento4 = new javax.swing.JLabel();
        J1_Movimiento5 = new javax.swing.JLabel();
        J1_Movimiento6 = new javax.swing.JLabel();
        J1_Movimiento7 = new javax.swing.JLabel();
        J1_Movimiento8 = new javax.swing.JLabel();
        J1_Movimiento9 = new javax.swing.JLabel();
        J2_Movimiento1 = new javax.swing.JLabel();
        J2_Movimiento2 = new javax.swing.JLabel();
        J2_Movimiento3 = new javax.swing.JLabel();
        J2_Movimiento4 = new javax.swing.JLabel();
        J2_Movimiento5 = new javax.swing.JLabel();
        J2_Movimiento6 = new javax.swing.JLabel();
        J2_Movimiento7 = new javax.swing.JLabel();
        J2_Movimiento8 = new javax.swing.JLabel();
        J2_Movimiento9 = new javax.swing.JLabel();
        ImagenAM_J1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        J1label.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        J1label.setText("JUGADOR 1");

        SeleccionarAM_J2.setText("Seleccionar Arte Marcial");
        SeleccionarAM_J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarAM_J2ActionPerformed(evt);
            }
        });

        ImagenAM_J3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout ImagenAM_J3Layout = new javax.swing.GroupLayout(ImagenAM_J3);
        ImagenAM_J3.setLayout(ImagenAM_J3Layout);
        ImagenAM_J3Layout.setHorizontalGroup(
            ImagenAM_J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        ImagenAM_J3Layout.setVerticalGroup(
            ImagenAM_J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        VidaYGolpes_J1.setText("Actualizar Vida y Golpes");

        J2label.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        J2label.setText("JUGADOR 2");

        VidaYGolpes_J2.setText("Actualizar Vida y Golpes");

        InfoBox_J1.setColumns(20);
        InfoBox_J1.setRows(5);
        jScrollPane13.setViewportView(InfoBox_J1);

        InfoBox_J2.setColumns(20);
        InfoBox_J2.setRows(5);
        jScrollPane14.setViewportView(InfoBox_J2);

        Vida_J1.setColumns(20);
        Vida_J1.setRows(5);
        jScrollPane15.setViewportView(Vida_J1);

        Vida_J2.setColumns(20);
        Vida_J2.setRows(5);
        jScrollPane16.setViewportView(Vida_J2);

        DescripcionAM_J1.setColumns(20);
        DescripcionAM_J1.setRows(5);
        jScrollPane17.setViewportView(DescripcionAM_J1);

        DescripcionAM_J2.setColumns(20);
        DescripcionAM_J2.setRows(5);
        jScrollPane18.setViewportView(DescripcionAM_J2);

        AsignarJ2.setText("J2 Re Asignar");
        AsignarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarJ2ActionPerformed(evt);
            }
        });

        AtacarseButton1.setText("Atacarse");
        AtacarseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtacarseButton1ActionPerformed(evt);
            }
        });

        AsignarJ1.setText("J1 Re Asignar");
        AsignarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarJ1ActionPerformed(evt);
            }
        });

        SeleccionarAM_J1.setText("Seleccionar Arte Marcial");
        SeleccionarAM_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarAM_J1ActionPerformed(evt);
            }
        });

        Ataque_J1.setText("Atacar");
        Ataque_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque_J1ActionPerformed(evt);
            }
        });

        Ataque_J2.setText("Atacar");
        Ataque_J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque_J2ActionPerformed(evt);
            }
        });

        ArteMarcia2_J2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia2_J2.setBorder(new javax.swing.border.MatteBorder(null));

        ArteMarcia1_J1.setBackground(new java.awt.Color(255, 51, 102));
        ArteMarcia1_J1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia1_J1.setBorder(new javax.swing.border.MatteBorder(null));

        ArteMarcia3_J2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia3_J2.setBorder(new javax.swing.border.MatteBorder(null));

        ArteMarcia1_J2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia1_J2.setBorder(new javax.swing.border.MatteBorder(null));

        ArteMarcia2_J1.setBackground(new java.awt.Color(255, 51, 102));
        ArteMarcia2_J1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia2_J1.setBorder(new javax.swing.border.MatteBorder(null));

        ArteMarcia3_J1.setBackground(new java.awt.Color(255, 51, 102));
        ArteMarcia3_J1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ArteMarcia3_J1.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento3.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento3.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento3.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento1.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento1.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento1.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento2.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento2.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento2.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento4.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento4.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento4.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento5.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento5.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento5.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento6.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento6.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento6.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento7.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento7.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento7.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento8.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento8.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento8.setBorder(new javax.swing.border.MatteBorder(null));

        J1_Movimiento9.setBackground(new java.awt.Color(204, 204, 255));
        J1_Movimiento9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J1_Movimiento9.setForeground(new java.awt.Color(255, 0, 51));
        J1_Movimiento9.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento1.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento1.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento1.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento2.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento2.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento2.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento3.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento3.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento3.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento4.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento4.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento4.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento5.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento5.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento5.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento6.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento6.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento6.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento7.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento7.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento7.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento8.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento8.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento8.setBorder(new javax.swing.border.MatteBorder(null));

        J2_Movimiento9.setBackground(new java.awt.Color(204, 204, 255));
        J2_Movimiento9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        J2_Movimiento9.setForeground(new java.awt.Color(255, 0, 51));
        J2_Movimiento9.setBorder(new javax.swing.border.MatteBorder(null));

        ImagenAM_J1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout ImagenAM_J1Layout = new javax.swing.GroupLayout(ImagenAM_J1);
        ImagenAM_J1.setLayout(ImagenAM_J1Layout);
        ImagenAM_J1Layout.setHorizontalGroup(
            ImagenAM_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        ImagenAM_J1Layout.setVerticalGroup(
            ImagenAM_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(J1label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ArteMarcia1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(ArteMarcia2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(ArteMarcia3_J1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(VidaYGolpes_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ataque_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SeleccionarAM_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addComponent(ImagenAM_J3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1_Movimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(J1_Movimiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(J1_Movimiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(J1_Movimiento8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(J1_Movimiento9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(J1_Movimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(J1_Movimiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AtacarseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AsignarJ1))
                            .addComponent(AsignarJ2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(J2label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImagenAM_J1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeleccionarAM_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VidaYGolpes_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ataque_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(J2_Movimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J2_Movimiento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J2_Movimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ArteMarcia2_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(J2_Movimiento5, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(J2_Movimiento6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(J2_Movimiento9, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(J2_Movimiento8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(J2_Movimiento7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(J2_Movimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(ArteMarcia1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(ArteMarcia3_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J2label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArteMarcia1_J2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArteMarcia2_J2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArteMarcia3_J2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J2_Movimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J2_Movimiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(J2_Movimiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J2_Movimiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J2_Movimiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J2_Movimiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J2_Movimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(J2_Movimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(J2_Movimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AtacarseButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(SeleccionarAM_J2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Ataque_J2)
                                        .addGap(18, 18, 18)
                                        .addComponent(VidaYGolpes_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ImagenAM_J1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AsignarJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AsignarJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(SeleccionarAM_J1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Ataque_J1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(VidaYGolpes_J1)
                                        .addGap(12, 12, 12))
                                    .addComponent(ImagenAM_J3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J1label)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArteMarcia1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArteMarcia2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArteMarcia3_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(J1_Movimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1_Movimiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(J1_Movimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J1_Movimiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarAM_J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarAM_J2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarAM_J2ActionPerformed

    private void AsignarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsignarJ2ActionPerformed

    private void AtacarseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtacarseButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtacarseButton1ActionPerformed

    private void AsignarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsignarJ1ActionPerformed

    private void SeleccionarAM_J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarAM_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarAM_J1ActionPerformed

    private void Ataque_J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ataque_J1ActionPerformed

    private void Ataque_J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque_J2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ataque_J2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArteMarcia1_J1;
    private javax.swing.JLabel ArteMarcia1_J2;
    private javax.swing.JLabel ArteMarcia2_J1;
    private javax.swing.JLabel ArteMarcia2_J2;
    private javax.swing.JLabel ArteMarcia3_J1;
    private javax.swing.JLabel ArteMarcia3_J2;
    private javax.swing.JButton AsignarJ1;
    private javax.swing.JButton AsignarJ2;
    private javax.swing.JButton AtacarseButton1;
    private javax.swing.JButton Ataque_J1;
    private javax.swing.JButton Ataque_J2;
    private javax.swing.JTextArea DescripcionAM_J1;
    private javax.swing.JTextArea DescripcionAM_J2;
    private javax.swing.JPanel ImagenAM_J1;
    private javax.swing.JPanel ImagenAM_J3;
    private javax.swing.JTextArea InfoBox_J1;
    private javax.swing.JTextArea InfoBox_J2;
    private javax.swing.JLabel J1_Movimiento1;
    private javax.swing.JLabel J1_Movimiento2;
    private javax.swing.JLabel J1_Movimiento3;
    private javax.swing.JLabel J1_Movimiento4;
    private javax.swing.JLabel J1_Movimiento5;
    private javax.swing.JLabel J1_Movimiento6;
    private javax.swing.JLabel J1_Movimiento7;
    private javax.swing.JLabel J1_Movimiento8;
    private javax.swing.JLabel J1_Movimiento9;
    private javax.swing.JLabel J1label;
    private javax.swing.JLabel J2_Movimiento1;
    private javax.swing.JLabel J2_Movimiento2;
    private javax.swing.JLabel J2_Movimiento3;
    private javax.swing.JLabel J2_Movimiento4;
    private javax.swing.JLabel J2_Movimiento5;
    private javax.swing.JLabel J2_Movimiento6;
    private javax.swing.JLabel J2_Movimiento7;
    private javax.swing.JLabel J2_Movimiento8;
    private javax.swing.JLabel J2_Movimiento9;
    private javax.swing.JLabel J2label;
    private javax.swing.JButton SeleccionarAM_J1;
    private javax.swing.JButton SeleccionarAM_J2;
    private javax.swing.JButton VidaYGolpes_J1;
    private javax.swing.JButton VidaYGolpes_J2;
    private javax.swing.JTextArea Vida_J1;
    private javax.swing.JTextArea Vida_J2;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    // End of variables declaration//GEN-END:variables
}
