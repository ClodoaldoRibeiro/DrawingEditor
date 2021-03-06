/**
 *
 * @author raymundosaraiva
 */
package drawingeditor;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class SideBar extends javax.swing.JFrame {

    ArrayList<Drawing> drawList = new ArrayList<>();
    Drawing currentDraw;
    Color currentColors[];
    int currentStrokeWidth;
    int currentTransparency;
    boolean eraser = false;
    private static boolean pincel = false;
    
    public static final int PEN = 1, LINE = 2, CIRCLE = 3, RECT = 4, TRIANGLE = 5, ABSORB = 6;

    public SideBar() {
        initComponents();
        setLocation(900, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newDraw();

        // Save th current draw to a png file
        saveMenu.addActionListener((e) -> {
            currentDraw.getImage();
        });

        // Open a new image from file
        openMenu.addActionListener((e) -> {
            if (e != null) {
                currentDraw.open();
            }
        });

        clearMenu.addActionListener((e) -> {
            if (e != null) {
                currentDraw.clear();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        blue = new java.awt.Canvas();
        jToolBar1 = new javax.swing.JToolBar();
        lineButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rectButton = new javax.swing.JButton();
        red = new java.awt.Canvas();
        eraserButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        paintButton = new javax.swing.JButton();
        penButton = new javax.swing.JButton();
        absorbButton = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        jb_CaiXaDeTexto = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        green = new java.awt.Canvas();
        black = new java.awt.Canvas();
        white = new java.awt.Canvas();
        yellow = new java.awt.Canvas();
        stroke = new javax.swing.JSlider();
        transparency = new javax.swing.JSlider();
        canvas1 = new java.awt.Canvas();
        jLabel2 = new javax.swing.JLabel();
        strokeButton = new javax.swing.JButton();
        fillButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clearMenu = new javax.swing.JMenuItem();
        windowMenu = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela de Ferramentas");
        setBackground(java.awt.Color.white);
        setResizable(false);

        blue.setBackground(new java.awt.Color(51, 102, 255));
        blue.setName(""); // NOI18N
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueMouseClicked(evt);
            }
        });

        jToolBar1.setRollover(true);

        lineButton.setBackground(new java.awt.Color(255, 255, 255));
        lineButton.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        lineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line.png"))); // NOI18N
        lineButton.setToolTipText("Linha");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pen tool.png"))); // NOI18N
        jButton2.setToolTipText("Caneta");

        rectButton.setBackground(new java.awt.Color(255, 255, 255));
        rectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle tool.png"))); // NOI18N
        rectButton.setToolTipText("Retângulo");
        rectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtonActionPerformed(evt);
            }
        });

        red.setBackground(new java.awt.Color(255, 51, 51));
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redMouseClicked(evt);
            }
        });

        eraserButton.setBackground(new java.awt.Color(255, 255, 255));
        eraserButton.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        eraserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eraser.png"))); // NOI18N
        eraserButton.setToolTipText("Borracha");
        eraserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserButtonActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Direct selection tool.png"))); // NOI18N
        jButton5.setToolTipText("Selecionar");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Crop tool.png"))); // NOI18N
        jButton6.setToolTipText("Recortar");

        paintButton.setBackground(new java.awt.Color(255, 255, 255));
        paintButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3d material drop tool.png"))); // NOI18N
        paintButton.setToolTipText("Balde de Tinta");
        paintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintButtonActionPerformed(evt);
            }
        });

        penButton.setBackground(new java.awt.Color(255, 255, 255));
        penButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Brush tool.png"))); // NOI18N
        penButton.setToolTipText("Pincel");
        penButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penButtonActionPerformed(evt);
            }
        });

        absorbButton.setBackground(new java.awt.Color(255, 255, 255));
        absorbButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eyedropper.png"))); // NOI18N
        absorbButton.setToolTipText("Absorver Cor");
        absorbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absorbButtonActionPerformed(evt);
            }
        });

        triangleButton.setBackground(new java.awt.Color(255, 255, 255));
        triangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sharpen tool.png"))); // NOI18N
        triangleButton.setToolTipText("Triângulo");
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });

        circleButton.setBackground(java.awt.Color.white);
        circleButton.setForeground(new java.awt.Color(255, 255, 255));
        circleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circle.png"))); // NOI18N
        circleButton.setToolTipText("Círculo");
        circleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleButtonMouseClicked(evt);
            }
        });

        jb_CaiXaDeTexto.setBackground(new java.awt.Color(255, 255, 255));
        jb_CaiXaDeTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Horizontal type tool.png"))); // NOI18N
        jb_CaiXaDeTexto.setToolTipText("Texto");
        jb_CaiXaDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CaiXaDeTextoActionPerformed(evt);
            }
        });

        jButton14.setToolTipText("");
        jButton14.setEnabled(false);

        green.setBackground(new java.awt.Color(0, 255, 0));
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                greenMouseClicked(evt);
            }
        });

        black.setBackground(new java.awt.Color(0, 51, 51));
        black.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackMouseClicked(evt);
            }
        });

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteMouseClicked(evt);
            }
        });

        yellow.setBackground(new java.awt.Color(255, 255, 102));
        yellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yellowMouseClicked(evt);
            }
        });

        stroke.setMaximum(20);
        stroke.setMinimum(1);
        stroke.setToolTipText("Espessura da Linha");
        stroke.setValue(1);
        stroke.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                strokeStateChanged(evt);
            }
        });

        transparency.setMaximum(99);
        transparency.setMinimum(1);
        transparency.setToolTipText("Transparência");
        transparency.setValue(99);
        transparency.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                transparencyStateChanged(evt);
            }
        });

        strokeButton.setBackground(new java.awt.Color(0, 0, 0));
        strokeButton.setToolTipText("Cor da Borda");
        strokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strokeButtonActionPerformed(evt);
            }
        });

        fillButton.setBackground(new java.awt.Color(0, 0, 0));
        fillButton.setToolTipText("Cor de Preenchimento");
        fillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        newMenu.setText("Novo");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir.png"))); // NOI18N
        openMenu.setText("Abrir");
        jMenu1.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        saveMenu.setText("Salvar");
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        clearMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        clearMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        clearMenu.setText("Limpar Tudo");
        clearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuActionPerformed(evt);
            }
        });
        jMenu2.add(clearMenu);

        jMenuBar1.add(jMenu2);

        windowMenu.setText("Janela");
        jMenuBar1.add(windowMenu);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(triangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eraserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_CaiXaDeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(absorbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(strokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(stroke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transparency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(circleButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rectButton)
                            .addComponent(triangleButton)))
                    .addComponent(penButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton5))
                        .addComponent(paintButton, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lineButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eraserButton)
                            .addComponent(jb_CaiXaDeTexto)))
                    .addComponent(absorbButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stroke, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transparency, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButton14)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueMouseClicked
        setColor(Color.BLUE, Color.BLUE);
    }//GEN-LAST:event_blueMouseClicked

    private void redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseClicked
        setColor(Color.RED, Color.RED);
    }//GEN-LAST:event_redMouseClicked

    private void eraserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserButtonActionPerformed
        currentColors = getColor();
        currentStrokeWidth = stroke.getValue();
        currentTransparency = transparency.getValue();
        setColor(Color.WHITE, Color.WHITE);
        stroke.setValue(20);
        transparency.setValue(99);
        eraser = true;
        setAction(PEN);
    }//GEN-LAST:event_eraserButtonActionPerformed

    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        currentColor();
        setAction(RECT);
    }//GEN-LAST:event_rectButtonActionPerformed

    private void penButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penButtonActionPerformed
        currentColor();
        setAction(PEN);
    }//GEN-LAST:event_penButtonActionPerformed

    private void greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenMouseClicked
        setColor(Color.GREEN, Color.GREEN);
    }//GEN-LAST:event_greenMouseClicked

    private void blackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackMouseClicked
        setColor(Color.BLACK, Color.BLACK);
    }//GEN-LAST:event_blackMouseClicked

    private void whiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteMouseClicked
        setColor(Color.WHITE, Color.WHITE);
    }//GEN-LAST:event_whiteMouseClicked

    private void yellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowMouseClicked
        setColor(Color.YELLOW, Color.YELLOW);
    }//GEN-LAST:event_yellowMouseClicked

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        currentColor();
        setAction(LINE);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void strokeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_strokeStateChanged
        if (currentDraw != null) {
            currentDraw.strokeWidth = stroke.getValue();
        }
    }//GEN-LAST:event_strokeStateChanged

    private void circleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleButtonMouseClicked
        setAction(CIRCLE);
    }//GEN-LAST:event_circleButtonMouseClicked

    private void transparencyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_transparencyStateChanged
        if (currentDraw != null) {
            currentDraw.transparentVal = (float) (transparency.getValue() * .01);
        }
    }//GEN-LAST:event_transparencyStateChanged

    private void strokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strokeButtonActionPerformed
        if (currentDraw != null) {
            currentDraw.strokeColor = JColorChooser.showDialog(null, "Pick a Stroke", currentDraw.strokeColor);
            strokeButton.setBackground(currentDraw.strokeColor);
        }
    }//GEN-LAST:event_strokeButtonActionPerformed

    private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtonActionPerformed
        if (currentDraw != null) {
            currentDraw.fillColor = JColorChooser.showDialog(null, "Pick a Stroke", currentDraw.fillColor);
            fillButton.setBackground(currentDraw.fillColor);
        }
    }//GEN-LAST:event_fillButtonActionPerformed

    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        setAction(TRIANGLE);
    }//GEN-LAST:event_triangleButtonActionPerformed

    private void clearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuActionPerformed
        //currentDraw.getContentPane().
    }//GEN-LAST:event_clearMenuActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        newDraw();
    }//GEN-LAST:event_newMenuActionPerformed

    private void paintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintButtonActionPerformed
        currentColor();
        setPincel(true);
    }//GEN-LAST:event_paintButtonActionPerformed

    private void absorbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absorbButtonActionPerformed
        setAction(ABSORB);
        Color color;
        try {
            if (currentDraw != null) {
                color = currentDraw.getPixelColor(200, 200);
                setColor(color, color);
            }
        } catch (AWTException ex) {
            Logger.getLogger(SideBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_absorbButtonActionPerformed

    private void jb_CaiXaDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CaiXaDeTextoActionPerformed
        // Cria formulario
        JFrame formulario = new JFrame("DA - JTextArea");

        formulario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cria nova instancia da classe
        Texto texto = new Texto();

        // adiciona painel ao formulario
        formulario.setContentPane(texto.CriaPainel());

        // Compacta componetes no formulario
        formulario.pack();

        // Mostra formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_jb_CaiXaDeTextoActionPerformed

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
            java.util.logging.Logger.getLogger(SideBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SideBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SideBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SideBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SideBar().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absorbButton;
    private java.awt.Canvas black;
    private java.awt.Canvas blue;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton circleButton;
    private javax.swing.JMenuItem clearMenu;
    private javax.swing.JButton eraserButton;
    private javax.swing.JButton fillButton;
    private java.awt.Canvas green;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_CaiXaDeTexto;
    private javax.swing.JButton lineButton;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JButton paintButton;
    private javax.swing.JButton penButton;
    private javax.swing.JButton rectButton;
    private java.awt.Canvas red;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JSlider stroke;
    private javax.swing.JButton strokeButton;
    private javax.swing.JSlider transparency;
    private javax.swing.JButton triangleButton;
    private java.awt.Canvas white;
    private javax.swing.JMenu windowMenu;
    private java.awt.Canvas yellow;
    // End of variables declaration//GEN-END:variables

    // Set the color in the draw
    public void setColor(Color stroke, Color fill) {
        if (currentDraw != null) {
            currentDraw.strokeColor = stroke;
            currentDraw.fillColor = fill;
            strokeButton.setBackground(stroke);
            fillButton.setBackground(fill);
        }
    }

    // Get the Color from the draw
    public Color[] getColor() {
        Color colors[] = {currentDraw.strokeColor, currentDraw.fillColor};
        return colors;
    }

    // Get the current color, stroke and transparency, before Eraser was called
    public void currentColor() {
        if (eraser) {
            setColor(currentColors[0], currentColors[1]);
            stroke.setValue(currentStrokeWidth);
            transparency.setValue(currentTransparency);
            eraser = false;
        }
    }

    // Set the current action selected
    private void setAction(int ACTION) {
        if (currentDraw != null) {
            currentDraw.currentAction = ACTION;
        }
    }

    // Method to create new Drawing windows
    public void newDraw() {
        Drawing draw = new Drawing();
        int index = drawList.size();

        // A listener to indicate whitch window has the focus, so they can be treated as separated 
        draw.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (evt != null) {
                    currentDraw = draw;
                    System.out.println("Focus gained in JPanel");
                }
            }
        });

        draw.setTitle("Sem Título " + (index + 1)); // Add a untitled name to each new window

        //Add new draw to menu Janela
        //windowMenu.add(new JCheckBoxMenuItem(draw.getTitle()));
        draw.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        draw.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                //Remove
                drawList.remove(index);
                //remove draw from menu Janela
                draw.dispose();
            }
        });
        // Add new draw to the list
        drawList.add(draw);

    }

    public boolean isPincel() {
        return pincel;
    }

    public void setPincel(boolean pincel) {
        this.pincel = pincel;
    }
}
